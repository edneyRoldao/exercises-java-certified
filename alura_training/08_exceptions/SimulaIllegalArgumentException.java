class ContaCorrente {
	private double saldo = 250.50;

	public void saca(double valor) {
		if(valor > saldo)
			throw new IllegalArgumentException();

		saldo -= valor;
		System.out.println("novo saldo: " + saldo);
	}

}

class TestaConta {
	public static void main(String[] args) {
		new ContaCorrente().saca(300.00);
	}
}

/*
	$ java TestaConta
	Exception in thread "main" java.lang.IllegalArgumentException
	at ContaCorrente.saca(SimulaIllegalArgumentException.java:6)
	at TestaConta.main(SimulaIllegalArgumentException.java:16)
*/
