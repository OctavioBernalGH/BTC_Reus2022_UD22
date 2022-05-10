<table>
 <tr>
    <td width="100px"><img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/></td>
  <td width="1000px"> <h2> Ejercicios Modelo-Vista-Controlador Unidad 22 </h2> </td>
  
 </tr>
</table>
 
 [comment]: <> (<img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/><br>)
 

 
 [comment]: <> (### Ejercicios SQL Unidad UD16<hr>)

[![Java](https://img.shields.io/badge/Java-FrontEnd-informational)]()
[![JBuilder](https://img.shields.io/badge/JBuilder-View-critical)]()
[![JUnit 5](https://img.shields.io/badge/JUnit%205-Testing-success)]()
[![GitHub](https://img.shields.io/badge/GitHub-Repository-lightgrey)]()
[![SQL](https://img.shields.io/badge/SQL-DataBase-yellowgreen)]()
[![Maven](https://img.shields.io/badge/Maven-ProjectStructure-blueviolet)]()

Este ejercicio ha sido realizado por los miembros del equipo 1. Dicho equipo esta formado por:

  [- J.Oriol López Bosch](https://github.com/mednologic)<br>
  [- Octavio Bernal](https://github.com/OctavioBernalGH)<br>
  [- David Dalmau](https://github.com/DavidDalmauDieguez)

### Ejercicio 1 UD22

<p align="justify">Primero de todo se comenzarán los ejercicios creando la base de datos y las tablas correspondientes a la base de datos, en el ejercicio 1 se crea la base de datos UD22_Ejercicio_1 con la tabla cliente, esta tabla tendrá las columnas (id, nombre, apellido, dirección, dni y fecha). En la siguiente imagen se muestra el script de creación de la BBDD, la creación de la tabla con sus columnas y el esquema de ingeniería inversa realizado con MySQL Worbench.</p>

![fotoSQLe1](https://user-images.githubusercontent.com/103035621/167592843-9fd45a4f-a6d1-4b81-989d-0699ee28c65f.jpg)

### Ejercicio 2 UD22

<p align="justify">Como en el ejercicio 1, primero de todo se creará la base de datos, en este caso llamada UD22_Ejercicio_2 junto con sus tablas, que en este caso serán la tabla cliente con las columnas (id, nombre, apellido, direccion, dni y fecha) y la tabla videos con las columnas (id, title, director y cli_id que hará referencia al campo id de la tabla cliente). Una vez creada, se muestra en la siguiente imagen el script resultante junto al esquema de ingeniería inversa realizado con MySQL Worbench.</p>

![fotoSQLe2cpy](https://user-images.githubusercontent.com/103035621/167587305-1abfddc0-bbf8-47ff-9dc0-456e8e6e4b31.png)

### Ejercicio 3 UD22

<p align="justify">Por último, en el ejercicio 3 se procederá a crear la base de datos llamada UD22_Ejercicio_3, dentro de ella se crearan 3 tablas y en el siguiente orden, la primera llamada cientificos con las columnas (DNI y NomApels) y como PRIMARY KEY de esta se usará el DNI, la siguiente tabla llamada proyecto con las columnas (id, nombre y horas) y como PRIMARY KEY de esta se usará el id y por último la tabla asignado_a con las columnas (cientifico y proyecto) ambas como PRIMARY KEY y como claves foráneas de las tablas cientificos y proyecto.</p>

![fotoSQLe3](https://user-images.githubusercontent.com/103035621/167588583-3bebd78e-2fa4-4e51-9f03-4ea9a5e00915.png)
