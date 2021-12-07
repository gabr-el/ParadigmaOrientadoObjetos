package ExercicioInterface;

public abstract class Construcao {
	private double area;
	private double precoArea;

	public Construcao() {

	}

	public Construcao(double area, double precoArea) {
		super();
		this.area = area;
		this.precoArea = precoArea;
	}

	public double getArea() {
		return area;
	}

	public double getPrecoArea() {
		return precoArea;
	}

	public String getDados() {
		return "Area: " + this.area + ", Preço da Area: " + this.precoArea;
	}

	public void printDados() {
		System.out.println(getDados() + ", Preço total: " + getPrecoTotal());
	}

	public abstract double getPrecoTotal();
}
