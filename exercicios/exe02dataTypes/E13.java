//  Escolha a opção adequada ao tentar compilar e rodar o arquivo a seguir:
class B {

}

class E13 {
	public static void main(String[] args) {
		B b;
		
		for(int i = 0; i < 10; i++)
			b = new B();

		System.out.println("finalizado");
	}
}


/*
	a) Não compila.
	b) Compila e garbage coleta 10 objetos do tipo B na linha do System.out.
	c) Compila e não podemos falar quantos objetos do tipo B foram garbage 
	   coletados na linha do System.out.
*/