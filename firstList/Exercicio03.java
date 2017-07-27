abstract class Writer {
	public static void write() {
		System.out.println("Writing...");
	}
}

class Author extends Writer {
	public static void write() {
		System.out.println("Writing a book");		
	}
}

public class Exercicio03 extends Writer {

	public static void write() {
		System.out.println("Writing a code");
	}

	public static void main(String[] args) {
		Writer w = new Exercicio03();
		w.write();
	}

}
/*
	What is the result:

	A) Writing...
	B) Writing a book
	C) Writing a code
	D) Compilation fails
*/