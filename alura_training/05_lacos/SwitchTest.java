public class SwitchTest {
	public static void main(String[] args) {
		
		// testaSwitch1();
		testaSwitch2(5);

	}

	public static void testaSwitch1() {
		int i = 10;
		int hum = 1; // para funcionar precisamos colocar o modificador final nessa variavel.
		final int hum2 = 1; // esso pode pois é uma constante

		// Não compila pois estamos passando uma variavel que pode mudar (nao constante)
		// para compilar precisamos colocar o modificador final
		switch(i) {
			//case hum:
			case hum2:
				System.out.println(i);
				break;
			case 3:
				System.out.println(i);
				break;
			case 4:
				System.out.println(i);
				break;
			default:
				System.out.println("Não exizte nos cases");				
		}

	}

	public static void testaSwitch2(final int naoPodeIrNoCase) {
		int i = 10;
		final int podeIrNoCase = 5;
		switch(i) {
			//case naoPodeIrNoCase:
			case podeIrNoCase:		
				System.out.println("não funciona mesmo a declaração do final");
			case 0:
				System.out.println("zero");				
		}
	} 

}