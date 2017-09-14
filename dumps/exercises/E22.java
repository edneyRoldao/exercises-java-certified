	
	// Given the following main method:
	class Test {
		public static void main(String[] args) {
			int num = 5;
			do {
				System.out.print(num-- + " ");
			} while(num == 0);
		}
	}

	/* Which is the result:

		A) 5 4 3 2 1 0
		B) 5 4 3 2 1
		C) 4 2 1
		D) 5
		E) Nothing is printed
	*/
