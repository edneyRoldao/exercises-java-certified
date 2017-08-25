public class FormasDeclararArray {

	public static void main(String[] args) {
		
		int[] f1;

		double f2[];

		long []f3;

		float[]f4;

		// também podemos declarar possando valores de duas maneiras:
		double[] valores = new double[]{1.0, 3.5, 7.85};

		//inicializando um array sem o operador new
		double []valores2 = {1.0, 3.5, 7.85};

		// posso aplicar o forEach para tipos primitivos
		f1 = new int[]{1, 2, 3, 4, 5, 6};

		for(int i : f1)	System.out.print(i);
	}

}