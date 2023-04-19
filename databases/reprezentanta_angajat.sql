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
-- Table structure for table `angajat`
--

DROP TABLE IF EXISTS `angajat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `angajat` (
  `id_angajat` int NOT NULL AUTO_INCREMENT,
  `id_functie` int NOT NULL,
  `nume_angajat` varchar(255) DEFAULT NULL,
  `prenume_angajat` varchar(255) DEFAULT NULL,
  `data_nasterii` date DEFAULT NULL,
  `ore_lucrate` int DEFAULT NULL,
  PRIMARY KEY (`id_angajat`),
  KEY `id_functie` (`id_functie`),
  CONSTRAINT `angajat_ibfk_1` FOREIGN KEY (`id_functie`) REFERENCES `functie` (`id_functie`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `angajat`
--

LOCK TABLES `angajat` WRITE;
/*!40000 ALTER TABLE `angajat` DISABLE KEYS */;
INSERT INTO `angajat` VALUES (2,2,'Georgescu','Andrei','2021-05-22',49),(3,4,'Stan','Elena','2020-06-14',37),(4,3,'Constantinescu','Stefania','2019-05-25',43),(5,2,'Manole','Gabriel','2019-11-05',20),(6,4,'Albu','Elena','2019-03-02',28),(7,4,'Manole','Andreea','2019-12-23',36),(8,3,'Georgescu','Cristian','2020-08-14',35),(9,2,'Constantinescu','Stefan','2019-08-29',34),(10,2,'Ciobanu','Alexandru','2019-06-17',14),(11,3,'Dobre','Antonia','2020-05-28',14),(12,3,'Voinea','Andreea','2020-05-02',21),(13,4,'Tudor','Ionut','2021-01-21',8),(14,2,'Constantinescu','Andrei','2021-01-29',24),(15,4,'Stanescu','Antonia','2020-05-30',38),(16,3,'Voinea','Ana','2019-05-27',40),(17,2,'Marin','Daniel','2020-07-27',4),(18,4,'Tomescu','Antonia','2019-07-06',44),(19,4,'Manole','Andreea','2021-02-07',11),(20,2,'Popescu','Antonia','2019-05-24',12),(21,4,'Ursu','Mihai','2021-03-31',4),(22,2,'Popescu','Daria','2021-03-25',14),(23,4,'Nitu','Daniel','2020-02-24',7),(24,2,'Nistor','Maria','2019-01-09',6),(25,3,'Ursu','Stefan','2019-10-03',38),(26,2,'Tomescu','Daria','2020-05-29',47),(27,4,'Toma','Elena','2020-03-21',9),(28,3,'Dumitrescu','Alexandra','2020-07-13',22),(29,3,'Pop','Cristian','2021-02-09',21),(30,3,'Stan','Darius','2020-05-18',48);
/*!40000 ALTER TABLE `angajat` ENABLE KEYS */;
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
