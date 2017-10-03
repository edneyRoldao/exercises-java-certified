class Customer {
	String name;
	String lastName;

	public String toString() {
		return "O StringBuilder chama o toString do objeto";
	}
}

/* StringBuilder testes */
class TestesComStringBuilder {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();

		// podemos passar qualquer objeto no metodo append 
		// que ele vai chamar o toString e appendar o valor.
		sb.append(new Customer());

		// o metodo append aceita char
		sb.append('o');

		// podemos passar um array de char no append
		char[] p = {'j', 'a', 'v', 'a', 'n', 'o', 'v', 'o'};
		sb.append(p);

		// método mutável
		// remove a partir do index zero até a posição anterior à 2, que no caso é 1
		sb.delete(0, 2);

		// método mutável
		// podemos inverter as palavras
		sb.reverse();

		sb.append(new char[]{'j', 'a', 'v', 'a', 'n', 'o', 'v', 'o'});

		//`Podemos adicionar valores a partir de uma posicao
		sb.insert(10, " adicionado na posicao 10 ");

		System.out.println();
		System.out.println(sb);
		System.out.println( isPalindromo2("java") );
		System.out.println( isPalindromo("aba") );

		StringBuilder sb2 = new StringBuilder("    teste o trim     ");
		sb2.toString().trim();
		System.out.println( sb2.toString().trim() );

	}

	public static boolean isPalindromo(String value) {
		return new StringBuilder(value).reverse().toString().equals(value);
	}

	public static boolean isPalindromo2(String value) {
		char[] invertida = new char[value.length()];
		int index = value.length() - 1;

		for(int i = 0; i <= index; i++)
			invertida[i] = value.charAt(index - i);

		return new String(invertida).equals(value);
	}
}