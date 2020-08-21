/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : mldn

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 05/08/2019 17:58:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `deptno` int(11) NOT NULL AUTO_INCREMENT,
  `dname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `loc` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`deptno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, '开发部', 'db8001');
INSERT INTO `dept` VALUES (2, '财务部', 'db8001');
INSERT INTO `dept` VALUES (3, '市场部', 'db8001');
INSERT INTO `dept` VALUES (4, '后勤部', 'db8001');
INSERT INTO `dept` VALUES (5, '销售部', 'db8001');
INSERT INTO `dept` VALUES (6, '公关部', 'db8001');
INSERT INTO `dept` VALUES (9, '测试部', 'db8001');
INSERT INTO `dept` VALUES (10, '测试部', 'db8001');

SET FOREIGN_KEY_CHECKS = 1;
