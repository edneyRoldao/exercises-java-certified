/* What is the difference between StringBuffer and StringBuilder ?
		StringBuilder is synchronized then, it can be accessed by just one thread at a time.
		StringBuffer can be accessed by many threads at the same time.

		*** the methods substring and subSequence from StringBuilder and Buffer works 
			like java.lang.String 'it is immutable' ***
*/
public class StringBuilderTeste {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();

		// it allow char as parameter
		sb.append('x');

		// It allow any onject as parameter
		sb.append(new StringBuilderTeste());

		StringBuilder sb2 = new StringBuilder();
		sb2.append("vou inserir um valor dentro dessas aspas: \"\" com o metodo insert");
		sb2.insert(43, "novo texto");
		System.out.println(sb2.toString());

		// we can delete values by passing a range as parameter on method delete
		sb2.delete(0, 4); // vou 

		// two ways to retrieve a value
		String v = sb2.toString();
		System.out.println(v);
		System.out.println(sb2);
		sb2.reverse();
		System.out.println(sb2);
		System.out.println( isPalindromo("ava") );		
	}

	public static boolean isPalindromo(String text) {
		return new StringBuilder(text).reverse().toString().equals(text);
	}

}