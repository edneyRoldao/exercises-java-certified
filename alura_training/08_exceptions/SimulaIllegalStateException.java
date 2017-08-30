class ExecutaProcesso {
	boolean estaExecutando = false;

	public void iniciaProcesso() {
		if(estaExecutando)
			throw new IllegalStateException();

		estaExecutando = true;
	}

	public void paraProcesso() {
		estaExecutando = false;
	}
}

class TestaProcesso {
	public static void main(String[] args) {
		ExecutaProcesso processExecutor = new ExecutaProcesso();
		processExecutor.iniciaProcesso();
		processExecutor.iniciaProcesso(); // erro aqui		
	}
}

/*
	$ java TestaProcesso
	Exception in thread "main" java.lang.IllegalStateException
	at ExecutaProcesso.iniciaProcesso(SimulaIllegalStateException.java:6)
	at TestaProcesso.main(SimulaIllegalStateException.java:20)
*/