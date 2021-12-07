package Avaliacao1B;

import java.util.ArrayList;

public class Distribuidora {
	protected String nome;
	protected int numero;
	protected ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	protected ArrayList<ProdutoPerecivel> listaProdutosPereciveis = new ArrayList<ProdutoPerecivel>();

	public Distribuidora(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public ArrayList<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public ArrayList<ProdutoPerecivel> getListaProdutosPereciveis() {
		return listaProdutosPereciveis;
	}

	public Produto buscarProduto(String nome) {
		for (Produto elemento : listaProdutos) {
			if (elemento.nome.equals(nome)) {
				return elemento;
			}
		}
		for (ProdutoPerecivel elemento : listaProdutosPereciveis) {
			if (elemento.nome.equals(nome)) {
				return elemento;
			}
		}
		return null;
	}

	public Produto buscarProduto(int codigo) {
		for (Produto elemento : listaProdutos) {
			if (elemento.codigo == codigo) {
				return elemento;
			}
		}
		for (ProdutoPerecivel elemento : listaProdutosPereciveis) {
			if (elemento.codigo == codigo) {
				return elemento;
			}
		}
		return null;
	}

	public void cadastrarProduto(Produto x) {
		listaProdutos.add(x);
	}
	
	public void cadastrarProdutoPerecivel(ProdutoPerecivel x) {
		listaProdutosPereciveis.add(x);
	}
}