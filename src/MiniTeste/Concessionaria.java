package MiniTeste;

public class Concessionaria extends Conta {

	String identificador;

	public Concessionaria() {
		super();
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	@Override
	public double getValorAPagar() {
		return this.valor;
	}

	@Override
	public String toString() {
		return "Concessionaria [identificador=" + identificador + ", situação=" + this.status + ", valor= "
				+ ControlePagamento.df.format(this.getValorAPagar());
	}

}
