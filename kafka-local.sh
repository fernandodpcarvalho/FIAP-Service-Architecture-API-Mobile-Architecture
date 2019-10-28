cd /opt/confluent/bin
kafka-topics --zookeeper zookeeper:2181 --if-exists --delete --topic pedido
kafka-topics --zookeeper localhost:2181 --if-exists --delete --topic pedido
kafka-topics --zookeeper localhost:2181 --create --topic pedido --partitions 1 --replication-factor 1
