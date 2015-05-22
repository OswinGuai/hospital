-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: hospital
-- ------------------------------------------------------
-- Server version	5.6.24-log

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
-- Table structure for table `diagnose_procedure_record`
--

DROP TABLE IF EXISTS `diagnose_procedure_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `diagnose_procedure_record` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `procedure_type` int(11) NOT NULL,
  `record_time` datetime NOT NULL,
  `finish_time` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `record_id` bigint(20) NOT NULL,
  `room_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diagnose_procedure_record`
--

LOCK TABLES `diagnose_procedure_record` WRITE;
/*!40000 ALTER TABLE `diagnose_procedure_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `diagnose_procedure_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diagnose_record`
--

DROP TABLE IF EXISTS `diagnose_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `diagnose_record` (
  `record_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `patient_id` bigint(20) NOT NULL,
  `diagnose_type` int(11) NOT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diagnose_record`
--

LOCK TABLES `diagnose_record` WRITE;
/*!40000 ALTER TABLE `diagnose_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `diagnose_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diagnose_room`
--

DROP TABLE IF EXISTS `diagnose_room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `diagnose_room` (
  `room_id` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  PRIMARY KEY (`room_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diagnose_room`
--

LOCK TABLES `diagnose_room` WRITE;
/*!40000 ALTER TABLE `diagnose_room` DISABLE KEYS */;
/*!40000 ALTER TABLE `diagnose_room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diagnose_type`
--

DROP TABLE IF EXISTS `diagnose_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `diagnose_type` (
  `id` int(11) NOT NULL,
  `type_name` varchar(45) NOT NULL,
  `parent_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diagnose_type`
--

LOCK TABLES `diagnose_type` WRITE;
/*!40000 ALTER TABLE `diagnose_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `diagnose_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location_direction`
--

DROP TABLE IF EXISTS `location_direction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `location_direction` (
  `id` int(11) NOT NULL,
  `diagnose_type` int(11) DEFAULT NULL,
  `procedure_type` int(11) DEFAULT NULL,
  `room_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location_direction`
--

LOCK TABLES `location_direction` WRITE;
/*!40000 ALTER TABLE `location_direction` DISABLE KEYS */;
/*!40000 ALTER TABLE `location_direction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patient` (
  `patient_id` bigint(20) NOT NULL,
  `name` varchar(45) NOT NULL,
  `idcard` varchar(45) DEFAULT NULL,
  `cellphone` varchar(45) DEFAULT NULL,
  `alipay_id` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`patient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_card_bind`
--

DROP TABLE IF EXISTS `patient_card_bind`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patient_card_bind` (
  `id` bigint(20) NOT NULL,
  `patient_id` bigint(20) NOT NULL,
  `card_id` varchar(45) NOT NULL,
  `bind_time` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_card_bind`
--

LOCK TABLES `patient_card_bind` WRITE;
/*!40000 ALTER TABLE `patient_card_bind` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient_card_bind` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_card_trade_record`
--

DROP TABLE IF EXISTS `patient_card_trade_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patient_card_trade_record` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `trade_type` int(11) NOT NULL,
  `amount` int(11) NOT NULL,
  `comment` varchar(100) DEFAULT NULL,
  `time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_card_trade_record`
--

LOCK TABLES `patient_card_trade_record` WRITE;
/*!40000 ALTER TABLE `patient_card_trade_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `patient_card_trade_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `procedure_type`
--

DROP TABLE IF EXISTS `procedure_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `procedure_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `procedure_type`
--

LOCK TABLES `procedure_type` WRITE;
/*!40000 ALTER TABLE `procedure_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `procedure_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `aid` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `idcard` varchar(45) DEFAULT NULL,
  `cellphone` varchar(45) DEFAULT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('sss111','名字','232132','1324312',1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-05-22 10:14:42
