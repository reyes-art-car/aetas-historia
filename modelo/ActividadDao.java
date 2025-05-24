package modelo;

import java.util.List;

public interface ActividadDao {
public void registrarActividad (Actividad actividad);
List<Actividad> obtenerTodas();

}
