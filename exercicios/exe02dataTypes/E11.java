//  Escolha a opção adequada ao tentar compilar e rodar o arquivo a seguir:
class B {
	int v = 15;
}

class E11 {
	public static void main(String[] args) {
		B x = new B();
		B y = x;
		y.v++;
		x.v++;
		B z = y;
		z.v--;
		System.out.println(x.v + y.v + z.v);
	}
}


/*
	a) Imprime 43.
	b) Imprime 44.
	c) Imprime 45.
	d) Imprime 46.
	e) Imprime 47.
	f) Imprime 48.
	g) Imprime 49
*/