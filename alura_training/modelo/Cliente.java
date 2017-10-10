package modelo;

public class Cliente {
	private String nome;
	protected int a = 10;

	public Cliente(String nome) {
		this.nome = nome;
	}

	public Cliente() {}

	protected void imprime() {
		System.out.println(nome);
	}
}