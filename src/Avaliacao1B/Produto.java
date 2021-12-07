package Avaliacao1B;

import java.util.Random;

public class Produto {
	protected int codigo = 0;
	protected String nome;
	protected String marca;
	protected int quantidade;
	protected float precoUnitario;

	private static int cont = 0;

	public Produto() {
	}

	public Produto(String nome, String marca, int quantidade, float precoUnitario) {
		cont++;
		this.codigo += cont;
		this.nome = nome;
		this.marca = marca;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getMarca() {
		return marca;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public float getPrecoUnitario() {
		return precoUnitario;
	}

	public int retirarDoEstoque(int quantidade) {
		int aux;
		if (quantidade <= this.getQuantidade()) {
			this.quantidade = this.getQuantidade() - quantidade;
			return quantidade;
		} else {
			aux = this.getQuantidade();
			this.quantidade = 0;
			return aux;
		}
	}

	public void colocarEmEstoque(int quantidade) {
		this.quantidade = this.getQuantidade() + quantidade;
		System.out.println("Estoque atualizado. Quantidade atual: " + this.getQuantidade());
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", marca=" + marca + ", quantidadeEstoque=" + quantidade
				+ ", precoUnitario=" + precoUnitario + "";
	}

}