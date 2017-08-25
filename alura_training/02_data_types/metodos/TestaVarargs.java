package metodos;

/*
	About varargs

	1: we can pass an array as parameter as well.
	2: it must be the last argument from a method.
*/

public class TestaVarargs {
	public static void main(String[] args) {
		
		int total = 0;
		total = somar(10, 20, 100);
		System.out.println(total);

		int[] values = new int[]{1, 20, 45, 77};
		total = somar(values);
		System.out.println(total);
	}

	private static int somar(int... valores) {
		int soma = 0;

		for(int i = 0; i < valores.length; i++) {
			soma += valores[i];
		}

		return soma;
	}
}