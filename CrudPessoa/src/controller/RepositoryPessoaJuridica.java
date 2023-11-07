package controller;

import java.util.ArrayList;
import java.util.List;

public class RepositoryPessoaJuridica implements IRepositoryPessoaJuridica {
	List<PessoaJuridica> listaPessoa = new ArrayList<PessoaJuridica>();

	public boolean atualiza(PessoaJuridica pj) {
		for (int i = 0; i < listaPessoa.size(); i++) {
			if (listaPessoa.get(i).getCnpj() == pj.getCnpj()) {
				listaPessoa.get(i).setNome(pj.getNome());
				listaPessoa.get(i).setCnpj(pj.getCnpj());

				System.out.println("Lista atualizada: " + listaPessoa);
				return true;
			}

		}
		return false;
	}

	public List<PessoaJuridica> retornaLista() {
		return listaPessoa;
	}

	public boolean cria(PessoaJuridica pessoaJuridica) {
		listaPessoa.add(pessoaJuridica);

		return true;
	}

	public boolean deleta(int cnpj) {

		for (int i = listaPessoa.size() - 1; i >= 0; i--) {
			if (listaPessoa.get(i).getCnpj() == cnpj) {
				listaPessoa.remove(i);
				System.out.println("CNPJ removido com sucesso!");
				return true;
			}
		}
		System.out.println("CNPJ não encontrado!");
		return false;
	}

}
