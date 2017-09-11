// Escolha a opção adequada ao tentar compilar e rodar o arquivo a seguir:
class E05 {
	public static void main(String[] args) {
		boolean argumentos;

		if(args.length > 0)
			argumentos = 1;
		else 
			argumentos = 0;

		System.out.println(argumentos);
	}
}


/*
	a) Não compila: o método de impressão não recebe boolean.
	b) Não compila: atribuição inválida.
	c) Não compila: o método length de array não é uma propriedade.
	d) Não compila: o método length de String[]não é uma propriedade.
	e) Compila e imprime 0 ou 1.
	f) Compila e imprime false ou true.
*/