/**
 * 数据库 
 */
CREATE DATABASE `hospital` DEFAULT CHARACTER SET utf8 ;
use `hospital`;

/**
* 用户信息表
*/
CREATE TABLE `user` (
  `aid` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `idcard` varchar(45) DEFAULT NULL,
  `cellphone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

