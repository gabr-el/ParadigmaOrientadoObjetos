package ExercicioInterface;

public class Apartamento extends Construcao {

	protected int numeroQuartos;

	public Apartamento() {
		super();
	}

	public Apartamento(double area, double precoArea, int numeroQuartos) {
		super(area, precoArea);
		this.numeroQuartos = numeroQuartos;
	}

	public int getNumeroQuartos() {
		return numeroQuartos;
	}

	public void setNumeroQuartos(int numeroQuartos) {
		this.numeroQuartos = numeroQuartos;
	}

	public String getDados() {
		return "Número de Quartos: " + getNumeroQuartos() + super.getDados();
	}

	@Override
	public double getPrecoTotal() {
		return (super.getArea() * super.getPrecoArea()) * getNumeroQuartos();
	}

	public void printDados() {
		System.out.println("Nùmero de Quartos: " + getNumeroQuartos());
		super.printDados();
	}

}
