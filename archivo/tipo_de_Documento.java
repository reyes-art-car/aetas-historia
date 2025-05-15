package archivo;

public class tipo_de_Documento {

	
//Atributos
	
	private String id_tipo_de_documento;
	private String nombre;
	private String descripcion;
	public String getId_tipo_de_documento() {
		return id_tipo_de_documento;
	}
	//Getters
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	//Setters
	public void setId_tipo_de_documento(String id_tipo_de_documento) {
		this.id_tipo_de_documento = id_tipo_de_documento;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	//ToString
	@Override
	public String toString() {
		return "tipo_de_Documento [id_tipo_de_documento=" + id_tipo_de_documento + ", nombre=" + nombre
				+ ", descripcion=" + descripcion + "]";
	}
	

}
