package Avaliacao2B;

import java.util.Calendar;
import java.util.Scanner;

public class Estabelecimento {
	public String nomeEstabelecimento;
	public String endereco;
	public Nutricionista[] listaNutris = new Nutricionista[4];
	public Consulta[] listaConsultas = new Consulta[10];

	public static int cont = 1;

	public Estabelecimento(String pNomeEstabelecimento, String pEndereco) {
		nomeEstabelecimento = pNomeEstabelecimento;
		endereco = pEndereco;
	}

	public Nutricionista buscarNutri(int pCrn) {
		for (int i = 0; i < listaNutris.length; i++) {
			if (listaNutris[i] != null) {
				if (listaNutris[i].crn == pCrn) {
					return listaNutris[i];
				}
			}
		}
		return null;
	}

	public void contratarNutri(Nutricionista pNutri) {
		Nutricionista n = new Nutricionista(0, "", 0);
		n = buscarNutri(pNutri.crn);
		if (n != null) {
			System.out.println(pNutri.nome + " já está cadastrado na clínica");
		} else {
			for (int i = 0; i < listaNutris.length; i++) {
				if (listaNutris[i] == null) {
					listaNutris[i] = pNutri;
					System.out.println("Nutricionista cadastrado com sucesso!");
					break;
				}
			}
		}

	}

	public int marcarConsulta(Nutricionista pNutri) {
		int codConsulta = Calendar.getInstance().get(Calendar.YEAR) + cont;
		for (int i = 0; i < listaConsultas.length; i++) {
			if (listaConsultas[i] == null) {
				Consulta c = new Consulta(codConsulta, pNutri);
				listaConsultas[i] = c;
				break;
			}
		}
		return codConsulta;
	}

	public double pagarConsulta(int pCodConsulta) {
		Scanner dados = new Scanner(System.in);
		for (int i = 0; i < listaConsultas.length; i++) {
			if ((listaConsultas[i] != null) && (listaConsultas[i].codConsulta == pCodConsulta)) {
				System.out.println("Qual o tempo de consulta (em minutos)?");
				return listaConsultas[i].nutriResponsavel.calcularValorConsulta(dados.nextInt());
			}
		}
		System.out.println("A consulta não foi encontrada.");
		return 0;
	}
}
