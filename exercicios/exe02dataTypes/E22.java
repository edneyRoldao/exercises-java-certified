// Considere o seguinte código dentro de um main:
class E22 {
	public static void main(String [] args) {
		String s = "aba";

		for(int i = 0; i < 9; i++) {
			s = s + "aba";
		}

		System.out.println(s.length);
	}
}


/*
	a) Não compila.
	b) Compila e imprime 3.
	c) Compila e imprime 30.
	d) Compila e imprime 33.
	e) Compila e imprime 36.
*/