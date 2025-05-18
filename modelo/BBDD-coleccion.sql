CREATE TABLE aetashistoria.coleccion
(
    id_coleccion    int(7)      not null
        PRIMARY KEY ,
    nombre          varchar(30) not null,
    etapa_historica varchar(30) not null
)
    collate = utf8mb4_spanish2_ci;

