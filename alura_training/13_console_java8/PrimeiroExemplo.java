class PrimeiroExemplo {
	public static void main(String[] args) {
		
		/*

			OBS: o System.out.print n possui sobrecarga sem argumentos

			%b = boolean
			%c = char
			%d = inteiros
			%f = decimais
			%s = tudo
			%n = quebra de linha

			REGRAS: % depois indice, flags, tamanho, precisao, tipo
			
			EXP 01 
			*obs: 1º parametro sempre sera 1
			Podemos informar a posicao dos valores com numeroIndex$, veja:
			("%2$s %1$s", "Universe", "Hello") - Hello Universe
			("%2$s %2$s", "Universe", "Hello") - Hello Hello

			EXP 02
			Podemos definir um valor mínimo de caracteres que
			queremos imprimir. Vale para texto tbm
			*obs: veja que nao tem o $, essa é a única dif
			("[%5d]", 422) - [  422] 

			EXP 03
			Toda vez que imprimir um numero positivo, podemos
			adicionar o sinal de +
			("%+d%n", 50)  - +50
			("%+d%n", -50) - -50
			
			EXP 04
			Podemos imprimir numeros negativos entre parenteses
			("%(d", -43) - (-43)
			("%(d", -43) - 43
			Podemos juntar o exp 03 e 04
			("%+(d", -43)

			EXP 05
			Podemos alinhar todo à esquerda
			("[%-5d]", 25) - [25   ]			

			EXP 06
			Podemos preencher os espeços em branco com zeros
			obs: nao funciona com string
			("[%05d]", 30) - [00030]

			EXP 07 
			podemos adicionar um separador de milhar do OS
			("[%,5f]", 12345678999) - 123.456.789,990000

			EXP 08
			podemos definir as casas decimais
			usamos ponto e qtd de casas
			("[%.2f]", 45412.7845154) - 45412,78			


		*/

		// unica situação que o system.out.print nao chama o toString
		// é quando passamos um array de char pois será impresso seu
		// conteúdo. Nesse caso nao vai imprimir nada pois está vazio.
		// lembre-se: ele nao vai imprimir o endereco da memória, mesmo
		// sendo um array.
		System.out.println(new char[10]);

		// os metodos abaixo tem o mesmo comportamento
		// o printf chama o format
		System.out.printf("foo");
		System.out.format("foo \n");


		// O format possuí caracteres de formatação
		// REGRAS: % depois indice, flags, tamanho, precisao, tipo
		// % e o tipo são obrigatórios


		// Exemplos de interpolação
		System.out.format("Hello %s", "Universe !");



	}
}