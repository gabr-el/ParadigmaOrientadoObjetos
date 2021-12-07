package ExercicioFixacao;

public class Circunferencia {

	private Ponto centro;
	private double raio;
	private String corDaLinha;
	private String corDoPreenchimento;

	public Circunferencia(Ponto centro, double raio) {
		this.centro = centro;
		this.raio = raio;
	}

	public Circunferencia(Ponto centro, double raio, String corDaLinha) {
		this(centro, raio);
		this.corDaLinha = corDaLinha;
	}

	public Circunferencia(Ponto centro, double raio, String corDaLinha, String corDoPreenchimento) {
		this(centro, raio, corDaLinha);
		this.corDoPreenchimento = corDoPreenchimento;
	}

	public Ponto getCentro() {
		return centro;
	}

	public double getRaio() {
		return raio;
	}

	public String getCorDaLinha() {
		return corDaLinha;
	}

	public String getCorDoPreenchimento() {
		return corDoPreenchimento;
	}

	public void setCentro(Ponto centro) {
		this.centro = centro;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public void setCorDaLinha() {
		this.corDaLinha = corDaLinha;
	}

	public void setCorDoPreenchimento() {
		this.corDoPreenchimento = corDoPreenchimento;
	}

	public double area() {
		return Math.PI * raio * 2;
	}

	public double perimetro() {
		return 2 * Math.PI * raio;
	}

	public void imprimirDados() {
		System.out.println("Circunferência = [ Centro X : " + centro.getX() + ",Centro Y : " + centro.getY()
				+ ", Cor do centro " + centro.getCor() + ", Raio : " + raio + ", Cor da Linha : " + corDaLinha
				+ ", Cor do Preenchimento : " + corDoPreenchimento + "]");
	}

}
