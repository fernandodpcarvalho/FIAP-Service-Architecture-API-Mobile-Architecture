package com.aoj.trabalho.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aoj.trabalho.model.Produto;
import com.aoj.trabalho.repository.ProdutoRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value="produtos")
public class ProdutoController {
	
	@Autowired
    private ProdutoRepository produtoRepository;
	
	@PostMapping(value="cadastrarProduto/{Produto}")
	public Produto CadastrarProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	@PutMapping(value="atualizarProduto/{Produto}")
	public Produto AtualizarProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	@DeleteMapping(value="RemoverProduto/{produtoId}")
	public Boolean RemoverProduto( @PathVariable("produtoId") int produtoId) {
		return produtoRepository.deleteById(produtoId);
	}

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
