INSERT INTO cliente (`nome`,`email`,`endereco`,`telefone`) VALUES ('Alexandre','alexandre.tadeu@gmail.com','Rua teste 101','11 25067388');
INSERT INTO cliente (`nome`,`email`,`endereco`,`telefone`) VALUES ('Fernando','fernando@gmail.com','Rua opa 101','11 25067388');
INSERT INTO cliente (`nome`,`email`,`endereco`,`telefone`) VALUES ('Guilherme','guilherme@gmail.com','Rua blabla 101','11 25067388');

INSERT INTO `pedido` (`endereco_entrega`,`quantidade`,`status`,`valor`,`cliente`) VALUES ('Endereço 1',1,'status 1',111.11,1);
INSERT INTO `pedido` (`endereco_entrega`,`quantidade`,`status`,`valor`,`cliente`) VALUES ('Endereço 2',2,'status 2',222.22,2);
INSERT INTO `pedido` (`endereco_entrega`,`quantidade`,`status`,`valor`,`cliente`) VALUES ('Endereço 3',3,'status 3',333.33,3);

INSERT INTO produto(categoria, descricao, fornecedor, Genero, nome, preco, visualizacao, pedido) VALUES('Categoria 1', 'Descricao 1', 'Fornecedor 1', 'Genero 1', 'Produto 1', 112.30, 5, 1);
INSERT INTO produto(categoria, descricao, fornecedor, Genero, nome, preco, visualizacao, pedido) VALUES('Categoria 2', 'Descricao 2', 'Fornecedor 2', 'Genero 2', 'Produto 2', 112.40, 10, 1);
INSERT INTO produto(categoria, descricao, fornecedor, Genero, nome, preco, visualizacao, pedido) VALUES('Categoria 3', 'Descricao 3', 'Fornecedor 3', 'Genero 3', 'Produto 3', 112.50, 3, 2);
INSERT INTO produto(categoria, descricao, fornecedor, Genero, nome, preco, visualizacao, pedido) VALUES('Categoria 4', 'Descricao 4', 'Fornecedor 4', 'Genero 4', 'Produto 4', 10.50, 8, 3);
INSERT INTO produto(categoria, descricao, fornecedor, Genero, nome, preco, visualizacao, pedido) VALUES('Categoria 5', 'Descricao 5', 'Fornecedor 5', 'Genero 5', 'Produto 5', 140.99, 13, 3);
INSERT INTO produto(categoria, descricao, fornecedor, Genero, nome, preco, visualizacao, pedido) VALUES('Categoria 6', 'Descricao 6', 'Fornecedor 6', 'Genero 6', 'Produto 6', 1000.00, 25, null);
INSERT INTO produto(categoria, descricao, fornecedor, Genero, nome, preco, visualizacao, pedido) VALUES('Categoria 7', 'Descricao 7', 'Fornecedor 7', 'Genero 7', 'Produto 7', 1000.00, 25, null);
INSERT INTO produto(categoria, descricao, fornecedor, Genero, nome, preco, visualizacao, pedido) VALUES('Categoria 8', 'Descricao 8', 'Fornecedor 8', 'Genero 8', 'Produto 8', 1000.00, 25, null);
INSERT INTO produto(categoria, descricao, fornecedor, Genero, nome, preco, visualizacao, pedido) VALUES('Categoria 9', 'Descricao 9', 'Fornecedor 9', 'Genero 9', 'Produto 9', 250.00, 25, null);
INSERT INTO produto(categoria, descricao, fornecedor, Genero, nome, preco, visualizacao, pedido) VALUES('Categoria 10', 'Descricao 10', 'Fornecedor 10', 'Genero 10', 'Produto 10', 3000.00, 25, null);

INSERT INTO `lista_desejo` (`cliente`,`produto`) VALUES (1,1);
INSERT INTO `lista_desejo` (`cliente`,`produto`) VALUES (2,2);
INSERT INTO `lista_desejo` (`cliente`,`produto`) VALUES (3,3);
INSERT INTO `lista_desejo` (`cliente`,`produto`) VALUES (1,4);
INSERT INTO `lista_desejo` (`cliente`,`produto`) VALUES (2,5);
INSERT INTO `lista_desejo` (`cliente`,`produto`) VALUES (3,6);


