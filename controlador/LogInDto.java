package controlador;

public class LogInDto {

	//Atributos
	private String email;
	private String contraseña;
	
	//Getters
	public String getEmail() {
		return email;
	}
	public String getContraseña() {
		return contraseña;
	}
	//Setters
	public void setEmail(String email) {
		this.email = email;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	@Override
	public String toString() {
		return "LogInDto [email=" + email + ", contraseña=" + contraseña + "]";
	}
	
	
}
