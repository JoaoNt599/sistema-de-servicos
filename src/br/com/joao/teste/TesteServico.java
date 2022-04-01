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
			
			System.out.println("Informe o ID da ordem de serviço: ");
			idOrdemServico = Integer.parseInt(sc.nextLine());
			
			System.out.println("Informe a data de solicitação da ordem de serviço: ");
			dataSolicitacao = formato.parse(sc.nextLine());
			
			ordemServico = new OrdemServico(idOrdemServico, dataSolicitacao);
			
			// Definindo o tecnico
			System.out.println("Informe o ID do técnico: ");
			idTecnico = Integer.parseInt(sc.nextLine());
			
			System.out.println("Informe o nome do técnico: ");
			nomeTecnico = sc.nextLine();
			
			System.out.println("Informe o CPF do técnico: ");
			cpfTecnico = Long.parseLong(sc.nextLine());
			
			System.out.println("Informe o telefone do técnico: ");
			telefoneTecnico = Long.parseLong(sc.nextLine());
			
			tecnico = new Tecnico(idTecnico, nomeTecnico, cpfTecnico, telefoneTecnico);
			
			// Registrando informacoes
			
			System.out.println("Informe a data de inicio da ordem de serviço");
			dataInicio = formato.parse(sc.nextLine());
			ordemServico.setDataInicio(dataInicio);
			
			System.out.println("Informe a quantidade de serviços desejados:  ");
			quantidadeServico = Integer.parseInt(sc.nextLine());
			ordemServico.inserirServicos(quantidadeServico);
			
			for(int i = 0; i < quantidadeServico; i++); {
				
				System.out.println("Informe com o ID o tipo de serviço");
				idServico = Integer.parseInt(sc.nextLine());
				
				System.out.println("Descrição do serviço: ");
				descricaoServico = sc.nextLine();
				
				ordemServico.servico(idServico, quantidadeServico, descricaoServico);
			}
			
			System.out.println("Informe a quantidade de materiais (caso necessário");
			quantidadeMaterial = Integer.parseInt(sc.nextLine());
			
			quantidadeMaterial = Integer.parseInt(sc.nextLine());
			
			if(quantidadeMaterial != 0) {
				
				ordemServico.inserirMateriais(quantidadeMaterial);
				
				for(int quantidade = 0; quantidade < quantidadeMaterial; quantidade++) {
					
					System.out.println("Informe o ID do material: ");
					idMaterial = Integer.parseInt(sc.nextLine());
					
					System.out.println("Descrição do material: ");
					descricaoMaterial = sc.nextLine();
					
					System.out.println("Informe o valor do material: ");
					valorMaterial = Double.parseDouble(sc.nextLine());
					
					ordemServico.material(quantidade, idMaterial, descricaoMaterial, valorMaterial);
				}
			}
			
			System.out.println("Informe a data final da ordem de serviço: ");
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
