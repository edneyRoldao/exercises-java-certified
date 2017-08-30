class Veiculo {

}

class Carro extends Veiculo {

}

class Moto extends Veiculo {

}

class TestaCasting {

	public static void main(String[] args) {
		
		// Tipos mais genericos podem receber mais especificos
		Veiculo v = new Carro();
		v = new Moto();

		// erro de compilação
		// nem sempre Veiculo é uma moto
		// incompatible types. Veiculo cannot be converted to Moto
		Veiculo v2 = new Moto();
		Moto m = v2;

		// Nesse caso o codgo compila pois estamos assumindo que os tipos
		// sao compativeis, porem nao sao. Entao... recebemos uma:
		// ClassCastException em tempo de execucao.
		Veiculo v3 = new Carro();
		Moto m2 = (Moto) v3;

		// nem compila, carro e moto nao sao compativeis mesmo ambos sendo veiculo
		Carro c = new Carro();
		Moto m3 = c;

	}

}

/*
	SOBRE INTERFACES:
		Podemos aplicar o casting em interfaces livremente mesmo se a classe 
		não implementar a interface pois pode ocorrer
		que a classe que está recebendo o casting tenha uma classe filha que
		implementa tal interface. O compilador não sabe disso. Portante ele deixa
		compilar.
		Ele só nao vai compilar se a classe for final, que significa que a classe
		nunca terá uma classe filha que implementa a interface, pois classes
		com modificador final nao podem ser extendidas.
*/