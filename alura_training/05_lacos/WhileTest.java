public class WhileTest {
	public static void main(String[] args) {
		
		/* Teste 01 - não compila */
		int i = 0;
		while(true) {
			System.out.println("test");
		}

		// unreachable statement
		i++; // a JVM sabe que esse codigo nunca será executado, 
			 // pois temos um laço infinito portanto ocorre erro.


		/* Quando passamos um boolean com final temos o mesmo comportamento acima */
		final boolean test = true;
		while(test) {
			// erro de compilação, a JVM sabe que nunca vai sair do loop
		}

		// unreachable statement
		i++; // a JVM sabe que esse codigo nunca será executado, 
			 // pois temos um laço infinito portanto ocorre erro.


		/* quando possamos false de forma literal também não compila, a JVM sabe 
		   que nunca vai entrar no loop */
	   while(false) {
	   	// erro de compilação
	   }

	   final boolean c = false;
	   while(c) // erro de compilação

	}
}