class SuperClass {
	SuperClass(int x) {
		System.out.println("Super");
	}
}

public class Exercicio04 extends SuperClass {

	Exercicio04() {
		// n1
		System.out.println("Subclass");
	}

}

/*
	Which statement, when inserted at line n1, enables the code to compile ?
	
	A) this(10)
	B) super(10)
	C) SuperClass(10)
	D) super.SuperClass(10)
*/