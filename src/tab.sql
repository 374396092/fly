/*
Navicat MySQL Data Transfer

Source Server         : fuqiang
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : tab

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2019-11-26 19:32:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tab_answer`
-- ----------------------------
DROP TABLE IF EXISTS `tab_answer`;
CREATE TABLE `tab_answer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `answer_content` varchar(255) DEFAULT NULL,
  `answer_time` datetime DEFAULT NULL,
  `answer_user_id` int(11) DEFAULT NULL,
  `post_id` int(11) DEFAULT NULL,
  `is_accept` int(11) DEFAULT NULL,
  `is_agree` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_answer_user_id` (`answer_user_id`),
  KEY `fk_answer_post_id` (`post_id`),
  CONSTRAINT `tab_answer_ibfk_1` FOREIGN KEY (`post_id`) REFERENCES `tab_post` (`id`),
  CONSTRAINT `tab_answer_ibfk_2` FOREIGN KEY (`answer_user_id`) REFERENCES `tab_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tab_answer
-- ----------------------------
INSERT INTO `tab_answer` VALUES ('1', '中国山东找蓝翔', '2019-10-17 09:17:49', '3', '1', null, null);
INSERT INTO `tab_answer` VALUES ('6', '楼上是托吧', '2019-11-01 09:18:31', '3', '1', null, null);
INSERT INTO `tab_answer` VALUES ('7', '我不知道该说啥了', '2019-10-17 09:24:42', '3', '5', null, null);
INSERT INTO `tab_answer` VALUES ('8', '就得这么晚', '2019-10-13 11:28:44', '5', '2', null, null);

-- ----------------------------
-- Table structure for `tab_area`
-- ----------------------------
DROP TABLE IF EXISTS `tab_area`;
CREATE TABLE `tab_area` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `area` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tab_area
-- ----------------------------
INSERT INTO `tab_area` VALUES ('1', '四平');
INSERT INTO `tab_area` VALUES ('2', '铁岭');
INSERT INTO `tab_area` VALUES ('3', '抚顺');
INSERT INTO `tab_area` VALUES ('4', '天津');
INSERT INTO `tab_area` VALUES ('5', '澳门');

-- ----------------------------
-- Table structure for `tab_coll_post`
-- ----------------------------
DROP TABLE IF EXISTS `tab_coll_post`;
CREATE TABLE `tab_coll_post` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `post_id` int(11) DEFAULT NULL,
  `coll_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_coll_user_id` (`user_id`),
  KEY `fk_coll_post_id` (`post_id`),
  CONSTRAINT `tab_coll_post_ibfk_1` FOREIGN KEY (`post_id`) REFERENCES `tab_post` (`id`),
  CONSTRAINT `tab_coll_post_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `tab_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tab_coll_post
-- ----------------------------
INSERT INTO `tab_coll_post` VALUES ('1', '2', '1', '2019-10-30 15:46:07');

-- ----------------------------
-- Table structure for `tab_fly_kiss`
-- ----------------------------
DROP TABLE IF EXISTS `tab_fly_kiss`;
CREATE TABLE `tab_fly_kiss` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kiss_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tab_fly_kiss
-- ----------------------------
INSERT INTO `tab_fly_kiss` VALUES ('1', '20');
INSERT INTO `tab_fly_kiss` VALUES ('2', '30');
INSERT INTO `tab_fly_kiss` VALUES ('3', '50');
INSERT INTO `tab_fly_kiss` VALUES ('4', '60');
INSERT INTO `tab_fly_kiss` VALUES ('5', '80');
INSERT INTO `tab_fly_kiss` VALUES ('6', '200');

-- ----------------------------
-- Table structure for `tab_post`
-- ----------------------------
DROP TABLE IF EXISTS `tab_post`;
CREATE TABLE `tab_post` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `content` longtext,
  `user_id` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `view_count` int(11) DEFAULT NULL,
  `special_column_id` int(11) DEFAULT NULL,
  `fly_kiss_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_post_user_id` (`user_id`),
  KEY `fk_post_special_column_id` (`special_column_id`),
  KEY `fk_post_fly_kiss_id` (`fly_kiss_id`),
  CONSTRAINT `tab_post_ibfk_1` FOREIGN KEY (`fly_kiss_id`) REFERENCES `tab_fly_kiss` (`id`),
  CONSTRAINT `tab_post_ibfk_2` FOREIGN KEY (`special_column_id`) REFERENCES `tab_special_column` (`id`),
  CONSTRAINT `tab_post_ibfk_3` FOREIGN KEY (`user_id`) REFERENCES `tab_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tab_post
-- ----------------------------
INSERT INTO `tab_post` VALUES ('1', '问', '挖掘机技术哪家强', '2', '2019-10-02 14:22:34', '0', null, null);
INSERT INTO `tab_post` VALUES ('2', '如何', '如何评价蓝翔的广告蓝翔挖掘机技术', '2', '2019-10-02 14:22:34', '0', null, null);
INSERT INTO `tab_post` VALUES ('3', ' 你奶腿', 'asdasdasdasdsdasd', '1', '2019-10-17 00:00:00', '0', '5', '1');
INSERT INTO `tab_post` VALUES ('4', 'sadasd', '阿斯顿撒打扫打扫打扫打扫打扫的', '1', '2019-10-17 16:35:59', '0', '4', '1');
INSERT INTO `tab_post` VALUES ('5', '应该么', '我真的呵呵了', '5', '2019-12-13 09:21:49', null, '3', '4');

-- ----------------------------
-- Table structure for `tab_sex`
-- ----------------------------
DROP TABLE IF EXISTS `tab_sex`;
CREATE TABLE `tab_sex` (
  `id` int(11) NOT NULL DEFAULT '0',
  `sex` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tab_sex
-- ----------------------------
INSERT INTO `tab_sex` VALUES ('0', '男');
INSERT INTO `tab_sex` VALUES ('1', '女');

-- ----------------------------
-- Table structure for `tab_special_column`
-- ----------------------------
DROP TABLE IF EXISTS `tab_special_column`;
CREATE TABLE `tab_special_column` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `special_column` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tab_special_column
-- ----------------------------
INSERT INTO `tab_special_column` VALUES ('1', '提问');
INSERT INTO `tab_special_column` VALUES ('2', '分享');
INSERT INTO `tab_special_column` VALUES ('3', '讨论');
INSERT INTO `tab_special_column` VALUES ('4', '建议');
INSERT INTO `tab_special_column` VALUES ('5', '公告');
INSERT INTO `tab_special_column` VALUES ('6', '动态');
INSERT INTO `tab_special_column` VALUES ('7', '呵呵');

-- ----------------------------
-- Table structure for `tab_user`
-- ----------------------------
DROP TABLE IF EXISTS `tab_user`;
CREATE TABLE `tab_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `email` varchar(20) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `nickname` varchar(10) DEFAULT NULL,
  `sex_id` int(2) DEFAULT NULL,
  `grade_id` int(10) DEFAULT NULL,
  `area_id` int(20) DEFAULT NULL,
  `sizn` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_user_area_id` (`area_id`),
  KEY `fk_user_grade_id` (`grade_id`),
  KEY `fk_user_sex_id` (`sex_id`),
  CONSTRAINT `tab_user_ibfk_1` FOREIGN KEY (`area_id`) REFERENCES `tab_area` (`id`),
  CONSTRAINT `tab_user_ibfk_2` FOREIGN KEY (`grade_id`) REFERENCES `tab_user_grade` (`id`),
  CONSTRAINT `tab_user_ibfk_3` FOREIGN KEY (`sex_id`) REFERENCES `tab_sex` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tab_user
-- ----------------------------
INSERT INTO `tab_user` VALUES ('1', 'root', '123', 'root', '0', '5', '1', 'asdasd');
INSERT INTO `tab_user` VALUES ('2', 'saasd.@qq.com', '1', null, '0', '0', '3', null);
INSERT INTO `tab_user` VALUES ('3', '6', '6', '社会王', '1', '3', '2', null);
INSERT INTO `tab_user` VALUES ('5', 'qqq.@qq.com', 'aa', 'asd', '1', '1', '1', null);

-- ----------------------------
-- Table structure for `tab_user_grade`
-- ----------------------------
DROP TABLE IF EXISTS `tab_user_grade`;
CREATE TABLE `tab_user_grade` (
  `id` int(11) NOT NULL,
  `grade` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tab_user_grade
-- ----------------------------
INSERT INTO `tab_user_grade` VALUES ('0', '普通用户');
INSERT INTO `tab_user_grade` VALUES ('1', 'vip1');
INSERT INTO `tab_user_grade` VALUES ('2', 'vip2');
INSERT INTO `tab_user_grade` VALUES ('3', 'vip3');
INSERT INTO `tab_user_grade` VALUES ('4', 'vip4');
INSERT INTO `tab_user_grade` VALUES ('5', 'vip5');
