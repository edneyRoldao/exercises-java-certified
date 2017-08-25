package metodos;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setIdade(35);
		System.out.println(p.getIdade());
	}
}

/* 
How to run Pessoa and PessoaTeste from terminal

	first:   02_data_types> javac metodos/*.java
	second:  02_data_types> java metodos.PessoaTeste

*/