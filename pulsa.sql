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
  `kode` varchar(10) NOT NULL,
  `ket` varchar(25) NOT NULL,
  `harga` decimal(10,0) NOT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `daftar_harga` */

insert  into `daftar_harga`(`kode`,`ket`,`harga`) values ('A100','AS 100.000','98900'),('A25','AS 25.000','25600'),('A50','AS 50.000','49950'),('AX1','AXIS 1.000','1400'),('AX2','AXIS 2.000','2400'),('AX5','AXIS 5.000','5500'),('I10','IM3 10.000','10675'),('I2','IM3 2.000','2500'),('I25','IM3 25.000','25400'),('I5','IM3 5.000','5675'),('I50','IM3 50.000','49700'),('M10','MENTARI 10.000','10675'),('M5','MENTARI 5.000','5675'),('M50','MENTARI 50.000','49700'),('S10','SIMPATI 10.000	','10925'),('S100','SIMPATI 100.000','98900'),('S20','SIMPATI 20.000','20700'),('S5','SIMPATI 5.000','5925'),('S50','SIMPATI 50.000','49950');

/*Table structure for table `deposit` */

DROP TABLE IF EXISTS `deposit`;

CREATE TABLE `deposit` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `tgl_dep` varchar(20) NOT NULL,
  `nominal` int(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `deposit` */

insert  into `deposit`(`id`,`tgl_dep`,`nominal`) values (1,'12-12-2016',600000);

/*Table structure for table `transaksi` */

DROP TABLE IF EXISTS `transaksi`;

CREATE TABLE `transaksi` (
  `id_trx` int(10) NOT NULL AUTO_INCREMENT,
  `no_hp` varchar(20) NOT NULL,
  `kode` varchar(10) NOT NULL,
  `tgl_trx` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_trx`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `transaksi` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
