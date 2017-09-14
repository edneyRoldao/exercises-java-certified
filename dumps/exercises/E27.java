	
	// Given:
	class A {
		public A() {
			System.out.print("A ");
		}
	}

	class B extends A {
		public B() {					// line n1
			System.out.print("B ");
		}
	}

	class C extends B {
		public C() {					// line n2
			System.out.print("C ");			
		}

		public static void main(String[] args) {
			C c = new C();
		}
	}

	/*  WHAT IS THE RESULT ?
		A) C B A
		B) C
		C) A B C
		D) Compilation fails at line n1 and line n2 
	*/
