package modelo;

public class Usuario {

//Atributos
	private String nickname;
	private String nombre;
	private String email;
	private String tipoDeUsuario;
	
	
	//Constructor
	public Usuario () {
		this.nickname= nickname;
		this.nombre= nombre;
		this.email= email;
		this.tipoDeUsuario= tipoDeUsuario;
	}
	
	//Getters
	public String getNickname() {
		return nickname;
	}
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
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setId_tipo_de_usuario(String tipoDeUsuario) {
		this.tipoDeUsuario = tipoDeUsuario;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Usuario [nickname=" + nickname + ", nombre=" + nombre + ", email=" + email + ", id_tipo_de_usuario="
				+ tipoDeUsuario + "]";
	}
	
	
	
}
