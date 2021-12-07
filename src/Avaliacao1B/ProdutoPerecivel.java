package Avaliacao1B;

import java.util.Scanner;

public class ProdutoPerecivel extends Produto {
	private int dataValidade;

	public ProdutoPerecivel() {
	}

	public ProdutoPerecivel(String nome, String marca, int quantidade, float precoUnitario, int data) {
		super(nome, marca, quantidade, precoUnitario);
		this.dataValidade = data;
	}

	public int getDataValidade() {
		return dataValidade;
	}

	public int retirarDoEstoque(int quantidade) {
		Scanner dados = new Scanner(System.in);
		System.out.println("Digite a data de  hoje: (DDMMAAAA)");
		int data = dados.nextInt();
		dados.close();
		if (this.getDataValidade() >= data) {
			System.out.println("Produtos vencidos. Estoque zerado!");
			this.quantidade = 0;
			return 0;
		}
		return super.retirarDoEstoque(quantidade);
	}

	public void colocarEmEstoque(int quantidade) {
		if (this.quantidade == 0) {
			super.colocarEmEstoque(quantidade);
		} else {
			System.out.println("Ainda existem produtos com outra validade.");
		}
	}

	@Override
	public String toString() {
		super.toString();
		return "ProdutoPerecivel [validade=" + dataValidade + "]";
	}

}