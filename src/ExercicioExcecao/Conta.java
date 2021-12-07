package ExercicioExcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Conta implements Autenticavel {
	protected String agencia;
	protected int conta;
	protected double saldo;
	protected String senha;

	public Conta(String agencia, int conta, double saldo, String senha) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.senha = senha;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getSenha() {
		return senha;
	}

	public void depositar() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor para depositar:");
		double valor = 0;
		try {
			valor = entrada.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Tipo inválido.");
		} finally {
			this.setSaldo(this.getSaldo() + valor);
		}
		entrada.close();
	}

	public void sacar(double valor) throws Exception {
		double aux;
		System.out.println("Digite a senha:");
		Scanner entrada = new Scanner(System.in);
		String senha = entrada.next();
		if (this.autenticar(senha)) {
			if (this.getSaldo() < saldo) {
				throw new Exception("Saldo insuficiente");
			} else {
				this.setSaldo(this.getSaldo() - valor);
			}
		}
		entrada.close();
	}

	@Override
	public boolean autenticar(String senha) {
		if (this.getSenha().equals(senha)) {
			System.out.println("Usuário validado.");
			return true;
		} else {
			System.out.println("Senha inválida.");
			return false;
		}
	}

}
