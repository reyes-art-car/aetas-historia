CREATE TABLE aetashistoria.documento_coleccion
(
    id_coleccion int not null,
    id_documento int not null,
    CONSTRAINT id_documento
        FOREIGN KEY (id_documento) REFERENCES aetashistoria.documento (id_documento)
)
    collate = utf8mb4_spanish2_ci;

CREATE INDEX id_coleccion
    on aetashistoria.documento_coleccion (id_coleccion);

