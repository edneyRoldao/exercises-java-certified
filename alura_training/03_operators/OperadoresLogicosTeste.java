public class OperadoresLogicosTeste {
	public static void main(String[] args) {
		
		// OU EXCLUSIVO (será true se o resultado da expressao dos lados forem diferentes)
		System.out.println(1 == 1 ^ 1 > 2); // true   - (um lado é true e outro é false)
		System.out.println(1 == 1 ^ 3 > 2); // false  - (os dois lados são true)
		System.out.println(1 != 1 ^ 3 < 2); // false  - (os dois lados são false)

		// Sobre & e | 
		System.out.println(20 != 20 & 10 == 10); // apesar da primeira expressao ja ser evaluada para false,
												 // a segunda expressao tambem será verificado

		System.out.println(20 == 20 | 10 != 10); // mesmo caso acima, apesar da primeira expressao ser true,
												 // a segunda expressao tambem será verificado


		// Sobre && e ||  (short circuit) 
		System.out.println(20 != 20 && 10 == 10); // como temos um false logo na primeira expressao,
												 // a segunda expressao NÃO é verificada

		System.out.println(20 == 20 || 10 != 10); // como temos um true logo na primeira expressao,
												 // a segunda expressao NÃO é verificada


		/*-----------   pegadinha do short circuit  ----------------*/

		// se a resultado da segunda expressao for obtido a partir de um método que executa
		// diversas operações, pode acontecer do método não ser chamada. Veja:

		System.out.println(20 == 20 || chamaMetodo("primeira")); // como temos um true logo na primeira expressao,
													   // o metodo não é invocado.

		System.out.println(20 != 20 && chamaMetodo("segunda")); // como temos um false logo na primeira expressao,
												      // o metodo não é invocado.

		System.out.println(20 == 20 && chamaMetodo("terceira")); // aqui o metodo é chamado
		System.out.println(20 != 20 || chamaMetodo("quarta")); // aqui o metodo é chamado
	}

	private static boolean chamaMetodo(String metodo) {
		System.out.println("chamando a " + metodo + " vez");
		return true;
	}

}