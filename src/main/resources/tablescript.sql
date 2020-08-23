CREATE DATABASE `loginssdb` ;
USE `loginssdb`;

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `NAME` varchar(45) NOT NULL,
  `EMAIL` varchar(45) NOT NULL,
  `PHONENUMBER` bigint(10) NOT NULL,
  `PASSWORD` varchar(45) NOT NULL,
  `ACCOUNT_ID` bigint(12) NOT NULL,
  
  
  PRIMARY KEY (`PHONENUMBER`)
);
CREATE TABLE `account` (
  `ACCOUNT_ID` bigint(12) NOT NULL,
  `ACCOUNT_TYPE` varchar(45) NOT NULL,
  `BALANCE` double(11,4) NOT NULL,
  
  PRIMARY KEY (`ACCOUNT_ID`)

);




--
-- Dumping data for table `login`
--
insert into login values('saurabh kumar','saurabh@gmail.com','7777766666','kumar@w*3996','10101111');
insert into login values('Akash kumar','akash@gmail.com','7777766665','akash@w*3996','10101112');
insert into login values('Suraj kumar','suraj@gmail.com','7777766655','suraj@w*3996','10101113');
insert into login values('Jatin kumar','jatin@gmail.com','7777766555','jatin@w*3996','10101114');
insert into login values('Abhinav kumar','abhinav@gmail.com','7777765555','abhinav@w*3996','10101118');


insert into account values('10101111','HOME',999.0000);
insert into account values('10101112','HOME',999.0000);
insert into account values('10101113','HOME',999.0000);
insert into account values('10101114','HOME',999.0000);
insert into account values('10101118','HOME',999.0000);
