class SimulaArrayIndexOutOfBound {

	public static void main(String[] args) {
		
		String[] a = new String[10];
		a[10] = "erro ocorre aqui";	

	}

}

/*
	$ java SimulaArrayIndexOutOfBound
	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
	at SimulaArrayIndexOutOfBound.main(SimulaArrayIndexOutOfBoundException.java:6)
*/