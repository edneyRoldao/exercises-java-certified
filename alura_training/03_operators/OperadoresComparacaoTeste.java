public class OperadoresComparacaoTeste {
	public static void main(String[] args) {
		
		boolean test = false;
		test = 1 == 1.0; // true
		test = 1.0f == 1.0d; // true

		System.out.println(1 == (100.0 / 100.0)); // true

	}
}