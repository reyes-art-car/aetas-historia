package archivo;

public class autor {

	
//Atributos
	
	private String id_autor;
	private String nombre;
	private String apellidos;
	private int fecha_de_nacimiento;
	
	//Getters
	public String getId_autor() {
		return id_autor;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public int getFecha_de_nacimiento() {
		return fecha_de_nacimiento;
	}
	
	//Setters
	public void setId_autor(String id_autor) {
		this.id_autor = id_autor;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setFecha_de_nacimiento(int fecha_de_nacimiento) {
		this.fecha_de_nacimiento = fecha_de_nacimiento;
	}
	
	//ToString
	@Override
	public String toString() {
		return "autor [id_autor=" + id_autor + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", fecha_de_nacimiento=" + fecha_de_nacimiento + "]";
	}


}
