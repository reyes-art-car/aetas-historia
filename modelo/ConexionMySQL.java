// src/modelo/ConexionMySQL.java
package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConexionMySQL {
    private Connection conexion;

    public ConexionMySQL(String host, String port, String user, String pass, String bd) {
        String url = "jdbc:mysql://" + host + ":" + port
            + "/" + bd + "?useSSL=false&serverTimezone=UTC";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conexion = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
            this.conexion = null;
        }
    }

    public boolean success() {
        return this.conexion != null;
    }

    public boolean userExist(String username) {
        String SQL = "SELECT nombre FROM usuario WHERE nombre = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(SQL)) {
            stmt.setString(1, username);
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean register(String nombre, String email, String contraseña) {
        String SQL = """
            INSERT INTO usuario(
              nombre, email, tipo_de_usuario_id_tipo_de_usuario, contraseña
            ) VALUES (?, ?, 2, ?)
            """;
        try (PreparedStatement stmt = conexion.prepareStatement(SQL)) {
            stmt.setString(1, nombre);
            stmt.setString(2, email);
            stmt.setString(3, contraseña);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean añadirDocumento(
        String titulo,
        String descripcion,
        String autor,
        int anio,
        String formato,
        String coleccion,
        String fechaDeSubida,
        String imagenPath
    ) {
        String SQL = """
            INSERT INTO documento(
              titulo, descripcion, autor, anio,
              formato, coleccion, fecha_de_subida, imagen
            ) VALUES (?,?,?,?,?,?,?,?)
            """;
        try (PreparedStatement stmt = conexion.prepareStatement(SQL)) {
            stmt.setString(1, titulo);
            stmt.setString(2, descripcion);
            stmt.setString(3, autor);
            stmt.setInt   (4, anio);
            stmt.setString(5, formato);
            stmt.setString(6, coleccion);
            stmt.setString(7, fechaDeSubida);
            stmt.setString(8, imagenPath);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<DocumentFullData> getAllDocuments() {
        List<DocumentFullData> docs = new ArrayList<>();
        String SQL = "SELECT titulo, descripcion, autor, anio, formato, coleccion, fecha_de_subida, imagen "
                   + "FROM documento ORDER BY id_Documento";
        try (PreparedStatement stmt = conexion.prepareStatement(SQL);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                docs.add(new DocumentFullData(
                  rs.getString("titulo"),
                  rs.getString("descripcion"),
                  rs.getString("autor"),
                  rs.getInt   ("anio"),
                  rs.getString("formato"),
                  rs.getString("coleccion"),
                  rs.getString("fecha_de_subida"),
                  rs.getString("imagen")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return docs;
    }

    public DocumentFullData getDocumentByTitle(String titulo) {
        String SQL = """
            SELECT titulo, descripcion, autor, anio, formato, coleccion, fecha_de_subida, imagen
            FROM documento
            WHERE titulo = ?
            """;
        try (PreparedStatement stmt = conexion.prepareStatement(SQL)) {
            stmt.setString(1, titulo);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new DocumentFullData(
                      rs.getString("titulo"),
                      rs.getString("descripcion"),
                      rs.getString("autor"),
                      rs.getInt   ("anio"),
                      rs.getString("formato"),
                      rs.getString("coleccion"),
                      rs.getString("fecha_de_subida"),
                      rs.getString("imagen")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Verifica usuario + contraseña en la tabla `usuario`.
     * Devuelve true si la combinación existe.
     */
    public boolean logging(String username, String password) {
        String SQL = "SELECT nombre FROM usuario WHERE nombre = ? AND contraseña = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(SQL)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
