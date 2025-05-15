package archivo;

import java.sql.SQLException;

import modelo.ConexionMySQL;

public class Main {

	public static void main(String[] args) {
		// Conectar con la base de datos
		ConexionMySQL conexion = new ConexionMySQL("root","","aetas-historia");

		try {
			conexion.conectar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
