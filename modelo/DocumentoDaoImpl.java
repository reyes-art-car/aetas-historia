package modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Esta clase genera el CRUD de documento
public class DocumentoDaoImpl implements DocumentoDao{

//Crear documento
	@Override
	public void createArchive(Documento doc) {
		ConexionMySQL conexion = new ConexionMySQL("root", "", "aetas_historia");

		try {
			conexion.conectar();
			// Insertamos documentos
			String sentencia = 
				    "DECLARE\n" +
				    "  v_titulo            VARCHAR2(200) := 'Título de ejemplo';\n" +
				    "  v_descripcion       VARCHAR2(200) := 'Descripción del documento';\n" +
				    "  v_autor             VARCHAR2(100) := 'Nombre del autor';\n" +
				    "  v_anio              NUMBER := 2023;\n" +
				    "  v_tipo_documento    VARCHAR2(100) := 'Informe';\n" +
				    "  v_formato           VARCHAR2(50) := 'PDF';\n" +
				    "  v_id_coleccion      NUMBER := 1;\n" +
				    "BEGIN\n" +
				    "  INSERT INTO documento (\n" +
				    "    titulo, descripcion, autor, anio, tipo_de_documento, formato, id_coleccion\n" +
				    "  ) VALUES (\n" +
				    "    v_titulo, v_descripcion, v_autor, v_anio, v_tipo_documento, v_formato, v_id_coleccion\n" +
				    "  );\n" +
				    "  DBMS_OUTPUT.PUT_LINE('Documento insertado correctamente.');\n" +
				    "EXCEPTION\n" +
				    "  WHEN OTHERS THEN\n" +
				    "    DBMS_OUTPUT.PUT_LINE('Error al insertar documento: ' || SQLERRM);\n" +
				    "END;";

			conexion.ejecutarInsertDeleteUpdate(sentencia);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//Obtener documento por ID
	public Documento readArchiveById(int id_documento) {
		Documento documento= null;
		try {
			ConexionMySQL conexion = new ConexionMySQL("root", "", "aetas_historia");
			conexion.conectar();
			// Seleccionamos documentos por ID
			String sentencia2 = 
				    "DECLARE\n" +
				    "  v_id_documento   documento.id_documento%TYPE := 1;\n" +
				    "  v_titulo         documento.titulo%TYPE;\n" +
				    "  v_descripcion    documento.descripcion%TYPE;\n" +
				    "  v_autor          documento.autor%TYPE;\n" +
				    "  v_anio           documento.anio%TYPE;\n" +
				    "  v_tipo_doc       documento.tipo_de_documento%TYPE;\n" +
				    "  v_formato        documento.formato%TYPE;\n" +
				    "  v_id_coleccion   documento.id_coleccion%TYPE;\n" +
				    "BEGIN\n" +
				    "  SELECT titulo, descripcion, autor, anio, tipo_de_documento, formato, id_coleccion\n" +
				    "  INTO   v_titulo, v_descripcion, v_autor, v_anio, v_tipo_doc, v_formato, v_id_coleccion\n" +
				    "  FROM   documento\n" +
				    "  WHERE  id_documento = v_id_documento;\n" +
				    "\n" +
				    "  DBMS_OUTPUT.PUT_LINE('Título: ' || v_titulo);\n" +
				    "  DBMS_OUTPUT.PUT_LINE('Descripción: ' || v_descripcion);\n" +
				    "  DBMS_OUTPUT.PUT_LINE('Autor: ' || v_autor);\n" +
				    "  DBMS_OUTPUT.PUT_LINE('Año: ' || v_anio);\n" +
				    "  DBMS_OUTPUT.PUT_LINE('Tipo: ' || v_tipo_doc);\n" +
				    "  DBMS_OUTPUT.PUT_LINE('Formato: ' || v_formato);\n" +
				    "  DBMS_OUTPUT.PUT_LINE('ID Colección: ' || v_id_coleccion);\n" +
				    "EXCEPTION\n" +
				    "  WHEN NO_DATA_FOUND THEN\n" +
				    "    DBMS_OUTPUT.PUT_LINE('No se encontró el documento con ese ID.');\n" +
				    "  WHEN OTHERS THEN\n" +
				    "    DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);\n" +
				    "END;";

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
		String sentencia3 = 
			    "CREATE PROCEDURE ver_documentos()\n" +
			    "BEGIN\n" +
			    "    SELECT * FROM documento;\n" +
			    "END;";

		try {
			ConexionMySQL conexion = new ConexionMySQL("root", "", "aetas_historia");
			conexion.conectar();
			conexion.ejecutarSelect(sentencia3);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return documentos;
	}

	public Documento updateArchive(Documento archive) {
		String sentencia4 = 
			    "CREATE OR REPLACE PROCEDURE actualizar_documento()\n" +
			    "BEGIN\n" +
			    "    DECLARE v_id_documento INT DEFAULT 1;\n" +
			    "    DECLARE v_formato VARCHAR(50) DEFAULT 'PDF';\n" +
			    "    DECLARE v_descripcion VARCHAR(200) DEFAULT 'Descripción de prueba';\n" +
			    "    DECLARE v_titulo VARCHAR(200) DEFAULT 'Título de prueba';\n" +
			    "    DECLARE v_autor VARCHAR(100) DEFAULT 'Autor de prueba';\n" +
			    "    DECLARE v_anio INT DEFAULT 2024;\n" +
			    "    DECLARE v_tipo_documento VARCHAR(100) DEFAULT 'Ensayo';\n" +
			    "    DECLARE v_id_coleccion INT DEFAULT 3;\n" +
			    "\n" +
			    "    UPDATE documento\n" +
			    "    SET \n" +
			    "        formato = v_formato,\n" +
			    "        descripcion = v_descripcion,\n" +
			    "        titulo = v_titulo,\n" +
			    "        autor = v_autor,\n" +
			    "        anio = v_anio,\n" +
			    "        tipo_de_documento = v_tipo_documento,\n" +
			    "        id_coleccion = v_id_coleccion\n" +
			    "    WHERE id_documento = v_id_documento;\n" +
			    "END;";

		try {
			ConexionMySQL conexion = new ConexionMySQL("root", "", "aetas_historia");
			conexion.conectar();
			conexion.ejecutarInsertDeleteUpdate(sentencia4);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return archive;
	}

	public void deleteArchive(int id_documento) {
		String sentencia5 = 
			    "CREATE OR REPLACE PROCEDURE eliminar_documento()\n" +
			    "BEGIN\n" +
			    "    DECLARE v_id_documento INT DEFAULT 1;\n" +
			    "    DELETE FROM documento\n" +
			    "    WHERE id_documento = v_id_documento;\n" +
			    "END;";

		try {
			ConexionMySQL conexion = new ConexionMySQL("root", "", "aetas_historia");
			conexion.conectar();
			conexion.ejecutarInsertDeleteUpdate(sentencia5);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Documento eliminado");
	}

}
