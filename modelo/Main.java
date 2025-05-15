package modelo;

import java.sql.SQLException;

import modelo.ConexionMySQL;
import modelo.DocumentoDAO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConexionMySQL conexion = new ConexionMySQL("root", "", "aetashistoria");
		DocumentoDAO documento = new DocumentoDAO ();
		try {
			conexion.conectar();
			documento.actualizarDocumento(null);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
