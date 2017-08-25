public class Child extends Parent {

	public static void imprimeStatico() {
		System.out.println("Calling static method from Child !");
	}

	public void imprime() {
		System.out.println("Calling non static method from Child !");
	}

}