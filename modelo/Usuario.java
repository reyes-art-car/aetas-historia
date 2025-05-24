package modelo;

public class Usuario {

//Atributos
	private String nombre;
	private String email;
	private String tipoDeUsuario;
	
	
	//Constructor
	public Usuario () {
		this.nombre= nombre;
		this.email= email;
		this.tipoDeUsuario= tipoDeUsuario;
	}
	
	//Getters
	public String getNombre() {
		return nombre;
	}
	public String getEmail() {
		return email;
	}
	public String getId_tipo_de_usuario() {
		return tipoDeUsuario;
	}
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setId_tipo_de_usuario(String tipoDeUsuario) {
		this.tipoDeUsuario = tipoDeUsuario;
	}
	
	public static boolean validator(String nombre, String password, String email) {
		return !(nombre == null || password == null || nombre.isBlank() || password.isBlank());
	}
	
	//ToString
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", email=" + email + ", id_tipo_de_usuario="
				+ tipoDeUsuario + "]";
	}
	
	
	
}
