//  Escolha a opção adequada ao tentar compilar e rodar o arquivo a seguir:
class B {
	void x() {
		System.out.println("vazio");
	}

	void x(String... args) {
		System.out.println(args.length);		
	}
}

class C {
	void x(String... args) {
		System.out.println(args.length);		
	}

	void x() {
		System.out.println("vazio");
	}
}

class E16 {
	public static void main(String[] args) {
		new B().x();
		new C().x();
	}
}

/*
	a) Não compila: conflito entre método com varargs e sem argumentos.
	b) Compila e imprime vazio/vazio.
	c) Compila e imprime vazio/0.
	d) Compila e imprime 0/vazio.
	e) Compila e imprime 0/0.
*/

