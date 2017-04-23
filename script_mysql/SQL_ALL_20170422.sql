

/*TABLA PRODUCTOS  PARA PODER VENDER FRACCIONES*/

ALTER TABLE PUNTOVENTA_PRODUCTO
MODIFY COLUMN CANTIDAD_DISPONIBLE DOUBLE NOT NULL;


/*TABLA VENTA    PARA PODER VER HORA DE VENTA*/

ALTER TABLE PUNTOVENTA_VENTA
MODIFY COLUMN FECHA_VENTA DATETIME NOT NULL;


ALTER TABLE PUNTOVENTA_HISTORIA_INVENTARIO
MODIFY COLUMN CANTIDAD_ANTERIOR DOUBLE NOT NULL;

ALTER TABLE PUNTOVENTA_HISTORIA_INVENTARIO
MODIFY COLUMN CANTIDAD_ADICIONADA DOUBLE NOT NULL;

ALTER TABLE PUNTOVENTA_HISTORIA_INVENTARIO
MODIFY COLUMN CANTIDAD_NUEVA DOUBLE NOT NULL;

ALTER TABLE PUNTOVENTA_HISTORIA_INVENTARIO
MODIFY COLUMN FECHA_REGISTRO DATETIME NOT NULL;


ALTER TABLE PUNTOVENTA_CARRITO
MODIFY COLUMN CANTIDAD_PRODUCTO DOUBLE NOT NULL;


DROP TRIGGER PUNTOVENTA_HISTORIA_INVENTARIO_ADD;


delimiter //

CREATE TRIGGER PUNTOVENTA_HISTORIA_INVENTARIO_ADD BEFORE UPDATE ON PUNTOVENTA_PRODUCTO
  FOR EACH ROW
  BEGIN
     
     DECLARE v_old_cantidad DOUBLE;
     DECLARE v_difference_cantidad DOUBLE;
     DECLARE v_new_cantidad DOUBLE;
     
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
