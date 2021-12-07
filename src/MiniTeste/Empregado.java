package MiniTeste;

import java.util.ArrayList;

public abstract class Empregado implements Pagavel {
	protected String nome;
	protected String sobrenome;
	protected int identidade;

	private static int cont = 0;

	public Empregado() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdentidade() {
		return identidade;
	}

	public void setIdentidade(int identidade) {
		this.identidade = identidade;
	}

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Empregado.cont = cont;
	}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", sobrenome=" + sobrenome + ", valor="
				+ ControlePagamento.df.format(this.getValorAPagar());
	}

}
