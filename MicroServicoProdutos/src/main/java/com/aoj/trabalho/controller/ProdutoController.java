package com.aoj.trabalho.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aoj.trabalho.model.Produto;
import com.aoj.trabalho.repository.ProdutoRepository;

import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(value="produtos")
public class ProdutoController {
	
	@Autowired
    private ProdutoRepository produtoRepository;

	@RequestMapping(value="listarProdutos", method = RequestMethod.GET)
	public List<Produto> ListarProdutos() {
		return (List<Produto>) produtoRepository.findAll();
	}
	
	@RequestMapping(value="buscarProduto/{idProduto}", method = RequestMethod.GET)
	public Produto BuscarProduto( @PathVariable("idProduto") String idProduto) {
		return produtoRepository.findById(Integer.parseInt(idProduto));
	}
	
	@RequestMapping(value="buscarGenero/{genero}", method = RequestMethod.GET)
	public List<Produto> BuscarGenero( @PathVariable("genero") String genero) {
		return produtoRepository.findByGenero(genero);
	}
	
	@RequestMapping(value="buscarMaisVistosCategoria/{categoria}", method = RequestMethod.GET)
	public List<Produto> BuscarMaisVistosCategoria( @PathVariable("categoria") String categoria) {
		List<Produto> first100 = produtoRepository.findByCategoriaOrderByVisualizacaoDesc(categoria).stream().limit(100).collect(Collectors.toList());
		return first100;
	}
	
    @RequestMapping(value="buscarDetalhes/{idProduto}", method = RequestMethod.GET)
	public String BuscarDetalhes( @PathVariable("idProduto") String idProduto) {
		
			Produto p = produtoRepository.findById(Integer.parseInt(idProduto));
			if(p != null) {
				p.setVisualizacao(p.getVisualizacao() + 1);
				produtoRepository.save(p);
			}
			return p.getDescricao();
	}
	
	@RequestMapping(value="buscarPalavraChave/{palavraChave}", method = RequestMethod.GET)
	public List<Produto> BuscarPalavraChave( @PathVariable("palavraChave") String palavraChave) {
		return produtoRepository.findByDescricaoContaining(palavraChave);
	}

}
