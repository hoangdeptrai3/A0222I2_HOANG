-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: furamaresort
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
-- Table structure for table `bo_phan`
--

DROP TABLE IF EXISTS `bo_phan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bo_phan` (
  `ma_bo_phan` int NOT NULL AUTO_INCREMENT,
  `ten_bo_phan` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ma_bo_phan`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bo_phan`
--

LOCK TABLES `bo_phan` WRITE;
/*!40000 ALTER TABLE `bo_phan` DISABLE KEYS */;
INSERT INTO `bo_phan` VALUES (1,'Sale-Marketing'),(2,'Hành chính'),(3,'Phục vụ'),(4,'Quản lý');
/*!40000 ALTER TABLE `bo_phan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dich_vu`
--

DROP TABLE IF EXISTS `dich_vu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dich_vu` (
  `ma_dich_vu` int NOT NULL AUTO_INCREMENT,
  `ten_dich_vu` varchar(45) DEFAULT NULL,
  `dien_tich` int DEFAULT NULL,
  `chi_phi_thue` double DEFAULT NULL,
  `so_nguoi_toi_da` int DEFAULT NULL,
  `ma_kieu_thue` int NOT NULL,
  `ma_loai_dich_vu` int NOT NULL,
  `tieu_chuan_phong` varchar(45) DEFAULT NULL,
  `mo_ta_tien_nghi_khac` varchar(45) DEFAULT NULL,
  `dien_tich_ho_boi` double DEFAULT NULL,
  `so_tang` int DEFAULT NULL,
  PRIMARY KEY (`ma_dich_vu`),
  KEY `ma_kieu_thue` (`ma_kieu_thue`),
  KEY `ma_loai_dich_vu` (`ma_loai_dich_vu`),
  CONSTRAINT `dich_vu_ibfk_1` FOREIGN KEY (`ma_kieu_thue`) REFERENCES `kieu_thue` (`ma_kieu_thue`),
  CONSTRAINT `dich_vu_ibfk_2` FOREIGN KEY (`ma_loai_dich_vu`) REFERENCES `loai_dich_vu` (`ma_loai_dich_vu`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dich_vu`
--

LOCK TABLES `dich_vu` WRITE;
/*!40000 ALTER TABLE `dich_vu` DISABLE KEYS */;
INSERT INTO `dich_vu` VALUES (1,'Villa Beach Front',25000,10000000,10,3,1,'vip','Có hồ bơi',500,4),(2,'House Princess 01',14000,5000000,7,2,2,'vip','Có thêm bếp nướng',NULL,3),(3,'Room Twin 01',5000,1000000,2,4,3,'normal','Có tivi',NULL,NULL),(4,'Villa No Beach Front',22000,9000000,8,3,1,'normal','Có hồ bơi',300,3),(5,'House Princess 02',10000,4000000,5,3,2,'normal','Có thêm bếp nướng',NULL,2),(6,'Room Twin 02',3000,900000,2,4,3,'normal','Có tivi',NULL,NULL);
/*!40000 ALTER TABLE `dich_vu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dich_vu_di_kem`
--

DROP TABLE IF EXISTS `dich_vu_di_kem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dich_vu_di_kem` (
  `ma_dich_vu_di_kem` int NOT NULL AUTO_INCREMENT,
  `ten_dich_vu_di_kem` varchar(45) DEFAULT NULL,
  `gia` double DEFAULT NULL,
  `don_vi` varchar(10) DEFAULT NULL,
  `trang_thai` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ma_dich_vu_di_kem`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dich_vu_di_kem`
--

LOCK TABLES `dich_vu_di_kem` WRITE;
/*!40000 ALTER TABLE `dich_vu_di_kem` DISABLE KEYS */;
INSERT INTO `dich_vu_di_kem` VALUES (1,'Karaoke',10000,'giờ','tiện nghi, hiện tại'),(2,'Thuê xe máy',10000,'chiếc','hỏng 1 xe'),(3,'Thuê xe đạp',20000,'chiếc','tốt'),(4,'Buffet buổi sáng',15000,'suất','đầy đủ đồ ăn, tráng miệng'),(5,'Buffet buổi trưa',90000,'suất','đầy đủ đồ ăn, tráng miệng'),(6,'Buffet buổi tối',32000,'suất','đầy đủ đồ ăn, tráng miệng');
/*!40000 ALTER TABLE `dich_vu_di_kem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hop_dong`
--

DROP TABLE IF EXISTS `hop_dong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hop_dong` (
  `ma_hop_dong` int NOT NULL AUTO_INCREMENT,
  `ngay_lam_hop_dong` date DEFAULT NULL,
  `ngay_ket_thuc` date DEFAULT NULL,
  `tien_dat_coc` double DEFAULT NULL,
  `ma_nhan_vien` int NOT NULL,
  `ma_khach_hang` int NOT NULL,
  `ma_dich_vu` int NOT NULL,
  PRIMARY KEY (`ma_hop_dong`),
  KEY `ma_nhan_vien` (`ma_nhan_vien`),
  KEY `ma_khach_hang` (`ma_khach_hang`),
  KEY `ma_dich_vu` (`ma_dich_vu`),
  CONSTRAINT `hop_dong_ibfk_1` FOREIGN KEY (`ma_nhan_vien`) REFERENCES `nhan_vien` (`ma_nhan_vien`),
  CONSTRAINT `hop_dong_ibfk_2` FOREIGN KEY (`ma_khach_hang`) REFERENCES `khach_hang` (`ma_khach_hang`),
  CONSTRAINT `hop_dong_ibfk_3` FOREIGN KEY (`ma_dich_vu`) REFERENCES `dich_vu` (`ma_dich_vu`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hop_dong`
--

LOCK TABLES `hop_dong` WRITE;
/*!40000 ALTER TABLE `hop_dong` DISABLE KEYS */;
INSERT INTO `hop_dong` VALUES (1,'2020-12-08','2020-12-08',0,3,1,3),(2,'2020-07-14','2020-07-21',200000,7,3,1),(3,'2021-03-15','2021-03-17',50000,3,4,2),(4,'2021-01-14','2021-01-18',100000,7,5,5),(5,'2021-07-14','2021-07-15',0,7,2,6),(6,'2021-06-01','2021-06-03',0,7,7,6),(7,'2021-09-02','2021-09-05',100000,7,4,4),(8,'2021-06-17','2021-06-18',150000,3,4,1),(9,'2020-11-19','2020-11-19',0,3,4,3),(10,'2021-04-12','2021-04-14',0,10,3,5),(11,'2021-04-25','2021-04-25',0,2,2,1),(12,'2021-05-25','2021-05-27',0,7,10,1);
/*!40000 ALTER TABLE `hop_dong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hop_dong_chi_tiet`
--

DROP TABLE IF EXISTS `hop_dong_chi_tiet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hop_dong_chi_tiet` (
  `ma_hop_dong_chi_tiet` int NOT NULL AUTO_INCREMENT,
  `ma_hop_dong` int NOT NULL,
  `ma_dich_vu_di_kem` int DEFAULT NULL,
  `so_luong` int DEFAULT NULL,
  PRIMARY KEY (`ma_hop_dong_chi_tiet`),
  KEY `ma_hop_dong` (`ma_hop_dong`),
  KEY `ma_dich_vu_di_kem` (`ma_dich_vu_di_kem`),
  CONSTRAINT `hop_dong_chi_tiet_ibfk_1` FOREIGN KEY (`ma_hop_dong`) REFERENCES `hop_dong` (`ma_hop_dong`),
  CONSTRAINT `hop_dong_chi_tiet_ibfk_2` FOREIGN KEY (`ma_dich_vu_di_kem`) REFERENCES `dich_vu_di_kem` (`ma_dich_vu_di_kem`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hop_dong_chi_tiet`
--

LOCK TABLES `hop_dong_chi_tiet` WRITE;
/*!40000 ALTER TABLE `hop_dong_chi_tiet` DISABLE KEYS */;
INSERT INTO `hop_dong_chi_tiet` VALUES (1,2,4,5),(2,2,5,8),(3,2,6,15),(4,3,1,1),(5,3,2,11),(6,1,3,1),(7,1,2,2),(8,12,2,2);
/*!40000 ALTER TABLE `hop_dong_chi_tiet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khach_hang`
--

DROP TABLE IF EXISTS `khach_hang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khach_hang` (
  `ma_khach_hang` int NOT NULL AUTO_INCREMENT,
  `ma_loai_khach` int NOT NULL,
  `ho_va_ten` varchar(45) DEFAULT NULL,
  `ngay_sinh` date DEFAULT NULL,
  `gioi_tinh` bit(1) DEFAULT NULL,
  `so_cmnd` varchar(45) DEFAULT NULL,
  `so_dien_thoai` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `dia_chi` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ma_khach_hang`),
  KEY `ma_loai_khach` (`ma_loai_khach`),
  CONSTRAINT `khach_hang_ibfk_1` FOREIGN KEY (`ma_loai_khach`) REFERENCES `loai_khach` (`ma_loai_khach`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khach_hang`
--

LOCK TABLES `khach_hang` WRITE;
/*!40000 ALTER TABLE `khach_hang` DISABLE KEYS */;
INSERT INTO `khach_hang` VALUES (1,5,'Nguyễn Thị Hào','1970-11-07',_binary '\0','643431213','0945423362','thihao07@gmail.com','23 Nguyễn Hoàng, Đà Nẵng'),(2,3,'Phạm Xuân Diệu','1992-08-08',_binary '','865342123','0954333333','xuandieu92@gmail.com','K77/22 Thái Phiên, Quảng Trị'),(3,1,'Trương Đình Nghệ','1990-02-27',_binary '','488645199','0373213122','nghenhan2702@gmail.com','K323/12 Ông Ích Khiêm, Vinh'),(4,1,'Dương Văn Quan','1981-07-08',_binary '','543432111','0490039241','duongquan@gmail.com','K453/12 Lê Lợi, Đà Nẵng'),(5,4,'Hoàng Trần Nhi Nhi','1995-12-09',_binary '\0','795453345','0312345678','nhinhi123@gmail.com','224 Lý Thái Tổ, Gia Lai'),(6,4,'Tôn Nữ Mộc Châu','2005-12-06',_binary '\0','732434215','0988888844','tonnuchau@gmail.com','37 Yên Thế, Đà Nẵng'),(7,1,'Nguyễn Mỹ Kim','1984-04-08',_binary '\0','856453123','0912345698','kimcuong84@gmail.com','K123/45 Lê Lợi, Hồ Chí Minh'),(8,3,'Nguyễn Thị Hào','1999-04-08',_binary '\0','965656433','0763212345','haohao99@gmail.com','55 Nguyễn Văn Linh, Kon Tum'),(9,1,'Trần Đại Du','1994-07-01',_binary '','432341235','0643343433','danhhai99@gmail.com','24 Lý Thường Kiệt, Quảng Ngãi'),(10,1,'Nguyễn Tâm Đắc','1989-07-01',_binary '','344343432','0987654321','dactam@gmail.com','22 Ngô Quyền, Đà Nẵng'),(11,1,'Bành Tuấn Khuôi','2001-04-09',_binary '','090123','12345654','dolekhanh@gmail.com','Trong tim Hân');
/*!40000 ALTER TABLE `khach_hang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kieu_thue`
--

DROP TABLE IF EXISTS `kieu_thue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kieu_thue` (
  `ma_kieu_thue` int NOT NULL AUTO_INCREMENT,
  `ten_kieu_thue` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ma_kieu_thue`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kieu_thue`
--

LOCK TABLES `kieu_thue` WRITE;
/*!40000 ALTER TABLE `kieu_thue` DISABLE KEYS */;
INSERT INTO `kieu_thue` VALUES (1,'year'),(2,'month'),(3,'day'),(4,'hour');
/*!40000 ALTER TABLE `kieu_thue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loai_dich_vu`
--

DROP TABLE IF EXISTS `loai_dich_vu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loai_dich_vu` (
  `ma_loai_dich_vu` int NOT NULL AUTO_INCREMENT,
  `ten_loai_dich_vu` varchar(45) DEFAULT NULL,
  `ten_loai_divh_vu` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ma_loai_dich_vu`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loai_dich_vu`
--

LOCK TABLES `loai_dich_vu` WRITE;
/*!40000 ALTER TABLE `loai_dich_vu` DISABLE KEYS */;
INSERT INTO `loai_dich_vu` VALUES (1,'Villa',NULL),(2,'House',NULL),(3,'Room',NULL);
/*!40000 ALTER TABLE `loai_dich_vu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loai_khach`
--

DROP TABLE IF EXISTS `loai_khach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loai_khach` (
  `ma_loai_khach` int NOT NULL AUTO_INCREMENT,
  `ten_loai_khach` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ma_loai_khach`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loai_khach`
--

LOCK TABLES `loai_khach` WRITE;
/*!40000 ALTER TABLE `loai_khach` DISABLE KEYS */;
INSERT INTO `loai_khach` VALUES (1,'Diamond'),(2,'Platinium'),(3,'Gold'),(4,'Silver'),(5,'Member');
/*!40000 ALTER TABLE `loai_khach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhan_vien`
--

DROP TABLE IF EXISTS `nhan_vien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhan_vien` (
  `ma_nhan_vien` int NOT NULL AUTO_INCREMENT,
  `ho_va_ten` varchar(45) DEFAULT NULL,
  `ngay_sinh` date DEFAULT NULL,
  `so_cmnd` varchar(45) DEFAULT NULL,
  `luong` double DEFAULT NULL,
  `so_dien_thoai` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `dia_chi` varchar(45) DEFAULT NULL,
  `ma_vi_tri` int NOT NULL,
  `ma_trinh_do` int NOT NULL,
  `ma_bo_phan` int NOT NULL,
  PRIMARY KEY (`ma_nhan_vien`),
  KEY `nhan_vien_ibfk_1` (`ma_vi_tri`),
  KEY `nhan_vien_ibfk_2` (`ma_bo_phan`),
  KEY `nhan_vien_ibfk_3` (`ma_trinh_do`),
  CONSTRAINT `nhan_vien_ibfk_1` FOREIGN KEY (`ma_vi_tri`) REFERENCES `vi_tri` (`ma_vi_tri`),
  CONSTRAINT `nhan_vien_ibfk_2` FOREIGN KEY (`ma_bo_phan`) REFERENCES `bo_phan` (`ma_bo_phan`),
  CONSTRAINT `nhan_vien_ibfk_3` FOREIGN KEY (`ma_trinh_do`) REFERENCES `trinh_do` (`ma_trinh_do`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhan_vien`
--

LOCK TABLES `nhan_vien` WRITE;
/*!40000 ALTER TABLE `nhan_vien` DISABLE KEYS */;
INSERT INTO `nhan_vien` VALUES (2,'Lê Văn Bình','1997-04-09','654231234',7000000,'0934212314','binhlv@gmail.com','22 Yên Bái, Đà Nẵng',1,2,2),(3,'Hồ Thị Yến','1995-12-12','999231723',2343212,'0412352315','thiyen@gmail.com','K234/11 Điện Biên Phủ, Gia Lai',1,3,2),(7,'Nguyễn Hữu Hà','1993-01-01','534323231',8000000,'0941234553','nhh0101@gmail.com','4 Nguyễn Chí Thanh, Huế',2,3,2),(10,'Nguyễn Công Đạo','1994-01-08','755434343',8000000,'0988767111','nguyencongdao12@gmail.com','6 Hoà Khánh, Đồng Nai',2,3,2),(13,'Luận Lê','2022-09-28','123456',234,'0988282506','leluando2001@gmail.com','FPT',1,1,1),(14,'Khanh Buồi Tuấn','2022-10-12','098789',1,'0988282506','khanhboblu@gmail.com','FPT',1,1,1);
/*!40000 ALTER TABLE `nhan_vien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `APP_ROLE_UK` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trinh_do`
--

DROP TABLE IF EXISTS `trinh_do`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trinh_do` (
  `ma_trinh_do` int NOT NULL AUTO_INCREMENT,
  `ten_trinh_do` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ma_trinh_do`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trinh_do`
--

LOCK TABLES `trinh_do` WRITE;
/*!40000 ALTER TABLE `trinh_do` DISABLE KEYS */;
INSERT INTO `trinh_do` VALUES (1,'Trung Cấp'),(2,'Cao Đẳng'),(3,'Đại Học'),(4,'Sau Đại Học');
/*!40000 ALTER TABLE `trinh_do` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `enabled` bit(1) NOT NULL,
  `name` varchar(36) NOT NULL,
  `password` varchar(128) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `APP_USER_UK` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `role_id` int NOT NULL,
  `user_id` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `USER_ROLE_UK` (`user_id`,`role_id`),
  KEY `FKa68196081fvovjhkek5m97n3y` (`role_id`),
  CONSTRAINT `FK859n2jvi8ivhui0rl0esws6o` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `FKa68196081fvovjhkek5m97n3y` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vi_tri`
--

DROP TABLE IF EXISTS `vi_tri`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vi_tri` (
  `ma_vi_tri` int NOT NULL AUTO_INCREMENT,
  `ten_vi_tri` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ma_vi_tri`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vi_tri`
--

LOCK TABLES `vi_tri` WRITE;
/*!40000 ALTER TABLE `vi_tri` DISABLE KEYS */;
INSERT INTO `vi_tri` VALUES (1,'Quản Lý'),(2,'Nhân Viên');
/*!40000 ALTER TABLE `vi_tri` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-16 20:39:20
