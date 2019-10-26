package com.aoj.trabalho.builder;

import org.springframework.stereotype.Component;

import com.aoj.trabalho.dto.PedidoDTO;
import com.aoj.trabalho.model.Pedido;

@Component
public class PedidoBuilder {

	public Pedido build(PedidoDTO pedidoDTO) {
		Pedido pedido = new Pedido();
		pedido.setCliente(pedidoDTO.getCliente());
		pedido.setEnderecoEntrega(pedidoDTO.getEnderecoEntrega());
//		pedido.setProdutos(pedidoDTO.getProdutos());
		pedido.setQuantidade(pedidoDTO.getQuantidade());
		pedido.setStatus(pedidoDTO.getStatus());
		pedido.setValor(pedidoDTO.getValor());
		return pedido;
	}

}
