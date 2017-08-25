public class Exercicio01 {
	public static void main(String[] args) {
		
		String s = "aba";

		for(int i = 0; i < 9; i++) {
			s = s + "aba";
		}

		System.out.println(s.length);
	}
}

/*
	A) nao compila
	B) compila e imprime 36
	C) compila e imprime 30
	D) compila e imprime 3
	E) compila e imprime 33
*/




















































// PEGADINHA
// ocorre um erro pois length en tipo string é um método e não um atributo.