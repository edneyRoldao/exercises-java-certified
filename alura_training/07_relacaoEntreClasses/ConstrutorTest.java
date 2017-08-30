/*
	O construtor da classe pai sempre será invocado, por isso, classes filhas
	só podem ser instanciadas caso elas tenham acesso a tal construtor ou 
	ela deve chamar o construtor que ela tenha acesso.
*/

class Pai {
	private Pai() {
		System.out.println("Construtor do pai com super");		
	}

	Pai(String v) {
		System.out.println(v);		
	}
}

class Construtor extends Pai {

	Construtor() {
		this("Chamando outro construtor dessa classe");
		System.out.println("Construtor sem argumentos");
	}

	Construtor(String v) {
		super("chamando o construtor com argumento do Pai, pois o padra esta privado");
		System.out.println(v);
	}

}

class Testa {
	public static void main(String[] args) {		
		new Construtor();
		new Construtor("só chama esse");

	}
}