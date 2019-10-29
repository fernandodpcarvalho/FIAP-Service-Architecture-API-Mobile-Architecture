CREATE TABLE `cliente` (
`cliente_id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `endereco` varchar(255) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  PRIMARY KEY (`cliente_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE lista_desejo (
 `listadesejo_id` int(11) NOT NULL AUTO_INCREMENT,
  `cliente` int not NULL,
  `produto` int not NULL,
   PRIMARY KEY (`listadesejo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE chamado (
 `chamado_id` int(11) NOT NULL AUTO_INCREMENT,
  `cliente` int not NULL,
  `descricao` varchar(2000) not NULL,
  `status` varchar(100) not NULL,
   PRIMARY KEY (`chamado_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO cliente (`nome`,`email`,`endereco`,`telefone`) VALUES ('Alexandre','alexandre.tadeu@gmail.com','Rua teste 101','11 25067388');
INSERT INTO cliente (`nome`,`email`,`endereco`,`telefone`) VALUES ('Fernando','fernando@gmail.com','Rua opa 101','11 25067388');
INSERT INTO cliente (`nome`,`email`,`endereco`,`telefone`) VALUES ('Guilherme','guilherme@gmail.com','Rua blabla 101','11 25067388');

INSERT INTO `lista_desejo` (`cliente`,`produto`) VALUES (1,1);
INSERT INTO `lista_desejo` (`cliente`,`produto`) VALUES (2,2);
INSERT INTO `lista_desejo` (`cliente`,`produto`) VALUES (3,3);
INSERT INTO `lista_desejo` (`cliente`,`produto`) VALUES (1,4);
INSERT INTO `lista_desejo` (`cliente`,`produto`) VALUES (2,5);
INSERT INTO `lista_desejo` (`cliente`,`produto`) VALUES (3,6);
