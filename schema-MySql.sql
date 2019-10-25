CREATE TABLE `produto` (
  `produto_id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `descricao` varchar(1000) NOT NULL,
  `genero` varchar(255) NOT NULL,
  `fornecedor` varchar(255) NOT NULL,
  `preco` float NOT NULL,
  `categoria` varchar(255) NOT NULL,
  `visualizacao` int(20) NOT NULL,
  `pedido` int(11),
  PRIMARY KEY (`produto_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


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
   PRIMARY KEY (`listadesejo_id`),
  FOREIGN KEY (cliente) REFERENCES cliente (cliente_id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE chamado (
 `chamado_id` int(11) NOT NULL AUTO_INCREMENT,
  `cliente` int not NULL,
  `descricao` varchar(2000) not NULL,
  `status` varchar(100) not NULL,
   PRIMARY KEY (`chamado_id`),
  FOREIGN KEY (cliente) REFERENCES cliente (cliente_id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `pedido` (
  `pedido_id` int(11) NOT NULL AUTO_INCREMENT,
  `endereco_entrega` varchar(255) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `status` varchar(255) NOT NULL,
  `valor` float NOT NULL,
  `cliente` int(11) NOT NULL,
  PRIMARY KEY (`pedido_id`),
  FOREIGN KEY (`cliente`) REFERENCES cliente (`cliente_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

ALTER TABLE `produto` ADD FOREIGN KEY (`pedido`) REFERENCES pedido (`pedido_id`);
