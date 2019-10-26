package com.aoj.trabalho.kafka;

import java.util.Properties;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.aoj.trabalho.model.Pedido;

@Component
public class PedidoProducer {

	Logger logger;
	String bootstrapServers;
	Properties properties;
	KafkaProducer<String, String> producer;	
	String topic;
	
	public PedidoProducer() {
		this.logger = LoggerFactory.getLogger(PedidoProducer.class);
		
		this.bootstrapServers = "127.0.0.1:9092";
		
		this.properties = new Properties();
		this.properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		this.properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		this.properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		
		this.producer = new KafkaProducer<String, String>(properties);
		
		this.topic = "pedido";
	}
	
	public void send(Pedido pedido) {
		//producer record
		ProducerRecord<String, String> record = new ProducerRecord<String, String>(this.topic, "{pedidoId: " + pedido.getId() + ", pedidoValor: " + pedido.getValor() + ", pedidoEndereço: " + pedido.getEnderecoEntrega());
		
		//send data
		producer.send(record, new Callback() {
			public void onCompletion(RecordMetadata recordMetadata, Exception e) {
				if (e == null) {
					logger.info("Received new metadata. \n" + 
								"Topic: " + recordMetadata.topic() + "\n" + 
								"Partition: " + recordMetadata.partition() + "\n" +
								"Offset: " + recordMetadata.offset() + "\n" + 
								"Timestamp: " + recordMetadata.timestamp());
				} else {
					logger.error("Error while producing", e);
				}
			}
		});
		producer.flush();
//		producer.close();
	}
}
