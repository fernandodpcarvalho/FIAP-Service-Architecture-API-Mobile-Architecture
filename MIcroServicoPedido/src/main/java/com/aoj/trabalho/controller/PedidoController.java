package com.aoj.trabalho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aoj.trabalho.model.Pedido;
import com.aoj.trabalho.repository.PedidoRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="pedido")
public class PedidoController {
	
	@Autowired
    private PedidoRepository pedidoRepository;
	
	@ApiOperation(value = "Retorna os dados do pedido")
	@GetMapping(value="buscarPedido/{idPedido}", produces="application/json")
	public Pedido BuscarPedido( @PathVariable("idPedido") String idPedido) {
		return pedidoRepository.findById(Integer.parseInt(idPedido));
	}
	
	@GetMapping(value="calcularFrete/cepOrigem={cepOrigem}/cepDestino={cepDestino}", produces="application/json")
	public String calcularFrete(@PathVariable("cepOrigem") String cepOrigem, @PathVariable("cepDestino") String cepDestino) {
		return "mil reais";
	}
}
