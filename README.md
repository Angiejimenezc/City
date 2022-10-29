# Ejercicio City
Exercise with classes with java

La ciudad de Barcelona, ​​como cualquier ciudad, está formada por un número muy grande de edificios. Hay muchas clases de edificios: edificios de viviendas, hospitales, escuelas, bloques de apartamentos, bloques de oficinas, hoteles, cines, etc.
El ejercicio propuesto consistirá en crear una aplicación que contendrá una clase Edificio y varias clases derivadas. 
No se instanciarà ningún objeto de la clase Edificio, sino que se instanciaran objetos de las clases derivadas de ésta. 
Las clases derivadas son: H otel, Hospital y Cine.

Todos los edificios tendrán ciertos datos comunes (nombre, número de plantas, superficie (m²)) que se darán en crear el edificio y no se modificarán, pero sí que se deberá poder acceder a ellas para leerlas.
Se creará un método limpiar () en la clase adecuada, lo mostrará por pantalla el tiempo que se ha tardado en limpiar el edificio, teniendo en cuenta que se tarda en limpiar un minuto por cada 5 m². Además, si un edificio tiene más de una planta, se tarda en subir medio minuto de una planta a otra. 
Por lo tanto, añadiremos medio minuto por cada planta adicional. 
Por cada minuto de trabajo se pagará un euro diario. Además, como que se limpia cada día, para obtener el coste mensual, tendremos que multiplicar por 30 (este coste mensual también se mostrará por pantalla) 
Además, se implementará un método llamado calcularCostVigilancia () que mostrará lo que cuesta al mes contratar vigilantes en cada edificio. 
Se considera que cada vigilante de hotel u hospital puede vigilar 1000 m². Por lo tanto, si un edificio tiene una superficie de 5500 m², necesitaremos 6 vigilantes. 
En cambio, los vigilantes de los cines pueden vigilar 3000 m². 
Contratar cada vigilante cuesta a los propietarios del edificio 1.300 euros mensuales, pero los vigilantes de hoteles cobran un plus de peligrosidad de 500 euros mensuales. 
En el hospital se reparte comida para los enfermos tres veces al día. 
Habrá un método repartirDinar () en el lugar adecuado que mostrará, cuando sea llamado, el mensaje "Se están repartiendo xxx raciones". 
Este número puede variar a lo largo del tiempo, y por tanto, se deberá permitir acceder al atributo correspondiente, tanto para leerlo como para modificarlo, aunque no se haga directamente. 
En el cine se creará la función projectarSessio (), que mostrará el mensaje "Se han recaudado xxx.xx euros", teniendo en cuenta que, para calcular la recaudación, se multiplicará el precio de una entrada por el número de asistentes a la sesión, que no podrá superar el aforo máximo. Por lo tanto, la función projectarSessió deberá recibir como parámetros el número de asistentes y el precio de la entrada para esa sesión. 
El número de asistentes a la sesión no puede ser mayor que el aforo total de la sala. 
En los hoteles cada día pasa el servicio de habitaciones. Se calcula que cada miembro del servicio puede atender 20 habitaciones. Se creará un método que calcule, y muestre por pantalla: a) ¿Cuántas personas son necesarias para atender el servicio de habitaciones del hotel. b) ¿Cuál es el total necesario para los sueldos de estas personas, teniendo en cuenta que cada persona cobra 1.000 euros al mes. 
Ejemplos: El "Hospital de Vilafranca", de 1.950 m² y 2 plantas. En este momento tiene 26 enfermos. El "Hospital General de Cataluña", de 25.350 m² y 10 plantas. En este momento tiene 315 enfermos. El "Cine Montecarlo", de 3180 m² y 1 planta. El "Cine Principal", de 12.450 m² y 2 plantas. El "Hotel Hilton", de 73.858 m² y 22 plantas. Tiene 583 habitaciones. El "Hotel Pepita", de 593 m² y 3 plantas. Tiene 12 habitaciones. 
La aplicación debe ser capaz de dar de alta, mostrar y eliminar edificios. Al llamar al método mostrar, llamaremos a todos los métodos del edificio en cuestión para ver todos sus datos por pantalla.

