package br.com.joao.cliente;

import br.com.joao.pessoa.Pessoa;


public class Cliente extends Pessoa {
	
	private String endereco;
	private String cidade;
	private String estado;
	private String cep;
	private long telefone;
	
	public Cliente(int id, String nome, long cpf, String endereco, String cidade, String estado, String cep, long telefone) {
		
		super(id, nome, cpf);
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.telefone = telefone;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public long getTelefone() {
		return telefone;
	}
	
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
}
