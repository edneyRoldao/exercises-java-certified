import java.util.*;

class Teste {
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("edney");
		lista.add("giselle");
		lista.add("nadine");
		lista.add("marjorie");

		lista.sort(s -> Comparator.comparing(s.length()));

		lista.forEach(System.out::println);

	}
}