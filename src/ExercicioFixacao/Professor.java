package ExercicioFixacao;

public class Professor {

	private String matricula;
	private String nome;
	private String cpf;
	private String admissao;
	private String email;
	private Curso lotacao;

	public Professor(String matricula, String nome, String cpf, String admissao) {
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
		this.admissao = admissao;
	}

	public Professor(String matricula, String nome, String cpf, String admissao, String email, Curso lotacao) {
		this(matricula, nome, cpf, admissao);
		this.email = email;
		this.lotacao = lotacao;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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

	public String getAdmissao() {
		return admissao;
	}

	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Curso getLotacao() {
		return lotacao;
	}

	public void setLotacao(Curso lotacao) {
		this.lotacao = lotacao;
	}

	public void imprimirDados() {
		System.out.println("Professor = [ matricula : " + matricula + ", nome : " + nome + ", cpf : " + cpf
				+ ", admissao : " + admissao + ", email" + email + ", lotacao : " + lotacao.getNome() + "]");
	}
	
	
}
