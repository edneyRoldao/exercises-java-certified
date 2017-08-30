class Pai {
	int numero = 10;
	float preco;
}

class Filho extends Pai {
	int numero = 20;
	float preco;

	void imprime() {
		System.out.println("Chama var do pai com super: " + super.numero);
		System.out.println("Chama var do filho com this: " + this.numero);
	}

	void imprimePrecoDoPai() {
		System.out.println("preco do pai - " + super.preco);		
	}

	void imprimePrecoDoFilho() {
		System.out.println("preco do filho - " + this.preco);		
	}
}

class TestaThis {
	public static void main(String[] args) {
		new Filho().imprime();

		// Pra onde o valor do preco será atribuido ?
		// como estamos referenciando a classe filho, o preco dela
		// onde será atribuido o valor
		Filho p = new Filho();

		// vai para o pai
		((Pai) p).preco = 45.55f;

		// vai para o filho
		p.preco = 67.88f;
		
		p.imprimePrecoDoFilho();
		p.imprimePrecoDoPai();				

	}
}