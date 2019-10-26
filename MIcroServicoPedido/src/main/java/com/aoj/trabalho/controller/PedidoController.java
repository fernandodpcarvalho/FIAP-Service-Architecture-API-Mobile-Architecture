package com.aoj.trabalho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aoj.trabalho.dto.PedidoDTO;
import com.aoj.trabalho.model.Pedido;
import com.aoj.trabalho.service.PedidoService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="pedido")
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	
	@ApiOperation(value = "Retorna os dados do pedido")
	@GetMapping(value="buscarPedido/{pedidoId}", produces="application/json")
	public Pedido BuscarPedido( @PathVariable("pedidoId") String pedidoId) {
		return pedidoService.findById(Integer.parseInt(pedidoId));
	}
	
	@PostMapping(value="fazerPedido", produces="application/json")
	public Pedido FazerPedido(@RequestBody PedidoDTO pedidoDTO) {
		return pedidoService.save(pedidoDTO);
	}
}
