public class Parent {

	public static void imprimeStatico() {
		System.out.println("Calling static method from Parent !");
	}

	public void imprime() {
		System.out.println("Calling non static method from Parent !");
	}

}

public class BindingMetodosTest {

	public static void main(String[] args) {

		// O binding de métodos estáticos são feitos em tempo de
		// compilação, ou seja, mesmo usando uma referencia de pai
		// com um object do tipo filho, o metodo estático chamado séra
		// da classe pai.
		Parent c = new Child();
		c.imprimeStatico(); // chama do pai

		// isso não acontece quando o método não é static
		// veja que temos uma referencia para o tipo Child
		// e seu método que sera invocado
		c.imprime(); // chama da filha

	}

}