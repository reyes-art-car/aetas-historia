package modelo;

public class Documento {
//Atributos
	
	private String id_documento;
	private String titulo;
	private String descripcion;
	private String id_autor;
	private int anio;
	private String id_tipo_de_documento;
	private String formato;
	private String id_coleccion;
	private int fecha_de_subida;
	
	//Getters
	public String getId_documento() {
		return id_documento;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String getId_autor() {
		return id_autor;
	}
	public int getAnio() {
		return anio;
	}
	public String getId_tipo_de_documento() {
		return id_tipo_de_documento;
	}
	public String getFormato() {
		return formato;
	}
	public String getId_coleccion() {
		return id_coleccion;
	}
	public int getFecha_de_subida() {
		return fecha_de_subida;
	}
	//Setters
	public void setId_documento(String id_documento) {
		this.id_documento = id_documento;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setId_autor(String id_autor) {
		this.id_autor = id_autor;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public void setId_tipo_de_documento(String id_tipo_de_documento) {
		this.id_tipo_de_documento = id_tipo_de_documento;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public void setId_coleccion(String id_coleccion) {
		this.id_coleccion = id_coleccion;
	}
	public void setFecha_de_subida(int fecha_de_subida) {
		this.fecha_de_subida = fecha_de_subida;
	}
	
	//ToString
	@Override
	public String toString() {
		return "Documento [id_documento=" + id_documento + ", titulo=" + titulo + ", descripcion=" + descripcion
				+ ", id_autor=" + id_autor + ", anio=" + anio + ", id_tipo_de_documento=" + id_tipo_de_documento
				+ ", formato=" + formato + ", id_coleccion=" + id_coleccion + ", fecha_de_subida=" + fecha_de_subida
				+ "]";
	}
	

	
	
	
}
