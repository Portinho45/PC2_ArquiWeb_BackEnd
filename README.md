# PC2_ArquiWeb_BackEnd
PC2 de Arquitectura Web 2023-1
Práctica:
Se solicita elabore una aplicación web y debe contar con las siguientes características:
a.	Tecnologías 

Spring Boot
Spring DataJPA
Base de Datos – PostgreSQL
b.	Consideraciones: 
•	Utilizar una base de datos PostgreSQL
•	Considere los campos mencionados en la tabla dada y la historia de usuario para el modelo de la tabla en la base de datos.
•	Implemente sólo lo solicitado en las historias de usuario.
•	Los nombres de las variables del programa deben ser escritas en inglés
•	Claridad y eficiencia de la lógica implementada, 
•	La organización de los componentes debe guardar coherencia con lo desarrollado en clase.
•	Los nombres de las variables de todo el programa deben contener las dos iniciales de sus apellidos. 

Variable: Edad
Apellido: Ramírez Méndez
Ejemplo: rmEdad

•	El nombre de la base de datos:
La base de datos deberá estar implementada en PostgreSQL y deberá llamarse apellidoPaternoBDPC2
•	Las rutas de los controladores:
La ruta del controlador debe ser su apellido paterno.
•	El nombre con el que debe crear el proyecto debe ser apellidoPaternoapellidoMaterno.


 
Enunciado

Se solicita desarrollar una API REST para gestionar los vehículos de una concesionaria de automóviles. La base de datos deberá estar implementada en PostgreSQL y se llamará "apellidoPaternoBDPC2".

La concesionaria maneja vehículos de diferentes tipos: sedán, SUV, deportivo. Para gestionar los vehículos, se requiere implementar las siguientes historias de usuario:

HUB01: Como desarrollador, quiero registrar un vehículo para su gestión.

Criterio de aceptación:
•	Se debe registrar un vehículo con todos sus atributos obligatorios.
•	Se debe autogenerar un identificador único para el vehículo.
•	Se utilizará Swagger para visualizar la transacción.
•	Se debe mostrar en formato JSON el vehículo registrado.
•	Se utilizará el patrón DTO.
HUB02: Como desarrollador, quiero listar todos los vehículos para su gestión.

Criterio de aceptación:
•	Se deben listar todos los vehículos con todos sus atributos obligatorios.
•	Se utilizará Swagger para visualizar la transacción.
•	Se debe mostrar en formato JSON los vehículos listados.
•	Se utilizará el patrón DTO.
HUB03: Como desarrollador, quiero buscar un vehículo por su modelo para su gestión.

Criterio de aceptación:
•	Se debe buscar el vehículo por su modelo y mostrar todos sus atributos en el resultado de la búsqueda.
•	Se utilizará Swagger para visualizar la transacción.
•	Se debe mostrar en formato JSON el vehículo encontrado.
•	Se utilizará el patrón DTO.
HUB04: Como desarrollador, quiero visualizar la cantidad de vehículos de tipo deportivo.

Criterio de aceptación:
•	Se debe mostrar la cantidad de vehículos de tipo deportivo.
•	Se utilizará Swagger para visualizar el resultado de la transacción.
•	Se debe mostrar en formato JSON la cantidad solicitada.
•	Se utilizará el patrón DTO.

Vehículo  						        
Id
placa 
Tipo
fechaFabricacion
FechaCompra
Modelo

Estas historias de usuario se enfocan en las operaciones básicas de registro, listado y búsqueda de vehículos, así como en obtener información estadística sobre los vehículos de tipo deportivo. Utilizar el patrón DTO asegurará una separación adecuada entre la capa de presentación y los datos transferidos. Además, Swagger proporcionará una documentación interactiva y facilitará la visualización y prueba de los endpoints de la API.


Rúbrica de Evaluación
Criterio de calificación	Excelente	Promedio	Deficiente
C01. Registrar 	Registra la funcionalidad solicitada en la historia de usuario A, y cumple con todos los criterios de aceptación.
	Registra la funcionalidad solicitada en la historia de usuario, pero no cumple con todos los criterios de aceptación 	No registra, tiene errores, no funciona.
	3 puntos	1.5 puntos	0 puntos
C02. Listar	Lista la funcionalidad solicitada en la historia de usuario B, y cumple con todos los criterios de aceptación
	Registra la funcionalidad solicitada en la historia de usuario, pero no cumple con todos los criterios de aceptación 	No lista, no funciona.
	3 puntos	1.5 puntos	0 puntos
C03. Buscar	Busca por el campo solicitado, la funcionalidad solicitada cumple totalmente la historia de usuario C y el criterio de aceptación	Lista la funcionalidad solicitada sin el cálculo, aplicación de reglas o falta alguno de los datos solicitados en la historia
	No busca, no funciona, tiene errores.
	4 puntos	2 puntos	0 puntos
C04. Obtiene cantidad	Obtiene la cantidad de registros solicitados de la entidad dada. Funciona.		No funciona, no se obtiene la cantidad.
	4 puntos		0 puntos
C05.  Code Organization	El desarrollador organiza el código agrupando en paquetes y las clases según propósito o funcionalidad. Usa la estructura desarrollada en clase.	El desarrollador aplica sólo en parte la organización del código, agrupando en paquetes y clases según propósito o funcionalidad 	No se evidencia un criterio de organización del código en paquetes
	1 puntos	0.5 puntos	0 puntos
C06. Nombre de proyecto y variables en todo el programa	Cumple con el nombre del proyecto y todas las variables del programa.	Cumple parcialmente con el nombre del proyecto y con las variables del programa	No aplica
	2 puntos	1punto	0 puntos
C07.DTO	Usa el patrón DTO		No usa el patrón DTO
	1		0
C08. Rutas 	Aplica el formato solicitado para las rutas de los controladores.		No aplica el formato para las rutas solicitadas. 
	1 puntos		0 puntos
C09.BD	Cumple con el formato de nombre de BD solicitado.		No cumple con el formato de nombre solicitado.
	1 puntos		0 puntos
