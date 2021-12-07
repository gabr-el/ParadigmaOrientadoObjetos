package ExcecaoExtra;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = { 4, 6, 16, 32, 64, 128 };
		int[] demon = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + demon + "-" + (numeros[i] / demon[i]));
			} catch (ArithmeticException exception) {
				System.out.println("erro ao dividir por zero");
			} catch (ArrayIndexOutOfBoundsException exception) {
				System.out.println("erro ao localizar um índice inexistente");
			} catch (Throwable exception) {
				System.out.println("ocorreu algum erro");
			} finally {
				System.out.println("essa linha é sempre impressa após a linha do try ou catch");
			}
		}

	}

}
