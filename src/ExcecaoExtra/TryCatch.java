package ExcecaoExtra;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			int[] vetor = new int[4];

			System.out.println("antes da exception");

			vetor[4] = 1;

			System.out.println("esse texto n�o ser� impresso");

		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("exce��o ao acessar um �ndice do vetor que n�o existe");
		}

		System.out.println("esse texto ser� impresso ap�s a exce��o");

	}

}
