/*
	Forçando um recusive constructor invocation
	Erro em tempo de compilação
*/
class LoopNoConstrutor {

	LoopNoConstrutor() {
		this("chama construtor com argumento");
	}

	LoopNoConstrutor(String v) {
		this();
		System.out.println(v);
	}

}

class TestaLoop {
	public static void main(String[] args) {
		
		// Não vai compilar pois o compilador sabe que vai ocorrer 
		// um loop infinito
		new LoopNoConstrutor();

	}
}