	
	// Given the code fragment:
	class Test {
		public static void main(String[] args) {
			int ii = 0;
			int jj = 7;
			for(ii = 0; ii < jj - 1; ii = ii + 2) {
				System.out.print(ii + " ");
			}
		}
	}

	/*	WHAT IS THE RESULT ?

		A) 2 4 
		B) 0 2 4 6
		C) 0 2 4
		D) compilation fails
	*/


