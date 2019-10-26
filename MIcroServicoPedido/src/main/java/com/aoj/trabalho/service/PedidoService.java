package com.aoj.trabalho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aoj.trabalho.builder.PedidoBuilder;
import com.aoj.trabalho.dto.PedidoDTO;
import com.aoj.trabalho.kafka.PedidoProducer;
import com.aoj.trabalho.model.Pedido;
import com.aoj.trabalho.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
    private PedidoRepository pedidoRepository;
	
	@Autowired
	private PedidoProducer pedidoProducer;
	
	@Autowired 
	PedidoBuilder pedidoBuilder;

	public Pedido findById(int pedidoId) {
		return pedidoRepository.findById(pedidoId);
	}

	public Pedido save(PedidoDTO pedidoDTO) {
		Pedido pedido = pedidoBuilder.build(pedidoDTO);
		pedidoProducer.send(pedido);
		return pedidoRepository.save(pedido);
	}

}
