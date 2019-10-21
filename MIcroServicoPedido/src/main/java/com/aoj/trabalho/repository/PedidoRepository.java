package com.aoj.trabalho.repository;

import org.springframework.data.repository.CrudRepository;

import com.aoj.trabalho.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Integer> {
	
	Pedido findById(int pedidoId);

}



