package controller;

import java.util.List;

public interface IRepositoryPessoaFisica {
	public boolean atualiza(PessoaFisica pf);
	public boolean cria(PessoaFisica pf);
	public List<PessoaFisica> retornaLista();
	public boolean deleta(String cpf);
	
}
