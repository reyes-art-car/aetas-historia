CREATE TABLE aetashistoria.autor
(
    id_autor               int         not null
        PRIMARY KEY,
    nombre                 varchar(30) not null,
    apellidos              varchar(30) not null,
    nacionalidad           varchar(30) not null,
    fecha_de_nacimiento    int         not null,
    fecha_de_fallecimiento int         not null,
    CONSTRAINT fk_documento_autor
        FOREIGN KEY (id_autor) references aetashistoria.documento (id_documento)
)
    collate = utf8mb4_spanish2_ci;

