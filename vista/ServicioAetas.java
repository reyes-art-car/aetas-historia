package vista;

import controlador.DocumentoDto;

public interface ServicioAetas {
	
	public void createArchive (DocumentoDto doc);
	public DocumentoDto readArchiveById (int id_documento);
	public DocumentoDto updateArchiveById (DocumentoDto dto);
	public void deleteArchiveById (int id_documento);

}
