// Dada a seguinte classe:
class E23 {
	String msg;

	void imprime() {
		if(!msg.isEmpty())
			System.out.println(msg);
		else 
			System.out.println("vazio");
	}
}
// O que acontece se chamarmos new B().imprime() ? 


/*
	a) Não compila.
	b) Compila, mas dá exceção na hora de rodar.
	c) Compila, roda e não imprime nada.
	d) Compila, roda e imprime “vazio”
*/