//  Escolha a opção adequada ao tentar compilar e rodar o arquivo a seguir:
class B {
	void x(int... x) {
		System.out.println(x.length);
	}
}

class E17 {
	public static void main(String[] args) {
		new B().x(23789, 673482);
	}
}


/*
	a) Não compila: varargs tem método e não atributo length.
	b) Compila e ao rodar imprime os dois números.
	c) Compila e ao rodar imprime 2.
*/