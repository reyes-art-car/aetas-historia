-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-05-2025 a las 19:49:05
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `aetas_historia`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizar_documento` (IN `p_id_documento` INT, IN `p_formato` VARCHAR(50), IN `p_descripcion` VARCHAR(200), IN `p_titulo` VARCHAR(200), IN `p_autor` VARCHAR(100), IN `p_anio` INT, IN `p_tipo_documento` VARCHAR(100), IN `p_coleccion` VARCHAR(255))   BEGIN
    UPDATE documento
    SET 
        formato = p_formato,
        descripcion = p_descripcion,
        titulo = p_titulo,
        autor = p_autor,
        anio = p_anio,
        tipo_de_documento = p_tipo_documento,
        coleccion = p_coleccion
    WHERE id_Documento = p_id_documento;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminar_documento` ()   BEGIN
    DECLARE v_id_documento INT DEFAULT 1;

    DELETE FROM documento
    WHERE id_Documento = v_id_documento;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `insertar_documento` ()   BEGIN
  DECLARE v_titulo VARCHAR(200) DEFAULT 'Título de ejemplo';
  DECLARE v_descripcion VARCHAR(200) DEFAULT 'Descripción del documento';
  DECLARE v_autor VARCHAR(100) DEFAULT 'Nombre del autor';
  DECLARE v_anio INT DEFAULT 2023;
  DECLARE v_tipo_documento VARCHAR(100) DEFAULT 'Informe';
  DECLARE v_formato VARCHAR(50) DEFAULT 'PDF';
  DECLARE v_coleccion VARCHAR(255) DEFAULT 'Colección ejemplo';

  BEGIN
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
      SELECT 'Error al insertar documento.' AS mensaje;
    END;

    INSERT INTO documento (
      titulo, descripcion, autor, anio, tipo_de_documento, formato, coleccion
    ) VALUES (
      v_titulo, v_descripcion, v_autor, v_anio, v_tipo_documento, v_formato, v_coleccion
    );

    SELECT 'Documento insertado correctamente.' AS mensaje;
  END;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `listar_documentos` ()   BEGIN
    SELECT * FROM documento;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `ver_documento` ()   BEGIN
  DECLARE v_id_documento INT DEFAULT 1;

  SELECT 
    titulo,
    descripcion,
    autor,
    anio,
    tipo_de_documento,
    formato,
    coleccion
  FROM documento
  WHERE id_Documento = v_id_documento;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actividad`
--

CREATE TABLE `actividad` (
  `id_actividad` int(11) DEFAULT NULL,
  `tipo_de_actividad` int(11) DEFAULT NULL,
  `Documento_id_Documento` int(11) DEFAULT NULL,
  `usuario_id_usuario1` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autor`
--

CREATE TABLE `autor` (
  `id_autor` int(11) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `apellidos` int(11) DEFAULT NULL,
  `fecha_de_nacimiento` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Disparadores `autor`
--
DELIMITER $$
CREATE TRIGGER `EvitaFechaDeNacimientoFutura` BEFORE INSERT ON `autor` FOR EACH ROW BEGIN
  IF NEW.fecha_de_nacimiento > CURDATE() THEN
    SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'La fecha de nacimiento no puede ser futura';
  END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `coleccion`
--

CREATE TABLE `coleccion` (
  `id_coleccion` int(11) DEFAULT NULL,
  `etapa_historica` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Disparadores `coleccion`
--
DELIMITER $$
CREATE TRIGGER `ValidarNombreNoVacio` BEFORE INSERT ON `coleccion` FOR EACH ROW BEGIN
  IF NEW.nombre IS NULL OR NEW.nombre = '' THEN
    SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'El nombre de la colección no puede estar vacío';
  END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `documento`
--

CREATE TABLE `documento` (
  `id_Documento` int(11) NOT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `descripcion` text DEFAULT NULL,
  `autor` varchar(255) DEFAULT NULL,
  `anio` int(11) DEFAULT NULL,
  `tipo_de_documento` varchar(255) DEFAULT NULL,
  `formato` varchar(255) DEFAULT NULL,
  `coleccion` varchar(255) DEFAULT NULL,
  `fecha_de_subida` datetime NOT NULL,
  `id_tipo_dedocumento` int(11) DEFAULT NULL,
  `autor_id_autor` int(11) DEFAULT NULL,
  `tipo_de_documento_id_tipo_de_documento` int(11) DEFAULT NULL,
  `imagen` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `documento`
--

INSERT INTO `documento` (`id_Documento`, `titulo`, `descripcion`, `autor`, `anio`, `tipo_de_documento`, `formato`, `coleccion`, `fecha_de_subida`, `id_tipo_dedocumento`, `autor_id_autor`, `tipo_de_documento_id_tipo_de_documento`, `imagen`) VALUES
(65, '', 'Pergamino', 'Pergamino', 222, NULL, 'Pergamino', 'Pergamino', '2025-05-25 21:59:44', NULL, NULL, NULL, 'C:\\Users\\manzano\\Desktop\\pergamino.jpg'),
(67, 'Pergamino', 'Pergamino muy muy antiguo', 'Paco', 1999, NULL, 'Foto', 'Pergaminos', '2025-05-26 08:52:27', NULL, NULL, NULL, 'C:\\Users\\manzano\\Desktop\\Ramon1Pergamino.jpg'),
(68, 'RamonManzanoAlonso', 'Pergamino', 'RamonManzanoAlonso', 1999, NULL, 'Foto', 'Pergamino', '2025-05-26 09:13:16', NULL, NULL, NULL, 'C:\\Users\\manzano\\Desktop\\Ramon1Pergamino.jpg'),
(69, 'DocumentoSecreto', '1', '1', 1, NULL, '1', '1', '2025-05-26 10:43:17', NULL, NULL, NULL, 'C:\\Users\\manzano\\Desktop\\Ramon1Pergamino.jpg');

--
-- Disparadores `documento`
--
DELIMITER $$
CREATE TRIGGER `CaracteresInvalidos` BEFORE INSERT ON `documento` FOR EACH ROW BEGIN
  -- Comprobamos título y descripción, puedes replicar la condición para otros campos si lo deseas
  IF NEW.titulo     REGEXP '[#\$%\^&\*()_\+]' 
  OR NEW.descripcion REGEXP '[#\$%\^&\*()_\+]' THEN
    SIGNAL SQLSTATE '45000' 
      SET MESSAGE_TEXT = 'El título o la descripción contienen caracteres no permitidos';
  END IF;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `ValidarTituloNoVacio` BEFORE INSERT ON `documento` FOR EACH ROW BEGIN
  IF NEW.titulo IS NULL OR NEW.titulo = '' THEN
    SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'El título no puede estar vacío';
  END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `documento_coleccion`
--

CREATE TABLE `documento_coleccion` (
  `Documento_id_Documento` int(11) DEFAULT NULL,
  `Documento_autor_id_autor` int(11) DEFAULT NULL,
  `Documento_tipo_de_documento_id_tipo_de_documento` int(11) DEFAULT NULL,
  `coleccion_id_coleccion` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_de_documento`
--

CREATE TABLE `tipo_de_documento` (
  `id_tipo_de_documento` int(11) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `descripcion` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_de_usuario`
--

CREATE TABLE `tipo_de_usuario` (
  `id_tipo_de_usuario` int(11) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipo_de_usuario`
--

INSERT INTO `tipo_de_usuario` (`id_tipo_de_usuario`, `nombre`) VALUES
(1, 'usuario'),
(2, 'admin');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `tipo_de_usuario_id_tipo_de_usuario` int(11) DEFAULT NULL,
  `contraseña` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `nombre`, `email`, `tipo_de_usuario_id_tipo_de_usuario`, `contraseña`) VALUES
(NULL, 'tuesta', 'faksdfjlksa@gmail.com', 2, 'fjkalsdjkalsf'),
(NULL, 'ramon', 'fjaklldjfkal', 2, 'fajksdlfjsak'),
(NULL, 'enrique', 'fajkldfjkasldfjas', 2, 'fjaskldfjak'),
(NULL, 'NENO', 'faskjflkasjdfkla', 2, 'fsakldjfasklj'),
(NULL, 'dd', 'dd', 2, 'dd'),
(NULL, 'ee', 'ee', 2, 'ee'),
(NULL, 'd', 'd', 2, 'd'),
(NULL, 'pepe', 'eee', 2, 'ee'),
(NULL, '???', '???????', 2, '????'),
(NULL, 'rr', '', 2, 'rr'),
(NULL, 's', 's', 2, 's'),
(NULL, 'a', 'a', 2, 'a'),
(NULL, 'q', 'q', 2, 'q'),
(NULL, 'ramonm', 'ramonm', 2, 'ramonm'),
(NULL, 'oo', 'oo', 2, 'oo'),
(NULL, 'ss', 'ss', 2, 'ss'),
(NULL, 'i', 'i', 2, 'i'),
(NULL, 'l', 'l', 2, 'l'),
(NULL, 'eep', 'eep', 2, 'eep'),
(NULL, 'ww', 'ww', 2, 'ww'),
(NULL, 'sse', 'ss', 2, 'ss'),
(NULL, 'kkkss', 'kkkk', 2, 'sskk'),
(NULL, 'qqqqq', 'qqqq', 2, 'qqqqqqq'),
(NULL, 'xxxxxx', 'xxxxxx', 2, 'xxxxxx'),
(NULL, 'fff', 'fff', 2, 'fff'),
(NULL, 'holi', 'holi', 2, 'holi'),
(NULL, 'ddddd', 'ddddd', 2, 'ddddd'),
(NULL, 'xxxxxxxx', 'xxxxxxxxxx', 2, 'xxxxxxxxxx'),
(NULL, 'RAMONPRUEBA', 'RAMONPRUEBA', 2, 'RAMONPRUEBA'),
(NULL, 'RAMONOTRAPRUEBA', 'RAMONOTRAPRUEBA', 2, 'RAMONOTRAPRUEBA'),
(NULL, 'heiufhpie1uwhf9op', 'wejhfnipquewhfp', 2, 'oiwehf9uwehfoiwuehf8'),
(NULL, 'RAMONRUBIO', 'RAMONRUBIO', 2, 'RAMONRUBIO'),
(NULL, 'ramonsoyguapo', 'ramonsoyguapo', 2, 'ramonsoyguapo'),
(NULL, 'RAMONHOOLA', 'RAMONHOOLA', 2, 'RAMONHOOLA'),
(NULL, 'dddddd', 'ddd', 2, 'dd'),
(NULL, 'lovo', 'lovo', 2, 'lovo'),
(NULL, 'OLITA', 'OLITA', 2, 'OLITA'),
(NULL, 'OLITAS', 'OLITA', 2, 'OLITA'),
(NULL, 'OTRAPRUBAYMEMATO', 'OTRAPRUBAYMEMATO', 2, 'OTRAPRUBAYMEMATO'),
(NULL, 'QQQQ', 'QQQ', 2, 'QQQQQ'),
(NULL, 'WWWW', 'WWWW', 2, 'WWWW'),
(NULL, 'NFIQWEUHFPIOQEWR', 'KJNMMFO[WIQEJ', 2, 'KENMFOW[EIHF'),
(NULL, 'HOLAOLA', 'HOLAOLA', 2, 'HOLAOLA'),
(NULL, 'eee', 'eee', 2, 'eee'),
(NULL, 'HOLAHOLA', 'HOLA', 2, 'HOLAHOLA'),
(NULL, 'RAMONLOCO', 'RAMONLOCO', 2, 'RAMONLOCO'),
(NULL, 'ffffff', 'fff', 2, 'fffff'),
(NULL, 'ssssss', 'sss', 2, 'sss'),
(NULL, 'HolaSoyRamon', 'HolaSoyRamon', 2, 'HolaSoyRamon'),
(NULL, 'RamonManzano', 'RamonManzano', 2, 'RamonManzano'),
(NULL, '1', '1', 2, '1'),
(NULL, 'gggh', 'fghsfghfs', 2, 'ghghg'),
(NULL, 'Diego', 'Diego@gmail.com', 2, 'Diego'),
(NULL, 'Juan', 'Juan@gmail.com', 2, 'Juan'),
(NULL, 'oscar', 'oscar', 2, 'oscar'),
(NULL, 'ee', 'ee@', 2, 'ee'),
(NULL, 'a', '@', 2, 'a'),
(NULL, 'd', 'd@', 2, 'a'),
(NULL, 'dddd', 'd', 2, 'ddd'),
(NULL, 'eeeewfgq', 'eee@', 2, 'eee'),
(NULL, 'wew', 'wew@', 2, 'wew'),
(NULL, 'wwwwfq', 'wwww@', 2, 'wwww'),
(NULL, 'fffgfgfg', 'gfgfgfg@', 2, 'fgfgfgf'),
(NULL, 'eeee', 'eeee@', 2, 'eeeee'),
(NULL, 'qqqqwddw', 'qqqqqqq@', 2, 'qqqqqq'),
(NULL, '44444', '4444@', 2, '44444'),
(NULL, 'eeeerr', 'eeeeer@', 2, 'eeeer'),
(NULL, '6666', '666666@', 2, '6666666'),
(NULL, 'ewqE', 'wqeWE@', 2, 'eqwew'),
(NULL, 'wwwww', 'wwwwwwwwww@gmai.com', 2, 'wwwwwww'),
(NULL, 'Sergiono', 'Sergiono@Sergiono.com', 2, 'Sergiono'),
(NULL, 'Ramon123', 'Ramon@gmail.com', 2, 'Ramon123'),
(NULL, 'Ramon1234', 'Ramon1234@gmail.com', 2, 'Ramon123'),
(NULL, 'dddd4', 'dd@ffff', 2, 'ddddr'),
(NULL, 'RamonManzanoAlonso', 'Ramon@gmail.com', 2, 'Ramon1234'),
(NULL, 'Ramon123434', '42@gmail.com', 2, '24242'),
(NULL, 'Ramon Manznao', 'ramon@gmail.com', 2, 'Ramon1234'),
(NULL, 'RamonRamon', 'RamonRamon@gmail.ccom', 2, 'RamonRamon'),
(NULL, 'UsuarioCurioso', 'UsuarioCurioso@gmail.com', 2, 'UsuarioCurioso123'),
(NULL, '111', '1111@', 2, '1111'),
(NULL, 'Uusario', 'Uusario@', 2, 'Uusario'),
(NULL, 'Hola', 'hola@', 2, 'hola'),
(NULL, 'holaa', 'hola@', 2, 'hola'),
(NULL, 'RamonManzanoALonsoManzano', 'RamonManzanoALonso@', 2, 'RamonManzanoALonso'),
(NULL, 'a233', 'a@', 2, 'a'),
(NULL, 'Ramaoiowihdoiwq', 'rgeqrg@', 2, 'ergergergq'),
(NULL, 'gweoyugwe', 'kwejfhb;wo@', 2, 'ewikjfjo[we'),
(NULL, 'UsuarioHola', 'UsuarioHola@', 2, 'UsuarioHola'),
(NULL, '1222223', '1@', 2, '1'),
(NULL, 'sswwddwqdww', 's@', 2, 'sddddddddd');

--
-- Disparadores `usuario`
--
DELIMITER $$
CREATE TRIGGER `evitarContrasenaCorta` BEFORE INSERT ON `usuario` FOR EACH ROW BEGIN
  IF LENGTH(NEW.contraseña) < 6 THEN
    SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'La contraseña debe tener al menos 6 caracteres';
  END IF;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `evitarinsertarusuarioemailduplicado` BEFORE INSERT ON `usuario` FOR EACH ROW BEGIN
  IF EXISTS (SELECT 1 FROM usuario WHERE email = NEW.email) THEN
    SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'El email ya está registrado';
  END IF;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `evitarnombrevaciousuario` BEFORE INSERT ON `usuario` FOR EACH ROW BEGIN
  IF NEW.nombre IS NULL OR NEW.nombre = '' THEN
    SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'El nombre no puede estar vacío';
  END IF;
END
$$
DELIMITER ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `documento`
--
ALTER TABLE `documento`
  ADD PRIMARY KEY (`id_Documento`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `documento`
--
ALTER TABLE `documento`
  MODIFY `id_Documento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=70;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
