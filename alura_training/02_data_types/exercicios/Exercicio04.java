public class Exercicio04 {
	public static void main(String[] args) {
		
		String s = null;
		String s2 = new String(s);
		System.out.println(s2);
		
	}
}

/*
	A) Não compila ao tentar invocar o construtor.
	B) Compila e imprime null.
	C) Compila e não imprime nada.
	D) Compila e dá erro de execução ao tentar criar a segunda String.
*/






























































// o construtor da classe java.lang.String lança uma nullPointerExceprion
// em tempo de execução quando null é passado como parametro.