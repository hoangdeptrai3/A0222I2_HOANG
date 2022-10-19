-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ql_banhang
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
-- Temporary view structure for view `buyer_view`
--

DROP TABLE IF EXISTS `buyer_view`;
/*!50001 DROP VIEW IF EXISTS `buyer_view`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `buyer_view` AS SELECT 
 1 AS `user_name`,
 1 AS `name_order`,
 1 AS `email`,
 1 AS `phone_number`,
 1 AS `address`,
 1 AS `name_product`,
 1 AS `quantity`,
 1 AS `note`,
 1 AS `payment`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `buyer_without_product_quantity`
--

DROP TABLE IF EXISTS `buyer_without_product_quantity`;
/*!50001 DROP VIEW IF EXISTS `buyer_without_product_quantity`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `buyer_without_product_quantity` AS SELECT 
 1 AS `user_name`,
 1 AS `name_order`,
 1 AS `email`,
 1 AS `phone_number`,
 1 AS `address`,
 1 AS `name_product`,
 1 AS `id_order`,
 1 AS `note`,
 1 AS `payment`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `id_category` int NOT NULL,
  `name_category` varchar(45) NOT NULL,
  PRIMARY KEY (`id_category`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Áo thun'),(2,'Áo dài tay'),(3,'Quần đùi'),(4,'Quần dài');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `customer_list`
--

DROP TABLE IF EXISTS `customer_list`;
/*!50001 DROP VIEW IF EXISTS `customer_list`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `customer_list` AS SELECT 
 1 AS `id_user`,
 1 AS `name_order`,
 1 AS `email`,
 1 AS `phone_number`,
 1 AS `address`,
 1 AS `id_order`,
 1 AS `id_product`,
 1 AS `note`,
 1 AS `payment`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `discount`
--

DROP TABLE IF EXISTS `discount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `discount` (
  `id_discount` int NOT NULL,
  `name_discount` varchar(100) DEFAULT NULL,
  `discount_rate` float DEFAULT NULL,
  PRIMARY KEY (`id_discount`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discount`
--

LOCK TABLES `discount` WRITE;
/*!40000 ALTER TABLE `discount` DISABLE KEYS */;
INSERT INTO `discount` VALUES (1,'Khách hàng tiềm năng',0.1),(2,'Khách hàng may mắn',0.2),(3,'Khách hang mới',0.3),(4,'Mặt hàng hot',0.2),(5,'Mặt hàng mua nhiều',0.1),(6,'Đồ gia dụng',0.05);
/*!40000 ALTER TABLE `discount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `discount_view`
--

DROP TABLE IF EXISTS `discount_view`;
/*!50001 DROP VIEW IF EXISTS `discount_view`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `discount_view` AS SELECT 
 1 AS `name_discount`,
 1 AS `discount_rate`,
 1 AS `id_proudct`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `gallery`
--

DROP TABLE IF EXISTS `gallery`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gallery` (
  `id_gallery` int NOT NULL,
  `id_product` int NOT NULL,
  `name_gallery` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_gallery`),
  KEY `FK_PRODUCT_idx` (`id_product`),
  CONSTRAINT `FK_PRODUCT` FOREIGN KEY (`id_product`) REFERENCES `product` (`id_product`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gallery`
--

LOCK TABLES `gallery` WRITE;
/*!40000 ALTER TABLE `gallery` DISABLE KEYS */;
INSERT INTO `gallery` VALUES (1,1,NULL),(2,2,NULL),(3,3,NULL),(4,4,NULL),(5,5,NULL),(6,6,NULL),(7,7,NULL),(8,8,NULL),(9,9,NULL),(10,10,NULL),(11,1,NULL);
/*!40000 ALTER TABLE `gallery` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `inventory_view`
--

DROP TABLE IF EXISTS `inventory_view`;
/*!50001 DROP VIEW IF EXISTS `inventory_view`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `inventory_view` AS SELECT 
 1 AS `Product name`,
 1 AS `price`,
 1 AS `Inventory number`,
 1 AS `Total monney`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `money_without_vat`
--

DROP TABLE IF EXISTS `money_without_vat`;
/*!50001 DROP VIEW IF EXISTS `money_without_vat`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `money_without_vat` AS SELECT 
 1 AS `id_order`,
 1 AS `id_product`,
 1 AS `quantity`,
 1 AS `price`,
 1 AS `total_money`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `order_details`
--

DROP TABLE IF EXISTS `order_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_details` (
  `id_detail` int NOT NULL,
  `id_order` int NOT NULL,
  `id_product` int NOT NULL,
  `quantity` int DEFAULT NULL,
  `total_money` int DEFAULT NULL,
  PRIMARY KEY (`id_detail`),
  KEY `FK_ORDER_idx` (`id_order`),
  KEY `FK_PRODUCT_idx` (`id_product`),
  CONSTRAINT `FK_DORDER` FOREIGN KEY (`id_order`) REFERENCES `orders` (`id_order`),
  CONSTRAINT `FK_DPRODUCT` FOREIGN KEY (`id_product`) REFERENCES `product` (`id_product`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_details`
--

LOCK TABLES `order_details` WRITE;
/*!40000 ALTER TABLE `order_details` DISABLE KEYS */;
INSERT INTO `order_details` VALUES (1,1,2,3,0),(2,2,5,1,0),(3,3,5,2,0),(4,4,3,1,0),(5,5,2,1,0),(6,6,1,2,0),(7,7,3,1,0),(8,8,4,2,0),(9,9,2,4,NULL);
/*!40000 ALTER TABLE `order_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `id_order` int NOT NULL,
  `id_user` int NOT NULL,
  `name_order` varchar(50) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone_number` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `note` varchar(300) DEFAULT NULL,
  `order_date` datetime DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_order`),
  KEY `FK_USER_idx` (`id_user`),
  CONSTRAINT `FK_USER` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,2,'User','user1@gmail.com','32423422','Điện An','Giao hàng vào chiều thứ 3',NULL,NULL),(2,3,'User3','user3@gmail.com','3454368','3 Phan Thanh','Giao hàng giờ hàng chính',NULL,NULL),(3,4,'User4','user4@gmail.com','3462874','5 Nguyễn Văn Linh','Giao hàng giờ hàng chính',NULL,NULL),(4,5,'User5','user5@gmail.com','4534875','7 Phan Châu Trinh','Giao hàng giờ hàng chính',NULL,NULL),(5,6,'User6','user6@gmail.com','457832','18 Quang Trung','Giao hàng giờ hàng chính',NULL,NULL),(6,7,'user7','user7@gmail.com','343478579','Hòa Bình','Giao hàng vào chiều thứ 5',NULL,NULL),(7,8,'user 8','user8@gmail.com','343782642','Thái Bình','Giao hàng vào chiều thứ 3',NULL,NULL),(8,9,'user 9','user9@gmail.com','29462384','Sơn La','Giao hàng vào chiều thứ 3',NULL,NULL),(9,10,'user 10','user19@gmail.com','32462387','Sơn Trà','Giao hàng vào chiều thứ 4',NULL,NULL);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `id_product` int NOT NULL,
  `name_product` varchar(45) NOT NULL,
  `id_category` int NOT NULL,
  `title` varchar(20) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `price` int DEFAULT NULL,
  `Inventory_number` int NOT NULL,
  PRIMARY KEY (`id_product`),
  KEY `FK_CATEGORY_idx` (`id_category`),
  CONSTRAINT `FK_CATEGORY` FOREIGN KEY (`id_category`) REFERENCES `category` (`id_category`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'Áo dài Việt Nam',2,'Áo','Áo hoodie nữ hình những con cún con dễ thương',NULL,NULL,200000,200),(2,'Quần tây',4,'Quần','Thêm chút ngọt ngào nữ tính khi diện những mẫu chân váy đuôi cá',NULL,NULL,100000,40),(3,'Áo sơ mi',1,'Áo','Áo nỉ Monster dày dặn, ấm áp trong mùa thời trang thu đông năm nay',NULL,NULL,50000,100),(4,'Áo blue',2,'Áo','Đẹp và phong cách',NULL,NULL,150000,70),(5,'Áo lạnh',2,'Áo','Áo họa tiết chiếc lá rỗng',NULL,NULL,300000,48),(6,'Quần đùi',3,'Quần','Phong cách thể thao với mẫu quần legging.',NULL,NULL,20000,84),(7,'Áo tay lỡ',1,'Áo','Duyên dáng trời thu với áo trễ vai gợi cảm',NULL,NULL,100000,125),(8,'Áo tay phồng',1,'Áo','Áo sơ mi xếp ly ở hàng cúc áo cổ thủy thủ thêu những ngôi sao',NULL,NULL,120000,35),(9,'Áo cổ đức',1,'Áo','Áo ren họa tiết hoa',NULL,NULL,50000,85),(10,'Quần jean',4,'Quần','Vừa năng động lại tôn dáng người mặc với mẫu quần skiny.',NULL,NULL,90000,215);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_discounts`
--

DROP TABLE IF EXISTS `product_discounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_discounts` (
  `id_proudct` int NOT NULL,
  `id_discount` int NOT NULL,
  PRIMARY KEY (`id_proudct`,`id_discount`),
  KEY `FK_DISCOUNT_idx` (`id_discount`),
  CONSTRAINT `FK_DISCOUNT` FOREIGN KEY (`id_discount`) REFERENCES `discount` (`id_discount`),
  CONSTRAINT `FK_PRODUCTD` FOREIGN KEY (`id_proudct`) REFERENCES `product` (`id_product`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_discounts`
--

LOCK TABLES `product_discounts` WRITE;
/*!40000 ALTER TABLE `product_discounts` DISABLE KEYS */;
INSERT INTO `product_discounts` VALUES (1,1),(5,1),(4,2),(3,3),(2,4);
/*!40000 ALTER TABLE `product_discounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `profit`
--

DROP TABLE IF EXISTS `profit`;
/*!50001 DROP VIEW IF EXISTS `profit`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `profit` AS SELECT 
 1 AS `id_order`,
 1 AS `id_product`,
 1 AS `profit`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `profit_without_vat`
--

DROP TABLE IF EXISTS `profit_without_vat`;
/*!50001 DROP VIEW IF EXISTS `profit_without_vat`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `profit_without_vat` AS SELECT 
 1 AS `id_order`,
 1 AS `id_product`,
 1 AS `total_money`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `id_role` int NOT NULL,
  `name_role` varchar(45) NOT NULL,
  PRIMARY KEY (`id_role`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'admin'),(2,'user');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id_user` int NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone_number` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `password` varchar(45) NOT NULL,
  `id_role` int NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id_user`),
  KEY `FK_ROLE_idx` (`id_role`),
  CONSTRAINT `FK_ROLE` FOREIGN KEY (`id_role`) REFERENCES `role` (`id_role`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','admin@gmail.com','123456789','Đà Nẵng','123',1,NULL,NULL),(2,'user','user@gmail.com','987654321','Quảng Nam','123',2,NULL,NULL),(3,'user2','user2@gmail.com','3423342','Quảng Nam','123',2,NULL,NULL),(4,'user3','user3@gmail.com','34234234','Quảng Nam','123',2,NULL,NULL),(5,'user4','user4@gmail.com','344554648','Quảng Nam','123',2,NULL,NULL),(6,'user5','user5@gmail.com','68547857','Đà Nẵng','123',2,NULL,NULL),(7,'user6','user6@gmail.com','54537234','Đà Nẵng','123',2,NULL,NULL),(8,'user7','user7@gmail.com','434532674','Nghệ An','123',2,NULL,NULL),(9,'user8','user8@gmail.com','543895374','An Giang','123',2,NULL,NULL),(10,'user9','user9@gmail.com','45y3874728','Đà Nẵng','123',2,NULL,NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `buyer_view`
--

/*!50001 DROP VIEW IF EXISTS `buyer_view`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `buyer_view` AS select `b`.`user_name` AS `user_name`,`b`.`name_order` AS `name_order`,`b`.`email` AS `email`,`b`.`phone_number` AS `phone_number`,`b`.`address` AS `address`,`b`.`name_product` AS `name_product`,`o`.`quantity` AS `quantity`,`b`.`note` AS `note`,`b`.`payment` AS `payment` from (`buyer_without_product_quantity` `b` join `order_details` `o` on((`b`.`id_order` = `o`.`id_order`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `buyer_without_product_quantity`
--

/*!50001 DROP VIEW IF EXISTS `buyer_without_product_quantity`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `buyer_without_product_quantity` AS select `u`.`user_name` AS `user_name`,`c`.`name_order` AS `name_order`,`c`.`email` AS `email`,`c`.`phone_number` AS `phone_number`,`c`.`address` AS `address`,`p`.`name_product` AS `name_product`,`c`.`id_order` AS `id_order`,`c`.`note` AS `note`,`c`.`payment` AS `payment` from ((`customer_list` `c` join `user` `u` on((`c`.`id_user` = `u`.`id_user`))) join `product` `p` on((`c`.`id_product` = `p`.`id_product`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `customer_list`
--

/*!50001 DROP VIEW IF EXISTS `customer_list`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `customer_list` AS select `o`.`id_user` AS `id_user`,`o`.`name_order` AS `name_order`,`o`.`email` AS `email`,`o`.`phone_number` AS `phone_number`,`o`.`address` AS `address`,`o`.`id_order` AS `id_order`,`p`.`id_product` AS `id_product`,`o`.`note` AS `note`,`p`.`profit` AS `payment` from (`orders` `o` join `profit` `p` on((`o`.`id_order` = `p`.`id_order`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `discount_view`
--

/*!50001 DROP VIEW IF EXISTS `discount_view`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `discount_view` AS select `discount`.`name_discount` AS `name_discount`,`discount`.`discount_rate` AS `discount_rate`,`product_discounts`.`id_proudct` AS `id_proudct` from (`discount` join `product_discounts` on((`discount`.`id_discount` = `product_discounts`.`id_discount`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `inventory_view`
--

/*!50001 DROP VIEW IF EXISTS `inventory_view`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `inventory_view` AS select `product`.`name_product` AS `Product name`,`product`.`price` AS `price`,`product`.`Inventory_number` AS `Inventory number`,(`product`.`price` * `product`.`Inventory_number`) AS `Total monney` from `product` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `money_without_vat`
--

/*!50001 DROP VIEW IF EXISTS `money_without_vat`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `money_without_vat` AS select `d`.`id_order` AS `id_order`,`p`.`id_product` AS `id_product`,`d`.`quantity` AS `quantity`,`p`.`price` AS `price`,(`d`.`quantity` * `p`.`price`) AS `total_money` from (`order_details` `d` join `product` `p` on((`d`.`id_product` = `p`.`id_product`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `profit`
--

/*!50001 DROP VIEW IF EXISTS `profit`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `profit` AS select `p`.`id_order` AS `id_order`,`d`.`id_proudct` AS `id_product`,round((`p`.`total_money` * (1 - `d`.`discount_rate`)),0) AS `profit` from (`profit_without_vat` `p` join `discount_view` `d` on((`p`.`id_product` = `d`.`id_proudct`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `profit_without_vat`
--

/*!50001 DROP VIEW IF EXISTS `profit_without_vat`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `profit_without_vat` AS select `money_without_vat`.`id_order` AS `id_order`,`money_without_vat`.`id_product` AS `id_product`,sum(`money_without_vat`.`total_money`) AS `total_money` from `money_without_vat` group by `money_without_vat`.`id_order` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-04 22:19:23
