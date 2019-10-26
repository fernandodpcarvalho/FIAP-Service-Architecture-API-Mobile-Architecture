package com.aoj.trabalho.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aoj.trabalho.model.Cliente;

@Repository
public interface ClienteRepository  extends CrudRepository<Cliente, Integer> {
	
	Cliente findById(int clienteId);
}
