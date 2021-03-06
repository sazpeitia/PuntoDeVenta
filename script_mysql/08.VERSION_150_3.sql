-- MySQL Script generated by MySQL Workbench
-- 05/11/18 16:39:33
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

-- ----------------------------------------------------- 
-- Table puntoventa_venta 
-- ----------------------------------------------------- 
 
ALTER TABLE puntoventa_venta  
ADD ID_USUARIO_VENTA INT NULL, 
ADD CONSTRAINT FK_USUARIO_VENTA 
	FOREIGN KEY (ID_USUARIO_VENTA) 
	REFERENCES puntoventa_usuario (ID_USUARIO) 
	ON DELETE NO ACTION 
	ON UPDATE NO ACTION; 
	
CREATE INDEX  FK_USUARIO_VENTA_IDX  ON  puntoventa_venta  ( ID_USUARIO_VENTA  ASC);

 -- -----------------------------------------------------
-- Table puntoventa_corte_caja
-- -----------------------------------------------------
 
ALTER TABLE puntoventa_corte_caja 
ADD ID_USUARIO_CORTE INT NULL, 
ADD CONSTRAINT FK_USUARIO_CORTE 
	FOREIGN KEY (ID_USUARIO_CORTE) 
	REFERENCES puntoventa_usuario (ID_USUARIO) 
	ON DELETE NO ACTION 
	ON UPDATE NO ACTION; 
	
CREATE INDEX  FK_USUARIO_CORTE_IDX  ON  puntoventa_corte_caja  ( ID_USUARIO_CORTE  ASC);