package com.uem.model;

import javax.persistence.*;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

@Entity
public class Exemplar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	@Column
	private boolean emprestado;
	@Column
	private boolean reservado;
	@Column
	private Filme filme;
	
	public Exemplar() {
		
	}
	
	public Exemplar(Filme filme) {
		this.emprestado = false;
		this.reservado = false;
		this.filme = filme;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public boolean isEmprestado() {
		return emprestado;
	}
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	public boolean isReservado() {
		return reservado;
	}
	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	
}
