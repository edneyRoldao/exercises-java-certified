	
	// Given
	class Product {
		int id;
		String name;

		public Product(int id, String name) {
			this.id = id;
			this.name = name;
		}
	}

	// and given the code fragment:
	class Test {
		public static void main(String[] args) {
			Product p1 = new Product(101, "Pen");
			Product p2 = new Product(101, "Pen");
			Product p3 = p1;
			
			boolean ans1 = p1 == p2;
			boolean ans2 = p1.name.equals(p2.name);
			System.out.print(ans1 + " : " + ans2);
		}
	}

	/* WHAT IS THE RESULT ?
		A)  true : true
		B)  true : false
		C) false : true
		D) false : false
	*/