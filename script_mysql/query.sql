-- CREAR BASE DE DATOS
CREATE DATABASE PUNTOVENTA;
USE PUNTOVENTA;



CREATE TABLE PUNTOVENTA_CORTE_CAJA (

   ID_CORTE_CAJA      INT(6)      NOT NULL      PRIMARY KEY       AUTO_INCREMENT,
   TOTAL_RECAUDADO      DOUBLE      NOT NULL,
   FECHA_CORTE         DATE      NOT NULL
   
   
   
) ENGINE=INNODB;

/*TABLA CATEGORIA*/
CREATE  TABLE PUNTOVENTA_CATEGORIA (
	ID_CATEGORIA			INT(5)			NOT NULL	PRIMARY KEY		AUTO_INCREMENT,
	NOMBRE_CATEGORIA		VARCHAR(50),
	ID_CATEGORIA_PADRE		INT(5),
	
	CONSTRAINT				FK_SUBCATEGORIA
	FOREIGN KEY				(ID_CATEGORIA_PADRE) 
    REFERENCES				PUNTOVENTA_CATEGORIA(ID_CATEGORIA)
    ON DELETE CASCADE
) ENGINE=INNODB;



/*TABLA PRODUCTOS*/
CREATE  TABLE PUNTOVENTA_PRODUCTO (
	ID_PRODUCTO				INT(5)			NOT NULL	PRIMARY KEY		AUTO_INCREMENT,
	ID_CODIGO_BARRA			VARCHAR(50),
	NOMBRE_PRODUCTO			VARCHAR(100),
	ID_CATEGORIA			INT(5),
	PRECIO_VENTA			DOUBLE,
	PRECIO_COMPRA			DOUBLE,
	CANTIDAD_DISPONIBLE		INT(10),
	CODIGO_PRODUCTO			VARCHAR(50),
	
	INDEX					(ID_CODIGO_BARRA, NOMBRE_PRODUCTO),

	
	CONSTRAINT				FK_CATEGORIA
	FOREIGN KEY				(ID_CATEGORIA) 
    REFERENCES				PUNTOVENTA_CATEGORIA(ID_CATEGORIA)
    ON DELETE CASCADE
) ENGINE=INNODB;



/*TABLA VENTA*/
CREATE TABLE PUNTOVENTA_VENTA (
	
	ID_VENTA				INT(5)			NOT NULL	PRIMARY KEY		AUTO_INCREMENT,
	FECHA_VENTA				DATE,
	TOTAL_VENTA				DOUBLE,
	PAGO_VENTA				DOUBLE,
	CAMBIO_VENTA			DOUBLE,
	ID_CORTE_CAJA			INT(6),
	
	CONSTRAINT				FK_ID_CORTE_CAJA
	FOREIGN KEY				(ID_CORTE_CAJA) 
    REFERENCES				PUNTOVENTA_CORTE_CAJA(ID_CORTE_CAJA)
    ON DELETE CASCADE

)ENGINE=INNODB;



/*TABLA CARRITO*/
CREATE TABLE PUNTOVENTA_CARRITO (

	ID_CARRITO				INT(5)			NOT NULL	PRIMARY KEY		AUTO_INCREMENT,
	ID_VENTA				INT(5)			NOT NULL,
	CANTIDAD_PRODUCTO		INT(5)			NOT NULL,
	TOTAL					DOUBLE			NOT NULL,
	ID_PRODUCTO				INT(5)			NOT NULL,
	
	CONSTRAINT				FK_VENTA
	FOREIGN KEY				(ID_VENTA) 
    REFERENCES				PUNTOVENTA_VENTA(ID_VENTA)
    ON DELETE CASCADE,
	
	CONSTRAINT				FK_PRODUCTO
	FOREIGN KEY				(ID_PRODUCTO) 
    REFERENCES				PUNTOVENTA_PRODUCTO(ID_PRODUCTO)
    ON DELETE CASCADE
) ENGINE=INNODB;


CREATE TABLE PUNTOVENTA_HISTORIA_INVENTARIO (
	ID_HISTORIA_INVENTARIO			INT(5)			NOT NULL	PRIMARY KEY		AUTO_INCREMENT,
	FECHA_REGISTRO					DATE			NOT NULL,
	ID_PRODUCTO						INT(5)			NOT NULL,
	CANTIDAD_ANTERIOR				INT(5)			NOT NULL,
	CANTIDAD_ADICIONADA				INT(5)			NOT NULL,
	CANTIDAD_NUEVA					INT(5)			NOT NULL,
	
	INDEX				(FECHA_REGISTRO, ID_PRODUCTO),
	
	CONSTRAINT				FK_ID_INV_PRODUCTO
	FOREIGN KEY				(ID_PRODUCTO) 
    REFERENCES				PUNTOVENTA_PRODUCTO(ID_PRODUCTO)
    ON DELETE CASCADE
) ENGINE=INNODB;


delimiter //

CREATE TRIGGER PUNTOVENTA_HISTORIA_INVENTARIO_ADD BEFORE UPDATE ON PUNTOVENTA_PRODUCTO
  FOR EACH ROW
  BEGIN
     
     DECLARE v_old_cantidad integer;
     DECLARE v_difference_cantidad integer;
     DECLARE v_new_cantidad integer;
     
     SELECT     CANTIDAD_DISPONIBLE
     INTO     v_old_cantidad
     FROM     PUNTOVENTA_PRODUCTO
     WHERE     ID_PRODUCTO = NEW.ID_PRODUCTO;
     
     SET v_new_cantidad = NEW.CANTIDAD_DISPONIBLE;
	 
     IF v_new_cantidad != v_old_cantidad
     THEN
     
     SET v_difference_cantidad = v_new_cantidad - v_old_cantidad;
     
     INSERT INTO PUNTOVENTA_HISTORIA_INVENTARIO (FECHA_REGISTRO, ID_PRODUCTO, CANTIDAD_ANTERIOR, CANTIDAD_ADICIONADA, CANTIDAD_NUEVA) VALUES (NOW(), NEW.ID_PRODUCTO, v_old_cantidad, v_difference_cantidad, v_new_cantidad  );
     END IF;
    
  END; //
  
  delimiter ;

-- USUARIO QUE CONECTARA CON APLICACION
CREATE USER 'PUNTOVENTA'@'%' IDENTIFIED BY 'PUNTOVENTA';
GRANT ALL  ON PUNTOVENTA.* TO 'PUNTOVENTA'@'%';