package MiniTeste;

import java.util.Calendar;
import java.util.Scanner;

public class SistemaPagamentoTeste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int opcao, mesAtual;
		ControlePagamento p = new ControlePagamento();

		do {
			System.out.println(
					"Menu:\n1-Inserir Conta \n2-Inserir Funcionário\n3-Pagar Conta\n4-Relatórios\n5-Pagamento por funcionários"
							+ "\n6-Pagamento por Contas\n7-Sair do sistema\n0-Opção");
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("O que deseja cadastrar:\n1-Titulos\n2-Concessionaria? \nOpcão");
				opcao = entrada.nextInt();
				if (opcao == 1) {
					Titulo t1 = new Titulo();
					System.out.println("Digite os dados: (identificador, dia, mes, valor).");
					t1.setIdentificador(entrada.next());
					t1.setDia(entrada.nextInt());
					t1.setMes(entrada.nextInt());
					t1.setValor(entrada.nextDouble());
					t1.setStatus("PAGAR");
					p.setTitulos(t1);
				}
				if (opcao == 2) {
					Concessionaria c1 = new Concessionaria();
					System.out.println("Digite os dados: (identificador, dia, mes, valor).");
					c1.setIdentificador(entrada.next());
					c1.setDia(entrada.nextInt());
					c1.setMes(entrada.nextInt());
					c1.setValor(entrada.nextDouble());
					c1.setStatus("PAGAR");
					p.setConcessionarias(c1);
				}
				break;
			case 2:
				System.out.println(
						"O que deseja cadastrar:\n1-assalariado \n2-comissionado \n3-terceirizado \n4-assalariado comissionado");
				opcao = entrada.nextInt();
				switch (opcao) {
				case 1:
					Assalariado ass = new Assalariado();
					System.out.println("Digite os dados: (nome, sobrenome, identidade, horas trabalhadas");
					ass.setNome(entrada.next());
					ass.setSobrenome(entrada.next());
					ass.setIdentidade(entrada.nextInt());
					ass.setHorasTrabalhadas(entrada.nextInt());
					p.setAssalariados(ass);
				}
				break;
			case 3:
				System.out.println("Qualo o identificador da conta?");
				if (p.pagarConta(entrada.next())) {
					System.out.println("Conta paga.");
				} else {
					System.out.println("Conta não localizada.");
				}
				break;
			case 4:
				double valor = 0;
				mesAtual = Calendar.getInstance().get(Calendar.MONTH) + 1;
				System.out.println("Relatórios dos Pagamentos do Mês" + mesAtual);
				System.out.println("--------Contas-------");
				p.setTotal(0);
				p.imprimirContas(mesAtual);
				valor = p.getTotal();
				System.out.println("--------Funcionários--");
				p.setTotal(0);
				p.imprimirEmpregados();
				valor = valor + p.getTotal();
				System.out.println("-----------------------");
				System.out.println("Total Geral: $" + ControlePagamento.df.format(valor));
				break;
			case 5:
				System.out.println("Relatório dos funcionários: ");
				System.out.println("----------------------------");
				p.setTotal(0);
				p.imprimirEmpregados();
				break;

			case 6:
				mesAtual = Calendar.getInstance().get(Calendar.MONTH) + 1;
				System.out.println("Relatório das contas do mês" + mesAtual);
				p.setTotal(0);
				p.imprimirContas(mesAtual);
				break;
			case 7:
				System.out.println("Sistema finalizado.");
				break;
			default:
				System.out.println("Opção inválida!");
			}

		} while (opcao != 7);
		entrada.close();

	}
}
