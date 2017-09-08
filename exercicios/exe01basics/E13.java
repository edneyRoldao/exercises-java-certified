// Escolha a opção adequada ao tentar compilar e rodar o Teste. 
// Arquivo no diretório atual:
import modelo.Cliente;

class E13 {
	public static void main(String[] args) {
		new Cliente("Guilherme").imprime();
	}
}

// arquivo no diretorio modelo
package modelo;

class Cliente {
	private String nome;
	
	Cliente(String nome) {
		this.nome = nome;
	}

	public void imprime() {
		System.out.println(nome);
	}
}











































































/*
	a) Não compila: erro na classe Teste.
	b) Não compila: erro na classe Cliente.
	c) Erro de execução: método main.
	d) Roda e imprime “Guilherme”.
*/