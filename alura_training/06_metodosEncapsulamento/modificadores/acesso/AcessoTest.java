package acesso;

import acesso.filha.AcessoFilha;

/*
	se tivermos um metodo publico na classe pai, e ele ser sobrescrito
	na classe filha como protected, private ou default recebemos um erro.
	Pode ocorre do método estar sobrecarregado, ou seja, metodos com mesmo 
	nome e argumentos diferentes. Nesse case temos metodos totalmente distintos 
*/
public class AcessoTest {
	public static void main(String[] args) {
		
		AcessoFilha ac = new AcessoFilha();
		ac.imprime(10);

	}
}