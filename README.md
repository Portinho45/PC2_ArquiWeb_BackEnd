# **Universidad Peruana de Ciencias Aplicadas**
**Arquitectura de Aplicaciones Web**

**Práctica Calificada02**

**202301**

**Sedes: Todas**

**Duración:70 min**

**Profesores**

**Indicaciones:**

- Las preguntas de tipo práctico serán entregadas a través de la opción examinar archivos.
- Debe subir el ejercicio con extensión .rar o .zip al Blackboard en la opción examinar de donde descargó el examen.
- Recuerde que, de no asignar los nombres a todas las variables del programa, de acuerdo con el formato solicitado afectará el puntaje especificado en la rúbrica.
- Puede utilizar ejercicios desarrollados en clase, como guía.
- No se permite copiar del compañero, se penalizará con nota cero para el desarrollo de ejercicios iguales y evidencias de plagio.
- De no adjuntar su solución a través del aula virtual, la calificación será CERO.



**Práctica**:

Se solicita elabore una aplicación web y debe contar con las siguientes características:

1. **Tecnologías** 


|<h1>Spring Boot</h1>|
| :- |
|<h1>Spring DataJPA</h1>|
|<h1>Base de Datos – PostgreSQL</h1>|
1. **Consideraciones:** 
- Utilizar una base de datos PostgreSQL
- Considere los campos mencionados en la tabla dada y la historia de usuario para el modelo de la tabla en la base de datos.
- Implemente **sólo** lo solicitado en las historias de usuario.
- Los nombres de las variables del programa deben ser escritas en **inglés**
- Claridad y eficiencia de la lógica implementada, 
- La organización de los componentes debe guardar coherencia con lo desarrollado en clase.
- Los nombres **de las variables de todo el programa** deben contener las dos iniciales de sus apellidos. 

Variable: Edad

**Apellido: Ramírez Méndez**

**Ejemplo: rmEdad**

- **El nombre de la base de datos:**

La base de datos deberá estar implementada en PostgreSQL y deberá llamarse **apellidoPaternoBDPC2**

- **Las rutas de los controladores:**

La ruta del controlador debe ser su apellido paterno.

- El nombre con el que debe crear el proyecto debe ser **apellidoPaternoapellidoMaterno**.


**Enunciado**

Se solicita desarrollar una API REST para gestionar los vehículos de una concesionaria de automóviles. La base de datos deberá estar implementada en PostgreSQL y se llamará "apellidoPaternoBDPC2".

La concesionaria maneja vehículos de diferentes tipos: sedán, SUV, deportivo. Para gestionar los vehículos, se requiere implementar las siguientes historias de usuario:

HUB01: Como desarrollador, quiero registrar un vehículo para su gestión.

Criterio de aceptación:

- Se debe registrar un vehículo con todos sus atributos obligatorios.
- Se debe autogenerar un identificador único para el vehículo.
- Se utilizará Swagger para visualizar la transacción.
- Se debe mostrar en formato JSON el vehículo registrado.
- Se utilizará el patrón DTO.

HUB02: Como desarrollador, quiero listar todos los vehículos para su gestión.

Criterio de aceptación:

- Se deben listar todos los vehículos con todos sus atributos obligatorios.
- Se utilizará Swagger para visualizar la transacción.
- Se debe mostrar en formato JSON los vehículos listados.
- Se utilizará el patrón DTO.

HUB03: Como desarrollador, quiero buscar un vehículo por su modelo para su gestión.

Criterio de aceptación:

- Se debe buscar el vehículo por su modelo y mostrar todos sus atributos en el resultado de la búsqueda.
- Se utilizará Swagger para visualizar la transacción.
- Se debe mostrar en formato JSON el vehículo encontrado.
- Se utilizará el patrón DTO.

HUB04: Como desarrollador, quiero visualizar la cantidad de vehículos de tipo deportivo.

Criterio de aceptación:

- Se debe mostrar la cantidad de vehículos de tipo deportivo.
- Se utilizará Swagger para visualizar el resultado de la transacción.
- Se debe mostrar en formato JSON la cantidad solicitada.
- Se utilizará el patrón DTO.

Vehículo  						        

|<h1>Id</h1>|
| :- |
|<h1>placa** </h1>|
|<h1>Tipo</h1>|
|<h1>fechaFabricacion</h1>|
|<h1>FechaCompra</h1>|
|<p><h1>Modelo</h1></p><p><h1></h1></p>|










Estas historias de usuario se enfocan en las operaciones básicas de registro, listado y búsqueda de vehículos, así como en obtener información estadística sobre los vehículos de tipo deportivo. Utilizar el patrón DTO asegurará una separación adecuada entre la capa de presentación y los datos transferidos. Además, Swagger proporcionará una documentación interactiva y facilitará la visualización y prueba de los endpoints de la API.

















**Rúbrica de Evaluación**

|<h2>**Criterio de calificación**</h2>|<h2>**Excelente**</h2>|<h2>**Promedio**</h2>|<h2>**Deficiente**</h2>|
| :-: | :-: | :-: | :-: |
|<h2>**C01. Registrar** </h2>|<p>Registra la funcionalidad solicitada en la historia de usuario A, y cumple con todos los criterios de aceptación.</p><p></p>|Registra la funcionalidad solicitada en la historia de usuario, pero no cumple con todos los criterios de aceptación |<h2>No registra, tiene errores, no funciona.</h2>|
|<h2></h2>|<h2>3 puntos</h2>|<h2>1\.5 puntos</h2>|<h2>0 puntos</h2>|
|<h2>**C02. Listar**</h2>|<p>Lista la funcionalidad solicitada en la historia de usuario B, y cumple con todos los criterios de aceptación</p><p></p>|Registra la funcionalidad solicitada en la historia de usuario, pero no cumple con todos los criterios de aceptación |<h2>No lista, no funciona.</h2>|
|<h2></h2>|3 puntos|1\.5 puntos|<h2>0 puntos</h2>|
|<h2>**C03. Buscar**</h2>|Busca por el campo solicitado, la funcionalidad solicitada cumple totalmente la historia de usuario C y el criterio de aceptación|<p>Lista la funcionalidad solicitada sin el cálculo, aplicación de reglas o falta alguno de los datos solicitados en la historia</p><p></p>|<h2>No busca, no funciona, tiene errores.</h2>|
|<h2></h2>|4 puntos|2 puntos|<h2>0 puntos</h2>|
|<h2>**C04. Obtiene cantidad**</h2>|Obtiene la cantidad de registros solicitados de la entidad dada. Funciona.||<h2>No funciona, no se obtiene la cantidad.</h2>|
|<h2></h2>|4 puntos||<h2>0 puntos</h2>|
|<h2>**C05.  Code Organization**</h2>|El desarrollador organiza el código agrupando en paquetes y las clases según propósito o funcionalidad. Usa la estructura desarrollada en clase.|El desarrollador aplica sólo en parte la organización del código, agrupando en paquetes y clases según propósito o funcionalidad |<h2>No se evidencia un criterio de organización del código en paquetes</h2>|
|<h2></h2>|1 puntos|0\.5 puntos|<h2>0 puntos</h2>|
|<h2>**C06. Nombre de proyecto y variables en todo el programa**</h2>|Cumple con el nombre del proyecto y todas las variables del programa.|Cumple parcialmente con el nombre del proyecto y con las variables del programa|<h2>No aplica</h2>|
|<h2></h2>|2 puntos|1punto|<h2>0 puntos</h2>|
|<h2>**C07.DTO**</h2>|Usa el patrón DTO||<h2>No usa el patrón DTO</h2>|
|<h2></h2>|1||<h2>0</h2>|
|<h2>**C08. Rutas** </h2>|Aplica el formato solicitado para las rutas de los controladores.||<h2>No aplica el formato para las rutas solicitadas. </h2>|
|<h2></h2>|1 puntos||<h2>0 puntos</h2>|
|<h2>**C09.BD**</h2>|Cumple con el formato de nombre de BD solicitado.||<h2>No cumple con el formato de nombre solicitado.</h2>|
|<h2></h2>|1 puntos||<h2>0 puntos</h2>|
##

