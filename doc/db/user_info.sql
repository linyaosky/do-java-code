/*
Navicat MySQL Data Transfer

Source Server         : mySql
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2016-05-12 18:50:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `USER_ID` char(32) NOT NULL,
  `EMAIL` varchar(200) DEFAULT NULL,
  `PRE_PWD` char(32) DEFAULT NULL,
  `NOW_PWD` char(32) NOT NULL,
  `NICK_NAME` varchar(60) DEFAULT NULL,
  `REAL_NAME` varchar(60) DEFAULT NULL,
  `SEX` char(4) DEFAULT NULL,
  `BIRTH_DAY` date DEFAULT NULL,
  `COUNTRY` varchar(100) DEFAULT NULL,
  `PROVINCE` varchar(100) DEFAULT NULL,
  `CITY` varchar(100) DEFAULT NULL,
  `ADDR` varchar(200) DEFAULT NULL,
  `MOBILE_NO` varchar(18) DEFAULT NULL,
  `ICON_URL` varchar(255) DEFAULT NULL,
  `ICON_FLG` char(4) DEFAULT NULL,
  `ICON_WIDTH` int(3) DEFAULT NULL,
  `ICON_HEIGHT` int(3) DEFAULT NULL,
  `LOGIN_NUM` int(6) DEFAULT NULL,
  `LAST_LOGIN_TIME` datetime DEFAULT NULL,
  `LAST_LOGIN_IP_ADDR` varchar(50) DEFAULT NULL,
  `IDENT` varchar(200) DEFAULT NULL,
  `IDENT_PERIOD` datetime DEFAULT NULL,
  `STATUS` char(4) DEFAULT NULL,
  `ADD_DATE` datetime NOT NULL,
  `ADD_USER_ID` varchar(32) NOT NULL,
  `ADD_IP_ADDR` varchar(50) NOT NULL,
  `UPD_DATE` datetime NOT NULL,
  `UPD_USER_ID` varchar(32) NOT NULL,
  `UPD_IP_ADDR` varchar(50) NOT NULL,
  `TOKEN` varchar(255) DEFAULT NULL,
  `OPEN_ID` varchar(255) DEFAULT NULL,
  `DEL_FLG` char(1) NOT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
