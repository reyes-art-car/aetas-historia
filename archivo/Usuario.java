package archivo;

public class Usuario {

//Atributos
	private String id_usuario;
	private String nombre;
	private String email;
	private String id_tipo_de_usuario;
	
	//Getters
	public String getId_usuario() {
		return id_usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public String getEmail() {
		return email;
	}
	public String getId_tipo_de_usuario() {
		return id_tipo_de_usuario;
	}
	//Setters
	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setId_tipo_de_usuario(String id_tipo_de_usuario) {
		this.id_tipo_de_usuario = id_tipo_de_usuario;
	}
	//ToString
	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", nombre=" + nombre + ", email=" + email + ", id_tipo_de_usuario="
				+ id_tipo_de_usuario + "]";
	}

	
}
