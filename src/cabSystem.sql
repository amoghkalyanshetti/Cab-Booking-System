-- MySQL dump 10.13  Distrib 5.7.21, for Linux (x86_64)
--
-- Host: localhost    Database: cabSystem
-- ------------------------------------------------------
-- Server version	5.7.21-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Booking1`
--

DROP TABLE IF EXISTS `Booking1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Booking1` (
  `username` varchar(100) DEFAULT NULL,
  `source` varchar(100) DEFAULT NULL,
  `destination` varchar(100) DEFAULT NULL,
  `path` int(11) DEFAULT NULL,
  `BookingID` varchar(100) NOT NULL,
  PRIMARY KEY (`BookingID`),
  KEY `source` (`source`,`destination`,`path`),
  KEY `username` (`username`),
  CONSTRAINT `Booking1_ibfk_1` FOREIGN KEY (`source`, `destination`, `path`) REFERENCES `Location1` (`source`, `destination`, `path`),
  CONSTRAINT `Booking1_ibfk_2` FOREIGN KEY (`username`) REFERENCES `Customers` (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Booking1`
--

LOCK TABLES `Booking1` WRITE;
/*!40000 ALTER TABLE `Booking1` DISABLE KEYS */;
INSERT INTO `Booking1` VALUES ('Rajnikant','MIT','Baner',70,'Thu Oct 05 09:55:47 IST 2017Rajnikant');
/*!40000 ALTER TABLE `Booking1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Booking2`
--

DROP TABLE IF EXISTS `Booking2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Booking2` (
  `BookingID` varchar(100) NOT NULL,
  `LocationID` int(11) DEFAULT NULL,
  `username` varchar(100) DEFAULT NULL,
  `source` varchar(100) DEFAULT NULL,
  `destination` varchar(100) DEFAULT NULL,
  `path` int(11) DEFAULT NULL,
  PRIMARY KEY (`BookingID`),
  KEY `LocationID` (`LocationID`),
  CONSTRAINT `Booking2_ibfk_1` FOREIGN KEY (`LocationID`) REFERENCES `Location2` (`LocationID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Booking2`
--

LOCK TABLES `Booking2` WRITE;
/*!40000 ALTER TABLE `Booking2` DISABLE KEYS */;
INSERT INTO `Booking2` VALUES ('Thu Oct 05 10:20:13 IST 2017Rajnikant',12,'Rajnikant','MIT','Deccan',80),('Thu Oct 05 11:01:26 IST 2017Shivam',12,'Shivam','MIT','Deccan',80);
/*!40000 ALTER TABLE `Booking2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Customers`
--

DROP TABLE IF EXISTS `Customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Customers` (
  `Username` varchar(100) NOT NULL,
  `enailId` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Customers`
--

LOCK TABLES `Customers` WRITE;
/*!40000 ALTER TABLE `Customers` DISABLE KEYS */;
INSERT INTO `Customers` VALUES ('aarohi','aarohi@gmail.com','GPP@amogh123','null'),('abc','abc123@gmail.com','ABC@mit123','null'),('aishwarya','aishwarya4@gmail.com','Aishwarya1','null'),('amogh','amogh@gmail.com','GPP@amogh123','null'),('amoghk','amogh@gmail.com','12345','pune'),('ask','amogh@gmail.com','Chinna1997','null'),('baii','tej@gmail.com','Tejashree1','null'),('bhushan','pavanpatekar34@gmail.com','111222','nashik'),('giri','girija@yahoo.com','Girija90','null'),('Kiran','kiran@gmail.com','Kiran123','null'),('pragati','pragati@gmail.com','GPP@amogh123','null'),('pranav','p@gmail.com','Pranav123','null'),('rajnikant','Rajni@gmail.com','Rajni123','null'),('shivam','shivam@gmail.com','Shivam123','null'),('shubham','mataleshubham@gmail.com','Sshubham@01','null'),('swaraj','swaraj@gmail.com','Swaraj123','null'),('tej','amoghkalyanshetti@gmail.com','GPP@amogh123','null'),('tejashree','tejkanchan@gmail.com','Tejashree123','null'),('vinay','vinay@gmail.com','Vinay123','null');
/*!40000 ALTER TABLE `Customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Location1`
--

DROP TABLE IF EXISTS `Location1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Location1` (
  `source` varchar(100) NOT NULL,
  `destination` varchar(100) NOT NULL,
  `path` int(11) NOT NULL,
  PRIMARY KEY (`source`,`destination`,`path`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Location1`
--

LOCK TABLES `Location1` WRITE;
/*!40000 ALTER TABLE `Location1` DISABLE KEYS */;
INSERT INTO `Location1` VALUES ('Baner','Bavdhan',50),('Baner','Deccan',100),('Baner','MIT',70),('Bavdhan','Baner',50),('Bavdhan','Deccan',78),('Bavdhan','MIT',42),('Deccan','Baner',100),('Deccan','Bavdhan',78),('Deccan','MIT',80),('MIT','Baner',70),('MIT','Bavdhan',42),('MIT','Deccan',80);
/*!40000 ALTER TABLE `Location1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Location2`
--

DROP TABLE IF EXISTS `Location2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Location2` (
  `LocationID` int(11) NOT NULL AUTO_INCREMENT,
  `source` varchar(100) DEFAULT NULL,
  `destination` varchar(100) DEFAULT NULL,
  `path` int(11) DEFAULT NULL,
  PRIMARY KEY (`LocationID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Location2`
--

LOCK TABLES `Location2` WRITE;
/*!40000 ALTER TABLE `Location2` DISABLE KEYS */;
INSERT INTO `Location2` VALUES (1,'Baner','Bavdhan',50),(2,'Baner','Deccan',100),(3,'Baner','MIT',70),(4,'Bavdhan','Baner',50),(5,'Bavdhan','Deccan',78),(6,'Bavdhan','MIT',42),(7,'Deccan','Baner',100),(8,'Deccan','Bavdhan',78),(9,'Deccan','MIT',80),(10,'MIT','Baner',70),(11,'MIT','Bavdhan',42),(12,'MIT','Deccan',80);
/*!40000 ALTER TABLE `Location2` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-01 18:12:59
