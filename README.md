# TP6_DesarrolloSoftware
Este proyecto es una implementación de REST utilizando POSTMAN para analizar las modificaciones, además JPA (Java Persistence API) utilizando la base de datos H2 y aplicando ENVERS para tener una auditoria de los cambios en nuestra base de datos. A continuación, se detallan los pasos para descargar, configurar, y ejecutar el proyecto.
En este proceso creamos clases genericas de Controladores y servicios. Además generamos Querys personalizadas para cada clase.

# Prerrequisitos

Antes de comenzar, asegúrate de tener instalado lo siguiente en tu sistema:

IntelliJ IDEA

H2 Database

POSTMAN

# Instalación

Descargar el repositorio:

Haz clic en el botón Code en la página principal del repositorio.

Selecciona Download ZIP y guarda el archivo ZIP en tu computadora.

Extrae el contenido del archivo ZIP en una ubicación de tu preferencia.

# Abrir el proyecto en IntelliJ IDEA:

Abre IntelliJ IDEA.
Selecciona File > Open... y navega hasta la carpeta donde extrajiste el contenido del ZIP.

Selecciona la carpeta raíz del proyecto y haz clic en OK para abrirlo.

# Configuración de la base de datos H2

Conectar a la base de datos H2 desde: http://localhost:8080/h2-console/

Luego modificar por esta URL: jdbc:h2:mem:./testdb

# Ejecución del Proyecto

Ejecutar el proyecto:

En IntelliJ IDEA, navega hasta la clase Main ubicada en src/main/java/org/example/Main.java.

Haz clic derecho sobre el archivo Main.java y selecciona Run 'Main.main()'.
Verificación de los objetos creados:

Después de ejecutar el proyecto, vuelve a la consola de H2.

Ejecuta una consulta para verificar que las tablas y los datos correspondientes han sido creados correctamente:
sql

# Ejecución de la Auditoria

Para probar la auditoria se debe comentar todo el código (líneas 17 a 110) donde se crean las tablas una vez que ya las hayamos
creado y guardado en nuestra base de datos: 

Luego accedemos al archivo persistence.xml y modificamos el "create" por un "update"

Finalmente debemos:

Si queremos hacer una modificación de la tabla factura descomentamos las líneas (114-115-116)

Si queremos hacer una elimiación de la tabla factura descomentamos las líneas (119-120)

# Ejecución de Postman

Abrir postman y agregar las request con sus respectivas URL y realizar las modificaciones correspondientes para verificar su correcto funcionamiento.

