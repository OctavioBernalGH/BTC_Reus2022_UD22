-- Se elimina la BBDD si existe --
DROP DATABASE IF EXISTS UD22_Ejercicio_1;
-- Se crea de nuevo la BBDD --
CREATE DATABASE UD22_Ejercicio_1;
-- Se inicializa la BBDD para trabajar con ella --
USE UD22_Ejercicio_1;
-- Se crea la tabla cliente --
CREATE TABLE `UD22_Ejecicio_1.cliente`
(
	`id` int(11) NOT NULL AUTO_INCREMENT,
    `nombre` varchar(250) DEFAULT NULL,
    `apellido` varchar(250) DEFAULT NULL,
    `direccion` varchar(250) DEFAULT NULL,
    `dni` int(11) DEFAULT NULL,
    `fecha` date DEFAULT NULL,
    PRIMARY KEY (`id`)
);

