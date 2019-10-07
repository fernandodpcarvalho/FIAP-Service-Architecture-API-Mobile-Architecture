package com.aoj.trabalho.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Chamado")
public class Chamado implements Serializable {
	
	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "chamado_id", nullable = false)
	int chamado_id;

	@JsonIgnore
	@Column(name = "cliente", nullable = false, insertable = true, updatable = true)
	int cliente;
	
	@Column(name = "descricao", nullable = false)
	String descricao;
	
	@Column(name = "status", nullable = false)
	String status;
		
	
	public Chamado() {
	}

	public Chamado(int id) {
		this.chamado_id = id;
	}

	public int getChamado_id() {
		return chamado_id;
	}

	public void setChamado_id(int id) {
		this.chamado_id = id;
	}

	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricaoProblema) {
		this.descricao = descricaoProblema;
	}	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}	

}
