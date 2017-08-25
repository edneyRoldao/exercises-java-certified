public class OperadoresAritimeticosTeste {
	public static void main(String[] args) {
		
		/*
			Precisamos prestar atenção no retorno do resultado de uma operação
			aritimético entre tipos diferentes.


			Existem duas regras básicas:
			- 1: o menor tipo retornado sempre será um int, ou seja se tivermos uma soma entre short e byte ou
			     byte e byte ou short e short, o retorno será sempre int

		    - 2: quando temos uma opeção com tipos acima do int, sempre será retornado o de maior scopo.

			- Exceção à regra: podemos somar (char + char) pois ele devolve characteres


		    SOBRE DIVISAO POR ZERO:
		    - NAO PODEMOS: dividir um numero INTEIRO por zero (recebemos um arithmeticException)
			- PODEMOS: dividir tipos flutuantes por zero que não ocorre erro
		*/

		/*---------   regra 1  -------------*/
	    short s = 20;
	    byte b = 5;
	    byte b2 = 15;

    	int a = b + s;
    	int a2 = b + b2;

    	/*----------  regra 2  -------------*/
    	int i = 300;
    	double d = 450.0;

    	double r = i + d;

    	/*----------  divisao por zero -----*/
    	//int divide = 10 / 0; // - temos um arithmeticException em tempo de execução
    	double divide2 = 10.0 / 0; // vai de boa, temos um infinity

    	/*---------- exemplo de NaN em java --------*/
    	double infinitoPositivo = 5.0 / 0;
    	double infinitoNegativo = -5.0 / 0;
    	System.out.println(infinitoNegativo + infinitoPositivo); // NaN

	}
}