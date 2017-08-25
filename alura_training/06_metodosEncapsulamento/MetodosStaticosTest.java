public class MetodosStaticosTest {
	
	static int a = getValor();

	public static int getValor() {
		return b;
	}

	static int b = 20;

	public static void main(String[] args) {

		// Os métodos estáticos inicialiando antes das variáveis estáticas,
		// portanto, o metodo que chama a variavel b, vai returnar 0.
		System.out.println(a); // será zero

	}
}