package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Funcionario;
import br.com.fiap.entity.Nivel;

public class Teste {

	public static void main(String[] args) {
		// Criar a fabrica de Entity Manager

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("cliente");

		// Criar o gerenciador de entidades
		EntityManager em = fabrica.createEntityManager();

		// Cadastro
		Funcionario func = new Funcionario("Humberto", 1000, new GregorianCalendar(2010, Calendar.APRIL, 2), null,
				Nivel.ESTAGIO);

		em.persist(func);// cadastro
		em.getTransaction().begin();
		em.getTransaction().commit();

		//PESQUISA POR CÓDIGO
		Funcionario busca = em.find(Funcionario.class, 1);
		System.out.println(busca);
		
		//ATUALIZAÇÃO
		busca.setNome("Rodrigo");
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		Funcionario atualizacao = new Funcionario(3, "Alice", 10000, Calendar.getInstance(),null, Nivel.SENIOR);
		em.merge(atualizacao);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//remoção
		Funcionario remove = em.find(Funcionario.class, 5);
		em.remove(remove);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		
		
		em.close();
		fabrica.close();
	}

}
