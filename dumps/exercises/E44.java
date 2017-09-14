
	// Base.java
	class Base {
		public void test() {
			System.out.println("Base ");
		}
	}

	// DerivedA.java
	class DerivedA extends Base {
		public void test() {
			System.out.println("DerivedA ");			
		}
	}

	// DerivedB.java
	class DerivedB extends DerivedA {
		public void test() {
			System.out.println("DerivedB ");			
		}

		public static void main(String[] args) {
			Base b1 = new DerivedB();
			Base b2 = new DerivedA();
			Base b3 = new DerivedB();
			b1 = (Base) b3;
			Base b4 = (DerivedA) b3;
			b1.test();
			b4.test();
		}
	}

	/*
		WHAT IS THE RESULT ?
		A) Base and DerivedA
		B) Base and DerivedB
		C) DerivedB and DerivedB
		D) DerivedB and DerivedA
		E) A classCastException is thrown at runtime
	*/