package ExercicioHeranca;

public class Peixe extends Animal {
	private String caracteristica;

	public Peixe(String nome, float comprimento, int patas, String cor, String ambiente, float velocidade,
			String caracteristica) {
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.caracteristica = caracteristica;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public void dadosPeixe() {
		super.dados();
		System.out.println("caracteristica = " + caracteristica);
	}

}
