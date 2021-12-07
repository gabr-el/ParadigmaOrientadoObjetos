package MiniTeste;

import java.util.Scanner;

public class Terceirizado extends Empregado {
	private int horasTrabalhadas;

	public Terceirizado() {
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
		return horasTrabalhadas * ControlePagamento.HORA;
	}

}
