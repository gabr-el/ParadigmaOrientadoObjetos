package ExercicioFixacao;

public class Ponto {

	private double x;
	private double y;
	private String cor;

	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Ponto(double x, double y, String cor) {
		this(x, y);
		this.cor = cor;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	// public void alterarCor(String cor) {
	// this.cor = cor;
	// }

	public void imprimirDados() {
		System.out.println("Ponto = [ x :" + x + ", y : " + y + ", cor : " + cor + "]");
	}

}
