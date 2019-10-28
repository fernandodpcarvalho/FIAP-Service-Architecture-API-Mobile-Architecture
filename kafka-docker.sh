docker exec -i kafka bash <<< "kafka-topics.sh --zookeeper zookeeper:2181 --if-exists --delete --topic pedido
kafka-topics.sh --zookeeper zookeeper:2181 --create --topic pedido --partitions 1 --replication-factor 1
kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic pedido from beginning"
