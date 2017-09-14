	
	// Given the code fragment:
	class Test {
		public static void main(String[] args) {
			String str = " ";
			str.trim();
			System.out.println(str.equals("") + " " + str.isEmpty());	
		}
	}

	/* WHAT IS THE RESULT ?
		A) true true
		B) true false
		C) false false 
		D) false true
	*/