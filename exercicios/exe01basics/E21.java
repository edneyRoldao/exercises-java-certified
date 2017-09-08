// Escolha a opção adequada ao tentar compilar os arquivos a seguir:
public class A {
	public static final int VALOR = 15;
	public void executa(int x) {
		System.out.println(x);
	}
}

// arquivo b/B.java
package b;
import static A.*;
class B {
	void m() {
		A a = new A();
		a.execute(VALOR);
	}
}

/*
	a) não compila.
	b) Tudo compila.
*/
