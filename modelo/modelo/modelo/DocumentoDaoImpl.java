package modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Esta clase genera el CRUD de documento
public class DocumentoDaoImpl implements DocumentoDao{

//Crear documento
	@Override
	public void createArchive(Documento doc) {
		ConexionMySQL conexion = new ConexionMySQL("root", "", "aetashistoria");

		try {
			conexion.conectar();
			// Insertamos documentos
			String sentencia = "INSERT INTO documento (titulo, descripcion, autor, anio, tipo_de_documento, formato, id_coleccion) " +
	                 "VALUES ('" + doc.getTitulo() + "', '" + doc.getDescripcion() + "', '" + doc.getNombreAutor() + "', " +
	                 doc.getAnio() + ", '" + doc.getTipoDeDocumento() + "', '" + doc.getFormato() + "', " +
	                 doc.getIdColeccion();
			conexion.ejecutarInsertDeleteUpdate(sentencia);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//Obtener documento por ID
	public Documento readArchiveById(int id_documento) {
		Documento documento= null;
		try {
			ConexionMySQL conexion = new ConexionMySQL("root", "", "aetashistoria");
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
			ConexionMySQL conexion = new ConexionMySQL("root", "", "aetashistoria");
			conexion.conectar();
			conexion.ejecutarSelect(sentencia3);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return documentos;
	}

	public Documento updateArchive(Documento archive) {
		String sentencia4 = "UPDATE documento SET " +
		        "formato = '" + archive.getFormato() + "', " +
		        "descripcion = '" + archive.getDescripcion() + "', " +
		        "titulo = '" + archive.getTitulo() + "', " +
		        "autor = '" + archive.getNombreAutor() + "', " +
		        "anio = " + archive.getAnio() + ", " +
		        "tipo_de_documento = '" + archive.getTipoDeDocumento() + "', " +
		        "id_coleccion = " + archive.getIdColeccion() + " " +
		        "WHERE id_documento = '" + archive.getId() + "'";
		try {
			ConexionMySQL conexion = new ConexionMySQL("root", "", "aetas-historia");
			conexion.conectar();
			conexion.ejecutarInsertDeleteUpdate(sentencia4);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return archive;
	}

	public void deleteArchive(int id_documento) {
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
