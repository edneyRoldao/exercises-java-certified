class NumberFormatExceptionTest {
	public static void main(String[] args) {
		
		String num = "nao e numero";
		int n = Integer.parseInt(num);

	}
}

/*
	$ java NumberFormatExceptionTest
	Exception in thread "main" java.lang.NumberFormatException: 
	For input string: "nao e numero"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at NumberFormatExceptionTest.main(SimulaNumberFormatException.java:5)
*/
