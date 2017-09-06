class PrintfExemplos {
	public static void main(String[] args) {
		System.out.printf("");

		System.out.printf("%2$s %1$s %n", "Deus", "Meu");
		// Meu Deus - podemos definir as posições com index$

		System.out.printf("[%6d]%n", 12);
		// [    12] - podemos definir espaço mínimo

		System.out.printf("[%06d]%n", 12);
		// [000012] - podemos preencher com zeros os espeços
		// só vale para numeros

		System.out.printf("[%+6d]%n", 12);
		System.out.printf("[%+6d]%n", -12);
		System.out.printf("[%(6d]%n", 12);
		System.out.printf("[%(6d]%n", -12);

		System.out.printf("[%+(06d]%n", -12);
		System.out.printf("[%+(06d]%n", -12);
		System.out.printf("[%+(06d]%n", 12);
		System.out.printf("[%+(06d]%n", -12);

		System.out.printf("[%+(-6d]%n", -12);
		System.out.printf("[%+(-6d]%n", -12);
		System.out.printf("[%+(06d]%n", 12);
		System.out.printf("[%+(06d]%n", -12);

		System.out.printf("[%+(,018.2f]%n", 2345758.659);
		// [     +2.345.758,66]
	}
}