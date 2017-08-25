public class OperadoresIncrementoTeste {
	public static void main(String[] args) {
		
		// incrementa primeiro, depois retorna o valor
		int i = 10;
		System.out.println(++i); // 11

		// retorna o valor e depois incrementa
		int i2 = 10;
		System.out.println(i2++); // 10

		// Temos
		i *= 2;
		i /= 2;
		i %= 2;

		// Podemos fazer dentro do syso
		System.out.println(i += 2);

		// ATENCAO AQUI
		byte b1 = 1;
		byte b2 = 2;

		// sabemos que: quando realizamos alguma operacao aritimetica, o tipo
		// minimo retornado é um int entao:
		// erro, o mínimo é um int
		//b2 = b2 + b1; 

		// Podemos evitar o erro acima dessa forma:
		b2 += b1; // o motivo é que: quando abreviamos as operação,
				  // um casting é aplicado quando necessário
				  // funciona até se atribuirmos um valor maior que o tipo possa
				  // armazenar, ou seja, poderíamos fazer:
				  // byte b = 0;
				  // b += 10000;

		// DEVEMOS CALCULAR OS INCREMENTOS DA ESQUERDA PARA DIREITA.
		int a = 10;
		a += ++a + a + ++a;
	/* VAMOS DESMEMBRAR DA ESQUERDA PARA DIREITA
	   a = 10 + ++a + a + ++a;
	   a = 10 + 11 + 11 + ++a;
	   a = 10 + 11 + 11 + 12;
	   a = 44						
	*/
		System.out.println(a);

	}
}