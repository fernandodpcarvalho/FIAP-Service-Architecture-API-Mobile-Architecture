package com.aoj.trabalho.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aoj.trabalho.model.Pedido;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Integer> {
	
	Pedido findById(int pedidoId);
	
	Boolean deleteById(int pedidoId);
}



