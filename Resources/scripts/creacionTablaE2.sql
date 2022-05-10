-- Se elimina la BBDD --
DROP DATABASE IF EXISTS UD22_Ejercicio_2;
-- Se crea la base de datos --
CREATE DATABASE UD22_Ejercicio_2;
-- Se usa la DDBB ejercicio_2 para trabajar con ella --
USE UD22_Ejercicio_2;
-- Se crea la tabla cliente --
CREATE TABLE cliente
(
	id int(11) AUTO_INCREMENT,
    nombre varchar(250) DEFAULT NULL,
    apellido varchar(250) DEFAULT NULL,
    direccion varchar(250) DEFAULT NULL,
    dni int(11) DEFAULT NULL,
    fecha date DEFAULT NULL,
    PRIMARY KEY (id)
);
-- Se crea la tabla videos
CREATE TABLE videos
(
	id int(11) AUTO_INCREMENT,
    title varchar(250) DEFAULT NULL,
    director varchar(250) DEFAULT NULL,
    cli_id int(11) DEFAULT NULL,
    PRIMARY KEY(id),
    CONSTRAINT videos_fk FOREIGN KEY(cli_id) REFERENCES cliente(id)
);

