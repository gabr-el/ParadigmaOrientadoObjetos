package ExercicioHeranca;

public class TestarAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mamifero camelo = new Mamifero("camelo", 150, 4, "amarelo", "terra", (float)2.0, "folhas");
		Peixe tubarao = new Peixe("tubarão", 300, 0, "cinzento", "mar", (float)1.5, "barbatanas e cauda");
		Mamifero ursoCanada = new Mamifero("Urso-do-Canadá", 180, 4, "vermelho", "terra", (float)5.0, "mel");

		camelo.dadosMamifero();
		tubarao.dadosPeixe();
		ursoCanada.dadosMamifero();
	}

}
