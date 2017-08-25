public class Exercicio04 {

	public static int numero = 30;

	public static void main(String[] args) {
		System.out.println(this.numero);
	}
}

/*
	O modificador this utilizado acima faz referencia à instancia da classe, ou seja,
	temos um erro pois métodos estáticos não podem acessar métodos ou atributos de instancia.
*/