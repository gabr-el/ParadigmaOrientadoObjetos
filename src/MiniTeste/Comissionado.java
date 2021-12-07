package MiniTeste;

public class Comissionado extends Empregado {
	protected double vendas;

	public Comissionado() {
		super();
	}

	public double getVendas() {
		return vendas;
	}

	public void setVendas(double vendas) {
		this.vendas = vendas;
	}

	public double getValorAPagar() {
		return 0.06 * vendas;
	}

}
