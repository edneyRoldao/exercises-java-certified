// Escolha a opção adequada ao tentar compilar os arquivos a seguir:
// arquivo a/A.java
package a;
public class A {
	public static final int VALOR = 15;
	public void executa(int x) {
		System.out.println(x);
	}
}

// arquivo b/B.java
package b;
import static a.A.*;
class B {
	void m() {
		A a = new A();
		a.execute(VALOR);
	}
}


/*
	a) B não compila: erro na linha 13.
	b) B não compila: erro na linha 16.
	c) B não compila: erro na linha 17.
	d) Tudo compila.
*/
