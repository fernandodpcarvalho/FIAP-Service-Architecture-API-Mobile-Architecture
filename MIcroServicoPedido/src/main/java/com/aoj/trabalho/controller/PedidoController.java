package com.aoj.trabalho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aoj.trabalho.dto.PedidoDTO;
import com.aoj.trabalho.model.Pedido;
import com.aoj.trabalho.service.PedidoService;

@RestController
@RequestMapping(value="pedido")
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping(value="buscarPedido/{pedidoId}", produces="application/json")
	public Pedido BuscarPedido( @PathVariable("pedidoId") String pedidoId) {
		return pedidoService.findById(Integer.parseInt(pedidoId));
	}
	
	@GetMapping(value="listarPedido", produces="application/json")
	public Iterable<Pedido> ListarPedido() {
		return pedidoService.findAll();
	}
	
	@PostMapping(value="fazerPedido", produces="application/json")
	public Pedido FazerPedido(@RequestBody PedidoDTO pedidoDTO) {
		return pedidoService.save(pedidoDTO);
	}
	
	@PutMapping(value="atualizarPedido", produces="application/json")
	public Pedido AtualizarPedido(@RequestBody PedidoDTO pedidoDTO) {
		return pedidoService.save(pedidoDTO);
	}
	
	@DeleteMapping(value="RemoverPedido/{pedidoId}")
	public Boolean RemoverPedido(@PathVariable("pedidoId") int pedidoId) {
		return pedidoService.removePedido(pedidoId);
	}
	
	
	
	
	
	
	
	
}
