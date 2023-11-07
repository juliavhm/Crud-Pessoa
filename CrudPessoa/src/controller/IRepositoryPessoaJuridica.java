package controller;

import java.util.List;

public interface IRepositoryPessoaJuridica {
	public boolean atualiza(PessoaJuridica pj);
	public List<PessoaJuridica> retornaLista();
	public boolean cria(PessoaJuridica pj);
	public boolean deleta(int cnpj);
}
