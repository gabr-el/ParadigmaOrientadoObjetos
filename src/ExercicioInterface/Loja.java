package ExercicioInterface;

public class Loja extends Construcao implements iComissao {

	private double sales;

	public Loja(double area, double precoArea, double sales) {
		super(area, precoArea);
		this.sales = sales;
	}

	public String getDados() {
		return super.getDados() + "S: " + this.sales;
	}

	public void printDados() {
		System.out.println("S: " + this.sales);
		super.printDados();
	}

	@Override
	public void setVendas(double sales) {
		this.sales = sales;
	}

	@Override
	public double getPrecoTotal() {
		return (getArea() * getPrecoArea()) + ((getArea() * getPrecoArea()) * comissao);
	}
}
