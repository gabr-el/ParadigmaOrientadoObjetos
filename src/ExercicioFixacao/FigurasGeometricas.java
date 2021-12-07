package ExercicioFixacao;

public class FigurasGeometricas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ponto p = new Ponto(5, 10, "rosa");
		p.setCor("azul");
		p.imprimirDados();

		Circunferencia c = new Circunferencia(p, 3.14, "branca", "preto");
		c.area();
		c.perimetro();
		c.imprimirDados();

	}

}
