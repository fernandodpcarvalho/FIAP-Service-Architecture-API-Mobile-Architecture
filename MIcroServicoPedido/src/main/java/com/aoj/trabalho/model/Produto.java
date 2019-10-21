package com.aoj.trabalho.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "produto_id", nullable = false)
	private int id;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	@Column(name = "genero", nullable = false)
	private String genero;
	
	@Column(name = "categoria", nullable = false)
	private String categoria;
	
	@Column(name = "fornecedor", nullable = false)
	private String fornecedor;
	
	@Column(name = "preco", nullable = false)
	private Double preco;
	
	@Column(name = "visualizacao", nullable = false)
	private int visualizacao;
	
	@ManyToOne
	@JoinColumn(name="pedido")
	private Pedido pedido;


	public Produto() {
	}

	public Produto(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}	
	
	public int getVisualizacao() {
		return visualizacao;
	}
	
	public void setVisualizacao(int visualizacao) {
		this.visualizacao = visualizacao;
	}


	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}