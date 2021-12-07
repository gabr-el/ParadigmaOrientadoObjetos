package MiniTeste;

import java.util.Calendar;

public class Titulo extends Conta {

	String identificador;

	public Titulo() {
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

		int hoje = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		int mesAtual = Calendar.getInstance().get(Calendar.MONTH) + 1;
		if ((mes < mesAtual) && (status.equalsIgnoreCase("PAGAR"))) {
			return 1.1 * (this.valor);
		} else {
			if ((mes == mesAtual && dia < hoje) && (status.equalsIgnoreCase("PAGAR"))) {
				return 1.1 * (this.valor);
			} else {
				return this.valor;
			}
		}
	}

	@Override
	public String toString() {
		return "Titulo [identificador=" + identificador + ", situação=" + this.status + ", valor="
				+ ControlePagamento.df.format(this.getValorAPagar());
	}

}
