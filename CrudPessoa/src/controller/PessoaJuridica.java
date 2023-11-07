package controller;

public class PessoaJuridica extends Pessoa{
	private int cnpj;

	public PessoaJuridica(String nome ,int cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String getNome() {
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		super.setNome(nome);
	}

	
	}
	
	
	
	


