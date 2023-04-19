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
-- Table structure for table `service`
--

DROP TABLE IF EXISTS `service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service` (
  `id_reparatie` int NOT NULL AUTO_INCREMENT,
  `id_client` int NOT NULL,
  `id_angajat` int NOT NULL,
  `data_reparatie` date DEFAULT NULL,
  `pret_reparatie` int DEFAULT NULL,
  `observatii_reparatie` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_reparatie`),
  KEY `id_angajat` (`id_angajat`),
  KEY `id_client` (`id_client`),
  CONSTRAINT `service_ibfk_1` FOREIGN KEY (`id_angajat`) REFERENCES `angajat` (`id_angajat`),
  CONSTRAINT `service_ibfk_2` FOREIGN KEY (`id_client`) REFERENCES `client` (`id_client`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service`
--

LOCK TABLES `service` WRITE;
/*!40000 ALTER TABLE `service` DISABLE KEYS */;
INSERT INTO `service` VALUES (1,1,15,'2020-12-15',29,'blablabla'),(2,10,22,'2019-10-08',215,'blablabla'),(3,24,22,'2020-12-30',30,'blablabla'),(4,19,2,'2019-12-14',210,'blablabla'),(5,18,9,'2019-01-05',225,'blablabla'),(6,5,11,'2020-06-07',210,'blablabla'),(7,14,18,'2020-12-26',209,'blablabla'),(8,4,26,'2019-01-14',114,'blablabla'),(9,10,29,'2020-10-21',78,'blablabla'),(10,27,27,'2021-03-16',190,'blablabla'),(11,10,6,'2020-02-25',6,'blablabla'),(12,22,18,'2019-12-11',170,'blablabla'),(13,26,15,'2021-03-09',101,'blablabla'),(14,16,6,'2020-07-14',196,'blablabla'),(15,14,18,'2019-12-05',158,'blablabla');
/*!40000 ALTER TABLE `service` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-02 18:23:01
