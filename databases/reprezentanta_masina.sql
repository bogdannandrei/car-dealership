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
-- Table structure for table `masina`
--

DROP TABLE IF EXISTS `masina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `masina` (
  `id_masina` int NOT NULL AUTO_INCREMENT,
  `id_reprezentanta` int NOT NULL,
  `marca` varchar(20) DEFAULT NULL,
  `model` varchar(30) DEFAULT NULL,
  `an_fabricatie` int NOT NULL,
  `capacitate_cilindrica` int DEFAULT NULL,
  `combustibil` varchar(10) DEFAULT NULL,
  `cod_motor` varchar(4) DEFAULT NULL,
  `tip_masina` varchar(15) DEFAULT NULL,
  `pret` int DEFAULT NULL,
  `kilometraj` int DEFAULT NULL,
  `eligibil_rabla` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id_masina`),
  KEY `id_reprezentanta` (`id_reprezentanta`),
  KEY `cod_motor` (`cod_motor`),
  CONSTRAINT `masina_ibfk_1` FOREIGN KEY (`id_reprezentanta`) REFERENCES `reprezentanta` (`id_reprezentanta`),
  CONSTRAINT `masina_ibfk_2` FOREIGN KEY (`cod_motor`) REFERENCES `piesa` (`cod_motor`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `masina`
--

LOCK TABLES `masina` WRITE;
/*!40000 ALTER TABLE `masina` DISABLE KEYS */;
INSERT INTO `masina` VALUES (1,2,'Hyundai','Huracan',2019,2112,'electric','IAAA','test-drive',22097,493,'Nu'),(2,1,'Skoda','Cayenne',2019,2425,'benzina','MIAU','test-drive',36722,381,'Da'),(3,2,'Porsche','Octavia',2021,2868,'electric','IAAA','nou',20682,443,'Da'),(4,1,'Volkswagen','Tucson',2020,2911,'diesel','AZMB','second-hand',33766,497,'Da'),(5,1,'Porsche','Bayon',2021,3883,'electric','MIAU','second-hand',32186,117,'Nu'),(6,2,'KIA','Karoq',2019,2810,'diesel','AZMB','nou',39108,35,'Nu'),(7,3,'Hyundai','Karoq',2019,3757,'diesel','IAAA','nou',27769,261,'Nu'),(8,1,'SEAT','Aventador',2020,2040,'benzina','HAUB','second-hand',41367,206,'Da'),(9,3,'Audi','Taycan',2021,3748,'diesel','MIAU','nou',28917,181,'Nu'),(10,2,'Skoda','Karoq',2020,2562,'electric','IAAA','test-drive',36209,202,'Nu'),(11,3,'Volkswagen','Octavia',2021,3953,'diesel','IAAA','second-hand',48516,219,'Da'),(12,1,'Skoda','Aventador',2020,3522,'diesel','AZMB','test-drive',30986,211,'Nu'),(13,2,'Volkswagen','Cayenne',2019,2457,'benzina','HAUB','nou',41760,228,'Da'),(14,2,'Porsche','Leon',2019,2378,'benzina','HAUB','test-drive',27644,466,'Da'),(15,2,'Lamborghini','Leon',2021,2788,'benzina','AZMB','nou',20405,156,'Nu'),(16,3,'Skoda','Karoq',2019,3134,'diesel','IAAA','second-hand',21133,161,'Da'),(17,3,'KIA','Karoq',2021,2006,'diesel','MIAU','second-hand',23953,193,'Da'),(18,3,'SEAT','Tucson',2019,3880,'benzina','IAAA','nou',30943,370,'Da'),(19,3,'Audi','Cayenne',2020,2974,'electric','HAUB','test-drive',20384,263,'Nu'),(20,3,'Porsche','Tucson',2019,2835,'benzina','HAUB','nou',26954,221,'Da'),(21,3,'Audi','Octavia',2019,2030,'diesel','IAAA','second-hand',36053,387,'Da'),(22,3,'Hyundai','Octavia',2019,3523,'benzina','IAAA','nou',24234,366,'Nu'),(23,2,'Porsche','Tucson',2020,2335,'electric','MIAU','test-drive',33790,402,'Da'),(24,3,'Hyundai','Leon',2021,2286,'diesel','HAUB','nou',27349,169,'Nu'),(25,2,'Porsche','Karoq',2019,2253,'benzina','MIAU','test-drive',23761,181,'Da'),(26,3,'Hyundai','Bayon',2020,2490,'electric','IAAA','test-drive',33075,326,'Nu'),(27,1,'Volkswagen','Huracan',2020,3606,'benzina','HAUB','nou',28609,2,'Da'),(28,1,'Lamborghini','Sportage',2021,2430,'electric','HAUB','nou',49319,465,'Nu'),(29,1,'Mazda','Octavia',2020,3013,'diesel','HAUB','second-hand',41438,199,'Nu'),(30,1,'Mazda','Huracan',2021,2875,'diesel','HAUB','nou',35553,1,'Da'),(31,3,'KIA','Taycan',2021,2934,'benzina','AZMB','nou',22664,339,'Da'),(32,3,'Hyundai','Karoq',2021,2294,'diesel','HAUB','nou',29970,101,'Nu'),(33,3,'KIA','Bayon',2020,2378,'electric','HAUB','nou',37717,24,'Nu'),(34,3,'Lamborghini','Huracan',2019,3751,'diesel','AZMB','second-hand',21901,90,'Da'),(35,3,'Hyundai','Taycan',2021,3311,'diesel','HAUB','second-hand',41819,401,'Da'),(36,3,'Volkswagen','Bayon',2019,2787,'benzina','IAAA','second-hand',33385,12,'Nu'),(37,2,'Volkswagen','Karoq',2021,3780,'electric','IAAA','nou',30306,459,'Nu'),(38,3,'Audi','Huracan',2020,2443,'electric','MIAU','nou',29902,349,'Nu'),(39,2,'Skoda','Golf',2021,3981,'benzina','AZMB','test-drive',33962,409,'Nu'),(40,2,'KIA','Bayon',2019,3764,'benzina','HAUB','nou',47123,385,'Da'),(41,1,'Hyundai','Tucson',2019,3944,'electric','IAAA','second-hand',40700,265,'Nu'),(42,3,'Mazda','Huracan',2021,2849,'benzina','MIAU','second-hand',20375,43,'Da'),(43,1,'Porsche','Taycan',2021,2728,'benzina','AZMB','second-hand',42519,245,'Nu'),(44,1,'Hyundai','Leon',2019,3344,'electric','AZMB','nou',35732,257,'Nu'),(45,2,'KIA','Tucson',2020,3147,'electric','IAAA','nou',20875,342,'Da'),(46,2,'Lamborghini','Cayenne',2020,2845,'electric','HAUB','nou',35960,349,'Nu'),(47,1,'Audi','Octavia',2021,2960,'benzina','MIAU','second-hand',27787,67,'Nu'),(48,3,'Volkswagen','Bayon',2020,2219,'diesel','HAUB','second-hand',44431,112,'Nu'),(49,1,'Lamborghini','Sportage',2019,2764,'benzina','IAAA','test-drive',40731,428,'Nu'),(50,3,'Skoda','Leon',2020,3948,'benzina','IAAA','second-hand',35958,407,'Nu'),(51,1,'Lamborghini','Octavia',2021,2107,'diesel','HAUB','second-hand',40364,485,'Nu'),(52,1,'SEAT','Octavia',2021,2441,'benzina','MIAU','second-hand',36563,331,'Nu'),(53,2,'KIA','Leon',2021,2852,'benzina','MIAU','second-hand',31077,181,'Da'),(54,1,'Lamborghini','Tucson',2019,3054,'electric','HAUB','nou',34657,269,'Nu'),(55,2,'Skoda','Bayon',2020,2821,'diesel','MIAU','second-hand',34021,231,'Nu'),(56,3,'SEAT','Cayenne',2019,3708,'electric','IAAA','test-drive',48777,120,'Nu'),(57,2,'Hyundai','Bayon',2020,3205,'benzina','HAUB','nou',35557,432,'Nu'),(58,1,'Skoda','Tucson',2019,2685,'benzina','IAAA','test-drive',37449,186,'Nu'),(59,1,'Lamborghini','Sportage',2021,2843,'benzina','HAUB','nou',49079,66,'Nu'),(60,2,'Audi','Cayenne',2020,3394,'benzina','HAUB','nou',22111,126,'Da'),(61,2,'Audi','Cayenne',2020,3476,'benzina','IAAA','test-drive',36045,410,'Da'),(62,2,'Hyundai','Bayon',2021,3325,'electric','HAUB','nou',27716,221,'Nu'),(63,1,'Audi','Leon',2021,2412,'benzina','HAUB','second-hand',27013,56,'Da'),(64,2,'Hyundai','Karoq',2019,2798,'benzina','MIAU','nou',36171,189,'Da'),(65,1,'Volkswagen','Cayenne',2021,3771,'electric','AZMB','second-hand',24897,75,'Nu'),(66,3,'KIA','Karoq',2021,3099,'benzina','MIAU','nou',49271,422,'Da'),(67,2,'Lamborghini','Golf',2020,3429,'electric','HAUB','test-drive',45989,142,'Nu'),(68,3,'Mazda','Aventador',2020,3888,'electric','HAUB','test-drive',37559,401,'Da'),(69,3,'Hyundai','Karoq',2020,2055,'electric','AZMB','nou',42708,224,'Nu'),(70,3,'Hyundai','Taycan',2020,2779,'electric','IAAA','nou',22935,101,'Nu'),(71,2,'Mazda','Huracan',2019,2289,'benzina','AZMB','nou',21609,413,'Da'),(72,1,'Volkswagen','Octavia',2020,3015,'benzina','MIAU','test-drive',37437,182,'Nu'),(73,1,'Audi','Leon',2019,3474,'diesel','MIAU','nou',21127,346,'Nu'),(74,2,'Porsche','Tucson',2021,3521,'benzina','MIAU','test-drive',46740,458,'Da'),(75,3,'KIA','Huracan',2019,3186,'electric','AZMB','second-hand',22756,46,'Da'),(76,1,'SEAT','Leon',2021,2444,'electric','MIAU','test-drive',26728,317,'Nu'),(77,1,'KIA','Taycan',2021,2118,'diesel','HAUB','second-hand',48603,297,'Nu'),(78,3,'Hyundai','Taycan',2021,3018,'electric','IAAA','second-hand',32793,84,'Nu'),(79,2,'KIA','Tucson',2021,2054,'electric','IAAA','second-hand',49969,29,'Da'),(80,1,'Mazda','Karoq',2020,2594,'diesel','IAAA','second-hand',37550,334,'Da'),(81,1,'SEAT','Sportage',2020,2775,'diesel','IAAA','nou',33860,343,'Nu'),(82,1,'Hyundai','Golf',2019,3611,'benzina','IAAA','nou',33579,216,'Da'),(83,1,'Volkswagen','Karoq',2020,2194,'diesel','AZMB','test-drive',31846,105,'Da'),(84,3,'Hyundai','Aventador',2021,2816,'diesel','IAAA','nou',35797,314,'Da'),(85,3,'SEAT','Golf',2021,2947,'diesel','AZMB','second-hand',40917,136,'Da'),(86,2,'SEAT','Tucson',2019,3934,'benzina','IAAA','second-hand',32708,433,'Da'),(87,1,'Skoda','Octavia',2020,3084,'benzina','MIAU','test-drive',41039,426,'Da'),(88,1,'Skoda','Taycan',2020,2423,'benzina','MIAU','test-drive',37465,47,'Nu'),(89,3,'Volkswagen','Cayenne',2019,3184,'diesel','AZMB','nou',33650,197,'Nu'),(90,2,'Porsche','Golf',2021,3430,'benzina','IAAA','test-drive',30692,186,'Nu'),(91,3,'Audi','Sportage',2020,3488,'benzina','HAUB','nou',30542,455,'Da'),(92,1,'SEAT','Tucson',2021,3960,'electric','AZMB','nou',35262,283,'Da'),(93,2,'Porsche','Aventador',2020,2361,'diesel','AZMB','second-hand',49544,337,'Nu'),(94,3,'SEAT','Octavia',2019,3440,'diesel','HAUB','second-hand',29467,471,'Da'),(95,1,'Porsche','Huracan',2019,3258,'diesel','AZMB','nou',22776,124,'Da'),(96,2,'Mazda','Aventador',2019,2630,'electric','HAUB','nou',44432,235,'Nu'),(97,1,'Lamborghini','Tucson',2019,3631,'diesel','MIAU','test-drive',47681,84,'Nu'),(98,2,'Volkswagen','Cayenne',2020,3361,'electric','HAUB','nou',39918,407,'Da'),(99,3,'Skoda','Sportage',2021,2515,'benzina','HAUB','test-drive',25298,79,'Da'),(100,2,'Hyundai','Huracan',2020,3779,'benzina','IAAA','test-drive',28636,498,'Nu');
/*!40000 ALTER TABLE `masina` ENABLE KEYS */;
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
