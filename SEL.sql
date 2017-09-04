-- -------------------------
-- Table structure of 'user'
-- -------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
	`id` INT(11) UNSIGNED AUTO_INCREMENT,
	`username` varchar(20) NOT NULL,
	`password` varchar(20) NOT NULL,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ------------------------
-- Records of user
-- ------------------------
INSERT INTO `user` (`username`, `password`) VALUES ('admin', 'admin');
INSERT INTO `user` (`username`, `password`) VALUES ('kin', '123456');
