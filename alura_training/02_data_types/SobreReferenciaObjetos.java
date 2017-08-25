class Calculadora {
	double valor;
}

/*
	What's the takeaway about Object reference:
	When we copy a reference from an object to another, we can change any value
	from either of them that will be reflected on both of them. 
*/

public class SobreReferenciaObjetos {
	public static void main(String[] args) {
		Calculadora c1 = new Calculadora();
		c1.valor = 15;
		Calculadora c2 = c1; 

		System.out.println(c1.valor);
		System.out.println(c2.valor);
		System.out.println();
		System.out.println();

		c1.valor = 30; // change just one object.
		System.out.println(c1.valor); // 30
		System.out.println(c2.valor); // 30
	}
}