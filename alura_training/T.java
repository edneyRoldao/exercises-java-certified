import java.util.*;

interface Funcao {
	boolean isAdult(Integer age);
}

class UsaInterface {
	void metodo(String n, Funcao f) {

	}
}

class Test {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>(Arrays.asList("a", "b"));
		l.add("c");

		System.out.print(l.toString());
	}
}