import java.util.*;

public class Exercicio08 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
	    a.add(0,"a");
	    a.add(1,"b");
	    
	    for(Iterator<String> i=a.iterator();i.hasNext();i.next()) {
	        String element = i.next();
	        System.out.println(element);
	    }    

	}
}


/*
	A) Não compila.
	B) Compila e imprime a e b.
	C) Compila e imprime b.
	D) Compila e imprime a.
	E) Compila e imprime b e a.
*/

















































/*
	só vai imprimir o a pq estamos chamando o next() 2x.
*/
