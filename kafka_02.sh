kafka-topics --zookeeper localhost:2181 --if-exists --delete --topic pedido
kafka-topics --zookeeper localhost:2181 --create --topic pedido --partitions 1 --replication-factor 1
kafka-console-consumer --zookeeper localhost:2181 --topic pedido from beginning

kafka-console-producer --broker-list localhost:9092 --topic pedido
