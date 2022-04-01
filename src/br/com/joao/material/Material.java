package br.com.joao.material;

public class Material {

	private int id;
	private String descricao;
	private double valor;
	
	public Material() {
		
	}
	
	public Material(int id, String descricao, double valor) {
		
		this.valor = valor;
		this.descricao = descricao;
		this.valor = valor;
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
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor){
		this.valor = valor;
	}
	
	public void informacoes() {
		
		System.out.println("ID: " + getId());
		System.out.println("Descrição: " + getDescricao());
		System.out.println("Valor: " + getValor());
	}
	
}
