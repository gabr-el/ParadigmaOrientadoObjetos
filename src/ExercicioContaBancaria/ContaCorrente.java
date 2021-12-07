package ExercicioContaBancaria;

public class ContaCorrente extends ContaBancaria {
	protected int quantidadeTransacoes;

	public ContaCorrente(String senha) {
		super(senha);
		this.quantidadeTransacoes = 0;
	}

	public int getQuantidadeTransacoes() {
		return quantidadeTransacoes;
	}

	public void setQuantidadeTransacoes(int quantidadeTransacoes) {
		this.quantidadeTransacoes = quantidadeTransacoes + 1;
	}

	public void deposita(double valor) {
		Transacoes t = new Transacoes("Deposito", valor);
		this.addTransacao(t);
		this.setQuantidadeTransacoes(quantidadeTransacoes);
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.getSaldo() >= (valor + 0.1)) {
			this.saldo -= (valor + 0.1);
			Transacoes t = new Transacoes("Saque", (valor + 0.1));
			this.addTransacao(t);
			this.setQuantidadeTransacoes(quantidadeTransacoes);
			return true;
		} else {
			System.out.println("Saque não realizado. Saldo insuficiente!");
		}
		return false;
	}

	public void tiraExtrato() {
		System.out.println("Realizadas: " + this.getQuantidadeTransacoes() + " transações.");
		for (Transacoes elemento : this.getListaTransacoes()) {
			System.out.println(elemento.toString());
		}
		System.out.printf("Saldo: R$ %.2f", this.getSaldo());
	}

	@Override
	public String toString() {
		return "ContaCorrente [ número=" + numero + ", saldo = " + saldo + "]";
	}

}
