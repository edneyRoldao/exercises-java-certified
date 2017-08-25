public class SobrecargaMetodosTest {
	public static void main(String[] args) {
		
		// a JVM vai chamar o metodo com o objeto do tipo mais especifico passado.
		// vai chamar aquele que recebe String como arg.
		testaSobrecarga("teste");

		// Se quisermos chamar o mais abrangente, devemos aplicar o casting
		testaSobrecarga( (Object) "teste");

	}

	public static void testaSobrecarga(String a) {
		System.out.println("Chamando com tipo String");
	}

	public static void testaSobrecarga(Object a) {
		System.out.println("Chamando com tipo Objeto");
	}

	public static void testParamsMesmoNome(int a, double a) {
		// temos um erro pois a variaveis locais tem o mesmo nome.
		// variable a is already difined in method testParamsMesmoNome
	}

}