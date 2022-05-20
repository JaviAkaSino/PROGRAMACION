--<ScriptOptions statementTerminator=";"/>

CREATE TABLE tarjeta_bancaria (
	id INT NOT NULL,
	numero VARCHAR(45),
	fecha_caducidad DATE,
	csv INT,
	PRIMARY KEY (id)
);

CREATE TABLE alquiler (
	id INT NOT NULL,
	id_cliente INT NOT NULL,
	id_vehiculo INT NOT NULL,
	fecha_inicio DATE,
	numero_dias INT,
	PRIMARY KEY (id)
);

CREATE TABLE vehiculo (
	id INT NOT NULL,
	bastidor VARCHAR(20) NOT NULL,
	matricula VARCHAR(10) NOT NULL,
	marca VARCHAR(45),
	modelo VARCHAR(45),
	disponible TINYINT NOT NULL,
	precio DOUBLE NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE cliente (
	id INT NOT NULL,
	nombre VARCHAR(45),
	apellidos VARCHAR(45),
	nif VARCHAR(45) NOT NULL,
	id_tarjeta INT,
	PRIMARY KEY (id)
);

CREATE INDEX fk_cliente_idx ON cliente (id_tarjeta ASC);

CREATE INDEX fk_vehiculo_idx ON alquiler (id_vehiculo ASC);

CREATE INDEX fk_cliente_idx ON alquiler (id_cliente ASC);

