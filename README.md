<!-- CABECERA ANIMADA -->

<p align="center">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=26&pause=1000&color=6A5ACD&center=true&width=600&lines=%F0%9F%8F%9B%EF%B8%8F+AETAS+HISTORIA+-+Archivo+Hist%C3%B3rico+Digital" alt="Typing SVG" />
</p>

<p align="center">
  <img src="https://img.shields.io/badge/license-MIT-blueviolet?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/status-Activo-brightgreen?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/basedatos-MySQL%208.x-blue?style=for-the-badge&logo=mysql"/>
  <img src="https://img.shields.io/badge/lenguaje-Java-yellow?style=for-the-badge&logo=java"/>
</p>

---

<pre>
   __
  (`/\
  `=\/\ __...--~~~~~-._   _.-~~~~~--...__
   `=\/\               \ /               \\
    `=\/                V                 \\
    //_\___--~~~~~~-._  |  _.-~~~~~~--...__\\
   //  ) (..----~~~~._\ | /_.~~~~----.....__\\
  ===( INK )==========\\|//====================
__ejm\___/________dwb`---`____________________________________________
</pre>

> 💬 *"Rescatando el pasado, digitalizando el futuro."*

---

## 🧭 Sobre el proyecto

**Aetas Historia** es un archivo histórico digital que permite **consultar, conservar y organizar documentos históricos** con estructura moderna y flexible.

> 🏺 *Del latín:*  
> **aetas** = época o edad  
> **historia** = relato del pasado

---

## 🔥 Funcionalidades destacadas

✅ Filtros avanzados por colección, autor y época  
✅ Gestión de documentos: subir, editar, eliminar  
✅ Módulo de búsqueda para investigadores  
✅ Acceso con roles: administrador, investigador, visitante  
✅ Registro automático de actividad y validaciones

---

## ⚙️ Tecnologías

| 💡 Tecnología           | 🧩 Descripción                    |
|-------------------------|----------------------------------|
| 💻 Lenguaje              | Java, PL/SQL                     |
| 🗄️ Base de Datos         | MySQL 8.x                        |
| 🧠 IDE                   | Eclipse                          |
| 🔌 JDBC Driver           | MySQL Connector/J                |
| 🌀 Control de versiones  | Git                              |

---

## 🗃️ Modelo de Base de Datos

```
DOCUMENTO
AUTOR
COLECCION
DOCUMENTO_COLECCION
TIPO_DOCUMENTO
USUARIO
TIPO_USUARIO
```

📌 Diagrama entidad-relación: `aetas-historia-ER.drawio`

---

<details>
<summary>🧠 <strong>Procedimientos almacenados</strong></summary>

| 📋 Procedimiento         | ⚙️ Función                                  |
|--------------------------|---------------------------------------------|
| `insertar_documento`     | Añadir documento                            |
| `actualizar_documento`   | Modificar datos existentes                  |
| `eliminar_documento`     | Borrar por ID                               |
| `listar_documentos`      | Mostrar todos los documentos                |
| `ver_documento`          | Consultar detalle por ID                    |

</details>

<details>
<summary>⚙️ <strong>Triggers definidos</strong></summary>

| 🔄 Trigger                 | 🔍 Función                                                 |
|---------------------------|------------------------------------------------------------|
| `registrarActividadInsert`| Registra quién insertó el documento                        |
| `registrarActividadUpdate`| Guarda qué se modificó y cuándo                            |
| `registrarActividadDelete`| Registra quién lo eliminó                                  |
| `caracteresInválidos`     | Impide caracteres prohibidos en la inserción               |

</details>

---

## 🧪 Configuración del entorno

1. Instala **MySQL Server 8.x**
2. Crea la base de datos y el usuario:

```sql
CREATE DATABASE aetas_historia;

CREATE USER 'aetas_user'@'localhost' IDENTIFIED BY 'tu_contraseña';
GRANT ALL PRIVILEGES ON aetas_historia.* TO 'aetas_user'@'localhost';
```

3. Ejecuta el script `estructura.sql` para generar todas las tablas.

---

## 🚀 Cómo ejecutar el proyecto

```bash
# Clonar el proyecto
git clone https://github.com/reyes-art-car/aetas-historia.git
cd aetas-historia
```

🔧 Abre en **Eclipse**, conecta el driver **MySQL JDBC**  
🧠 Inicia sesión como el tipo de usuario correspondiente

---

## 👤 Autores

| 👨‍💻 Nombre                      | 📬 Contacto                                       |
|-------------------------------|--------------------------------------------------|
| **María Reyes Artacho Carrero** | [mac0045@alu.medac.es](mailto:mac0045@alu.medac.es) |
| **Ramón Manzano Alonso**        | [rma0020@alu.medac.es](mailto:rma0020@alu.medac.es)  |

---

## 📄 Licencia

Distribuido bajo la licencia **MIT**.  
Consulta el archivo [`LICENSE`](./LICENSE) para más información.

---

<pre>
            .--.           .---.        .-.
         .---|--|   .-.     | A |  .---. |~|    .--.
      .--|===|Ch|---|_|--.__| S |--|:::| |~|-==-|==|---.
      |%%|NT2|oc|===| |~~|%%| C |--|   |_|~|CATS|  |___|-.
      |  |   |ah|===| |==|  | I |  |:::|=| |    |GB|---|=|
      |  |   |ol|   |_|__|  | I |__|   | | |    |  |___| |
      |~~|===|--|===|~|~~|%%|~~~|--|:::|=|~|----|==|---|=|
hjw   ^--^---'--^---^-^--^--^---'--^---^-^-^-==-^--^---^-'
</pre>

<p align="center">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&pause=1000&color=F59E0B&center=true&width=440&lines=AETAS+HISTORIA+es+historia+viva.;Explora+%F0%9F%94%8D.+Conserva+%F0%9F%93%85.+Comparte+%F0%9F%92%AC." alt="Typing SVG">
</p>
