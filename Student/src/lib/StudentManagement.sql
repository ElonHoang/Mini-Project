CREATE DATABASE `StudentManagement`;
USE `StudentManagement`;

CREATE TABLE IF NOT EXISTS `Students`(
	`Id` INT PRIMARY KEY AUTO_INCREMENT,
	`Name` VARCHAR(255) NOT NULL,
	`Age` INT NOT NULL,
	`ClassRoom` VARCHAR(255),
	`Address` VARCHAR(255) NOT NULL
);
INSERT INTO Students(Id,`Name`,Age,ClassRoom,Address)
VALUES(1,"Hoang",11,"C2009G1","Ha Noi");