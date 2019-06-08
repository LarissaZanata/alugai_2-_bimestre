package com.uem.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;


@Entity
public class Filme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	@Column
	private String titulo;
	@Column
	private String produtora;
	@Column
	private String diretor;
	@Column
	private boolean ativo;
	@Column
	private List<Exemplar> exemplares;
		
	public Filme() {
		
	}
	
	public Filme(String titulo, String produtora, String diretor) {
		this.titulo = titulo;		
		this.produtora = produtora;
		this.diretor = diretor;
		this.ativo = true;
	}
	
	public List<Exemplar> getExemplares() {
		return exemplares;
	}

	public void setExemplares(List<Exemplar> exemplares) {
		this.exemplares = exemplares;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getProdutora() {
		return produtora;
	}
	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	
	
}
