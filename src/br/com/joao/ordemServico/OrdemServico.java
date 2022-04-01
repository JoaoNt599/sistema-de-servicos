package br.com.joao.ordemServico;

import java.util.Date;

import br.com.joao.material.Material;
import br.com.joao.servico.Servico;

public class OrdemServico {

	private int id;
	private Date dataSolicitacao;
	private Date dataInicio;
	private Date dataFim;
	private double valorTotal;
	private Servico[] servico;
	private Material[] material;
	
	public OrdemServico() {
		
	}
	
	public OrdemServico(int id, Date dataSolicitacao){
		this.id = id;
		this.dataSolicitacao = dataSolicitacao;
	}
	
	public OrdemServico(int id, Date dataSolicitacao, Date dataInicio, Date dataFim, double valorTotal) {
		this.id = id;
		this.dataSolicitacao = dataSolicitacao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.valorTotal = valorTotal;
	}
	
	public void inserirServicos(int quantidade) {
		Servico[] servico = new Servico[quantidade];
	}
	
	public void inserirMateriais(int quantidade) {
		Material[] material = new Material[quantidade];
	}
	
	public void servico(int posicao, int id, String descricao) {
		
		servico[posicao].setId(id);
		servico[posicao].setDescricao(descricao);
	}
	
	public void material(int id, int posicao, String descricao, double valor) {
		
		material[posicao].setId(id);
		material[posicao].setDescricao(descricao);
		material[posicao].setValor(valor);
		
		this.valorTotal += valor;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getDataSolicitacao() {
		return dataSolicitacao;
	}
	
	public void setDataSolicitacao(Date dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}
	
	public Date getDataInicio() {
		return dataInicio;
	}
	
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public Date getDataFim() {
		return dataFim;
	}
	
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public void informacoes() {
		
		System.out.println("ID: " + getId());
		System.out.println("Data de Solicitação: " + getDataSolicitacao());
		System.out.println("Data de Início: " + getDataInicio());
		System.out.println("Data Final: " + getDataFim());
		System.out.println("Valor Total: " + getValorTotal());
	}
}
