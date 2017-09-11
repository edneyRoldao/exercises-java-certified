// Choose a suitable option when try to compile and run the following file:
class E10 {
	public static void main(String[] args) {
		System.out.println(args);
		System.out.println(args.length);
		System.out.println(args[0]);				
	}	
}


/*
	a) Não compila: array não possui membro length.
	b) Não compila: o método println não consegue imprimir um array.
	c) Ao rodar sem argumentos, ocorre uma NullPointerException na linha 6.
	d) Ao rodar sem argumentos, ocorre uma NullPointerException na linha 5.
	e) Ao rodar sem argumentos, são impressos os valores “1” e “A”.
	f) Ao rodar com o argumento “certificacao”, são impressos os valores “2” e “A”.
*/