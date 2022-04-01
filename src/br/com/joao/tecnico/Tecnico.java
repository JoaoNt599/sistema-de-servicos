package br.com.joao.tecnico;

import br.com.joao.pessoa.Pessoa;


public class Tecnico extends Pessoa {

	private long telefone;
	
	public Tecnico() {
		
	}
	
	public Tecnico(long telefone) {
		this.telefone = telefone;
	}
	
	public Tecnico(int id, String nome, long cpf, long telefone) {
		
		super(id, nome, cpf);
		this.telefone = telefone;
	}
	
	public long getTelfone() {
		return telefone;
	}
	
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
}
