public class OperadoresAtribuicaoMultiplaTeste {
	public static void main(String[] args) {
		
		int a = 10, b = 20, c = 40;

		a = b = c;
		System.out.println(a); // 40
		System.out.println(b); // 40
		System.out.println(c); // 40

		a = 5;
		b = 10; 
		c = 15;

		a = (b = c) + 1;
		System.out.println(a); // 16
		System.out.println(b); // 15
		System.out.println(c); // 15

	}
}