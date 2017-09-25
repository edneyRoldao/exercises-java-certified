package modelo;

public class Cliente {
	private String nome;

	public Cliente(String nome) {
		this.nome = nome;
	}

	public Cliente() {}

	public void imprime() {
		System.out.println(nome);
	}
}