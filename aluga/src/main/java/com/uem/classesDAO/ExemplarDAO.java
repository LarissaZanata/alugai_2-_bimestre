/*package com.uem.classesDAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uem.interfacesDAO.InterfaceExemplarDAO;
import com.uem.model.Exemplar;
import com.uem.model.Filme;

@Repository
public class ExemplarDAO implements InterfaceExemplarDAO{

	@Override
	public boolean checarStatus(List <Exemplar> exemplares) {
		// percorrer a lista de exemplares verificando se algum deles está emprestado
		return false;
	}

	@Override
	public boolean cadastrarExemplar(Filme filme) {
		// cria um objeto de exemplar e vincula ele ao filme
		return false;
	}

	@Override
	public boolean devolverExemplar(int codigo) {
		// irá buscar o exemplar pelo código e alterar o campo de emprestado para false
		return false;
	}

	@Override
	public List<Exemplar> buscarExemplar(Filme filme) {
		// dado o filme passado, busca os exemplares vinculado à esse filme
		// e retorna uma lista contendo todos os exemplares
		return null;
	}

	@Override
	public boolean excluirExemplar(Filme filme) {
		// busca os exemplares e verifica se não está emprestado
		// se não estiver verificar se o exemplar a ser excluído é o ultimo daquele filme
		// se for, lançar mensagem de aviso, se for excluído o ultimo exemplar é excluido o filme tambem
		return false;
	}

	@Override
	public void alterarExemplar(Filme filme) {
		// ver esse método, talvez não exista nada que possa ser alterado na mão
		
	}

	@Override
	public boolean consultaReserva(List<Exemplar> exemplares) {
		// buscar os exemplares e percorrer a lista verificando se estão reservados
		return false;
	}

}
*/