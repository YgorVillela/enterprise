package br.com.fiap.dao;

import br.com.fiap.entity.Veiculo;

public interface VeiculoDAO {

	void gravar(Veiculo veiculo);
	
	void remover(int codigo);
	
	Veiculo pesquisar(int codigo);
	
	void alterar(Veiculo veiculo);
	
	void commit();
}
