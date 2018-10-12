DROP TABLE IF EXISTS fletero;
DROP TABLE IF EXISTS deportista;

CREATE TABLE fletero(
    id varchar(64),
    apellido_y_nombre varchar(200),
    dni varchar(10),
    domicilio varchar(200),
    PRIMARY KEY(id)
);

CREATE TABLE deportista(
    id_deportista int auto_increment,
    nya varchar(256) NOT NULL,
    dni varchar(8) NOT NULL,
    num_tel varchar(23) NOT NULL,
    PRIMARY KEY (id_deportista)
);