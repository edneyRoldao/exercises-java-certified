// Escolha a opção adequada ao tentar compilar e rodar o arquivo a seguir:
class E02 {
	public static void main(String[] args) {
		int idade;

		if(args.length > 0) {
			idade = Integer´parseInt(args[0]);
		} else {
			System.out.println("Por favor passe sua idade como primeiro param");
		}

		System.out.println("Sua idade é " + idade);
	}
}


/*
	a) Não compila: erro na linha que tenta acessar a variável idade.
	b) Compila e imprime 0 ou a idade que for passada na linha de comando.
	c) Compila e imprime a idade que for passada na linha de comando.
	d) Compila e imprime a mensagem de erro ou “Sua idade é "e a idade.
*/