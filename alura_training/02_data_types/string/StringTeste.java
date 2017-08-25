/* Atenções:

	1 - POSSO concatenar uma string com valor null, vai virar um literal
	2 - NÃO POSSO chamar metodos a partir de uma string com valor null
		vai acontecer um nullPointerException em tempo de execucao 

	METODOS
		.toUpperCase();
		.toLowerCase();
		.substring();
		.trim();
		.concat();
		.replace(char, char);
		.replace(string, string)
		.equalsIgnoreCase();
		.compareTo() lexicograficamente
		.startsWith()
		.endsWith()
	
*/

public class StringTeste {
	public static void main(String[] args) {
		System.out.println();

		StringBuilder sb = new StringBuilder("Certificacao");
		char[] ch = new char[]{'j', 'a', 'v', 'a'};

		String a = "text 1";
		String b = new String("text 2");
		String c = new String(sb); // allow stringBuilder as parameter
		String d = new String(ch); // allow an char array
		String e = null;
		//System.out.println(e.toString()); nullPointerException

		System.out.println(10 + 10 + " os valores somam"); // 20 os valores somam
		System.out.println(10 + (10 + " os valores NAO somam")); // 1010 os valores NAO somam
		System.out.println(0 + 0 + " exibe apenas um"); // 0 exibe apenas um
		System.out.println(00 + " exibe apenas um"); // 0 exibe apenas um		
		System.out.println(0 + (0 + " exibe os dois")); // 00 exibe os dois

		System.out.println("Testa concatenacao - " + 10 + 20 + 30 + 40); // 10203040
		System.out.println("Testa concatenacao - " + (10 + 20 + 30 + 40)); // 100		
		System.out.println(10 + 20 + 30 + 40 + " - teste de concatenacao 02"); // 100

		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println("--------- usando compareTo -----------");
		String cpt1 = "java";
		String cpt2 = "Java";
		System.out.println(cpt1.compareTo(cpt2));

		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println("--------- usando indexOf -----------");
		String texto1 = "Vamos buscar uma palavra";
		System.out.println(texto1.indexOf("palavrao")); // nao existe - retorna -1
		System.out.println(texto1.indexOf("a")); // busca sempre a primeira ocorrencia (1)
		System.out.println(texto1.lastIndexOf("a")); // busca sempre a ultima ocorrencia (1)
		
		// devolve a posição da primeira letra (0) 
		System.out.println(texto1.indexOf("Vamos")); 		
		// devolve a posição da primeira letra (16) a partir da ultima ocorrencia da palavra Vamos
		System.out.println("Vamos para casa Vamos".lastIndexOf("Vamos"));

		// posicao inicial da busca, ou seja, a JVM vai buscar a primeira ocorrencia de 'a'
		// a partir da posição 2
		System.out.println(texto1.indexOf("a", 2)); // posicao 10

		// podemos fazer isso com a lastIndexOf tambem
		System.out.println(texto1.lastIndexOf("a", texto1.length() - 2)); // posicao 20	
	}
}