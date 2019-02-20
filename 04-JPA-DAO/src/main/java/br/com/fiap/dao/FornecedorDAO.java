package br.com.fiap.dao;

import br.com.fiap.entity.Fornecedor;
import br.com.fiap.exception.CodigoInexistenteException;
import br.com.fiap.exception.CommitException;

//Define as assinaturas dos métodos
public interface FornecedorDAO {

	void gravar(Fornecedor fornecedor);
	
	void remover(int codigo) throws CodigoInexistenteException;
	
	Fornecedor pesquisar(int codigo);
	
	void alterar(Fornecedor fornecedor);
	
	void commit() throws CommitException;
	
}
