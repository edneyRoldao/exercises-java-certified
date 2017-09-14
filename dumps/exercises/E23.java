	
	// Given the code fragment:
	class Test {
		public static void main(String[] args) {
			int x = 100;
			int a = x++;
			int b = ++x;
			int c = x++;
			int d = (a < b) ? (a < c) ? a: (b <c )? b: c;
			System.out.println(d); 			
		}
	}

	/* What is the result ?
		A) 100
		B) 101
		C) 102
		D) 103
		E) compilation fails
	*/
