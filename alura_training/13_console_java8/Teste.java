class Teste {
	public static void main(String[] args) {
		int a = Integer.parseInt("10", 10);
		int b = a == 10 ? null : 3;
		System.out.println(a + b);
	}
}