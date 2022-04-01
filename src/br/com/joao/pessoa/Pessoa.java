package br.com.joao.pessoa;

public class Pessoa {

	private int id;
	private String nome;
	private long cpf;
	
	public Pessoa() {
		
	}
	
	public Pessoa(int id) {
		this.id = id;
	}
	
	public Pessoa(String nome, long cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Pessoa(int id, String nome, long cpf) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public long getCpf() {
		return cpf;
	}
	
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public void informacoes() {
		System.out.println("ID: " + Integer.toString(getId()));
		System.out.println("Nome: " + getNome());
		System.out.println("CPF: " + Long.toString(getCpf()));
	}
}
