CREATE TABLE `sales` (
  `idsales` int NOT NULL AUTO_INCREMENT,
  `email` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `name` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `lastName` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `cardNumber` varchar(16) COLLATE utf8_spanish_ci DEFAULT NULL,
  `expirationDateYear` int DEFAULT NULL,
  `expirationDateMonth` int DEFAULT NULL,
  `gasType` int DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `gasStation` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `sellerName` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`idsales`),
  KEY `FK_GasType` (`gasType`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;


CREATE TABLE `gasstationdesc` (
  `id` int NOT NULL AUTO_INCREMENT,
  `_id` varchar(45) DEFAULT NULL,
  `calle` varchar(100) DEFAULT NULL,
  `rfc` varchar(12) DEFAULT NULL,
  `date_insert` varchar(45) DEFAULT NULL,
  `regular` double DEFAULT NULL,
  `colonia` varchar(45) DEFAULT NULL,
  `numeropermiso` varchar(45) DEFAULT NULL,
  `fechaaplicacion` varchar(45) DEFAULT NULL,
  `longitude` varchar(45) DEFAULT NULL,
  `latitude` varchar(45) DEFAULT NULL,
  `premium` double DEFAULT NULL,
  `razonsocial` varchar(45) DEFAULT NULL,
  `codigopostal` varchar(8) DEFAULT NULL,
  `dieasel` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

