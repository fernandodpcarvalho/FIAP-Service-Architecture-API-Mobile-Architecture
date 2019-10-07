CREATE TABLE `produtos` (
  `produto_id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `descricao` varchar(1000) NOT NULL,
  `genero` varchar(255) NOT NULL,
  `fornecedor` varchar(255) NOT NULL,
  `preco` float NOT NULL,
  `categoria` varchar(255) NOT NULL,
  `visualizacao` int(20) NOT NULL,
  PRIMARY KEY (`produto_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `Cliente` (
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
  FOREIGN KEY (cliente) REFERENCES Cliente (cliente_id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE chamado (
 `chamado_id` int(11) NOT NULL AUTO_INCREMENT,
  `cliente` int not NULL,
  `descricao` varchar(2000) not NULL,
  `status` varchar(100) not NULL,
   PRIMARY KEY (`chamado_id`),
  FOREIGN KEY (cliente) REFERENCES Cliente (cliente_id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
