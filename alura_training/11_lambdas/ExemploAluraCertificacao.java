import java.util.*;

class TestaLambda {
	public static void main(String[] args) {
		
		List<Pessoa> pessoas = Arrays.asList(
				new Pessoa("Edney", 35),
				new Pessoa("Giselle", 29),
				new Pessoa("Nadine", 14),
				new Pessoa("Marjorie", 1)
			);

		FiltradorPessoa filter = new FiltradorPessoa();
		Martcher<Pessoa> criterio = new PessoaMaiorIdadeMatcher();
		List<Pessoa> filtrada = filter.filtrar(pessoas, criterio);  
		filtrada.forEach(c -> System.out.println(c.toString()));


	}
}

class PessoaMaiorIdadeMatcher implements Martcher<Pessoa> {

	@Override
	public boolean check(Pessoa p) {
		return p.getIdade() >= 18;
	}

}

class FiltradorPessoa {

	List<Pessoa> filtrar(List<Pessoa> lista, Martcher<Pessoa> matcher) {
		List<Pessoa> listaFiltrada = new ArrayList<>();
		for(Pessoa p : lista) {
			if(matcher.check(p)) listaFiltrada.add(p);
		}

		return listaFiltrada;
	}

}

interface Martcher<T> {
	boolean check(T t);
}

class Pessoa {
	private String nome;
	private int idade;

	Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return "[Pessoa: Nome: " + nome + " - idade: " + idade + "]";
	}
}







class TestPessoa {
	public static void main(String[] args) {
				
	}
}