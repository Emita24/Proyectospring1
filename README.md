# Proyectospring1
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS mydb DEFAULT CHARACTER SET utf8 ;
USE mydb ;

-- -----------------------------------------------------
-- Table mydb.cliente
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS mydb.cliente (
  idcliente INT NOT NULL,
  nombre VARCHAR(45) NULL,
  apellido VARCHAR(45) NULL,
  DNI VARCHAR(45) NULL,
  teléfono VARCHAR(45) NULL,
  dirección VARCHAR(45) NULL,
  PRIMARY KEY (idcliente))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table mydb.table1
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS mydb.table1 (
  idtable1 INT NOT NULL,
  nombre VARCHAR(45) NULL,
  apellido VARCHAR(45) NULL,
  DNI VARCHAR(45) NULL,
  teléfono VARCHAR(45) NULL,
  dirección VARCHAR(45) NULL,
  PRIMARY KEY (idtable1))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
