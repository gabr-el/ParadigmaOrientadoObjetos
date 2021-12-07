package MiniTeste;

public class AssalariadoComissionado extends Comissionado {

	public AssalariadoComissionado() {
		super();
	}

	public double getValorAPagar() {
		return ControlePagamento.SALARIO + (vendas * 0.06);
	}

}
