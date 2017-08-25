class HerancaTest {
	private static final int NUMERO_MOTOS = 10;

	public static int getTotalMotos() {
		return NUMERO_MOTOS;
	}

	public static int getTotalMotos2() {
		return NUMERO_MOTOS;
	}

}

public class MetodosStaticosComHerancaTest extends HerancaTest {
	private static final int NUMERO_MOTOS = 20;

	public static int getTotalMotos() {
		return NUMERO_MOTOS;
	}

	public static void main(String[] args) {
		
		// Não existe sobrescrita de métodos estáticos.
		// O que temos na verdade são métodos distintos
		System.out.println(HerancaTest.getTotalMotos()); // 10
		System.out.println(MetodosStaticosComHerancaTest.getTotalMotos()); // 20

		// como o metodo não sobrescrito, podemos chamar o método static do pai
		// a partir da classe do filho 
		System.out.println(MetodosStaticosComHerancaTest.getTotalMotos2()); // 10

	}
}