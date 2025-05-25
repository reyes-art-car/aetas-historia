package controlador;

public class SignInDto {

	//Atributos
	private String email;
	private String nombre;
	private String apellidos;
	
	//Getters
	public String getEmail() {
		return email;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	//Setter
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	@Override
	public String toString() {
		return "SignInDto [email=" + email + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
}
