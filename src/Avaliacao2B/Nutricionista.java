package Avaliacao2B;

public class Nutricionista {
	public int crn;
	public String nome;
	public double valorConsulta;

	public Nutricionista(int pCrn, String pNome, double pValorConsulta) {
		crn = pCrn;
		nome = pNome;
		valorConsulta = pValorConsulta;
	}

	public double calcularValorConsulta(int pTempo) {
		return pTempo * (valorConsulta) / 60;
	}

}
