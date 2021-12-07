package ExercicioContaBancaria;

public class ContaPoupanca extends ContaBancaria {
	private float taxa;

	public ContaPoupanca(String senha, float taxa) {
		super(senha);
		this.taxa = taxa;
	}

	public boolean saca(double valor) {
		if (this.getSaldo() >= valor) {
			this.saldo -= valor;
			Transacoes t = new Transacoes("Saque", valor);
			this.addTransacao(t);
			return true;
		} else {
			System.out.println("Saque não realizado. Saldo insuficiente!");
			return false;
		}
	}

	public void tiraExtrato() {
		for (Transacoes elemento : this.getListaTransacoes()) {
			System.out.println(elemento.toString());
		}
		System.out.printf("Saldo: R$ %.2f\n", this.getSaldo());
		System.out.printf("Rendimento: R$ %.2f", (this.taxa * this.getSaldo() / 100));
	}
	
	
}
