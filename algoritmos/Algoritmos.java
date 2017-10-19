import java.util.*;

public class Algoritmos {
	public static void main(String[] args) {
		List<Integer> primos = listarPrimos(2, 107);

		for(Integer primo : primos)
			System.out.println(primo);

		System.out.println("*******************************");
		System.out.println("*******************************");
		System.out.println("*******************************");
		
		System.out.println(primos.size());
		System.out.println(contaPrimos(2, 1000));
	}

	public static boolean isNumeroPrimo(int num) {
		if(num == 2) return true;
		if(num < 2 || num % 2 == 0) return false;

		for(int i = 3; i < num; i += 2) {
			if(num % i == 0) return false;
		}

		return true;
	}

	public static List<Integer> listarPrimos(int numInit, int numFinal) {
		List<Integer> primos = new ArrayList<>();

		for(int i = numInit; numInit <= numFinal; numInit++) {
			if(isNumeroPrimo(numInit))
				primos.add(numInit);
		}

		return primos;
	}

	public static List<Integer> listarPrimos(int numFinal) {
		return listarPrimos(0, numFinal);
	}

	public static int contaPrimos(int numInit, int numFinal) {
		int count = 0;

		for(int i = numInit; numInit <= numFinal; numInit++) {
			if(isNumeroPrimo(numInit))
				count++;
		}

		return count;
	}

	public static int contaPrimos(int numFinal) {
		return contaPrimos(0, numFinal);
	}

}