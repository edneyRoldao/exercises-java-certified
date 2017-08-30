class SimulaInitializerError {

	static {
		String a = null;
		a.toString();
	}

	public static void main(String[] args) {
		
		new SimulaInitializerError();

	}

}

/*
	Quando temos um bloco de inicialização estático e dentro do mesmo ocorre
	uma exception, ele é mantida e esse erro é disparado.

	$ java SimulaInitializerError
	java.lang.ExceptionInInitializerError
	Caused by: java.lang.NullPointerException
	at SimulaInitializerError.<clinit>(SimulaExceptionInitializerError.java:10)
	Exception in thread "main"
*/
