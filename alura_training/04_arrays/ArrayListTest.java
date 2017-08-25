import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("Java");
		arrayList.add("Java");
		
		boolean rm = arrayList.remove("Java"); // remove a primeira ocorrencia
		System.out.println(rm);// true

		System.out.println(arrayList.contains("Java"));// true


		// Formas de converter arrayList em array
		Object[] arrayList2 = arrayList.toArray();

		// Para recuperar o tipo certo, precisamos passar o tipo no construtor
		String[] arrayList3 = arrayList.toArray(new String[arrayList.size()]);

		// não precisamos passar o tamanho do array, basta passar 0 que a JVM resolve
		String[] arrayList4 = arrayList.toArray(new String[0]);


		// adicionando
		arrayList.add(2, "Javascript"); // podemos passar a posição
		arrayList.set(0, "Node JS"); // podemos mudar o valor de uma posição

		/*
			.indexOf("fgdsf");
			.lastIndexOf("fkkhjjhh"); // quando nao encontra, retorna -1
		*/


	}
}