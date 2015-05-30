# REST-Services-MySQL
Maven, Spark Framework and Hibernate

* Maven
	- En los ficheros .pom se encuentran todas las librerias que se usan en el proyecto y su versión.

* Hibernate
	- Configurado mediante anotaciones JPA.
	- En el fichero persistence.xml hay que ir añadiendo las nuevas entidades que se creen.
	- Existe un DAO genérico que al extender de él ya tendríamos las operaciones básicas. En caso de necesitar consultas específicas se añadirian en el DAO de la propia entidad.

* Spark Framework
	- Se encarga de servir todas las peticiones REST. 

* GSON
	- Para convertir los objetos en JSON y los JSON en objetos necesitamos alguna forma de serializar y deserializar. Para esto existe GSON de Google.

* INSTALACIÓN
	- Clonar el respositorio
	- En eclipse: File --> Import --> "Existing Maven Projects"
	- Crear una base de datos (create database test) en MySQL.
	- En fichero persistence.xml poner datos de conexión, es decir, contraseña, nombre de usuario y nombre de la base de datos. En este caso se llama test.

* COMPILAR
	- Desde terminal o desde Eclipse: mvn package
	- Ir a la carpeta target del proyecto y tendremos un jar con todo listo para funcionar.

* EJECUTAR
	- java -jar spark-rest.jar
	- Ir al localhost:8080 y el poryecto estará funcionando.
	- Servicio REST de prueba: localhost:8080/test/id, siendo id el id de un objeto existente en la tabla test de la base de datos test.
