import java.util.*;

class SimulaIndexOutOfBound {
	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add("1");
		lista.add("2");
		lista.add("3");
		lista.add("4");

		lista.get(10);
	}
}

/*
	$ java SimulaIndexOutOfBound
	Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 10, Size: 4
	at java.util.ArrayList.rangeCheck(ArrayList.java:653)
	at java.util.ArrayList.get(ArrayList.java:429)
	at SimulaIndexOutOfBound.main(SimulaIndexOutOfBoundException.java:12)
*/
