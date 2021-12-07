package ExcecaoExtra;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = { 4, 6, 16, 32, 64, 128 };
		int[] demon = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + demon + "-" + (numeros[i] / demon[i]));
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
				System.out.println("erro da mesma familia");
			} catch (Throwable e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

		}

	}

}
