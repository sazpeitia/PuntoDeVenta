-- MySQL Script generated by MySQL Workbench
-- 05/08/18 19:44:30
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

-- -----------------------------------------------------
-- Table `puntoventa_empresa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `puntoventa_empresa` (
  `ID_EMPRESA` INT(6) NOT NULL AUTO_INCREMENT,
  `NOMBRE_EMPRESA` VARCHAR(45) NOT NULL,
  `DIRECCION` VARCHAR(45) NOT NULL,
  `RFC` VARCHAR(45) NOT NULL,
  `TELEFONO` VARCHAR(45) NULL DEFAULT NULL,
  `PAGINA_WEB` VARCHAR(45) NULL DEFAULT NULL,
  `NOMBRE_CORTO` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID_EMPRESA`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;

CREATE UNIQUE INDEX `NOMBRE_CORTO_UNIQUE` ON `puntoventa_empresa` (`NOMBRE_CORTO` ASC);


-- -----------------------------------------------------
-- Table `puntoventa_categoria`
-- -----------------------------------------------------
ALTER TABLE `puntoventa_categoria`` 

ADD ID_EMPRESA INT(6) NULL DEFAULT NULL,
ADD CONSTRAINT FK_ID_EMPRESA
	FOREIGN KEY (ID_EMPRESA)
	REFERENCES puntoventa_empresa (ID_EMPRESA);
 

CREATE INDEX `FK_EMPRESA_IDX` ON `puntoventa_categoria` (`ID_EMPRESA` ASC);


-- -----------------------------------------------------
-- Table `puntoventa_producto`
-- -----------------------------------------------------


-- -----------------------------------------------------
-- Table `puntoventa_corte_caja`
-- -----------------------------------------------------



-- -----------------------------------------------------
-- Table `puntoventa_venta`
-- -----------------------------------------------------




-- -----------------------------------------------------
-- Table `puntoventa_usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `puntoventa_usuario` (
  `ID_USUARIO` INT(6) NOT NULL AUTO_INCREMENT,
  `DIRECCION` VARCHAR(45) NOT NULL,
  `TELEFONO` VARCHAR(45) NULL DEFAULT NULL,
  `ID_AUTH_USER` INT(11) NOT NULL,
  PRIMARY KEY (`ID_USUARIO`),
  CONSTRAINT `FK_ID_AUTH_USER`
    FOREIGN KEY (`ID_AUTH_USER`)
    REFERENCES `auth_user` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = latin1;

CREATE UNIQUE INDEX `ID_AUTH_USER_UNIQUE` ON `puntoventa_usuario` (`ID_AUTH_USER` ASC);

CREATE INDEX `FK_ID_AUTH_USER_IDX` ON `puntoventa_usuario` (`ID_AUTH_USER` ASC);


-- -----------------------------------------------------
-- Table `puntoventa_empresa_usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `puntoventa_empresa_usuario` (
  `ID_EMPRESA_USUARIO` INT(6) NOT NULL AUTO_INCREMENT,
  `ID_USUARIO` INT(6) NOT NULL,
  `ID_EMPRESA` INT(6) NOT NULL,
  PRIMARY KEY (`ID_EMPRESA_USUARIO`),
  CONSTRAINT `FK_EMPRESA`
    FOREIGN KEY (`ID_EMPRESA`)
    REFERENCES `puntoventa_empresa` (`ID_EMPRESA`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `FK_USUARIO`
    FOREIGN KEY (`ID_USUARIO`)
    REFERENCES `puntoventa_usuario` (`ID_USUARIO`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;

CREATE INDEX `FK_EMPRESA_IDX` ON `puntoventa_empresa_usuario` (`ID_EMPRESA` ASC);

CREATE INDEX `FK_USUARIO_IDX` ON `puntoventa_empresa_usuario` (`ID_USUARIO` ASC);

