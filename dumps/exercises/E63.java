
	// Given the content of three files:
	
	//	A.java
	public class A {
		public void a() {}
		int a;
	}

	//	B.java
	public class B {
		private int doStuff() {
			private int x = 100;
			return x++;
		}
	}

	//	C.java
	import java.io.*;
	package p1;
	public class C {
		public void main(String fileName) throws IOException { }
	}

	/* WHICH STATEMENT IS TRUE ?
		A) Only the A.Java file compiles successfully
		B) Only the B.java file compiles successfully.
		C) Only the C.java file compiles successfully.
		D) The A.Java and B.java files compile successfully.
		E) The B.java and C.java files compile successfully.
		F) The A.Java and C.java files compile successfully.
	*/


		