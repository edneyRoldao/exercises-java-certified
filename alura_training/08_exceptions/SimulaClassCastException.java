import java.util.*;

class SimulaErroDeCasting {

	public static void main(String[] args) {
			
		Object obj = new Object();
		Date d = (Date) obj;

	}

}

/*
	$ java SimulaErroDeCasting
	Exception in thread "main" java.lang.ClassCastException: java.lang.Object 
	cannot be cast to java.util.Date at 
	SimulaErroDeCasting.main(SimulaClassCastException.java:8)
*/
