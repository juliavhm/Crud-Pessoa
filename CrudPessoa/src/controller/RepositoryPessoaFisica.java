package controller;

import java.util.ArrayList;
import java.util.List;

public class RepositoryPessoaFisica implements IRepositoryPessoaFisica {
	List<PessoaFisica> listaPessoas = new ArrayList<PessoaFisica>();

	public boolean atualiza(PessoaFisica pf) {
		for (int i = 0; i < retornaLista().size(); i++) {
			if (retornaLista().get(i).getCpf().equals(pf.getCpf())) {
				listaPessoas.get(i).setNome(pf.getNome());

				System.out.println("Lista atualizada: " + listaPessoas);
			}

		}
		return false;
	}

	public List<PessoaFisica> retornaLista() {
		return listaPessoas;
	}

	public boolean cria(PessoaFisica pessoaFisica) {
		listaPessoas.add(pessoaFisica);

		return true;
	}

	@Override
	public boolean deleta(String cpf) {

		for (int i = 0; i < listaPessoas.size(); i++) {
			if (listaPessoas.get(i).getCpf().equals(cpf)) {
				listaPessoas.remove(i);
				System.out.println("Pessoa removida com sucesso!");
				return true;
			}
		}
		return false;
	}

}
