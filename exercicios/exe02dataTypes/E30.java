//  Escolha a opção adequada ao tentar compilar e rodar o arquivo a seguir:
class E30 {
	public static void main(String[] args) {
		String s = null;
		String s2 = new String(s);
		System.out.println(s2);
	}
}


/*
	a) Não compila ao tentar invocar o construtor.
	b) Compila e não imprime nada.
	c) Compila e imprime null.
	d) Compila e dá erro de execução ao tentar criar a segunda String.
*/