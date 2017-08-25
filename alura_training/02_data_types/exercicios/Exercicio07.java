public class Exercicio07 {
	public static void main(String[] args) {

        int valor = 10;
        int dividePor = 4;
        double resultado = valor / dividePor;
        System.out.println(valor + dividePor + "");
        System.out.println("" + resultado + valor );

    }
}

/*
	A) 14 e 2.010
	B) 14 e 12
	C) 14 e 2.510
	D) 104 e 2.010
*/
































































/*
	temos uma divisao de dois inteiros, portanto, mesmo utilizando um double para
	receber o resultado da conta, perdemos a precisao
	exp: double r = 10 / 4 (o resultado é 2.0) - perdemos o 0.5

	- numeros à esquerda de + "" soo somados     (10 + 10 + "" = 20)
	- numeros à direita de "" + sao concatenados ("" + 10 + 10 = 1010)
*/



