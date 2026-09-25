# reto-1-3-pgr-ede-sos
Reto 1.3 (PGR, SOS, EDE)

## 1.- Calculadora diaria de CO₂ por persona
Se desea implementar un programa en Java que funcione como una calculadora de huella de carbono diaria para un grupo de personas. El programa debe pedir datos a los usuarios y registrar sus actividades para calcular las emisiones de CO₂.
Al inicio, el programa debe preguntar cuántas personas se van a registrar.
Para cada persona se mostrará un menú con distintas actividades que pueden generar emisiones de CO₂. El menú debe repetirse hasta que la persona elija la opción de finalizar. Cada actividad tendrá un consumo de CO₂ diferente y se deberán registrar los datos que correspondan.
El menú de actividades será el siguiente:
Transporte en coche → Se pide cuántos km recorrió (0,21 kg CO₂ por km)
Transporte en autobús → Se pide cuántos km recorrió (0,10 kg CO₂ por km)
Transporte en bicicleta → Se pide cuántos km recorrió (0 kg CO₂ por km)
Uso de plancha → Se pregunta si la usó (1 = sí, 0 = no). Si la respuesta es sí, se pide cuántas horas se utilizó (0,70 kg CO₂ por hora)
Uso del ordenador → Se pide cuántas horas lo utilizó (0,08 kg CO₂ por hora)
Uso del móvil → Se pide cuántas horas lo utilizó (0,02 kg CO₂ por hora)
Finalizar actividades del día
El programa debe validar que no se introduzcan valores negativos ni respuestas incorrectas. Si se introduce un valor no válido, se mostrará un mensaje de error y se volverá a pedir el dato.
Al finalizar el registro de cada persona se mostrará el total de CO₂ emitido ese día. Al terminar con todas las personas se mostrará el total de CO₂ emitido por el grupo completo.

## 2.- Carrera popular 
El Ayuntamiento de Erandio desea desarrollar una aplicación para gestionar la participación en una carrera popular.
La aplicación funcionará de la siguiente manera:
En primer lugar, se introducirá el DNI del participante. No será necesario introducir más información personal, ya que los datos de los participantes están registrados previamente en la base de datos del Ayuntamiento. 
A continuación, se preguntará si la persona participa en la carrera individual o por parejas. 
Después, se solicitará el número de carreras populares en las que ha participado anteriormente. 
Para cada participante se introducirá su tiempo realizado en la carrera, expresado en minutos y segundos. 
El programa deberá indicar si el participante ha conseguido terminar la carrera en menos de 60 minutos. 
Una vez registrados los datos de un participante, el programa preguntará si se desea continuar registrando participantes. 
Al finalizar el registro, el programa mostrará:
El número total de participantes registrados. 
El número de participantes que han terminado la carrera en menos de 60 minutos. 
El número de participantes que han participado anteriormente en más de 3 carreras. 
El tiempo medio realizado por todos los participantes. 
El mejor tiempo registrado. 
Importante: el programa deberá realizar todos los cálculos a partir de los datos introducidos por el usuario. No se podrán utilizar valores previamente calculados.
## 3.- Control de revisiones de bicicletas 
Una empresa de alquiler de bicicletas quiere llevar un control sobre las revisiones de las bicicletas de su flota.
Primero se pedirá mediante consola la fecha actual, indicando día, mes y año.
Después se introducirán los datos de varias bicicletas, una a una. Antes de pasar a registrar una nueva bicicleta, se preguntará:
“¿Quiere registrar otra bicicleta? Conteste S o N”
Para cada bicicleta se pedirá:
El número de identificación de la bicicleta. 
La fecha de la última revisión, indicando día, mes y año. 
El programa deberá comparar la fecha de la última revisión con la fecha actual.
Si ha pasado más de un año desde la última revisión, se mostrará:
“Esta bicicleta necesita revisión.”
En caso contrario, se mostrará:
“Esta bicicleta NO necesita revisión.”
Además, el programa deberá contar cuántas bicicletas necesitan revisión y cuántas no necesitan revisión.
Al finalizar el registro, se mostrará en pantalla:
Bicicletas que necesitan revisión: seguido del número correspondiente.
Bicicletas que no necesitan revisión: seguido del número correspondiente.
 

## 4.- Cine
Realizar un programa que registre la venta de entradas de un cine durante una sesión.
El programa preguntará cuántos clientes se van a registrar.
Para cada cliente se introducirá el número de entradas de adulto y el número de entradas infantiles que compra.
La entrada de adulto cuesta 9 euros y la infantil 6 euros.
Si un cliente compra 5 o más entradas en total, se le aplicará un descuento del 10 % sobre el precio de las entradas.
El programa debe mostrar para cada cliente:
Número de entradas de adulto.
Número de entradas infantiles.
Número total de entradas.
Precio a pagar.
Al finalizar todos los clientes, el programa debe mostrar:
El dinero total recaudado.
El número total de entradas de adulto.
El número total de entradas infantiles.
El cliente que compró más entradas.

##5.- Gimnasio
Realizar un programa que registre la actividad semanal de los usuarios de un gimnasio.
El programa preguntará cuántos usuarios se van a registrar.
Para cada usuario se introducirá el número de días que ha acudido al gimnasio durante la semana y, para cada día, el número de minutos que ha realizado ejercicio.
El programa debe calcular para cada usuario:
El número total de minutos realizados durante la semana.
La media de minutos por día de asistencia.
El número de días en los que ha realizado más de 60 minutos de ejercicio.
Si un usuario realiza más de 300 minutos en total, el programa debe mostrar que ha alcanzado el objetivo semanal.
Al finalizar todos los usuarios, el programa debe mostrar:
El usuario que realizó más minutos de ejercicio.
El número total de minutos realizados entre todos los usuarios.
El número total de días de entrenamiento registrados.

## 6.- Videojuego
Realizar un programa que registre las partidas jugadas por varios jugadores de un videojuego.
El programa preguntará cuántos jugadores se van a registrar.
Para cada jugador se introducirá el número de partidas que ha jugado. Para cada partida se introducirá:
Los puntos conseguidos.
El número de enemigos derrotados.
El programa debe calcular para cada jugador:
La puntuación total obtenida.
El número total de enemigos derrotados.
La puntuación media por partida.
Si en una partida consigue más de 1.000 puntos, recibirá un bonus de 100 puntos.
El programa debe mostrar al finalizar las partidas de cada jugador:
Puntuación total, incluyendo los bonus.
Enemigos derrotados.
Puntuación media por partida.
Al finalizar todos los jugadores, el programa debe mostrar:
El jugador con mayor puntuación.
La puntuación total conseguida entre todos los jugadores.
El número total de enemigos derrotados.


## EXTRAS (Opcionales)

El servicio de PRL del Centro nos pide realizar un programa que nos indique:
Cuántos alumnos no han sido vacunados o no tienen la pauta completa (2 vacunas o 1 en caso de haber pasado la COVID-19)
Y de aquellos que sí y han sido vacunados (con dos dosis o 1, si hubieran padecido la COVID) hasta cuándo están protegidos (6 meses más del mes de la vacuna)
El proceso se realizará tantas veces como alumnos/as haya.

Realizar un programa que, dado el número obtenga un rectángulo, como se muestra en los siguientes ejemplos.
Introduce un número: 7 

Introduce un número: 4

Realizar un programa que, dado el número obtenga un triángulo, como se muestra en el siguiente ejemplo.
Introduce un número: 5

Realizar un programa que, dado el número de filas, muestre una pirámide de asteriscos.
Introduzca el número de filas: 5
```

    *
   ***
  *****
*******
*********
Ayuda: se necesitan ciclos independientes para producir los caracteres especiales y los asteriscos

----*
---***
--*****
-*******
*********

Intentar realizar alguna de estas variantes:
'
    *
   **
  ***
****
*****
    *
   ***
  *****
*******
*********
*******
  *****
   ***
    *
    *
   * *
  *   *
*     *
*********


    *
   * *
  *   *
*    *
*       *
*     *
  *   *
   * *
    *
  ```


