//  Escolha a opção adequada ao tentar compilar e rodar o arquivo a seguir:
class B {
	int c;
	void c(int c) {
		c = c;
	}
}

class E12 {
	public static void main(String[] args) {
		B b = new B();
		b.c = 10;
		System.out.println(b.c);
		b.c(30);
		System.out.println(b.c);		
	}
}


/*
	a) Não compila: conflito de nome de variável membro e método em B.
	b) Não compila: conflito de nome de variável membro e variável local em B.
	c) Compila e roda, imprimindo 10 e 30.
	d) Compila e roda, imprimindo outro resultado.
*/