/*ESQUEMA RELACIONAL:
+ Indica ser PK
* Indica ser FK

usuarios (+coduser, nombre, telefono, email, residencia)
orientadores (+codorientador, coduser*, antiguedad, salario) 
preguntas (+codpregunta, codorientador*, textopreg, nivelconcrecion)
responden (+(coduser*, codpregunta*), afinidad)
*/
drop database if exists BD_prog;
create database if not exists BD_Prog;
use BD_Prog;

create table if not exists usuarios
(
	coduser int not null AUTO_INCREMENT,
    nombre varchar (100),
    telefono char(12),
    email varchar(100),
    residencia varchar(30),
    
    constraint pk_usuarios primary key (coduser)
);


INSERT INTO usuarios
VALUES
		(1, 'Pepe Gotera', '666111222', 'email1@ejemplo.es', 'Estepona') ,
        (2, 'Juan Palomo', '666222333', 'email2@ejemplo.es', 'Marbella') ,
        (3, 'Antonio García', '666333444', 'email3@ejemplo.es', 'San Pedro') ,
        (4, 'Pedro Ximénez', '666444555', 'email4@ejemplo.es', 'San Roque') ,
        (5, 'Laura López', '666555666', 'email5@ejemplo.es', 'Algeciras') ,
        (6, 'Daniel Rey', '666666777', 'email6@ejemplo.es', 'Ronda') ,
        (7, 'María Blanco', '666777888', 'email7@ejemplo.es', 'Málaga') ;
        

create table if not exists orientadores
(
	codorientador int not null AUTO_INCREMENT,
    coduser int default 0,
    antiguedad int,
    salario decimal(7,2),
    
    constraint pk_orientadores primary key (codorientador),
    constraint pk_orientadores_usuarios foreign key (coduser)
	references usuarios (coduser)
		on update cascade on delete cascade
);

INSERT INTO orientadores
VALUES
	(1, 1, 57, 2150.23),
    (2, 4, 65, 1865.19),
    (3, 5, 23, 1235.05),
    (4, 7, 14, 1947.98);


create table if not exists preguntas
(
	codpregunta int not null AUTO_INCREMENT,
    codorientador int default 0,
    textopreg varchar(100),
    nivelconcrecion tinyint,
    
    constraint pk_preguntas primary key (codpregunta),
    constraint fk_preguntas_orientadores foreign key (codorientador)
    references orientadores (codorientador)
		on update cascade on delete no action
);


INSERT INTO preguntas
VALUES
	(1, 1, 'Texto pregunta número 1', 5),
    (2, 1, 'Texto pregunta número 2', 10),
    (3, 2, 'Texto pregunta número 3', 25),
    (4, 3, 'Texto pregunta número 4', 50);


SET FOREIGN_KEY_CHECKS = 1;
    
    
    