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
-- Table structure for table `asigurare`
--

DROP TABLE IF EXISTS `asigurare`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asigurare` (
  `id_asigurare` int NOT NULL AUTO_INCREMENT,
  `id_client` int NOT NULL,
  `id_masina` int NOT NULL,
  `firma_asigurare` varchar(255) DEFAULT NULL,
  `tip_asigurare` varchar(255) DEFAULT NULL,
  `durata_asigurare` int DEFAULT NULL,
  `pret_asigurare` int DEFAULT NULL,
  PRIMARY KEY (`id_asigurare`),
  KEY `id_client` (`id_client`),
  KEY `id_masina` (`id_masina`),
  CONSTRAINT `asigurare_ibfk_1` FOREIGN KEY (`id_client`) REFERENCES `client` (`id_client`),
  CONSTRAINT `asigurare_ibfk_2` FOREIGN KEY (`id_masina`) REFERENCES `masina` (`id_masina`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asigurare`
--

LOCK TABLES `asigurare` WRITE;
/*!40000 ALTER TABLE `asigurare` DISABLE KEYS */;
INSERT INTO `asigurare` VALUES (1,25,84,'ASIROM','RCA',6,750),(2,4,64,'Euroins','RCA',3,417),(3,13,60,'Garanti','mixt',12,5916),(4,11,43,'Omniasig','mixt',3,648),(5,9,5,'ASIROM','mixt',12,960),(6,8,97,'ASIROM','RCA',15,2625),(7,1,18,'Euroins','RCA',9,531),(8,15,39,'ASIROM','RCA',9,2844),(9,24,99,'Omniasig','RCA',15,2400),(10,26,43,'Euroins','mixt',15,195),(11,2,91,'Omniasig','CASCO',9,1206),(12,6,35,'City Insurance','CASCO',15,5085),(13,21,2,'ASIROM','mixt',6,390),(14,10,17,'Garanti','mixt',12,4896),(15,22,9,'ASIROM','CASCO',15,555);
/*!40000 ALTER TABLE `asigurare` ENABLE KEYS */;
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
