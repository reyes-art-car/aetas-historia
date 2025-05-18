package modelo;

import controlador.DocumentoDto;
import vista.ServicioAetas;

public class ServicioAetasImpl implements ServicioAetas{
	
	DocumentoDao dao;

	@Override
	public void createArchive(DocumentoDto dto) {
		
		Documento doc = mapToDocumentFromDto(dto);
		
		dao.createArchive(doc);
		
	}

	@Override
	public DocumentoDto readArchiveById(int id_documento) {
		
		Documento docFound = dao.readArchiveById(id_documento);
		
		DocumentoDto docMapped = mapToDtoFromDocument(docFound);
		
		
		
		
		return docMapped;
	}	
	
	
	@Override
	public void deleteArchiveById(int id_documento) {
		
		dao.deleteArchive(id_documento);
		
		
	}
	
	@Override
	public DocumentoDto updateArchiveById(DocumentoDto dto) {
		
		try {
			Documento docFound = dao.readArchiveById(dto.getId());
		    if (docFound != null) {
		        docFound.setFormato(dto.getFormato());

		        dao.updateArchive(docFound);
		        Documento postUpdate = dao.readArchiveById(docFound.getId());

		        return mapToDtoFromDocument(postUpdate);
		    }
		} catch (Exception e) {
		    // Registro del error
		    System.err.println("Error al actualizar el documento: " + e.getMessage());
		    e.printStackTrace();

		    // Opcional: relanzar como una excepción de tipo específico
		    throw new RuntimeException("Error actualizando el documento", e);
		}
		
		return dto;
	}
	
	
	private Documento mapToDocumentFromDto(DocumentoDto dto) {
		
		Documento doc = new Documento();
		
		doc.setTitulo(dto.getTitulo());
		doc.setDescripcion(dto.getDescripcion());
		doc.setAnio(dto.getAnio());
		doc.setIdColeccion(dto.getIdColeccion());
		doc.setNombreAutor(dto.getNombreAutor());
		doc.setFormato(dto.getFormato());
		doc.setTipoDeDocumento(dto.getTipoDeDocumento());
		
		
		return doc;
	}
	
	private DocumentoDto mapToDtoFromDocument(Documento doc) {
		
		DocumentoDto dto = new DocumentoDto();
		
		dto.setId(doc.getId());
		dto.setTitulo(dto.getTitulo());
		dto.setDescripcion(dto.getDescripcion());
		dto.setAnio(dto.getAnio());
		dto.setIdColeccion(dto.getIdColeccion());
		dto.setNombreAutor(dto.getNombreAutor());
		dto.setFormato(dto.getFormato());
		dto.setTipoDeDocumento(dto.getTipoDeDocumento());
		
		
		return dto;
	}


	
	
	

}
