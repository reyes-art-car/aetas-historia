-- SQL generado automáticamente desde Diagrama MWB con tipos genéricos
CREATE DATABASE IF NOT EXISTS aetas_historia;
USE aetas_historia;

-- Tabla Documento
CREATE TABLE IF NOT EXISTS `Documento` (
`id_Documento` INT,
`titulo` VARCHAR(255),
`descripcion` TEXT,
`autor` VARCHAR(255),
`anio` INT,
`tipo_de_documento` VARCHAR(255),
`formato` VARCHAR(255),
`coleccion` VARCHAR(255),
`fecha_de_subida` INT,
`id_tipo_dedocumento` INT,
`autor_id_autor` INT,
`tipo_de_documento_id_tipo_de_documento` INT
) ENGINE=InnoDB;


-- Tabla tipo_de_documento
CREATE TABLE IF NOT EXISTS `tipo_de_documento` (
`id_tipo_de_documento` INT,
`nombre` VARCHAR(255),
`descripcion` TEXT
) ENGINE=InnoDB;


-- Tabla coleccion
CREATE TABLE IF NOT EXISTS `coleccion` (
`id_coleccion` INT,
`etapa_historica` VARCHAR(255),
`nombre` VARCHAR(255)
) ENGINE=InnoDB;


-- Tabla documento_coleccion
CREATE TABLE IF NOT EXISTS `documento_coleccion` (
`Documento_id_Documento` INT,
`Documento_autor_id_autor` INT,
`Documento_tipo_de_documento_id_tipo_de_documento` INT,
`coleccion_id_coleccion` INT
) ENGINE=InnoDB;


-- Tabla actividad
CREATE TABLE IF NOT EXISTS `actividad` (
`id_actividad` INT,
`tipo_de_actividad` INT,
`Documento_id_Documento` INT,
`usuario_id_usuario1` INT
) ENGINE=InnoDB;


-- Tabla autor
CREATE TABLE IF NOT EXISTS `autor` (
`id_autor` INT,
`nombre` VARCHAR(255),
`apellidos` INT,
`fecha_de_nacimiento` DATE
) ENGINE=InnoDB;


-- Tabla usuario
CREATE TABLE IF NOT EXISTS `usuario` (
`id_usuario` INT,
`nombre` VARCHAR(255),
`email` VARCHAR(255),
`tipo_de_usuario_id_tipo_de_usuario` INT
) ENGINE=InnoDB;


-- Tabla tipo_de_usuario
CREATE TABLE IF NOT EXISTS `tipo_de_usuario` (
`id_tipo_de_usuario` INT,
`nombre` VARCHAR(255)
) ENGINE=InnoDB;
