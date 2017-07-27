import java.util.List;
import java.util.ArrayList;

public class Exercicio01 {

	public static void main(String[] args) {

		List<Integer> elements = new ArrayList<>();
		elements.add(10);
		int firstElmnt = elements.get(1);

		System.out.println(firstElmnt);
	}

}

/*
	Which is the result:

	A) null
	B) 10
	C) 0
	D) An IndexOutOfBoundsException is thrown at runtime.
*/
 