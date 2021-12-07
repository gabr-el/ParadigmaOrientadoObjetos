package ExercicioMuseu;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Museu m=new Museu("Museu da gente Sergipana", "Aracaju", "1111-1111");
		Scanner dados=new Scanner(System.in);
		int opcao;
		String nome;
		do {
			System.out.println("Menu de opção:\n1.Cadastrar Obra\n2.Listar obras de um determinado artista"
					+ "\n3.Listar informações\n4.Sair do programa \n Opção: ");
			opcao=dados.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do artista: ");
				nome=dados.next();
				//buscar o artista se já está cadastrado
				Artista b=m.buscarArtista(nome);
				if (b==null) {//se não estiver cadastrado, vamos criar ele e cadastrar ele e a obra
					System.out.println("Digite a nacionalidade do artista: ");
					Artista a=new Artista(nome,dados.next());
					System.out.println("Código: "+m.cadastrarObra(a));
				}
				else {//se já estiver cadastrado, apenas chamo o cadastro da obra
					System.out.println("Código: "+m.cadastrarObra(b));
				}
				break;
			case 2:
				System.out.println("Digite o nome do artista: ");
				nome=dados.next();
				//buscar o artista se já está cadastrado
				Artista c=m.buscarArtista(nome);
				if(c==null)//caso retorne null é pq não está cadstrado
					System.out.println("Artista não cadastrado!");
				else {//caso esteja cadastrado vou acessar a Lista de Obras do Artista
					for(Obra elemento: c.getListaDeObras()) { //usei um for each para acesso rápido
						elemento.imprimir();
						}
				}
				break;
			case 3:
				//um for each imprimindo os artistas do museu m
				for(Artista elemento:m.getListaArtistas()) {
					elemento.imprimir();
				}
				break;
			case 4:
				System.out.println("Sistema Finalizado!");
				break;
			}
		}while(opcao!=4);
dados.close();
	}
}