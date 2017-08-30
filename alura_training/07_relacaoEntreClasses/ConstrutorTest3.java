/*
	Aqui temos um erro em tempo de execução.
	java.lang.StackOverFlowError
*/
class StrackOverFlowNoConstrutor {

	StrackOverFlowNoConstrutor() {
		this("chamando outro construtor");
		System.out.println("construtor sem argumento");
	}

	StrackOverFlowNoConstrutor(String v) {
		new StrackOverFlowNoConstrutor();
		System.out.println("construtor com argumento");
	}

}

class TestaLoopPeloConstrutor {
	public static void main(String[] args) {
		
		// Aqui teremos um erro em tempo de execução pois estamos chamando 
		// construtores de forma recusiva indiretamente por meio da instanciação
		// de um Object e o compilador não consegue perceber 
		new StrackOverFlowNoConstrutor("chamando com argumento");

	}
}