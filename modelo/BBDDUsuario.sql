CREATE TABLE aetashistoria.usuario
(
    id_usuario      int(7)      not null,
    nombre          varchar(30) not null,
    apellidos       varchar(30) not null,
    email           varchar(30) not null,
    tipo_de_usuario varchar(30) not null
)
    collate = utf8mb4_spanish2_ci;

