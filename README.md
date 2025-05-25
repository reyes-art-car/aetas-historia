# Aetas Historia - Archivo Histórico Digital

**Aetas Historia** es un archivo histórico digital que permite conservar, digitalizar, consultar y organizar archivos históricos. Permite gestionar autores, colecciones, épocas históricas y tiene diferentes tipos de usuarios.

El nombre del proyecto surge de la palabra en latín *aetas*, que significa **edad o época**, y *historia*, en relación con la temática de la aplicación.

## 🎯 Funcionalidades principales

- Consultar archivos históricos
- Gestión de documentos por parte del administrador (subida, actualización, eliminación)
- Búsqueda de archivos por investigadores
- Acceso restringido para visitantes, con permisos limitados

## 🛠️ Tecnologías utilizadas

- Lenguaje: Java, PL/SQL  
- Base de Datos: MySQL 8.x  
- Driver JDBC: MySQL Connector/J  
- IDE utilizado: Eclipse  
- Sistema de control de versiones: Git  

## 🗃️ Estructura de la base de datos

La base de datos incluye tablas como:

- `DOCUMENTO`
- `AUTOR`
- `COLECCION`
- `DOCUMENTO_COLECCION`
- `TIPO_DOCUMENTO`
- `USUARIO`
- `TIPO_USUARIO`

Consulta el documento `aetas-historia-ER.drawio` para más detalles sobre el diseño entidad-relación.

### 🛠️ Procedimientos y Triggers en la Base de Datos

Este proyecto incorpora procedimientos almacenados y triggers (disparadores) para facilitar la gestión de documentos y mantener un historial de actividades de forma automatizada.

### 📄 Procedimientos (Stored Procedures)

A continuación se listan los procedimientos principales implementados en la base de datos:

- `insertar_documento`: Inserta un nuevo documento en la base de datos.
- `actualizar_documento`: Actualiza los datos de un documento existente.
- `eliminar_documento`: Elimina un documento por su ID.
- `listar_documentos`: Devuelve una lista completa de documentos registrados.
- `ver_documento`: Muestra los detalles de un documento específico por su ID.

### ⚙️ Triggers (Disparadores)

Se han definido los siguientes disparadores para registrar automáticamente las acciones realizadas sobre los documentos:

- `registrarActividadInsert`: Se ejecuta después de insertar un documento. Registra en una tabla adicional (`usuarioActividad`) qué usuario ha subido el documento.
- `registrarActividadUpdate`: Se ejecuta después de actualizar un documento. Registra que un documento ha sido modificado.
- `registrarActividadDelete`: Se ejecuta después de eliminar un documento. Guarda la acción en el registro de actividad de usuarios.
- `caracteresInválidos`: Se ejecuta antes de insertar un documento.Registra caracteres extraños e impide que se suba el documento.


## 🔧 Configuración del entorno

1. Instala MySQL Server 8.x y asegúrate de que esté corriendo.
2. Crea o selecciona la base de datos llamada `aetas_historia`.
3. Ejecuta el script `estructura.sql` para crear las tablas necesarias.
4. Crea un usuario con permisos sobre esa base de datos:

CREATE USER 'aetas_user'@'localhost' IDENTIFIED BY 'tu_contraseña';
GRANT ALL PRIVILEGES ON aetas_historia.* TO 'aetas_user'@'localhost';

## ▶️ Instrucciones de ejecución

1. Clona el repositorio:


git clone https://github.com/reyes-art-car/aetas-historia.git
cd aetas-historia


---

## 👥 Autores

- **María Reyes Artacho Carrero**  
  Correo: [mac0045@alu.medac.es](mailto:mac0045@alu.medac.es)

- **Ramón Manzano Alonso**  
  Correo: [rma0020@alu.medac.es](mailto:rma0020@alu.medac.es)


