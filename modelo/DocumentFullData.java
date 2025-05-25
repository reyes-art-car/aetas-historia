// src/modelo/DocumentFullData.java
package modelo;

public class DocumentFullData {
    private final String titulo;
    private final String descripcion;
    private final String autor;
    private final int anio;
    private final String formato;
    private final String coleccion;
    private final String fechaDeSubida;
    private final String imagenPath;

    public DocumentFullData(
        String titulo,
        String descripcion,
        String autor,
        int anio,
        String formato,
        String coleccion,
        String fechaDeSubida,
        String imagenPath
    ) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.autor = autor;
        this.anio = anio;
        this.formato = formato;
        this.coleccion = coleccion;
        this.fechaDeSubida = fechaDeSubida;
        this.imagenPath = imagenPath;
    }

    public String getTitulo()         { return titulo; }
    public String getDescripcion()    { return descripcion; }
    public String getAutor()          { return autor; }
    public int    getAnio()           { return anio; }
    public String getFormato()        { return formato; }
    public String getColeccion()      { return coleccion; }
    public String getFechaDeSubida()  { return fechaDeSubida; }
    public String getImagenPath()     { return imagenPath; }
}
