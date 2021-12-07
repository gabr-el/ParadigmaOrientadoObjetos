package ArrayList;

import java.util.ArrayList;

public class ArrayAprimorado {

	public static void main(String[] args) {
		// Instanciando um ArrayList
		ArrayList<String> nomes = new ArrayList<String>();

		// Adicionando valores ao ArrayList
		nomes.add("Gabriel");

		// Mostrando o conteudo no ArrayList
		System.out.println(nomes.toString());

		// Removendo o valor pela posição do objeto no ArrayList
		nomes.remove(0);

		// Removendo o valor pelo nome do objeto no ArrayList
		nomes.remove("Gabriel");
		System.out.println(nomes.toString());

		// Apagando todos os valores nas posições do ArrayList
		nomes.clear();

		// Mostrando o valor na posição indicada no ArrayList
		System.out.println(nomes.get(1));

		// Mostrando se o ArrayList está vazio
		System.out.println(nomes.isEmpty());

		// Mostrando se o ArrayList contém o objeto informado
		System.out.println(nomes.contains("Gabriel"));

		// Mostrando o tamanho do ArrayList
		System.out.println(nomes.size());

		// Mostrando a posição do objeto que estou passando por parametro
		System.out.println(nomes.indexOf("Gabriel"));

	}

}
