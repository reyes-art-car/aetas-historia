package controlador;

public class DocumentoDto {
//Atributos
	
	private int id;
	private String titulo;
	private String descripcion;
	private String nombreAutor;
	private int anio;
	private String tipoDeDocumento;
	private String formato;
	private int idColeccion;
	public int getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String getNombreAutor() {
		return nombreAutor;
	}
	public int getAnio() {
		return anio;
	}
	public String getTipoDeDocumento() {
		return tipoDeDocumento;
	}
	public String getFormato() {
		return formato;
	}
	public int getIdColeccion() {
		return idColeccion;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public void setTipoDeDocumento(String tipoDeDocumento) {
		this.tipoDeDocumento = tipoDeDocumento;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public void setIdColeccion(int idColeccion) {
		this.idColeccion = idColeccion;
	}
	@Override
	public String toString() {
		return "DocumentoDto [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", nombreAutor="
				+ nombreAutor + ", anio=" + anio + ", tipoDeDocumento=" + tipoDeDocumento + ", formato=" + formato
				+ ", idColeccion=" + idColeccion + "]";
	}
	
	
	
	
	
	
	

	

	
	
	
}
