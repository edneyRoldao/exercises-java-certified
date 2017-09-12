	
	// Given the code fragment:
	class Test {
		public static void main(String[] args) {
			int aVar = 9;

			if(aVar++ < 10) {
				System.out.println(aVar + " Hello World!");
			} else {
				System.out.println(aVar + " Hello Universe!");
			}
		}
	}

	/* WHAT'S THE RESULT IF THE INTEGER aVar IS 9
		A) Hello World!
		B) Hello Universe!
		C) Hello World!
		D) Compilation fails
	*/

