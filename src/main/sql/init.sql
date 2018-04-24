CREATE TABLE `merchant` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `abbname` varchar(25) NOT NULL DEFAULT '' COMMENT 'abbname',
  `fullname` varchar(255) NOT NULL DEFAULT '' COMMENT 'fullname',
  `address` varchar(255) DEFAULT NULL COMMENT 'address',
  `createdate` date NOT NULL DEFAULT '0000-00-00' COMMENT 'createdate',
  `employees` tinyint(3) DEFAULT NULL COMMENT 'employees',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='merchant';
