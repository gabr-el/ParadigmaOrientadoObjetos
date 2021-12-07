package MiniTeste;

import java.util.Scanner;

public class Assalariado extends Empregado {
	protected int horasTrabalhadas;

	public Assalariado() {
		super();
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public double getValorAPagar() {
		if (this.horasTrabalhadas <= 160) {
			return ControlePagamento.SALARIO;
		} else {
			int extra = horasTrabalhadas - 160;
			return (extra * ControlePagamento.HORA + ControlePagamento.SALARIO);
		}
	}

}
