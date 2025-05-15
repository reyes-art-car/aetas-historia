package modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Esta clase genera el CRUD de documento
public class DocumentoDAO {

//Crear documento
	public void CrearDocumento(String id_documento, String titulo, String descripcion, String id_autor, int anio, String tipo_de_documento, String formato, String id_coleccion, String fecha_de_subida) {
		ConexionMySQL conexion = new ConexionMySQL("root", "", "aetashistoria");

		try {
			conexion.conectar();
			// Insertamos documentos
			String sentencia = "INSERT INTO documento (id_documento, titulo, descripcion, id_autor, anio, id_tipo_de_documento, formato, id_coleccion, fecha_de_subida) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			conexion.ejecutarInsertDeleteUpdate(sentencia);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//Obtener documento por ID
	public Documento obtenerDocumentoPorId(String id_documento) {
		Documento documento= null;
		try {
			ConexionMySQL conexion = new ConexionMySQL("root", "", "aetas-historia");
			conexion.conectar();
			// Seleccionamos documentos por ID
			String sentencia2 = "SELECT * FROM documento WHERE id_documento= ?";
			conexion.ejecutarSelect(sentencia2);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return documento;
	}

//Listar documentos
	public List<Documento> listarDocumentos() {
		List<Documento> documentos = new ArrayList<>();
		String sentencia3 = "SELECT * FROM documento";
		try {
			ConexionMySQL conexion = new ConexionMySQL("root", "", "aetas-historia");
			conexion.conectar();
			conexion.ejecutarSelect(sentencia3);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return documentos;
	}

	public void actualizarDocumento(Documento documento) {
		String sentencia4 = "UPDATE formato FROM documento";
		try {
			ConexionMySQL conexion = new ConexionMySQL("root", "", "aetas-historia");
			conexion.conectar();
			conexion.ejecutarInsertDeleteUpdate(sentencia4);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void eliminarDocumento(String id_documento) {
		String sentencia5 = "DELETE * FROM documento WHERE id_documento = ?";
		try {
			ConexionMySQL conexion = new ConexionMySQL("root", "", "aetas-historia");
			conexion.conectar();
			conexion.ejecutarInsertDeleteUpdate(sentencia5);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Documento eliminado");
	}
}
