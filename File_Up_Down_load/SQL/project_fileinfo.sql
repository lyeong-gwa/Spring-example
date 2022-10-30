-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: project
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `fileinfo`
--

DROP TABLE IF EXISTS `fileinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fileinfo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `saveFolder` varchar(45) COLLATE utf8mb3_bin DEFAULT NULL,
  `originalFile` varchar(45) COLLATE utf8mb3_bin DEFAULT NULL,
  `saveFile` varchar(45) COLLATE utf8mb3_bin DEFAULT NULL,
  `userid` varchar(45) COLLATE utf8mb3_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fileinfo`
--

LOCK TABLES `fileinfo` WRITE;
/*!40000 ALTER TABLE `fileinfo` DISABLE KEYS */;
INSERT INTO `fileinfo` VALUES (1,'221030','싸피 스크립트.txt','94f017a4-53e1-4cdb-af94-823a0404ac26.txt','1'),(2,'221030','싸피정리.txt','76af9a49-c453-4dbb-98c8-817e620664bb.txt','1'),(3,'221030','떡상자료.PNG','2ece3d24-836f-4ceb-994e-89ba5ba2a23d.PNG','2'),(4,'221030','박정희.txt','5b36d2f0-05b4-42a0-bb8f-268d56cb8c71.txt','1'),(5,'221030','싸피 스크립트.txt','ed755503-1748-4dc3-966d-e6eb8fdc2e7d.txt','1'),(6,'221030','전자서명.PNG','396f5edb-b489-43cf-80f5-c626fa39ee4b.PNG','1'),(7,'221030','박정희_970507.pdf','ed07f0bb-6771-4e81-a65b-d5f2addc4b01.pdf','1'),(8,'221030','박정희_현대오토에버_이력서.pdf','81d63560-a849-437b-892f-3f851dc9ff7c.pdf','1');
/*!40000 ALTER TABLE `fileinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-30 21:24:52
