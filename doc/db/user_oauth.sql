/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : skyline

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2016-05-26 23:03:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_oauth
-- ----------------------------
DROP TABLE IF EXISTS `user_oauth`;
CREATE TABLE `user_oauth` (
  `user_id` char(32) NOT NULL,
  `oauth_name` varchar(30) DEFAULT NULL,
  `oauth_id` varchar(50) DEFAULT NULL,
  `oauth_access_token` varchar(100) DEFAULT NULL,
  `oauth_expires` bigint(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
