package ExercicioContaBancaria;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class ContaBancaria {
	protected String senha;
	protected int numero = 0;
	protected double saldo = 0;
	protected ArrayList<Transacoes> listaTransacoes;

	private static int cont = 0;

	public ContaBancaria(String senha) {
		cont++;
		this.numero = cont;
		this.senha = senha;
		this.saldo = 0;
		listaTransacoes = new ArrayList<Transacoes>();
	}

	public String getSenha() {
		return senha;
	}

	public double getSaldo() {
		return saldo;
	}

	public void alterarSenha(String senha) {
		Scanner dados = new Scanner(System.in);
		System.out.println("Digite o número da conta e senha: ");
		boolean validado = this.validar(dados.nextInt(), dados.next());
		dados.close();
		if (validado) {
			this.senha = senha;
		} else {
			System.out.println("Senha não foi alterada.");
		}
	}

	public ArrayList<Transacoes> getListaTransacoes() {
		return listaTransacoes;
	}

	public void setListaTransacoes(ArrayList<Transacoes> listaTransacoes) {
		this.listaTransacoes = listaTransacoes;
	}

	public void addTransacao(Transacoes t) {
		this.listaTransacoes.add(t);
	}

	public boolean validar(int numero, String senha) {
		if (numero != this.numero) {
			System.out.println("Número da conta inválido.");
			return false;
		} else if (senha.equals(this.getSenha())) {
			return false;
		} else {
			System.out.println("Senha inválida!");
			return false;
		}
	}

	public void deposita(double valor) {
		Transacoes t = new Transacoes("Deposito", valor);
		this.addTransacao(t);
		this.saldo += valor;
	}

	public abstract boolean saca(double valor);

	public abstract void tiraExtrato();
}
