package ExercicioFixacao;

public class Curso {
	private String codigo;
	private String nome;
	private String descricao;
	private Professor coordenador;
	private Professor[] docentes = new Professor[3];

	private static int cont = 1;

	public Curso(String nome, String descricao) {
		this.codigo = String.valueOf(cont);
		cont++;
		this.nome = nome;
		this.descricao = descricao;
	}

	public Curso(String nome, String descricao, Professor coordenador) {
		this(nome, descricao);
		this.coordenador = coordenador;
	}

	public Curso(String nome, String descricao, Professor coordenador, Professor[] docentes) {
		this(nome, descricao, coordenador);
		this.docentes = docentes;
	}

	/*
	 * public void definirCoordenador(Professor coordenador) { this.coordenador =
	 * coordenador; }
	 */

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Professor getCoordenador() {
		return coordenador;
	}
	
	public void setCoordenador(Professor coordenador) {
		this.coordenador = coordenador;
	}
	
	public Professor[] getDocentes() {
		return docentes;
	}

	public boolean addDocentes(Professor professor) {
		boolean flag = false;
		for (int i = 0; i < docentes.length; i++) {
			if (docentes[i] == null) {
				docentes[i] = professor;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public void setDocentes(Professor[] docentes) {
		this.docentes = docentes;
	}

	public void imprimirDados() {
		System.out.println("Curso = [ codigo" + codigo + ", nome : " + nome + ", descricao : " + descricao
				+ ", coordenador : " + coordenador.getNome() + ", docentes : ");
		for (int i = 0; i < docentes.length; i++) {
			if (docentes[i] != null) {
				System.out.println(docentes[i].getNome());
			} else
				break;
		}
	}
}
