
	// Given:
	class Vehicle {
		int x;

		Vehicle() {
			this(10);				// Line n1
		}

		Vehicle(int x) {
			this.x = x;
		}
	}

	class Car extends Vehicle {
		int y;

		Car() {
			super();
			this(20);				// Line n2
		}

		Car(int y) {
			this.y = y;
		}

		public String toString() {
			return super.x + ":" + this.y;
		}
	}

	class Test {
		public static void main(String[] args) {
			Vehicle y = new Car();
			System.out.println(y);
		}
	}

	/* WHAT IS THE RESULT ?
		A) 10:20
		B)  0:20
		C) Compilation fails at line n1
		D) Compilation fails at line n2
	*/




		