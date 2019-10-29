FIAP-Service-Architecture-API-Mobile-Architecture

# Visão geral do projeto
O projeto consiste na implementaço de 3 microserviços: Pedido, Cliente e Produto.
A implementaço de banco de dados foi feita usando Mysql
O microserviço Cliente possui o banco de dados em uma instância separada dos demais.
Os microserviços de Pedido e Produto acessam o mesmo Banco de dados, por terem domínios semelhantes.
Foi implementado um tópico "pedido" no Kafka
O microserviço de Pedido possui uma classe producer que envia os dados de novoPedido para o topico
A aplicaço PedidoConsumer consome os dados do topico "pedido" e imprime no log. 


Para iniciar a aplicação, siga as instruções abaixo:

Pré-Requisitos
Instalação do GIT - https://git-scm.com/
Instalação do docker e docker compose- https://www.docker.com/products/docker-enterprise

# Fazer o download do repositório do projeto:
git clone https://github.com/fernandodpcarvalho/FIAP-Service-Architecture-API-Mobile-Architecture.git

# Abrir o terminal do linux, entrar no diretório do Projeto e executar os seguintes comandos para criar a infra-estrutura em docker necessária para o projeto:
docker-compose up -d build

# OBS: Caso haja problema com o kafka em docker, instalar o Confluent Platform que contém o kafka, seguindo os passos abaixo:
Instalação: https://docs.confluent.io/current/installation/installing_cp/zip-tar.html#prod-kafka-cli-install
tar xvfz confluent.x.x.x.tar.gz
sudo mv confluent.x.x.x /opt
sudo ln -s confluent.x.x.x confluent (((Criar atalho)))
export PATH=$PATH:/opt/confluent/bin (Incluir no arquivo /etc/profile)

*Instalar Confluent CLI
https://docs.confluent.io/current/cli/installing.html
/opt/curl -L https://cnfl.io/cli | sh -s -- -b /opt/confluent/bin

*Executar: 
confluent local start

# Em seguida, executar o script de criação do topico "pedido"
1)PAra kafka em docker:
./kafka-docker.sh

2)Para Kafka local:
./kafka-local.sh


# Em seguida, executar os seguintes comandos para criar as tabelas no mysql:
1)Para o mysql_cliente:
docker exec -ti mysql-cliente bash
mysql -u root -p
senha = "root"
use amazon_cliente;

2)Para o mysql_produto
docker exec -ti mysql-produto bash
mysql -u root -p
senha = "root"
use amazon_produto;

# Em seguida, copiar os scripts SQL respecitivo em cada docker do mysql: 
amazon_database_cliente
amazon_database_produto

# No configurationserver, verificar no arquivo /resources/config/application.yml se o endereço do parâmetro searchLocations está correto no seu ambiente.

# EM seguida, abrir o projeto no Eclipse STS e dar build nos microserviços

# Acessar os seguintes endereços para acessar a documentação em Swager de cada microserviço:
1) Microserviço Cliente: http://localhost:8070//swagger-ui.html
2) Microserviço Pedido: http://localhost:8080//swagger-ui.html
3) Microserviço Produto: http://localhost:8090//swagger-ui.html
 
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
* Possibilidade de calcular o frete de uma compra

