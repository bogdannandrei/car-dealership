-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: reprezentanta
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `test_drive`
--

DROP TABLE IF EXISTS `test_drive`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `test_drive` (
  `id_test_drive` int NOT NULL AUTO_INCREMENT,
  `id_client` int NOT NULL,
  `id_angajat` int NOT NULL,
  `id_masina` int NOT NULL,
  `data_test_drive` date DEFAULT NULL,
  `durata_test_drive` int DEFAULT NULL,
  PRIMARY KEY (`id_test_drive`),
  KEY `id_client` (`id_client`),
  KEY `id_masina` (`id_masina`),
  KEY `id_angajat` (`id_angajat`),
  CONSTRAINT `test_drive_ibfk_1` FOREIGN KEY (`id_client`) REFERENCES `client` (`id_client`),
  CONSTRAINT `test_drive_ibfk_2` FOREIGN KEY (`id_masina`) REFERENCES `masina` (`id_masina`),
  CONSTRAINT `test_drive_ibfk_3` FOREIGN KEY (`id_angajat`) REFERENCES `angajat` (`id_angajat`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test_drive`
--

LOCK TABLES `test_drive` WRITE;
/*!40000 ALTER TABLE `test_drive` DISABLE KEYS */;
INSERT INTO `test_drive` VALUES (1,29,3,96,'2021-01-22',1),(2,25,10,48,'2021-02-12',4),(3,8,21,88,'2019-01-29',1),(4,1,3,20,'2019-12-29',2),(5,3,4,82,'2020-06-04',1),(6,28,4,88,'2019-03-02',5),(7,21,10,100,'2019-03-02',4),(8,11,4,95,'2019-08-17',5),(9,26,21,8,'2021-04-11',5),(10,17,21,20,'2020-07-11',3),(11,11,10,9,'2020-08-18',3),(12,15,3,6,'2020-05-05',5),(13,22,4,18,'2019-09-29',5),(14,10,10,18,'2021-02-03',1),(15,6,4,18,'2019-08-10',4);
/*!40000 ALTER TABLE `test_drive` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-02 18:23:00
