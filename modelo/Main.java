package modelo;

import java.sql.SQLException;

import modelo.ConexionMySQL;
import modelo.DocumentoDaoImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConexionMySQL conexion = new ConexionMySQL("root", "", "aetashistoria");
		DocumentoDaoImpl documento = new DocumentoDaoImpl ();
		try {
			conexion.conectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
