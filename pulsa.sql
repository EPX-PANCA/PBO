/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.6.26 : Database - pulsa
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`pulsa` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `pulsa`;

/*Table structure for table `daftar_harga` */

DROP TABLE IF EXISTS `daftar_harga`;

CREATE TABLE `daftar_harga` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `kode` varchar(10) NOT NULL,
  `ket` varchar(25) NOT NULL,
  `harga` decimal(10,0) NOT NULL,
  PRIMARY KEY (`id`,`kode`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;

/*Data for the table `daftar_harga` */

insert  into `daftar_harga`(`id`,`kode`,`ket`,`harga`) values (1,'A5','AS 5.000','5925'),(2,'A10','AS 10.000','10925'),(3,'A20','AS 20.000','20700'),(4,'A25','AS 25.000','25600'),(5,'A50','AS 50.000','49950'),(6,'A100','AS 100.000','98900'),(7,'AX1','AXIS 1.000','1400'),(8,'AX2','AXIS 2.000','2400'),(10,'AX3','AXIS 3.000','3400'),(11,'AX5','AXIS 5.000','5500'),(12,'I2','IM3 2.000','2500'),(13,'I5','IM3 5.000','5675'),(14,'I10','IM3 10.000','10675'),(15,'I25','IM3 25.000','25400'),(16,'I50','IM3 50.000','49700'),(17,'M5','MENTARI 5.000','5675'),(18,'M10','MENTARI 10.000','10675'),(19,'M50','MENTARI 50.000','49700'),(20,'S5','SIMPATI 5.000','5925'),(21,'S10','SIMPATI 10.000 ','10925'),(22,'S20','SIMPATI 20.000','20700'),(23,'S50','SIMPATI 50.000','49950'),(24,'S100','SIMPATI 100.000','98900');

/*Table structure for table `deposit` */

DROP TABLE IF EXISTS `deposit`;

CREATE TABLE `deposit` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `tgl_dep` varchar(20) NOT NULL,
  `nominal` int(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `deposit` */

insert  into `deposit`(`id`,`tgl_dep`,`nominal`) values (1,'12-12-2016',370575);

/*Table structure for table `transaksi` */

DROP TABLE IF EXISTS `transaksi`;

CREATE TABLE `transaksi` (
  `id_trx` int(10) NOT NULL AUTO_INCREMENT,
  `no_hp` varchar(20) NOT NULL,
  `kode` varchar(10) NOT NULL,
  `tgl_trx` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_trx`,`kode`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

/*Data for the table `transaksi` */

insert  into `transaksi`(`id_trx`,`no_hp`,`kode`,`tgl_trx`) values (12,'2222','A100','20-12-2016'),(13,'6363535353','A20','20-12-2016'),(14,'0876645','A10','20-12-2016');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
