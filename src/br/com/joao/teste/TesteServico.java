package br.com.joao.teste;

// importacoes 

import java.util.*;

import br.com.joao.cliente.Cliente;
import br.com.joao.material.Material;
import br.com.joao.ordemServico.OrdemServico;
import br.com.joao.servico.Servico;
import br.com.joao.tecnico.Tecnico;

import java.text.SimpleDateFormat;

public class TesteServico {
	
	public static void main(String[] args) {
		// Cliente
		int idCliente;
		long cpfCliente, telefoneCliente;
		String nomeCliente, enderecoCliente, cidadeCliente, estadoCliente, cepCliente;
		
		// Ordem de servico
		int idOrdemServico;
		Date dataSolicitacao, dataInicio, dataFim;
		double valorTotal;
		
		// Tecnico
		int idTecnico;
		long cpfTecnico, telefoneTecnico;
		String nomeTecnico;
		
		// Servico
		int idServico, quantidadeServico;
		String descricaoServico;
		
		// Material
		int idMaterial, quantidadeMaterial;
		String descricaoMaterial;
		double valorMaterial;
		
		// Objetos
		Cliente cliente;
		Tecnico tecnico;
		OrdemServico ordemServico;
		Servico servico[] = null;
		Material material[] = null;
		
		try {
			Scanner sc = new Scanner(System.in);
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			quantidadeServico = 0;
			quantidadeMaterial = 0;
			
			// Preeche dados do cliente
			System.out.println("Informe o ID do cliente: ");
			idCliente = Integer.parseInt(sc.nextLine());
			
			System.out.println("Informe o nome do cliente: ");
			nomeCliente = sc.nextLine();
			
			System.out.println("Informe o CPF do cliente: ");
			cpfCliente = Long.parseLong(sc.nextLine());
			
			System.out.println("Informe o endereco do cliente: ");
			enderecoCliente = sc.nextLine();
			
			System.out.println("Informe a cidade do cliente: ");
			cidadeCliente = sc.nextLine();
			
			System.out.println("Informe o Estado do cliente: ");
			estadoCliente = sc.nextLine();
			
			System.out.println("Informe o CEP do cliente: ");
			cepCliente = sc.nextLine();
			
			System.out.println("Informe o telefone do cliente: ");
			telefoneCliente = Long.parseLong(sc.nextLine());
			
			cliente = new Cliente(idCliente, nomeCliente, cpfCliente, enderecoCliente, cidadeCliente, estadoCliente, cepCliente, telefoneCliente);
			
			// Solicitacao de servico
			
			System.out.println("Informe o ID da ordem de servi�o: ");
			idOrdemServico = Integer.parseInt(sc.nextLine());
			
			System.out.println("Informe a data de solicita��o da ordem de servi�o: ");
			dataSolicitacao = formato.parse(sc.nextLine());
			
			ordemServico = new OrdemServico(idOrdemServico, dataSolicitacao);
			
			// Definindo o tecnico
			System.out.println("Informe o ID do t�cnico: ");
			idTecnico = Integer.parseInt(sc.nextLine());
			
			System.out.println("Informe o nome do t�cnico: ");
			nomeTecnico = sc.nextLine();
			
			System.out.println("Informe o CPF do t�cnico: ");
			cpfTecnico = Long.parseLong(sc.nextLine());
			
			System.out.println("Informe o telefone do t�cnico: ");
			telefoneTecnico = Long.parseLong(sc.nextLine());
			
			tecnico = new Tecnico(idTecnico, nomeTecnico, cpfTecnico, telefoneTecnico);
			
			// Registrando informacoes
			
			System.out.println("Informe a data de inicio da ordem de servi�o");
			dataInicio = formato.parse(sc.nextLine());
			ordemServico.setDataInicio(dataInicio);
			
			System.out.println("Informe a quantidade de servi�os desejados:  ");
			quantidadeServico = Integer.parseInt(sc.nextLine());
			ordemServico.inserirServicos(quantidadeServico);
			
			for(int i = 0; i < quantidadeServico; i++); {
				
				System.out.println("Informe com o ID o tipo de servi�o");
				idServico = Integer.parseInt(sc.nextLine());
				
				System.out.println("Descri��o do servi�o: ");
				descricaoServico = sc.nextLine();
				
				ordemServico.servico(idServico, quantidadeServico, descricaoServico);
			}
			
			System.out.println("Informe a quantidade de materiais (caso necess�rio");
			quantidadeMaterial = Integer.parseInt(sc.nextLine());
			
			quantidadeMaterial = Integer.parseInt(sc.nextLine());
			
			if(quantidadeMaterial != 0) {
				
				ordemServico.inserirMateriais(quantidadeMaterial);
				
				for(int quantidade = 0; quantidade < quantidadeMaterial; quantidade++) {
					
					System.out.println("Informe o ID do material: ");
					idMaterial = Integer.parseInt(sc.nextLine());
					
					System.out.println("Descri��o do material: ");
					descricaoMaterial = sc.nextLine();
					
					System.out.println("Informe o valor do material: ");
					valorMaterial = Double.parseDouble(sc.nextLine());
					
					ordemServico.material(quantidade, idMaterial, descricaoMaterial, valorMaterial);
				}
			}
			
			System.out.println("Informe a data final da ordem de servi�o: ");
			dataFim = formato.parse(sc.nextLine());
			ordemServico.setDataFim(dataFim);
			
		} catch(Exception erro) {
			System.out.println("Algo deu errado... " + erro.getMessage().toString());
			
		} finally {
			cliente = null;
			// cliente = cliente;
		}
	}
}
