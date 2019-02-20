package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Veiculo;

public class VeiculoDAOImpl {

	private EntityManager em;

	Veiculo veiculo = new Veiculo();

	public VeiculoDAOImpl(EntityManager em) {
		this.em = em;
	}

	// create
	public void gravar(Veiculo veiculo) {
		em.persist(veiculo);
	}

	// read
	public Veiculo pesquisar(int codigo) {
		Veiculo busca = em.find(Veiculo.class, codigo);
		return busca;
	}

	// update
	public void alterar(Veiculo veiculo) {
		em.merge(veiculo);
	}

	// delete
	public void remover(int codigo) {
		Veiculo v = em.find(Veiculo.class, codigo);
		em.remove(v);
	}
}
