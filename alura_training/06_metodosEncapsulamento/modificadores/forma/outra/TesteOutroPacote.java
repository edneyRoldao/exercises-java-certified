package forma.outra;

import forma.*;

class TesteOutroPacote {
	public static void main(String[] args) {
		
		Forma f = new Forma();
		Quadrado q = new Quadrado();
		Triangulo t = new Triangulo();
		
		// lado pode estar com modificador protected
		//f.lado = 5.5;

		q.imprime();
		t.imprime();
	}
}
