package ExercicioMuseu;

import java.util.ArrayList;

public class Artista {
	//atributos
	private int registro;
	private String nome;
	private String nacionalidade;
	private ArrayList<Obra> listaDeObras= new ArrayList<Obra>();
	private static int cont=0;//usei para gerar o registro do artista
	
	//construtor
	public Artista(String nome, String nacionalidade) {
		super();
		cont++;
		this.registro=cont;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}
	//métodos modificadores e acessadores
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public ArrayList<Obra> getListaDeObras() {
		return listaDeObras;
	}
	
	//Desisti de usar pois temos o método addObras
	/*public void setListaDeObras(ArrayList<Obra> listaDeObras) {
		this.listaDeObras = listaDeObras;
	}*/
	
	//Demais métodos
	public void addObras(Obra x) {
		this.listaDeObras.add(x); //como usei arrayList basta o méto add para inserir o elemento no final do arrayList
	}
	//o código abaixo seria se utilizasse vetores
	/*public boolean addObras(Obra x) {
		for(int i=0; i<listaDeObras.length; i++) {
			if (listaDeObras[i]==null) {
				listaDeObras[i]=x;
				break;
			}
		}	
	}*/
	
	public void imprimir() {
		System.out.println("Registro: "+registro+"\nNome: "+nome+"\nNacionalidade: "+nacionalidade);
	}

}