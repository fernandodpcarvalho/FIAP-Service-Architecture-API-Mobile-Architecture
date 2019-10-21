package com.aoj.trabalho.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pedido_id", nullable = false)
	private int id;
	
	@OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente")
	private Cliente cliente;
	
	@OneToMany(mappedBy = "pedido", targetEntity = Produto.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Column(name = "produtos")
	private List<Produto> produtos;
	
	@Column(name = "quantidade", nullable = false)
	private int quantidade;
	
	@Column(name = "valor", nullable = false)
	private Double valor;
	
	@Column(name = "status", nullable = false)
	private String status;
	
	@Column(name = "enderecoEntrega", nullable = false)
	private String enderecoEntrega;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
}
