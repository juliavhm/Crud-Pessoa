package controller;

public class PessoaFisica extends Pessoa {

	public PessoaFisica(String nome) {
		super(nome);
	}

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + "]";
	}

	

	
	
	
}
