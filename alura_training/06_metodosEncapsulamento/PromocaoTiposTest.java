class OverloadTest {

	public void method(int i, double d) {
		System.out.println("int is before double parameter");
	}

	public void method(double d, int i) {
		System.out.println("int is after double parameter");
	}

}

public class PromocaoTiposTest {
	public static void main(String[] args) {
		
		// os metodos acima são aceitos perfeitamente, passar passarmos os valores
		// de forma que não ocorre anbiguidade. Veja:
		new OverloadTest().method(10, 10.0); // a JVM sabe que estamos passando int e double respectivamento
		new OverloadTest().method(10.0, 10); // o mesmo ocorre aqui de forma inversa. a JVM sabe qual chamar.

		// Quando temos uma promoção de tipo, ou seja, o tipo passado como parametro tem o scopo menor  
		// que o declarado no método, portanto a JVM sabe se virar e fazer a conversão. só que...
		// quando passamos o mesmo tipo nos dois, que é o caso abaixo, a JVM não sabe qual dos parametros
		// passados ela deve tratar como double. TEMOS UM ERRO.
		new OverloadTest().method(10, 10); // erro: reference to method id ambiguous	

		/*
			OBS: quando temos dois metodos com a mesmo nome sendo um deles static, o JVM não sabe qual
			     usar quando temos um param de tipo mais especifico e outro mais generico
		*/

	}
}