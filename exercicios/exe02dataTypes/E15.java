//  Escolha a opção adequada ao tentar compilar e rodar o arquivo a seguir:
class B {

}

class E15 {
	public static void main(String[] args) {
		B[] bs = new B[100];
		System.out.println("Finalizado");
	}
}


/*
	a) Compila e 100 objetos do tipo B são criados, mas não podemos falar
	   nada sobre o garbage collector ter jogado os objetos fora na linha do
       System.out.
	b) Compila e nenhum objeto do tipo B é criado.
	c) Compila, cria 100 e joga fora todos os objetos do tipo B ao chegar no
	   System.out.
*/