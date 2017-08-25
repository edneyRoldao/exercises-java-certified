
// Qual metodo sera chamado ?
public class Teste {
	public static void main(String[] args) {
		t();
	}

	private static void t() {
		System.out.println("sem varargs");
	}

	private static void t(String... v) {
		System.out.println(v.length);
	}

}