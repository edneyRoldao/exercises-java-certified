public class CoisasQueCompilam {
	public static void main(String[] args) {
		
		/* Podemos passar números negativos na inicialização de um array
		   só que temos um error em tempo de execução: NegativeArraySizeException
		 */
		int[] array = new int[-1]; // compila e NegativeArraySizeException

		String[] array2;
		array2 = {"fas", "sdfgdf", "xcvb"}; // não funciona, tem que ser na declaração

		/* Não é possível aplicar casting em arrays de tipo primitivo */
		int[] array3 = {1, 5, 10, 22, 31};
		long[] array4 = (long[]) array3; // não funciona

		// Obs: quando usamos Objetos, o casting funciona e é implicito		

	}
}