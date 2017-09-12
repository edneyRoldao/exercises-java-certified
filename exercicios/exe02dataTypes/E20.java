//  Escolha a opção adequada ao tentar compilar e rodar o arquivo a seguir:
class E20 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("guilherme").delete(2,3);
		System.out.println(sb);
	}
}


/*
	a) O código não compila: erro na linha que tenta imprimir o StringBuilder.
	b) O código compila e imprime glherme.
	c) O código compila e imprime guherme.
	d) O código compila e imprime gilherme.
	e) O código compila e imprime gulherme.
*/