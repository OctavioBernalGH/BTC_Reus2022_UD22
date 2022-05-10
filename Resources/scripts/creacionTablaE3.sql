-- Se elimina la BBDD si existe --
DROP DATABASE IF EXISTS UD22_Ejercicio_3;
-- Se crea de nuevo la BBDD --
CREATE DATABASE UD22_Ejercicio_3;
-- Se inicializa la BBDD para trabajar con ella --
USE UD22_Ejercicio_3;
-- Se crea la tabla cientificos --
CREATE TABLE cientificos
(
	DNI varchar(8),
    NomApels nvarchar(255) NOT NULL,
    PRIMARY KEY (DNI, NomApels)
);
-- Se crea la tabla proyecto --
CREATE TABLE proyecto
(
	id char(4),
    nombre nvarchar(255) NOT NULL,
    horas int NOT NULL,
    PRIMARY KEY (id)
);
-- Se crea la tabla asignado_a --
CREATE TABLE asignado_a
(
	cientifico varchar(8),
    proyecto char(4),
    PRIMARY KEY (cientifico, proyecto),
    FOREIGN KEY (cientifico) REFERENCES cientificos(DNI),
	FOREIGN KEY (proyecto) REFERENCES proyecto(id)
);
