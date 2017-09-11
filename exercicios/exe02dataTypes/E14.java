//  Escolha a opção adequada ao tentar compilar e rodar o arquivo a seguir:
class B {

}

class E14 {
	public static void main(String[] args) {
		B b = new B();
		
		for(int i = 0; i < 10; i++)
			b = new B();

		System.out.println("finalizado");
	}
}


/*
	a) Não compila.
	b) Compila e 10 objetos do tipo B podem ser garbage coletados ao chegar
	   na linha do System.out.
	c) Compila e 11 objetos do tipo B podem ser garbage coletados ao chegar
	   na linha do System.out.
	d) Compila e garbage coleta 11 objetos do tipo B na linha do System.out.
*/