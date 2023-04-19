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
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `client` (
  `id_client` int NOT NULL AUTO_INCREMENT,
  `nume_client` varchar(255) DEFAULT NULL,
  `prenume_client` varchar(255) DEFAULT NULL,
  `data_nasterii` date DEFAULT NULL,
  `adresa_client` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_client`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (1,'Manole','Stefania','2019-02-20','Strada Afirmarii'),(2,'Popa','Stefan','2019-05-30','Strada Inocentei'),(3,'Tudor','Alexandru','2020-04-04','Strada Afirmarii'),(4,'Stanciu','Daria','2019-05-08','Strada Melodiei'),(5,'Dumitrescu','Stefania','2021-03-21','Strada Poeziei'),(6,'Popescu','Ioana','2019-03-09','Strada Melodiei'),(7,'Albu','Andreea','2020-07-23','Strada Poeziei'),(8,'Diaconu','Gabriel','2020-05-30','Strada Sperantei'),(9,'Barbu','Andrei','2019-11-14','Strada Sperantei'),(10,'Stan','Mihai','2021-07-01','Strada Frumusita'),(11,'Cristea','Andreea','2020-10-24','Strada Lanternei'),(12,'Stanescu','Antonia','2020-06-05','Strada Inocentei'),(13,'Dima','Ionut','2019-02-01','Strada Lecturii'),(14,'Ursu','Daria','2020-12-13','Strada Poeziei'),(15,'Fratila','Maria','2021-06-23','Strada Calitatii'),(16,'Nistor','Elena','2019-09-20','Strada Verii'),(17,'Dinescu','Gabriela','2019-03-09','Strada Inocentei'),(18,'Diaconu','Andrei','2020-03-17','Strada Ochisoru'),(19,'Diaconescu','Daria','2020-07-25','Strada Diminetii'),(20,'Pop','Gabriela','2021-01-23','Strada Ritmului'),(21,'Dima','Darius','2019-01-31','Strada Calitatii'),(22,'Georgescu','Cristian','2019-07-24','Strada Melodiei'),(23,'Puscasu','Gabriela','2019-06-09','Strada Somnului'),(24,'Dumitrescu','Cristian','2020-01-15','Strada Melodiei'),(25,'Nistor','Elena','2020-12-07','Strada Viitorului'),(26,'Diaconescu','Mihai','2021-06-23','Strada Calitatii'),(27,'Constantinescu','Mihai','2021-02-07','Strada Aromei'),(28,'Florea','Alexandra','2020-05-28','Strada Frumusita'),(29,'Stoica','Ioana','2020-04-08','Strada Ochisoru'),(30,'Cristea','Andrei','2019-11-16','Strada Existentei');
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
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
