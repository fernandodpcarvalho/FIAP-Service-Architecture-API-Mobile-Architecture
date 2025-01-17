package com.aoj.trabalho.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.aoj.trabalho.model.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

	Produto findById(int parseInt);
	
	List<Produto> findByGenero(String genero);
	
	List<Produto> findByCategoria(String categoria);
	
	List<Produto> findByDescricaoContaining(String palavra);
	
	List<Produto> findByCategoriaOrderByVisualizacaoDesc(String categoria);
	
	Boolean deleteById(int produtoId);

}
