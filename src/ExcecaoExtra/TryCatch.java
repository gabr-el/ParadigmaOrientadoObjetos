package ExcecaoExtra;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			int[] vetor = new int[4];

			System.out.println("antes da exception");

			vetor[4] = 1;

			System.out.println("esse texto não será impresso");

		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("exceção ao acessar um índice do vetor que não existe");
		}

		System.out.println("esse texto será impresso após a exceção");

	}

}
