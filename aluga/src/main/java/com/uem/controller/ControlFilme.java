package com.uem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.uem.model.Filme;
import com.uem.service.FilmeService;

@Controller
public class ControlFilme {
	
	@Autowired
	FilmeService filmeService;
	
	public ControlFilme(FilmeService filmeService) {
		this.filmeService = filmeService;
	}
	
	public boolean cadastrarFilme(String titulo, String produtora, String diretor) {
		return filmeService.cadastrarFilme(titulo, produtora, diretor);
	}
	
	public boolean excluirFilme(String titulo, String produtora) {
		return filmeService.excluirFilme(titulo, produtora);
	}
	
	public Filme buscarFilme(String titulo, String produtora) {
		return filmeService.buscarFilme(titulo, produtora);
		//tratar o retorno na view (se tiver dados do filme, mostrar)
	}
	
	public boolean alterarFilme(String titulo, String produtora) {
		return filmeService.alterarFilme(titulo, produtora);
	}
}
