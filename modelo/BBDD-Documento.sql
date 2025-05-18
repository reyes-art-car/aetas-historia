CREATE TABLE aetashistoria.documento
(
    id_documento      INT AUTO_INCREMENT PRIMARY KEY,
    titulo            varchar(200) null,
    descripcion       varchar(200) null,
    autor             varchar(30)  null,
    anio              int          null,
    tipo_de_documento varchar(30)  null,
    formato           varchar(30)  null,
    id_coleccion      int          null
)
    collate = utf8mb4_spanish2_ci;

