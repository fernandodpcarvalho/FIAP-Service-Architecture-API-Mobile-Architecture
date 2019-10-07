INSERT INTO Produtos(nome, descricao, genero, fornecedor, preco, categoria, visualizacao) VALUES('Produto 1', 'Descricao 1', 'Genero 1', 'Fornecedor 1', 112.30, 'Livro', 0);
INSERT INTO Produtos(nome, descricao, genero, fornecedor, preco, categoria, visualizacao) VALUES('Produto 2', 'Descricao 2', 'Genero 2', 'Fornecedor 2', 112.40),'Moda',0;
INSERT INTO Produtos(nome, descricao, genero, fornecedor, preco, categoria, visualizacao) VALUES('Produto 3', 'Descricao 3', 'Genero 3', 'Fornecedor 3', 112.50,'Vestuário',0);
INSERT INTO Produtos(nome, descricao, genero, fornecedor, preco, categoria, visualizacao) VALUES('Produto 4', 'Descricao 1', 'Genero 4', 'Fornecedor 4', 10, 'Livro', 8);
INSERT INTO Produtos(nome, descricao, genero, fornecedor, preco, categoria, visualizacao) VALUES('Produto 5', 'Descricao 1', 'Genero 5', 'Fornecedor 5', 140, 'Livro', 50);
INSERT INTO Produtos(nome, descricao, genero, fornecedor, preco, categoria, visualizacao) VALUES('Produto 6', 'Descricao 1', 'Genero 6', 'Fornecedor 6', 1000, 'Livro', 10);


INSERT INTO Cliente (`nome`,`email`,`endereco`,`telefone`) VALUES ('Alexandre','alexandre.tadeu@gmail.com','Rua teste 101','11 25067388');
INSERT INTO Cliente (`nome`,`email`,`endereco`,`telefone`) VALUES ('Fernando','fernando@gmail.com','Rua opa 101','11 25067388');
INSERT INTO Cliente (`nome`,`email`,`endereco`,`telefone`) VALUES ('Guilherme','guilherme@gmail.com','Rua blabla 101','11 25067388');

INSERT INTO `trabalho`.`lista_desejo` (`cliente`,`produto`) VALUES (1,1);
INSERT INTO `trabalho`.`lista_desejo` (`cliente`,`produto`) VALUES (2,2);
INSERT INTO `trabalho`.`lista_desejo` (`cliente`,`produto`) VALUES (3,3);
INSERT INTO `trabalho`.`lista_desejo` (`cliente`,`produto`) VALUES (1,4);
INSERT INTO `trabalho`.`lista_desejo` (`cliente`,`produto`) VALUES (2,5);
INSERT INTO `trabalho`.`lista_desejo` (`cliente`,`produto`) VALUES (3,6);
