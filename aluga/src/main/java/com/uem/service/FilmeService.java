package com.uem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.uem.model.Filme;
import com.uem.repository.FilmeRepository;


@Service
public class FilmeService {

	@Autowired
	FilmeRepository filmeRepository;
	
	public FilmeService(FilmeRepository filmeRepository) {
		this.filmeRepository = filmeRepository;
	}

	public boolean alterarFilme(String titulo, String produtora) {
		Filme filme = new Filme();

		filme.setAtivo(true);

		filmeRepository.save(filme);

		return false;
	}

	public boolean excluirFilme(String titulo, String produtora) {
		try {
			filmeRepository.deleteById(1L);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public Filme buscarFilme(String titulo, String produtora) {
		
		return null;
	}

	public boolean cadastrarFilme(String titulo, String produtora, String diretor) {
		Filme busca = new Filme();
		boolean cadastrou = false;
		
		busca = null;
		//novo = buscarFilme(titulo, produtora);
		
		Filme novo = new Filme(titulo, produtora, diretor);			
		novo.setAtivo(true);
					
		//vai cadastrar o exemplar
		
		filmeRepository.save(novo);
		
		cadastrou = true;
	/*	
		if(busca == null) {
			//não achou o filme
			
		}
		else if(busca != null){
			//cadastrar exemplar
			
			cadastrou = true;
		}
		
	*/	return cadastrou;
	}
}
