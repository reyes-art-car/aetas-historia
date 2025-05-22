package controlador;

public class ActividadDto {
	//Atributos
	
		private int id_actividad;
			private String tipo_de_actividad;
			
			//Getters
			public int getId_actividad() {
				return id_actividad;
			}
			public String getTipo_de_actividad() {
				return tipo_de_actividad;
			}
			//Setters
			public void setId_actividad(int id_actividad) {
				this.id_actividad = id_actividad;
			}
			public void setTipo_de_actividad(String tipo_de_actividad) {
				this.tipo_de_actividad = tipo_de_actividad;
			}
			//ToString
			@Override
			public String toString() {
				return "Actividad [id_actividad=" + id_actividad + ", tipo_de_actividad=" + tipo_de_actividad + "]";
			}
}
