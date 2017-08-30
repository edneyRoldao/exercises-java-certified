class NullPointerTest {
	public static void main(String[] args) {
		
		String a = null;

		a.equals("");

	}
}

/*
	$ java NullPointerTest
	Exception in thread "main" java.lang.NullPointerException
	        at NullPointerTest.main(SimulaNullPointerException.java:6)
*/