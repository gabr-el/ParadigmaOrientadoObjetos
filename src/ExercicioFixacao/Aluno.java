package ExercicioFixacao;

import java.util.Calendar;

public class Aluno {

	private String matricula;
	private String nome;
	private String cpf;
	private String email;
	private Curso[] cursos = new Curso[3];

	private static int cont = 1;

	public Aluno(String nome, String cpf) {
		int ano = Calendar.getInstance().get(Calendar.YEAR);
		this.matricula = String.valueOf(ano) + String.valueOf(cont);
		this.cont++;
		this.nome = nome;
		this.cpf = cpf;
	}

	public Aluno(String nome, String cpf, String email) {
		this(nome, cpf);
		this.email = email;
	}

	public Aluno(String nome, String cpf, String email, Curso[] cursos) {
		this(nome, cpf, email);
		this.cursos = cursos;
	}

	public boolean matricular(Curso curso) {
		boolean flag = false;
		for (int i = 0; i < cursos.length; i++) {
			if (cursos[i] == null) {
				cursos[i] = curso;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEMail() {
		return email;
	}

	public void setEmail() {
		this.email = email;
	}

	public Curso[] getCursos() {
		return cursos;
	}

	public void setCursos(Curso[] cursos) {
		this.cursos = cursos;
	}

	public void imprimirDados() {
		System.out.println("\nmatricula = " + matricula + "\nnome = " + nome + "\ncpf = " + cpf + "\nemail = " + email);
		for (int i = 0; i < cursos.length; i++) {
			if (cursos[i] != null) {
				System.out.println(cursos[i].getNome());
			}
		}
	}
}