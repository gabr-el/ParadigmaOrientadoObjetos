package ExercicioMuseu;

import java.util.ArrayList;
import java.util.Scanner;

public class Museu {
	private String nome;
	private String endereco;
	private String telefone;
	private ArrayList<Obra> listaDeObras= new ArrayList<Obra>();
	private ArrayList<Artista> listaArtistas= new ArrayList<Artista>();
	
	private static int codigoObra=0;//usado para gerar o codigo da obra
	
	public Museu(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	//metodos acessadores e modificadores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public ArrayList<Obra> getListaDeObras() {
		return listaDeObras;
	}

	public ArrayList<Artista> getListaArtistas() {
		return listaArtistas;
	}
	//demais m�todos
	public Artista buscarArtista(String nome) {
		for(Artista elemento:listaArtistas) {//percorrendo o arrayList com a lista de artistas
			if(elemento!=null)//se houver artista naquele elemento
				if(elemento.getNome().equalsIgnoreCase(nome)) {//verifico se coincide o nome
				  return elemento;
				}
		}
		return null;//caso n�o ache o artista
	}
	
	public void cadastrarArtista(Artista a) {
		Artista b=buscarArtista(a.getNome()); //procuro o artista na base
		if (b!=null) {
			System.out.println("Artista j� cadastrado!");
		}
		else {//caso tenha retornado null, ou seja, n�o cadastrado
			listaArtistas.add(a);//adiciono no arrayList
		}
	}
	
	public int cadastrarObra(Artista a) {
		Scanner dados=new Scanner(System.in);
		Obra x=new Obra();
		//como especificado, antes de cadastrar a obra tenho que cadastrar o artista
		this.cadastrarArtista(a);
		System.out.println("Digite o t�tulo da Obra: ");
		x.setTitulo(dados.next());
		for(Obra elemento: this.listaDeObras) {//verificando nas obras do museu
			//se a obra ja foi cadastrada 
			//usei o artista e o titulo como par�metro de busca
			if((elemento.getAutor()==a)&&(elemento.getTitulo().equalsIgnoreCase(x.getTitulo()))) {
				System.out.println("Obra j� cadastrada no acervo!");
				return elemento.getCodigo();//retorno o c�digo se j� foi cadastrado
			}
		}
		//s� chegar� nesse ponto se n�o executar o if, por causa do return dentro do if
		codigoObra++;//gerando o codigo da obra
		x.setCodigo(codigoObra);
		//demais dados da obra
		System.out.println("Digite o ano de aquisicao: ");
		x.setAnoAquisicao(dados.nextInt());
		System.out.println("Digite a t�cnica utilizada: ");
		x.setTecnica(dados.next());
		x.setAutor(a);//sei que o artista a � o autor da obra
		a.addObras(x);//adiciono a obra na lista de obras do artista
		this.listaDeObras.add(x);//adiciono a obra na lista de obras do museu
		System.out.println("Obra cadastrada com sucesso!");
		return x.getCodigo();//retorno o c�digo da obra
		}
		
	}