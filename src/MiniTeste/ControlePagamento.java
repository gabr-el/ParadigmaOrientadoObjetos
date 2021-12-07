package MiniTeste;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ControlePagamento {

	public static final double SALARIO = 1100.00;
	public static final double HORA = 8.00;

	public ArrayList<Titulo> titulos = new ArrayList<Titulo>();
	public ArrayList<Concessionaria> concessionarias = new ArrayList<Concessionaria>();
	public ArrayList<Assalariado> assalariados = new ArrayList<Assalariado>();
	public ArrayList<Terceirizado> terceirizados = new ArrayList<Terceirizado>();
	public ArrayList<Comissionado> comissionados = new ArrayList<Comissionado>();
	public ArrayList<AssalariadoComissionado> assalariadosComissionados = new ArrayList<AssalariadoComissionado>();

	static DecimalFormat df = new DecimalFormat("######.00");
	private double total = 0;

	public ControlePagamento() {
		super();
	}

	public ArrayList<Titulo> getTitulos() {
		return titulos;
	}

	public void setTitulos(Titulo titulo) {
		this.titulos.add(titulo);
	}

	public ArrayList<Concessionaria> getConcessionarias() {
		return concessionarias;
	}

	public void setConcessionarias(Concessionaria concessionarias) {
		this.concessionarias.add(concessionarias);
	}

	public ArrayList<Assalariado> getAssalariados() {
		return assalariados;
	}

	public void setAssalariados(Assalariado assalariados) {
		this.assalariados.add(assalariados);
	}

	public ArrayList<Terceirizado> getTerceirizados() {
		return terceirizados;
	}

	public void setTerceirizados(Terceirizado terceirizados) {
		this.terceirizados.add(terceirizados);
	}

	public ArrayList<Comissionado> getComissionados() {
		return comissionados;
	}

	public void setComissionados(Comissionado comissionados) {
		this.comissionados.add(comissionados);
	}

	public ArrayList<AssalariadoComissionado> getAssalariadosComissionados() {
		return assalariadosComissionados;
	}

	public void setAssalariadosComissionados(AssalariadoComissionado assalariadosComissionados) {
		this.assalariadosComissionados.add(assalariadosComissionados);
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void imprimirContas(int mes) {
		if (this.getTitulos().isEmpty()) {
			for (Titulo t : this.getTitulos()) {
				if (t.mes == mes) {
					System.out.println(t.toString());
					total += t.getValorAPagar();
				}
			}
		}
		if (this.getConcessionarias().isEmpty()) {
			for (Concessionaria c : this.getConcessionarias()) {
				if (c.mes == mes) {
					System.out.println(c.toString());
					total += c.getValorAPagar();
				}
			}
		}
		System.out.println("Total no mês: R$ " + df.format(total));
	}

	public void imprimirEmpregados() {
		if (this.getAssalariados().isEmpty()) {
			for (Assalariado a : this.getAssalariados()) {
				System.out.println(a.toString());
				total += a.getValorAPagar();
			}
		}
		if (this.getAssalariadosComissionados().isEmpty()) {
			for (AssalariadoComissionado a : this.getAssalariadosComissionados()) {
				System.out.println(a.toString());
				total += a.getValorAPagar();
			}
		}
		if (this.getComissionados().isEmpty()) {
			for (Comissionado a : this.getComissionados()) {
				System.out.println(a.toString());
				total += a.getValorAPagar();
			}
		}
		if (this.getTerceirizados().isEmpty()) {
			for (Terceirizado a : this.getTerceirizados()) {
				System.out.println(a.toString());
				total += a.getValorAPagar();
			}
		}
		System.out.println("Total a pagar: R$ " + df.format(total));
	}

	public boolean pagarConta(String identificador) {
		for (Titulo t : this.getTitulos()) {
			if (t.getIdentificador().equalsIgnoreCase(identificador)) {
				t.setStatus("PAGO");
				return true;
			}
		}
		for (Concessionaria c : this.getConcessionarias()) {
			if (c.getIdentificador().equalsIgnoreCase(identificador)) {
				c.setStatus("PAGO");
				return true;
			}
		}
		return false;
	}

}
