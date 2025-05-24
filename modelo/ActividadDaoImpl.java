package modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class ActividadDaoImpl implements ActividadDao {

	@Override
	public void registrarActividad(Actividad actividad) {
		
		
		try {
			ConexionMySQL conexion = new ConexionMySQL("root", "", "aetas_historia");
			conexion.conectar();
		String sentencia="CREATE OR REPLACE TRIGGER registrarActividad AFTER INSERT OR UPDATE OR DELETE ON documento FOR EACH ROW "
		+ "DECLARE BEGIN INSERT INTO actividad VALUES (tipo_de_usuario, usuario) END;";
		conexion.ejecutarInsertDeleteUpdate(sentencia);
		conexion.desconectar();
		}
		catch (SQLException e) {
				e.printStackTrace();
		}
		
	}

	@Override
	public List<Actividad> obtenerTodas() {
		List<Actividad> actividad = new ArrayList<>();
		
		
		try {
			ConexionMySQL conexion = new ConexionMySQL("root", "", "aetas_historia");
			conexion.conectar();
		String sentencia="SELECT * FROM actividad";
		conexion.ejecutarInsertDeleteUpdate(sentencia);
		conexion.desconectar();
		}
		catch (SQLException e) {
				e.printStackTrace();
		}
		
		return actividad ;
	}


}
