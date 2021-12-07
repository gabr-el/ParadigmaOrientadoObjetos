package Avaliacao1B;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Distribuidora d1 = new Distribuidora("Beer", 1);
		Distribuidora d2 = new Distribuidora("Zé", 2);
		int opcao, loja, quantidade, validade, numero, codigo;
		String nome, marca, produto;
		double valor;
		do {
			System.out.println("Qual loja deseja: (1- Beer) (2- Zé)");
			loja = leia.nextInt();
			if (loja <= 0 || loja > 2) {
				System.out.println("Digite qual deseja escolher (1 | 2)");
			}
		} while (loja <= 0 || loja > 2);
		do {
			System.out.println(
					"Menu \n" + "1- Cadastrar Produto\n" + "2- Atualizar Estoque\n" + "3- Relatórios\n" + "4- Sair");
			opcao = leia.nextInt();
			switch (opcao) {
			case 1:
				switch (loja) {
				case 1:
					System.out.println("Digite o nome do produto, marca, quantidade e preço:");
					nome = leia.next();
					marca = leia.next();
					quantidade = leia.nextInt();
					valor = leia.nextDouble();
					System.out.println("É um produto perecível? (s ou n)");
					produto = leia.next();
					if (produto.equalsIgnoreCase("n")) {
						Produto p1 = new Produto("Relogio", "Adidas", 50, (float) 50.00);
						d1.cadastrarProduto(p1);
					} else {
						System.out.println("Digite a validade");
						validade = leia.nextInt();
						Produto p1 = new ProdutoPerecivel("Farinha", "Itabaiana", 70, (float) 76.99, 030222);
						d2.cadastrarProduto(p1);
					}
					break;
				case 2:
					System.out.println("Digite o nome do produto, marca, quantidade e preço");
					nome = leia.next();
					marca = leia.next();
					quantidade = leia.nextInt();
					valor = leia.nextDouble();
					System.out.println("Produto Perecivel? (s ou n)");
					produto = leia.next();
					if (produto.equalsIgnoreCase("n")) {
						Produto p2 = new Produto("calça", "Marisa", 20, (float) 120.00);
						d1.cadastrarProduto(p2);
					} else {
						System.out.println("Digite a validade");
						validade = leia.nextInt();
						Produto p2 = new ProdutoPerecivel("Peixe", "Coqueiro", 200, (float) 39.00, 200321);
						d2.cadastrarProduto(p2);
					}
					break;
				}
			case 2:
				switch (loja) {
				case 1:
					System.out.println("Digite como deseja atualizar o estoque" + "10 Nome" + "20 Codigo");
					numero = leia.nextInt();
					if (numero == 10) {
						System.out.println("Digite o nome do produto: ");
						nome = leia.next();
						d1.buscarProduto(nome);
						for (Produto elemento : d1.getListaProdutos()) {
							if (elemento.getNome().equalsIgnoreCase(nome)) {
								System.out.println("Digite 1 para adicionar ou 2 para remover:");
								numero = leia.nextInt();
								if (numero == 1) {
									System.out.println("Digite a quantidade para adicionar: ");
									quantidade = leia.nextInt();
									elemento.colocarEmEstoque(quantidade);
									break;
								} else {
									System.out.println("Digite a quantidade para remover: ");
									quantidade = leia.nextInt();
									elemento.retirarDoEstoque(quantidade);
									break;
								}
							}
						}
						for (Produto elemento : d2.getListaProdutosPereciveis()) {
							if (elemento.getNome().equalsIgnoreCase(nome)) {
								System.out.println("Digite 1 para adicionar ou 2 para remover: ");
								numero = leia.nextInt();
								if (numero == 1) {
									System.out.println("Digite a quantidade para adicionar: ");
									quantidade = leia.nextInt();
									elemento.colocarEmEstoque(quantidade);
									break;
								} else {
									System.out.println("Digite a quantidade para remover: ");
									quantidade = leia.nextInt();
									elemento.retirarDoEstoque(quantidade);
									break;
								}
							}
						}
					} else {
						System.out.println("Digite o codigo do produto: ");
						codigo = leia.nextInt();
						d1.buscarProduto(codigo);
						for (Produto elemento : d1.getListaProdutos()) {
							if (elemento.getCodigo() == codigo) {
								System.out.println("Digite 1 para adicionar ou 2 para remover: ");
								numero = leia.nextInt();
								if (numero == 1) {
									System.out.println("Digite a quantidade para adicionar: ");
									quantidade = leia.nextInt();
									elemento.colocarEmEstoque(quantidade);
									break;
								} else {
									System.out.println("Digite a quantidade para remover: ");
									quantidade = leia.nextInt();
									elemento.retirarDoEstoque(quantidade);
									break;
								}
							}
						}
						for (Produto elemento : d2.getListaProdutosPereciveis()) {
							if (elemento.getCodigo() == codigo) {
								System.out.println("Digite 1 para adicionar ou 2 para remover. :");
								numero = leia.nextInt();
								if (numero == 1) {
									System.out.println("Digite a quantidade para adicionar: ");
									quantidade = leia.nextInt();
									elemento.colocarEmEstoque(quantidade);
									break;
								} else {
									System.out.println("Digite a quantidade para remover: ");
									quantidade = leia.nextInt();
									elemento.retirarDoEstoque(quantidade);
									break;
								}
							}
						}
						break;
					}
				case 2:
					System.out.println("Digite como deseja atualizar o estoque" + "10 Nome" + "20 Codigo: ");
					numero = leia.nextInt();
					if (numero == 10) {
						System.out.println("Digite o nome do produto: ");
						nome = leia.next();
						d2.buscarProduto(nome);
						for (Produto elemento : d2.getListaProdutos()) {
							if (elemento.getNome().equalsIgnoreCase(nome)) {
								System.out.println("Digite 1 para adicionar ou 2 para remover: ");
								numero = leia.nextInt();
								if (numero == 1) {
									System.out.println("Digite a quantidade para adicionar: ");
									quantidade = leia.nextInt();
									elemento.colocarEmEstoque(quantidade);
									break;
								} else {
									System.out.println("Digite a quantidade para remover: ");
									quantidade = leia.nextInt();
									elemento.retirarDoEstoque(quantidade);
									break;
								}
							}
						}
						for (Produto elemento : d2.getListaProdutosPereciveis()) {
							if (elemento.getNome().equalsIgnoreCase(nome)) {
								System.out.println("Digite 1 para adicionar ou 2 para remover: ");
								numero = leia.nextInt();
								if (numero == 1) {
									System.out.println("Digite a quantidade para adicionar: ");
									quantidade = leia.nextInt();
									elemento.colocarEmEstoque(quantidade);
									break;
								} else {
									System.out.println("Digite a quantidade para remover: ");
									quantidade = leia.nextInt();
									elemento.retirarDoEstoque(quantidade);
									break;
								}
							}
						}
					} else {
						System.out.println("Digite o codigo do produto: ");
						codigo = leia.nextInt();
						d2.buscarProduto(codigo);
						for (Produto elemento : d2.getListaProdutos()) {
							if (elemento.getCodigo() == codigo) {
								System.out.println("Digite 1 para adicionar ou 2 para remover: ");
								numero = leia.nextInt();
								if (numero == 1) {
									System.out.println("Digite a quantidade para adicionar: ");
									quantidade = leia.nextInt();
									elemento.colocarEmEstoque(quantidade);
									break;
								} else {
									System.out.println("Digite a quantidade para remover: ");
									quantidade = leia.nextInt();
									elemento.retirarDoEstoque(quantidade);
									break;
								}
							}
						}
						for (Produto elemento : d2.getListaProdutosPereciveis()) {
							if (elemento.getCodigo() == codigo) {
								System.out.println("Digite 1 para adicionar ou 2 para remover: ");
								numero = leia.nextInt();
								if (numero == 1) {
									System.out.println("Digite a quantidade para adicionar: ");
									quantidade = leia.nextInt();
									elemento.colocarEmEstoque(quantidade);
									break;
								} else {
									System.out.println("Digite a quantidade para remover: ");
									quantidade = leia.nextInt();
									elemento.retirarDoEstoque(quantidade);
									break;
								}
							}
						}
						break;
					}
				}
			}
		} while (opcao != 4);
	}
}
