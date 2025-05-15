package archivo;

public class tipo_de_usuario {

	
	//Atributo
	
	private String id_tipo_de_usuario;
	private String nombre;
	
	//Getters
	public String getId_tipo_de_usuario() {
		return id_tipo_de_usuario;
	}
	public String getNombre() {
		return nombre;
	}
	
	//Setters
	public void setId_tipo_de_usuario(String id_tipo_de_usuario) {
		this.id_tipo_de_usuario = id_tipo_de_usuario;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//ToString
	@Override
	public String toString() {
		return "tipo_de_usuario [id_tipo_de_usuario=" + id_tipo_de_usuario + ", nombre=" + nombre + "]";
	}
	
	
}
