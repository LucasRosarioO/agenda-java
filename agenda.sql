DROP DATABASE agenda;

CREATE DATABASE agenda;

USE agenda;

CREATE TABLE `agenda`.`evento` (
  `descricao` VARCHAR(50) NOT NULL,
  `data` DATE NOT NULL,
  `email` VARCHAR(50) NULL,
  `periodicidade` VARCHAR(50) NULL,
  `alarme` VARCHAR(45) NULL,
  PRIMARY KEY (`data`));
