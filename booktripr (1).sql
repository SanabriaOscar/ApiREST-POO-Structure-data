-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema booktrip
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema booktrip
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `booktrip` DEFAULT CHARACTER SET utf8mb4 ;
-- -----------------------------------------------------
-- Schema blackrawe
-- -----------------------------------------------------
USE `booktrip` ;

-- -----------------------------------------------------
-- Table `booktrip`.`departamentos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `booktrip`.`departamentos` (
  `idDepartamento` INT(255) NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la tabla departamentos',
  `nombre` VARCHAR(40) NOT NULL COMMENT 'Nombre del departamento',
  PRIMARY KEY (`idDepartamento`))
ENGINE = InnoDB
AUTO_INCREMENT = 9
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `booktrip`.`municipios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `booktrip`.`municipios` (
  `idMunicipio` INT(255) NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la tabla departamentos',
  `idDepartamento` INT(255) NOT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla departamentos',
  `nombre` VARCHAR(40) NOT NULL COMMENT 'Nombre del municipio',
  PRIMARY KEY (`idMunicipio`),
  INDEX `fk_municipio_departamento` (`idDepartamento` ASC),
  CONSTRAINT `fk_municipio_departamento`
    FOREIGN KEY (`idDepartamento`)
    REFERENCES `booktrip`.`departamentos` (`idDepartamento`))
ENGINE = InnoDB
AUTO_INCREMENT = 29
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `booktrip`.`actividades`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `booktrip`.`actividades` (
  `idActividad` INT(255) NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la tabla actividades',
  `idMunicipio` INT(255) NOT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla municipios',
  `nombre` VARCHAR(100) NOT NULL COMMENT 'Nombre de la acitividad',
  `lugar` VARCHAR(45) NOT NULL COMMENT 'Lugar donde se desarrolla la actividad',
  `descripcion` VARCHAR(250) NOT NULL COMMENT 'Descripción detallada de la actividad',
  PRIMARY KEY (`idActividad`),
  INDEX `fk_actividad_municipio` (`idMunicipio` ASC),
  CONSTRAINT `fk_actividad_municipio`
    FOREIGN KEY (`idMunicipio`)
    REFERENCES `booktrip`.`municipios` (`idMunicipio`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `booktrip`.`estados`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `booktrip`.`estados` (
  `idEstado` INT(255) NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la tabla estados',
  `nombre` VARCHAR(60) NOT NULL COMMENT 'Nombre del estado',
  PRIMARY KEY (`idEstado`))
ENGINE = InnoDB
AUTO_INCREMENT = 16
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `booktrip`.`tipoinmuebles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `booktrip`.`tipoinmuebles` (
  `idTipo` INT(255) NOT NULL AUTO_INCREMENT COMMENT 'Identicador de la tabla tipo inmuebles',
  `nombre` VARCHAR(60) NOT NULL COMMENT 'Categoria del inmueble',
  PRIMARY KEY (`idTipo`))
ENGINE = InnoDB
AUTO_INCREMENT = 10
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `booktrip`.`tipodocumentos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `booktrip`.`tipodocumentos` (
  `idTipoDocumento` INT(255) NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la tabla tipo documento',
  `nombre` VARCHAR(100) NOT NULL COMMENT 'Nombre del documento',
  PRIMARY KEY (`idTipoDocumento`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `booktrip`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `booktrip`.`usuarios` (
  `idUsuario` INT(255) NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la tabla usuarios',
  `idTipoDocumento` INT(255) NOT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla tipo documento',
  `numDocu` INT(255) NOT NULL COMMENT 'Identificación del usuario',
  `nombre` VARCHAR(40) NOT NULL COMMENT 'Nombre del usuario',
  `apellido` VARCHAR(60) NOT NULL COMMENT 'Apellido del usuario',
  `direccion` VARCHAR(45) NOT NULL COMMENT 'Dirección del usuario',
  `telefono` VARCHAR(45) NOT NULL COMMENT 'Número de contacto del usuario',
  `fechaNacimiento` VARCHAR(45) NOT NULL COMMENT 'Fecha de nacimiento del usuario',
  `email` VARCHAR(100) NOT NULL COMMENT 'Correo electronico del usuario',
  `password` VARCHAR(45) NOT NULL COMMENT 'Contraseña del usuario',
  PRIMARY KEY (`idUsuario`),
  INDEX `fk_usuario_tipoD` (`idTipoDocumento` ASC),
  CONSTRAINT `fk_usuario_tipoD`
    FOREIGN KEY (`idTipoDocumento`)
    REFERENCES `booktrip`.`tipodocumentos` (`idTipoDocumento`))
ENGINE = InnoDB
AUTO_INCREMENT = 14
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `booktrip`.`inmuebles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `booktrip`.`inmuebles` (
  `idInmueble` INT(255) NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la tabla inmuebles',
  `idTipo` INT(255) NOT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla tipo',
  `idDepartamento` INT(255) NOT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla departamentos',
  `idUsuario` INT(255) NOT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla usuarios',
  `idEstado` INT(255) NOT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla estados',
  `nombre` VARCHAR(70) NOT NULL COMMENT 'Nombre del inmueble',
  `direccion` VARCHAR(50) NOT NULL COMMENT 'Ubicación del inmueble',
  `capacidad` INT(255) NOT NULL COMMENT 'Capacidad del inmueble',
  `descripcion` VARCHAR(255) NOT NULL COMMENT 'Descripción detallada del inmueble',
  `precio` INT(255) NOT NULL COMMENT 'Precio del alquiler del inmueble',
  `adjunto` VARCHAR(45) NOT NULL COMMENT 'Observaciones especiales del inmueble',
  PRIMARY KEY (`idInmueble`),
  INDEX `fk_inmueble_tipoInmueble` (`idTipo` ASC),
  INDEX `fk_inmueble_departamento` (`idDepartamento` ASC),
  INDEX `fk_inmueble_usuario` (`idUsuario` ASC),
  INDEX `fk_inmueble_estado` (`idEstado` ASC),
  CONSTRAINT `fk_inmueble_departamento`
    FOREIGN KEY (`idDepartamento`)
    REFERENCES `booktrip`.`departamentos` (`idDepartamento`),
  CONSTRAINT `fk_inmueble_estado`
    FOREIGN KEY (`idEstado`)
    REFERENCES `booktrip`.`estados` (`idEstado`),
  CONSTRAINT `fk_inmueble_tipoInmueble`
    FOREIGN KEY (`idTipo`)
    REFERENCES `booktrip`.`tipoinmuebles` (`idTipo`),
  CONSTRAINT `fk_inmueble_usuarios`
    FOREIGN KEY (`idUsuario`)
    REFERENCES `booktrip`.`usuarios` (`idUsuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 16
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `booktrip`.`servicios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `booktrip`.`servicios` (
  `idServicio` INT(255) NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la tabla servicios',
  `nombre` VARCHAR(100) NOT NULL COMMENT 'Nombre del servicio',
  `descripcion` VARCHAR(255) NOT NULL COMMENT 'Descripcoón detallada del servicio',
  PRIMARY KEY (`idServicio`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `booktrip`.`adicionales`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `booktrip`.`adicionales` (
  `idAdicionales` INT(255) NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la tabla adicionales',
  `idInmueble` INT(255) NOT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla inmuebles',
  `idServicio` INT(255) NOT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla servicios',
  INDEX `fk_adicionales_inmueble` (`idInmueble` ASC),
  INDEX `fk_adicionales_servicio` (`idServicio` ASC),
  PRIMARY KEY (`idAdicionales`),
  CONSTRAINT `fk_adicionales_inmueble`
    FOREIGN KEY (`idInmueble`)
    REFERENCES `booktrip`.`inmuebles` (`idInmueble`),
  CONSTRAINT `fk_adicionales_servicio`
    FOREIGN KEY (`idServicio`)
    REFERENCES `booktrip`.`servicios` (`idServicio`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `booktrip`.`galerias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `booktrip`.`galerias` (
  `idGaleria` INT(255) NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la tabla galerias',
  `idInmueble` INT(255) NOT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla inmuebles',
  `imagen` BLOB NOT NULL COMMENT 'Nombre de la imagen inmueble',
  `url` VARCHAR(100) NOT NULL COMMENT 'Url donde se guarda la imagen',
  PRIMARY KEY (`idGaleria`),
  INDEX `fk_galeria_inmueble` (`idInmueble` ASC),
  UNIQUE INDEX `idInmueble_UNIQUE` (`idInmueble` ASC),
  CONSTRAINT `fk_galeria_inmueble`
    FOREIGN KEY (`idInmueble`)
    REFERENCES `booktrip`.`inmuebles` (`idInmueble`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `booktrip`.`pagos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `booktrip`.`pagos` (
  `idPago` INT(255) NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la tabla pagos',
  `idUsuario` INT(255) NOT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla usuarios',
  `idInmueble` INT(255) NOT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla inmuebles',
  `adjunto` BLOB NOT NULL COMMENT 'Recibo de pago ',
  `monto` INT(255) NOT NULL COMMENT 'Monto de anticipo dado por el cliente',
  `fechaPago` VARCHAR(45) NOT NULL COMMENT 'Fecha del primer pago',
  `fechaPago2` VARCHAR(45) NOT NULL COMMENT 'Fecha del segundo pago',
  PRIMARY KEY (`idPago`),
  INDEX `fk_pagos_usuarios` (`idUsuario` ASC),
  INDEX `fk_pagos_inmueble` (`idInmueble` ASC),
  CONSTRAINT `pagos_ibfk_1`
    FOREIGN KEY (`idInmueble`)
    REFERENCES `booktrip`.`inmuebles` (`idInmueble`),
  CONSTRAINT `pagos_ibfk_2`
    FOREIGN KEY (`idUsuario`)
    REFERENCES `booktrip`.`usuarios` (`idUsuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `booktrip`.`roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `booktrip`.`roles` (
  `idRol` INT(255) NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la tabla roles',
  `nombre` VARCHAR(100) NULL DEFAULT NULL COMMENT 'Nombre del rol',
  PRIMARY KEY (`idRol`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `booktrip`.`permisos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `booktrip`.`permisos` (
  `idPermiso` INT(255) NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la tabla permisos',
  `idUsuario` INT(255) NOT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla usuarios',
  `idRol` INT(255) NOT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla roles',
  PRIMARY KEY (`idPermiso`),
  INDEX `idRol` (`idRol` ASC),
  INDEX `idUsuario` (`idUsuario` ASC),
  CONSTRAINT `permisos_ibfk_1`
    FOREIGN KEY (`idRol`)
    REFERENCES `booktrip`.`roles` (`idRol`),
  CONSTRAINT `permisos_ibfk_2`
    FOREIGN KEY (`idUsuario`)
    REFERENCES `booktrip`.`usuarios` (`idUsuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `booktrip`.`puntuaciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `booktrip`.`puntuaciones` (
  `idPuntuacion` INT(255) NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la tabla puntuaciones',
  `idUsuario` INT(255) NULL DEFAULT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla usuarios',
  `idInmueble` INT(255) NULL DEFAULT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla inmuebles',
  `fechaCreada` VARCHAR(45) NULL DEFAULT NULL COMMENT 'Fecha de la puntuación',
  `descripcion` MEDIUMTEXT NULL DEFAULT NULL COMMENT 'Detalle de la calificación',
  `calificacion` VARCHAR(45) NULL DEFAULT NULL COMMENT 'Califiación/ puntuación',
  PRIMARY KEY (`idPuntuacion`),
  INDEX `fk_puntuacion_usuario` (`idUsuario` ASC),
  INDEX `fk_puntuacion_inmueble` (`idInmueble` ASC),
  CONSTRAINT `fk_puntuacion_inmueble`
    FOREIGN KEY (`idInmueble`)
    REFERENCES `booktrip`.`inmuebles` (`idInmueble`),
  CONSTRAINT `fk_puntuacion_usuario`
    FOREIGN KEY (`idUsuario`)
    REFERENCES `booktrip`.`usuarios` (`idUsuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `booktrip`.`reservas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `booktrip`.`reservas` (
  `idReserva` INT(255) NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la tabla reservas',
  `idUsuario` INT(255) NOT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla usuarios',
  `idInmueble` INT(255) NOT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla inmuebles',
  `idEstado` INT(255) NOT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla estados',
  `fechaReserva` DATE NOT NULL COMMENT 'fecha en que inicia la reserva',
  `checkIn` DATE NOT NULL COMMENT 'fecha en que se recibe el inmueble',
  `checkOut` DATE NOT NULL COMMENT 'fecha en la que se entrega el inmueble',
  PRIMARY KEY (`idReserva`),
  INDEX `fk_reservas_usuario` (`idUsuario` ASC),
  INDEX `fk_reservas_inmueble` (`idInmueble` ASC),
  INDEX `fk_reservas_estado` (`idEstado` ASC),
  CONSTRAINT `fk_reservas_estado`
    FOREIGN KEY (`idEstado`)
    REFERENCES `booktrip`.`estados` (`idEstado`),
  CONSTRAINT `fk_reservas_inmueble`
    FOREIGN KEY (`idInmueble`)
    REFERENCES `booktrip`.`inmuebles` (`idInmueble`),
  CONSTRAINT `fk_reservas_usuario`
    FOREIGN KEY (`idUsuario`)
    REFERENCES `booktrip`.`usuarios` (`idUsuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 18
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `booktrip`.`solicitudinmuebles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `booktrip`.`solicitudinmuebles` (
  `idSolicitud` INT(255) NOT NULL AUTO_INCREMENT COMMENT 'Identificador de la tabla de solicitud inmuebles',
  `idInmueble` INT(255) NOT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla inmuebles',
  `idUsuario` INT(255) NOT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla usuarios',
  `idEstado` INT(255) NOT NULL COMMENT 'Llave foranea obtenida de la relación con la tabla estados',
  `fecha` VARCHAR(45) NOT NULL COMMENT 'Fecha de la solicitud',
  PRIMARY KEY (`idSolicitud`),
  INDEX `fk_solicitud_inmueble` (`idInmueble` ASC),
  INDEX `fk_solicitud_usuario` (`idUsuario` ASC),
  INDEX `fk_solicitud_estado` (`idEstado` ASC),
  CONSTRAINT `fk_solicitud_estado`
    FOREIGN KEY (`idEstado`)
    REFERENCES `booktrip`.`estados` (`idEstado`),
  CONSTRAINT `fk_solicitud_inmueble`
    FOREIGN KEY (`idInmueble`)
    REFERENCES `booktrip`.`inmuebles` (`idInmueble`),
  CONSTRAINT `fk_solicitud_usuario`
    FOREIGN KEY (`idUsuario`)
    REFERENCES `booktrip`.`usuarios` (`idUsuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
