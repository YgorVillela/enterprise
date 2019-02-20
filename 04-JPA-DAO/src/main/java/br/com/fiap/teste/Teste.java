package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.FornecedorDAO;
import br.com.fiap.dao.impl.FornecedorDAOImpl;
import br.com.fiap.entity.Fornecedor;
import br.com.fiap.entity.Tipo;
import br.com.fiap.exception.CodigoInexistenteException;
import br.com.fiap.exception.CommitException;

public class Teste {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("cliente");// aqui entra o mesmo nome do
																							// persistence
		EntityManager em = fabrica.createEntityManager();
		FornecedorDAO dao = new FornecedorDAOImpl(em);
		
		// Cadastrar um fornecedor
		Fornecedor f = new Fornecedor("Ambev", 123456789, Tipo.ATACADO);

		try {
			dao.gravar(f);
			dao.commit();
			System.out.println("Fornecedor cadastrado!");
		} catch (CommitException e) {
			e.printStackTrace();
			System.err.println("Deu ruim");
		}
		// buscar fornecedor
		
		Fornecedor busca = dao.pesquisar(1);

		// atualizar fornecedor
		try {
			busca.setFornecedor("Zoomo");
			dao.alterar(busca);
			dao.commit();
			System.out.println("Fornecedor atualizado!");
		} catch (CommitException e) {
			e.printStackTrace();
			System.err.println("Erro..");
		}
		// remover um fornecedor
		try {
			dao.remover(1);
			dao.commit();
			System.out.println("Fornecedor removido!");
		}catch(CodigoInexistenteException e) {
			System.err.println("Código inexistente");
			e.printStackTrace();
		}catch(CommitException e) {
			System.err.println("Erro no commit");
			e.printStackTrace();
		}
		
		
		em.close();
		fabrica.close();
	}

}
