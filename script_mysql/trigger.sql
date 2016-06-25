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
