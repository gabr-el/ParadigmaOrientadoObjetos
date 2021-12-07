package ExercicioMuseu;

public class Obra {
	private int codigo;
	private int anoAquisicao;
	private String titulo;
	private String tecnica;
	private Artista autor;
	
	//Criei esse apenas para facilitar uma solu��o em Museu, no m�todo cadastrarObra
	public Obra() {
	}
	public Obra(int codigo, int anoAquisicao, String titulo, String tecnica,
			Artista autor) {
		super();
		this.codigo = codigo;//percebam que o c�digo � passado no construtor, 
							//ele � gerado automatico no m�todo que cadastra as obras
		this.anoAquisicao = anoAquisicao;
		this.titulo = titulo;
		this.tecnica = tecnica;
		this.autor = autor;
	}
	//m�todos acessadores e modificadores
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAnoAquisicao() {
		return anoAquisicao;
	}

	public void setAnoAquisicao(int anoAquisicao) {
		this.anoAquisicao = anoAquisicao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public Artista getAutor() {
		return autor;
	}

	public void setAutor(Artista autor) {
		this.autor = autor;
	}

	public void imprimir() {
		System.out.println("C�digo: "+ codigo+ "\nAno de Aquisicao: "+ anoAquisicao+
				"\nTitulo: "+ titulo+"\nTecnica: "+tecnica);
	}
}