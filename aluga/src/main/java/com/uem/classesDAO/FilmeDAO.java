package com.uem.classesDAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.uem.model.Filme;

@Repository
interface FilmeDAO extends JpaRepository<Filme, Long>{

	
	public boolean alterarFilme(String titulo, String produtora);
	
	public boolean excluirFilme(String titulo, String produtora);

	public Filme buscarFilme(String titulo, String produtora);

	public boolean cadastrarFilme(String titulo, String produtora, String diretor);
		


}
