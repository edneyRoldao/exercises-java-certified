public class BreakAndContinueTest {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			if(i == 5) continue;
			System.out.println(i + "test");
		}

		for(int i = 0; i < 10; i++) {
			if(i == 5) break;
			System.out.println(i + "test");
		}

		System.out.println();
		System.out.println("--------  TABOADA ---------");		
		imprimirTaboadaAte(5);
 
	}

	private static void imprimirTaboadaAte(int limite) {
		if(limite >= 1 && limite <= 9) {
			externo:for(int i = 1; i < 10; i++) {
				for(int j = 1; j < 10; j++) {
					if(i == limite + 1) break externo;
					System.out.println(i + "*" + j + " = " + (i * j));
				}
			}
		}else {
			System.out.println("numero invalido. - use numeros de 0 ate 9");
		}
	}

}