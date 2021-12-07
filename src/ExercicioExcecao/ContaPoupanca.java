package ExercicioExcecao;

public class ContaPoupanca extends Conta {
	private double percRendimento;

	public ContaPoupanca(String agencia, int conta, double saldo, String senha) {
		super(agencia, conta, saldo, senha);
	}

	public double getPercRendimento() {
		return percRendimento;
	}

	public void setPercRendimento(double percRendimento) {
		this.percRendimento = percRendimento;
	}

	public void calcularRendimento() {
		double aux = super.getSaldo() * this.percRendimento;
		super.setSaldo(super.getSaldo() + aux);
	}
}
