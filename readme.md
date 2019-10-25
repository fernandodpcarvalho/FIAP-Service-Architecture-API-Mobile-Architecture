FIAP-Service-Architecture-API-Mobile-Architecture

Para iniciar a aplicação, siga as instruções abaixo:

Pré-Requisitos
Instalação do GIT - https://git-scm.com/
Instalação do docker e docker compose- https://www.docker.com/products/docker-enterprise

# Fazer o download do repositório do projeto:
git clone https://github.com/fernandodpcarvalho/FIAP-Service-Architecture-API-Mobile-Architecture.git

# Abrir o terminal do linux, entrar no diretório do Projeto e executar os seguintes comandos para criar a infra-estrutura em docker necessária para o projeto:
docker-compose up -d

# Em seguida, executar o script de criação do topico "pedido"
./kafka.sh

# Em seguida, executar os seguintes comandos para criar as tabelas no mysql:
docker exec -ti mysql bash
mysql -u root -p
senha = "root"
use amazon;

# Em seguida, copiar o script sql do arquivo schema-MySql.sql e executar no terminal do docker do Mysql

# Em seguida, copiar o script sql do arquivo data-MySql.sql e executar no terminal do docker do Mysql

# EM seguida, abrir o projeto no Eclipse STS e dar build nos microserviços

# Acessar o endereço http://localhost:8080//swagger-ui.html para visualizar a documentação swagger do microserviço

# Baseado na documentação, realizar chamadas de cara endpoint para efetuar os testes.
  
  
# Microservico produtos
* Possibilidade de visualizar os detalhes de cada produto;
* Possibilidade de buscar um produto por palavra-chave;
Possibilidade de visualizar os produtos de um determinado gênero;
* Possibilidade de exibir os produtos mais vistos por categorias;(a cada visualização de detalhes, incrementar contador de visualizações)

# Microservico cliente
* Possibilidade de adicionar itens na sua lista de desejo;
* Possibilidade de abrir um chamado técnico de algum problema que está acontecendo;

# Microservico pedido
* Possibilidade de acompanhar os dados do seu pedido;
* Possibilidade de calcular o frete de uma compra;
