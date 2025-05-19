package modelo;

public interface DocumentoDao {
	
	public void createArchive (Documento archive);
	public Documento readArchiveById (int id_documento);
	public Documento updateArchive (Documento archive);
	public void deleteArchive (int id_documento);
}
