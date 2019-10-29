package com.aoj.trabalho.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cliente_id", nullable = false)
	private int id;

	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "telefone", nullable = false)
	private String telefone;
	
	@Column(name = "endereco", nullable = false)
	private String endereco;
	
	@JsonProperty("listaDesejos")
	@ElementCollection
    @CollectionTable(name = "ListaDesejo", joinColumns = @JoinColumn(name = "cliente"))
    @Column(name = "Produto")
	private List<Integer> listaDesejos;
	
	@JsonProperty("Chamado")
	@OneToMany(targetEntity=Chamado.class, mappedBy="cliente", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@Fetch(FetchMode.SUBSELECT)
	private List<Chamado> listaChamados;
	
	@Column(name = "pedidoId", nullable = false)
	private
	int pedidoId;	

	public Cliente() {
		listaDesejos = new ArrayList<Integer>();
		listaChamados = new ArrayList<Chamado>();
	}

	public Cliente(int id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	
	
	public List<Integer> getListaDesejos() {
		return listaDesejos;
	}
	
	public void setListaDesejos(List<Integer> listaDesejos) {
		this.listaDesejos = listaDesejos;
	}
	
	public List<Chamado> getListaChamados() {
		return listaChamados;
	}

	@JoinTable(
            name="Chamado",
            joinColumns = @JoinColumn( name="cliente_id"),
            inverseJoinColumns = @JoinColumn( name="cliente")
    )
	public void setListaChamados(List<Chamado> listaChamados) {
		this.listaChamados = listaChamados;
	}

	public int getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(int pedidoId) {
		this.pedidoId = pedidoId;
	}


}