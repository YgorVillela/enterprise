package br.com.fiap.dao.impl;

import java.util.Scanner;

import javax.persistence.EntityManager;

import br.com.fiap.dao.FornecedorDAO;
import br.com.fiap.entity.Fornecedor;
import br.com.fiap.exception.CodigoInexistenteException;
import br.com.fiap.exception.CommitException;

public class FornecedorDAOImpl implements FornecedorDAO {
	Scanner teclado = new Scanner(System.in);

	private EntityManager em; // Ele que vai chamar os métodos

	Fornecedor fornecedor = new Fornecedor();

	public FornecedorDAOImpl(EntityManager em) { // construtor
		this.em = em;
	}

	public void gravar(Fornecedor fornecedor) {
		em.persist(fornecedor);
	}

	public void remover(int codigo)throws CodigoInexistenteException {
		Fornecedor f = em.find(Fornecedor.class, codigo);
		if(f ==null) {
			throw new CodigoInexistenteException("Erro ao remover");
		}
		em.remove(f);
	}

	public Fornecedor pesquisar(int codigo) {
		Fornecedor busca = em.find(Fornecedor.class, codigo);
		return busca;
	}

	public void alterar(Fornecedor fornecedor) {
		em.merge(fornecedor);
	}

	public void commit() throws CommitException {
		try {

			em.getTransaction().begin();
			em.getTransaction().commit(); //aqui ele tá tentando dar o commit
		} catch (Exception e) {
			e.printStackTrace(); //aqui ele trata a exceçao caso o commit nao funcione
			em.getTransaction().rollback(); //quando dá erro no commit e ele precisa voltar
			throw new CommitException("Erro no commit");
		}
	}
	



}
