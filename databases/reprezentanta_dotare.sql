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
-- Table structure for table `dotare`
--

DROP TABLE IF EXISTS `dotare`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dotare` (
  `id_dotare` int NOT NULL AUTO_INCREMENT,
  `nume_dotare` varchar(255) DEFAULT NULL,
  `descriere_dotare` varchar(255) DEFAULT NULL,
  `pret_dotare` int DEFAULT NULL,
  PRIMARY KEY (`id_dotare`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dotare`
--

LOCK TABLES `dotare` WRITE;
/*!40000 ALTER TABLE `dotare` DISABLE KEYS */;
INSERT INTO `dotare` VALUES (1,'Clima pe doua zone',NULL,500),(2,'Incalzire in scaune',NULL,200),(3,'Senzori de parcare',NULL,150),(4,'Trapa panoramica',NULL,1956),(5,'Cutie automata',NULL,150),(6,'Pilot adaptiv',NULL,150),(7,'Faruri LED',NULL,150),(8,'Suspensie adaptiva',NULL,560),(9,'Comenzi pe volan',NULL,200),(10,'Navigatie',NULL,1000),(11,'Tapiterie din piele',NULL,1300),(12,'Jante forjate',NULL,3000),(13,'Geamuri fumurii',NULL,150),(14,'Franare automata',NULL,500),(15,'Heads-up display',NULL,600);
/*!40000 ALTER TABLE `dotare` ENABLE KEYS */;
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
