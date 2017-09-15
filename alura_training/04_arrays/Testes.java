import java.util.*;

class Testes {
	public static void main(String[] args) {
		
		System.out.println(args.length);
		System.out.println( args.toString() );

		List<String> lista = new ArrayList<>();
		lista.add("Edney");
		lista.add("Giselle");
		lista.add("Nadine");
		lista.add("Marjorie");

		Iterator<String> it = lista.iterator();

		while(it.hasNext())
			System.out.println(it.next());


	}
}