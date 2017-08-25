package acesso.filha;

import acesso.AcessoPai;

public class AcessoFilha extends AcessoPai {

	protected void imprime(double v) {
		System.out.println("Chamando pela classe filha: " + v);
	}

}