INSERT INTO cliente (`nome`,`email`,`endereco`,`telefone`) VALUES ('Alexandre','alexandre.tadeu@gmail.com','Rua teste 101','11 25067388');
INSERT INTO cliente (`nome`,`email`,`endereco`,`telefone`) VALUES ('Fernando','fernando@gmail.com','Rua opa 101','11 25067388');
INSERT INTO cliente (`nome`,`email`,`endereco`,`telefone`) VALUES ('Guilherme','guilherme@gmail.com','Rua blabla 101','11 25067388');

INSERT INTO `pedido` (`endereco_entrega`,`quantidade`,`status`,`valor`,`cliente`) VALUES ('Endereço 1',1,'status 1',111.11,1);
INSERT INTO `pedido` (`endereco_entrega`,`quantidade`,`status`,`valor`,`cliente`) VALUES ('Endereço 2',2,'status 2',222.22,2);

INSERT INTO produto(categoria, descricao, fornecedor, Genero, nome, preco, visualizacao, pedido) VALUES('Categoria 1', 'Descricao 1', 'Fornecedor 1', 'Genero 1', 'Nome 1', 112.30, 5, 1);
INSERT INTO produto(categoria, descricao, fornecedor, Genero, nome, preco, visualizacao, pedido) VALUES('Categoria 2', 'Descricao 2', 'Fornecedor 2', 'Genero 2', 'Nome 2', 112.40, 10, 1);
INSERT INTO produto(categoria, descricao, fornecedor, Genero, nome, preco, visualizacao, pedido) VALUES('Categoria 3', 'Descricao 3', 'Fornecedor 3', 'Genero 3', 'Nome 3', 112.50, 3, 1);
INSERT INTO produto(categoria, descricao, fornecedor, Genero, nome, preco, visualizacao, pedido) VALUES('Categoria 4', 'Descricao 1', 'Fornecedor 4', 'Genero 4', 'Nome 4', 10.50, 8, 1);
INSERT INTO produto(categoria, descricao, fornecedor, Genero, nome, preco, visualizacao, pedido) VALUES('Categoria 5', 'Descricao 1', 'Fornecedor 5', 'Genero 5', 'Nome 5', 140.99, 13, 1);
INSERT INTO produto(categoria, descricao, fornecedor, Genero, nome, preco, visualizacao, pedido) VALUES('Categoria 6', 'Descricao 1', 'Fornecedor 6', 'Genero 6', 'Nome 6', 1000.00, 25, null);

INSERT INTO `lista_desejo` (`cliente`,`produto`) VALUES (1,1);
INSERT INTO `lista_desejo` (`cliente`,`produto`) VALUES (2,2);
INSERT INTO `lista_desejo` (`cliente`,`produto`) VALUES (3,3);
INSERT INTO `lista_desejo` (`cliente`,`produto`) VALUES (1,4);
INSERT INTO `lista_desejo` (`cliente`,`produto`) VALUES (2,5);
INSERT INTO `lista_desejo` (`cliente`,`produto`) VALUES (3,6);


