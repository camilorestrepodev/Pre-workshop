# EJERCICIO PRE-WORKSHOP PROGRAMACION ORIENTADA A OBJECTOS

El hospital MAKAIA busca automatizar el comportamiento para un usuario que desea agendar una cita médica. Un usuario está representado en nuestro negocio por los siguientes atributos:
•Nombre 
•Apellido 
•Cedula 
•Correo Electrónico.

Ademásde esto el usuario tiene un método obtenerTipo
Pero hay varios tipos de usuarios.
•UsuarioEps –este tipo de usuario debe de sobrescribir el método obtenerTipo el cual retorna el tipo en este caso “EPS”
•UsuarioPoliza --este tipo de usuario debe de sobrescribir el método obtenerTipo el cual retorna el tipo en este caso “POLIZA”
•UsuarioParticular --este tipo de usuario debe de sobrescribir el método obtenerTipo el cual retorna el tipo en este caso “PARTICULAR”

Además de esto el hospital cuenta con varias especialidades (MEDICINA GENERAL, MEDICINA INTERNA Y MEDICINA DEL DEPORTE), cada especialidad está constituida por: 
•el nombre.
•Código.
•tipo de especialidad.

El hospital será el encargado de agendar citas médicasla cual está representada en nuestro negocio por el siguienteatributo:•ValorBase a pagar.. El hospital tendráel métodoagendar citas que recibirácomo argumentos 
•Especialidad.
•Usuario
•Fecha de la cita.

Para saber cuál es el valor para pagar se debe tener en cuenta lo siguiente. 1.Si el agendamiento lo hace un usuario tipo EPS, el valor base debe ser de 30.000 mil pesos.2.Si el agendamiento lo hace un usuario tipo POLIZA, el valor base debe ser de 40.000 mil pesos.3.Si el agendamiento lo hace un usuario tipo PARTICULAR, el valor a base debe ser de 70.000 mil pesos.Entregar 
•Realizar el diagrama UML
•Realizar código enjava.
•Probar en el main. 

# DIAGRAMAS UML:
![Diagrama sin título drawio](https://user-images.githubusercontent.com/119947851/217027610-94e42ea7-2d9a-4c11-aa1a-64965e13a31f.png)

# PARTICIPANTES:
- Juan Camilo Restrepo B.
- Camilo Andres Botina T.
