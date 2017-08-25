public class MetodosTest {
	public static void main(String[] args) {
		
		// passando um char quando o parametro é double. Isso funciona
		// um char pode devolver um numero
		primitivo('z');

		// promoção de tipo - podemos passar um tipo de menor scopo ao tipo
		// que foi  declarado no parametro. vou passar int o a declaração é double
		int a = 10;
		primitivo(a);

		// testa metodo que lança uma exception no lugar do return
		returnException();

	}

	// testar a promoção de tipos.
	public static void primitivo(double a) {}

	// ERRO
	public void testReturn() {
		return;
		// int i = 10; // esse codigo nunca será executado, e a JVM sabe disso (unreachable)
	}

	public static int returnException() {
		throw new RuntimeException("teste exceção como retorno de um método");
	}

}