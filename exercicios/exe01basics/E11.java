/*
	Escolha a opção adequada para rodar a classe A.java presente no diretório b, 
	que foi compactado em um arquivo chamado programa.jar, sendo que não existe 
	nenhum arquivo de manifesto:
*/
package b;
class A {
	public static void main(String[] args) {
		System.out.println(args[0]);
	}
}


/*
	a) java jar programa.jar
	b) java jar programa.jar b.A
	c) java -jar programa.jar
	d) java -jar programa.jar b.A
	e) java -cp programa.jar
	f) java -cp programa.jar b.A
*/