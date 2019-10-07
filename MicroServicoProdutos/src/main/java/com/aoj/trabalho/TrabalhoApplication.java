package com.aoj.trabalho;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aoj.trabalho.model.Produto;
import com.aoj.trabalho.repository.ProdutoRepository;

import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RestController
@RequestMapping(value="microServicoProdutos")
public class TrabalhoApplication {
	
	@Autowired
    private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TrabalhoApplication.class, args);
	}
	
	@RequestMapping(value="ListarProdutos", method = RequestMethod.GET)
	public List<Produto> ListarProdutos() {
		return (List<Produto>) produtoRepository.findAll();
	}
	
	@RequestMapping(value="BuscarProduto/{idProduto}", method = RequestMethod.GET)
	public Produto BuscarProduto( @PathVariable("idProduto") String idProduto) {
		return produtoRepository.findById(Integer.parseInt(idProduto));
	}
	
	@RequestMapping(value="BuscarGenero/{genero}", method = RequestMethod.GET)
	public List<Produto> BuscarGenero( @PathVariable("genero") String genero) {
		return produtoRepository.findByGenero(genero);
	}
	
	@RequestMapping(value="BuscarMaisVistosCategoria/{categoria}", method = RequestMethod.GET)
	public List<Produto> BuscarMaisVistosCategoria( @PathVariable("categoria") String categoria) {
		List<Produto> first100 = produtoRepository.findByCategoriaOrderByVisualizacaoDesc(categoria).stream().limit(100).collect(Collectors.toList());
		return first100;
	}
	
    @RequestMapping(value="BuscarDetalhes/{idProduto}", method = RequestMethod.GET)
	public String BuscarDetalhes( @PathVariable("idProduto") String idProduto) {
		
			Produto p = produtoRepository.findById(Integer.parseInt(idProduto));
			if(p != null) {
				p.setVisualizacao(p.getVisualizacao() + 1);
				produtoRepository.save(p);
			}
			return p.getDescricao();
	}
	
	@RequestMapping(value="BuscarPalavraChave/{palavraChave}", method = RequestMethod.GET)
	public List<Produto> BuscarPalavraChave( @PathVariable("palavraChave") String palavraChave) {
		return produtoRepository.findByDescricaoContaining(palavraChave);
	}

}
