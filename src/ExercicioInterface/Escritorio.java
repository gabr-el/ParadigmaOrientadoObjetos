package ExercicioInterface;

public class Escritorio extends Apartamento implements iComissao {
	private double sales;

	public Escritorio(double area, double precoArea, int numeroQuartos, double sales) {
		super(area, precoArea, numeroQuartos);
		this.sales = sales;
	}

	@Override
	public void setVendas(double sales) {
		this.sales = sales;
	}

	public double getPrecoTotal() {
		return super.getPrecoTotal() * ((getArea() * getPrecoArea()) * comissao);
	}

	public String getDados() {
		return "Sales: " + this.sales + super.getDados();
	}

	public void printDados() {
		System.out.println("Sales: " + this.sales);
		super.printDados();
	}
}
