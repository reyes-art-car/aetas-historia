# 🏛️ Aetas Historia - Archivo Histórico Digital

![License](https://img.shields.io/badge/license-MIT-blue)
![Status](https://img.shields.io/badge/status-Actively--Maintained-brightgreen)
![MySQL](https://img.shields.io/badge/DB-MySQL%208.x-blue)
![Java](https://img.shields.io/badge/language-Java-yellow)

> _"Rescatando el pasado, digitalizando el futuro."_

---

## 📖 Descripción

**Aetas Historia** es un archivo histórico digital que permite **conservar, digitalizar, consultar y organizar archivos históricos**.  
Gestión de autores, colecciones, épocas históricas y diferentes tipos de usuarios.

📜 El nombre del proyecto proviene del latín:

- **aetas** → _edad o época_  
- **historia** → temática central de la aplicación

---

## 🎯 Funcionalidades principales

- 🔍 Consultar archivos históricos por filtros (colección, autor, época)
- 🛠️ Administración de documentos (subida, edición, eliminación)
- 📁 Búsqueda avanzada para investigadores
- 🔐 Acceso restringido para visitantes con permisos limitados

---

## 🛠️ Tecnologías utilizadas

| Categoría        | Herramienta                        |
|------------------|------------------------------------|
| 🔤 Lenguaje       | Java, PL/SQL                       |
| 💾 Base de Datos | MySQL 8.x                          |
| 🧩 Driver JDBC    | MySQL Connector/J                  |
| 🧠 IDE           | Eclipse                            |
| 🔄 Control       | Git                                |

---

## 🗃️ Estructura de la Base de Datos

📌 Tablas principales:

- `DOCUMENTO`
- `AUTOR`
- `COLECCION`
- `DOCUMENTO_COLECCION`
- `TIPO_DOCUMENTO`
- `USUARIO`
- `TIPO_USUARIO`

📎 Consulta el diseño entidad-relación en: `aetas-historia-ER.drawio`

---

## 🧠 Procedimientos y Triggers

### 📄 Procedimientos Almacenados

| Procedimiento          | Descripción                                  |
|------------------------|----------------------------------------------|
| `insertar_documento`   | Inserta un nuevo documento                   |
| `actualizar_documento` | Actualiza datos de un documento existente    |
| `eliminar_documento`   | Elimina un documento por su ID               |
| `listar_documentos`    | Devuelve todos los documentos registrados    |
| `ver_documento`        | Muestra los detalles de un documento por ID  |

### ⚙️ Triggers (Disparadores)

| Trigger                    | Función                                                            |
|----------------------------|---------------------------------------------------------------------|
| `registrarActividadInsert`| Registra qué usuario insertó un documento                           |
| `registrarActividadUpdate`| Guarda la actividad al actualizar documentos                        |
| `registrarActividadDelete`| Almacena acciones de eliminación de documentos                      |
| `caracteresInválidos`     | Previene caracteres no válidos antes de insertar un nuevo documento |

---

## ⚙️ Configuración del entorno

1. Instala **MySQL Server 8.x** y asegúrate de que esté corriendo.
2. Crea una base de datos llamada `aetas_historia`
3. Ejecuta el script `estructura.sql` para crear las tablas.
4. Crea un usuario y asigna permisos:

```sql
CREATE USER 'aetas_user'@'localhost' IDENTIFIED BY 'tu_contraseña';
GRANT ALL PRIVILEGES ON aetas_historia.* TO 'aetas_user'@'localhost';
