	
	// Given:
	class Test {
		public static void main(String[] args) {
			if(args[0].equals("Hello") ? false : true) {
				System.out.println("Success");
			} else {
				System.out.println("Failure");				
			}			
		}
	}

	/*	And Given the commands:

		javac Test.java
		java Test Hello

		WHAT IS THE RESULT

		A) Success
		B) Failure
		C) Compilation fails
		D) An exception is thrown at runtime
	*/
