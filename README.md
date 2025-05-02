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
- `TIPO_DOCUMENTO`
- `USUARIO`
- `TIPO_USUARIO`

Consulta el documento `aetas-historia-ER.drawio` para más detalles sobre el diseño entidad-relación.

## 🔧 Configuración del entorno

1. Instala MySQL Server 8.x y asegúrate de que esté corriendo.
2. Crea o selecciona la base de datos llamada `aetas_historia`.
3. Ejecuta el script `estructura.sql` para crear las tablas necesarias.
4. Crea un usuario con permisos sobre esa base de datos:

CREATE USER 'aetas_user'@'localhost' IDENTIFIED BY 'tu_contraseña';
GRANT ALL PRIVILEGES ON aetas_historia.* TO 'aetas_user'@'localhost';

## ▶️ Instrucciones de ejecución

1. Clona el repositorio:


git clone https://github.com/tuusuario/aetas-historia.git
cd aetas-historia


---

## 👥 Autores

- **María Reyes Artacho Carrero**  
  Correo: [mac0045@alu.medac.es](mailto:mac0045@alu.medac.es)

- **Ramón Manzano Alonso**  
  Correo: [rma0020@alu.medac.es](mailto:rma0020@alu.medac.es)


