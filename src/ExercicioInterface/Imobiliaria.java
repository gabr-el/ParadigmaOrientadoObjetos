package ExercicioInterface;

public class Imobiliaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Loja l = new Loja(50, 500.00, 70.000);
		l.setVendas(60.000);
		l.printDados();

		Apartamento p = new Apartamento(40, 1.200, 4);
		p.setNumeroQuartos(45);
		p.printDados();

		Escritorio e = new Escritorio(30, 1.500, 2, 30.000);
		e.getDados();
		e.printDados();

	}

}
