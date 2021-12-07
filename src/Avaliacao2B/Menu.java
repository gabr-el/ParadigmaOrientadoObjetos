package Avaliacao2B;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		Estabelecimento e = new Estabelecimento("Neo CLin", "Rua Messias Isidorio");
		int pCrn, opcao, pCod;
		String pNome;
		double pValorConsulta;

		do {

			System.out.println("ESCOLHA UMA OPÇÃO:");
			System.out.println("1 - Contratar Nutricionista");
			System.out.println("2 - Marcar Consulta");
			System.out.println("3 - Pagar Consulta");
			System.out.println("4 - Sair do Sistema");

			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o CRN do nutricionista:");
				pCrn = entrada.nextInt();
				System.out.println("Digite o nome do nutricionista:");
				pNome = entrada.next();
				System.out.println("Digite o valor da consulta:");
				pValorConsulta = entrada.nextDouble();
				Nutricionista nutri = new Nutricionista(pCrn, pNome, pValorConsulta);
				e.contratarNutri(nutri);
				break;
			case 2:
				System.out.println("Informar CRN do Nutricionista:");
				pCrn = entrada.nextInt();
				Nutricionista n2 = e.buscarNutri(pCrn);
				if (n2 != null) {
					System.out.println("Consulta marcada! Número: " + e.marcarConsulta(n2));
				} else {
					System.out.println("Nutricionista não encontrado");
				}
				break;
			case 3:
				System.out.println("Qual o código da consulta?");
				pCod = entrada.nextInt();
				pValorConsulta = e.pagarConsulta(pCod);
				System.out.println("Valor a pagar da consulta: R$ " + pValorConsulta);
				break;
			default:
				System.out.println("Você saiu do sistema!");
				break;
			}
		} while (opcao != 4);
	}

}
