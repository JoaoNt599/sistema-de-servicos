package br.com.joao.servico;

public class Servico {
	
	private int id;
	private String descricao;
	
	public Servico() {
		
	}
	
	public Servico(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void informacoes() {
		System.out.println("ID: " + getId());
		System.out.println("Descrição: " + getDescricao());
	}
}
