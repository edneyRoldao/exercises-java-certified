import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
	
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Edney");
		nomes.add("Giselle");
		nomes.add("Nadine");
		nomes.add("Marjorie");

		/* USANDO O ITERATOR */
		Iterator<String> it = nomes.iterator();

		while(it.hasNext()) {
			String a = it.next();
			System.out.println(a);
			it.remove();
		}
		
		System.out.println(nomes.size());

		/*
			.contains()
			.indexOf()
			needs that you implement equals method.
		*/

	}
}