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
