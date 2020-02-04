-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: videogamerentals
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS employees;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE employees (
  id int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  username varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES employees WRITE;
/*!40000 ALTER TABLE employees DISABLE KEYS */;
INSERT INTO employees VALUES (1,'Admin','admin','21232f297a57a5a743894a0e4a801fc3'),(2,'John Doe','jdoe','a31405d272b94e5d12e9a52a665d3bfe'),(5,'Mark Dacascos','mdaca','11fc58f72652d713ea97e91b915013f4'),(10,'John Philip','jphilip','8ed1707e07ca7900d1672cf574c33cb0'),(15,'John Murphy','jmurphy','f15b20a961931c35e70fd23a7e6480a1');
/*!40000 ALTER TABLE employees ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `games`
--

DROP TABLE IF EXISTS games;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE games (
  id int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  genre varchar(45) DEFAULT NULL,
  platform varchar(45) DEFAULT NULL,
  members_id int(11) NOT NULL,
  rental_date varchar(45) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY fk_games_members_idx (members_id),
  CONSTRAINT fk_games_members FOREIGN KEY (members_id) REFERENCES `members` (id)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `games`
--

LOCK TABLES games WRITE;
/*!40000 ALTER TABLE games DISABLE KEYS */;
INSERT INTO games VALUES (1,'Army of Two','action-tps','PS3',7,'2019-12-05'),(2,'Army of Two: The 40th Day','action-tps','PS3',7,'2019-12-05'),(3,'Assassin’s Creed','action-adventure stealth','PS3',2,'2019-12-02'),(4,'Assassin’s Creed II','action-adventure stealth','PS3',14,'2019-12-04'),(5,'Assassin’s Creed III','action-adventure stealth','PS3',12,'2019-12-06'),(6,'Asura’s Wrath','beat\'em-up','PS3',3,'2019-12-01'),(7,'Enchanted Arms','jRPG','PS3',0,NULL),(8,'F.E.A.R.','first person shooter','PS3',7,'2019-12-06'),(9,'Far Cry 3','first person shooter','PS3',5,'2019-12-06'),(10,'FIFA 14','sports','PS3',22,'2019-12-06'),(11,'Final Fantasy XIII','jRPG','PS3',0,NULL),(12,'Siren: Blood Curse','action-horror','PS3',0,NULL),(13,'Soulcalibur V','fighting','PS3',0,NULL),(14,'Tekken 6','fighting','PS3',0,NULL),(15,'Tekken 7','fighting','PS4',0,NULL),(16,'God of War','action','PS4',0,NULL),(17,'Alien: Isolation','survival horror','PS4',7,'2019-12-04'),(18,'Assassin\'s Creed Odyssey','action-adventure stealth','PS4',5,'2019-12-06'),(19,'Assassin\'s Creed: Origins','action-adventure stealth','PS4',8,'2019-12-04'),(20,'Crash Bandicoot N. Sane Trilogy','platform','PS4',22,'2019-12-06'),(21,'Kingdom Hearts HD 1.5 + 2.5 Remix','jRPG','PS4',0,NULL),(22,'Knack 2','platform','PS4',10,'2019-12-06'),(39,'Tekken3','fighting','PS1',0,NULL);
/*!40000 ALTER TABLE games ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `members`
--

DROP TABLE IF EXISTS members;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE members (
  id int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  email varchar(45) DEFAULT NULL,
  phone varchar(45) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=164 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `members`
--

LOCK TABLES members WRITE;
/*!40000 ALTER TABLE members DISABLE KEYS */;
INSERT INTO members VALUES (0,'-','-','-'),(1,'Rennie Syers','rsyers0@hao123.com','06 20 331 2053'),(2,'Ricky Hyslop','rhyslop1@theguardian.com','06 70 101 6817'),(3,'Pippa Dowey','pdowey2@chron.com','06 30 893 2138'),(4,'Upton Broose','ubroose3@dropbox.com','06 70 998 8499'),(5,'Ardisj Gother','agother4@ovh.net','06 30 847 5518'),(6,'Valentino Manueli','vmanueli5@paypal.com','06 30 728 9633'),(7,'Antonetta Heintzsch','aheintzsch6@examiner.com','06 20 162 9304'),(8,'Brandice Barr','bbarr7@1688.com','06 70 776 7724'),(9,'Liuka Rees','lrees8@apache.org','06 70 789 2392'),(10,'Gaspar Pound','gpound9@spotify.com','06 30 421 0142'),(11,'Lavinia Shale','lshalea@stumbleupon.com','06 70 518 7050'),(12,'Bailie Van Velden','bvanb@tuttocitta.it','06 30 311 8500'),(13,'Sianna Blaby','sblabyc@foxnews.com','06 20 958 9452'),(14,'Cathyleen Gosford','cgosfordd@psu.edu','06 20 481 4324'),(15,'Tiphanie Lillico','tlillicoe@privacy.gov.au','06 20 653 0241'),(16,'Conrad McPhater','cmcphaterf@nasa.gov','06 20 302 8866'),(17,'Ximenes Atwool','xatwoolg@tinyurl.com','06 70 578 0706'),(18,'Tiena Wressell','twressellh@unicef.org','06 30 839 9369'),(19,'Zeke O\'Cleary','zoclearyi@rediff.com','06 70 227 0599'),(20,'Kristo Hofler','khoflerj@joomla.org','06 70 406 3868'),(21,'Gorden Matteoni','gmatteonik@w3.org','06 70 389 0302'),(22,'Bekki Howorth','bhoworthl@nbcnews.com','06 30 936 0312'),(23,'Huberto Culwen','hculwenm@stanford.edu','06 70 322 7726'),(24,'Dalenna Nussii','dnussiin@mtv.com','06 70 062 1591'),(25,'Zebedee Pallant','zpallanto@last.fm','06 70 426 5296'),(26,'Grayce Colby','gcolbyp@wiley.com','06 70 125 5859'),(27,'Miranda Minero','mmineroq@facebook.com','06 20 844 8000'),(28,'Dodie Mellody','dmellodyr@biglobe.ne.jp','06 70 601 4939'),(29,'Isaac Asple','iasples@meetup.com','06 30 947 1118'),(30,'Shep Boucher','sbouchert@github.com','06 70 143 2892'),(146,'Kocsis Géza','geza@hotmail.com','06 20 320 2123'),(159,'Martin Luther','martin@gmail.com','06 20 321 2311'),(163,'Bellamy Blake','bel@msn.com','06 20 121 2134');
/*!40000 ALTER TABLE members ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-04 19:20:46
