/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 80016
Source Host           : 127.0.0.1:3306
Source Database       : mydb

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2020-03-31 11:05:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for s_order
-- ----------------------------
DROP TABLE IF EXISTS `s_order`;
CREATE TABLE `s_order` (
  `order_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_name` varchar(255) DEFAULT NULL,
  `order_desc` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of s_order
-- ----------------------------
INSERT INTO `s_order` VALUES ('1', '1', '1', '1', '2020-03-31 11:05:01', '2020-03-31 11:05:01');
