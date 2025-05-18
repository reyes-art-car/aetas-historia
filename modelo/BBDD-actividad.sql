CREATE TABLE aetashistoria.actividad
(
    id_actividad       int(7)      not null,
    id_documento       int(7)      not null,
    id_usuario         int(7)      not null,
    fecha_de_actividad int(6)      not null,
    tipo_de_actividad  varchar(30) not null
)
    collate = utf8mb4_spanish2_ci;

