package ExercicioContaBancaria;

public class Transacoes {
	private String tipoTransacao;
	private double valorTransacao;

	public Transacoes(String tipoTransacao, double valorTransacao) {
		this.tipoTransacao = tipoTransacao;
		this.valorTransacao = valorTransacao;
	}

	public String getTipoTransacao() {
		return tipoTransacao;
	}

	public void setTipoTransacao(String tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}

	public double getValorTransacao() {
		return valorTransacao;
	}

	public void setValorTransacao(double valorTransacao) {
		this.valorTransacao = valorTransacao;
	}

	@Override
	public String toString() {
		return "Transacoes [tipoTransacao=" + tipoTransacao + ", valorTransacao=" + valorTransacao + "]";
	}

}
