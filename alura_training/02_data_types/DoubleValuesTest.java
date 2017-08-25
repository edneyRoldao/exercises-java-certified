public class DoubleValuesTest {

	// Usando double por notação científica
	public static void main(String[] args) {
		
		double d = 3.1E2;
		System.out.println(d);

		float f = 3e3f;
		System.out.println(f);

		long l = 1_326_458___745_875_879l;
		System.out.println(l);

		// podemos colocar o underscore entre as letras da base hexadecimal pois elas 
		// represantam valores numéricos
		int h = 0XE_E;
		System.out.println(h);

		// no char podemos utilizar os valores numéricos e unicode
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u03A9';
		System.out.println(c3);

		// podemos declarar variáveis com acentuação (unicode)
		int não = 25; // compila
		int nao99222 = 30; // compila
		int nao_nao_ = 35; // compila
		int nao$$$$$$ = 40; // compila
		int $valor = 10; // compila
		int _valor = 5; // compila
		System.out.println(não);


	}
}