# fsc
fsc order system
1. git clone it to local and use intellij to import

2.  build project run command: gradle build 

3. run application by run command: java -jar bulid/lib/fsc-0.1.0.jar

4. enable debug on port 5005: java -jar -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005 build/libs/fsc-0.1.0.jar

CREATE TABLE `users` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `COMPANY_ID` varchar(45) COLLATE utf8_bin NOT NULL,
  `USERNAME` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `PASSWORD` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `FIRST_NAME` varchar(45) COLLATE utf8_bin NOT NULL,
  `LAST_NAME` varchar(45) COLLATE utf8_bin NOT NULL,
  `EMAIL` varchar(45) COLLATE utf8_bin NOT NULL,
  `STATE` varchar(45) COLLATE utf8_bin NOT NULL,
  `CREATED_BY` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `CREATED_TIME` datetime DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin


CREATE TABLE `role` (
  `ROLE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ROLE_TYPE` varchar(20) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin


CREATE TABLE `users_role_rel` (
  `USER_ID` int(11) NOT NULL,
  `ROLE_ID` int(11) NOT NULL,
  PRIMARY KEY (`USER_ID`,`ROLE_ID`),
  KEY `roleIdFer` (`ROLE_ID`),
  CONSTRAINT `roleIdFer` FOREIGN KEY (`ROLE_ID`) REFERENCES `role` (`ROLE_ID`),
  CONSTRAINT `userIdFer` FOREIGN KEY (`USER_ID`) REFERENCES `users` (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin 

INSERT INTO `users` VALUES ('1', 'fasite', jack', '$2a$04$LyGCv0uB.byagt0lysM3nuN3b71qLBc6Vqb0o4QjxOI01clxgz/h.', 'jack', 'nie', 'jack@qq.com', 'Active', 'admin', now());
INSERT INTO `users` VALUES ('2', 'fasite', 'admin', '$2a$10$1Gw7sGrVnLePL7gK5hG1zezoP10xDmbmLNjJGwM.ryo9cz607PTli', 'admin', 'nie', 'admin@qq.com', 'Active', 'admin', now());
INSERT INTO `users` VALUES ('3', 'fasite', 'dba', '$2a$10$vgQL4L7P5nR3QpoSGo49pe.r.5QjYjn5o4zmSdJyZAZy836VzvH66', 'dba', 'nie', 'dba@qq.com', 'Active', 'admin', now());


INSERT INTO `role` VALUES ('1', 'USER');
INSERT INTO `role` VALUES ('2', 'DBA');
INSERT INTO `role` VALUES ('3', 'ADMIN');

INSERT INTO `users_role_rel` VALUES ('1', '1');
INSERT INTO `users_role_rel` VALUES ('3', '2');
INSERT INTO `users_role_rel` VALUES ('2', '3');
INSERT INTO `users_role_rel` VALUES ('3', '3');



//add check 

//addd ss 

//wanglei Test
