//  Escolha a opção adequada ao tentar compilar e rodar o arquivo a seguir:
class B {
	void x(Object... x) {
		System.out.println(x.length);
	}
}

class E19 {
	public static void main(String[] args) {
		new B().x(new Object[]{23789, 673482});
	}
}


/*
	a) Não compila: varargs tem método e não atributo length.
	b) Não compila: não podemos passar um array para um varargs.
	c) Compila e ao rodar imprime os dois números.
	d) Compila e ao rodar imprime 1.
	e) Compila e ao rodar imprime 2.
*/