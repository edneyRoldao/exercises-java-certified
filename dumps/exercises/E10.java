	
	// Given the code fragment:
	class Test {
		public static void main(String[] args) {
			StringBuilder sb = new StringBuilder(5);
			String s = "";

			if(sb.equals(s)) {
				System.out.println("Match 1");
			} else if(sb.toString().equals(s.toString())) {
				System.out.println("Match 2");
			} else {
				System.out.println("No Match");
			}
		}
	}
	
	/*
		A) Match 1
		B) Match 2
		C) No Match
		D) NullPointerException is thrown at runtime
	*/

