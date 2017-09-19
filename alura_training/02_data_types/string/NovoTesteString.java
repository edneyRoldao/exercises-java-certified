class NovoTesteString {
	public static void main(String[] args) {
		
		// charAt devolve stringIndexOutOf...

		// podemos usar indexOf a partir de uma posição:
		String s = "qual o doce mais doce que o doce de batat doce, e o doce de batata doce";
		int index = s.indexOf("doce", 10);
		System.out.println(index);

		// Entendendo pool de string - só vai para o pool variáveis criadas de forma literal
		// quando concatenamos dois literais, eles permanecem literais
		// concatenações com referencia à variáveis, não vão para o pool
		// qualquer valor de string que resultante de um método como toString, substring e outros,
		// não vai para o pool.

		/* exceção à regra acima:
		   Se você cria um valor de forma literal, ele vai para o pool de strings.
		   Se você tentar alterar o valor desse string por meio dos métodos de string, como: toString
		   substring, etc. Caso o resultado for igual ao valor que a variável tinha antes, um novo objecto
		   não será criado e o valor será obtido a partir do pool de strings
	   */
		String n1 = "edney";
//		String n2 = "edney";
		String n2 = new String("edney");
		System.out.println(n1 == n2);

		String n3 = n2.toString();
		System.out.println(n1 == n3);

		n3 = n2.substring(0);
		System.out.println(n1 == n3);

		n3 = n2.toLowerCase();
		System.out.println(n1 == n3);

		n3 = n2.toUpperCase();		
		n3 = n2.toLowerCase();
		System.out.println(n1 == n3);

		String n5 = new String("edney");
		System.out.println(n1 == n5);

		n1 = "roldao";
		System.out.println(n1);
		System.out.println(n2);

		String n6 = new String("giselle"); // temos a criação de dois objetos - o n6 e o pool de string.
		String n7 = "giselle";
		System.out.println("#########  novo teste  ###########");
		System.out.println( n6 == n7);

		// contar objetos criados
		String h = new String("hello "); 	// 2
		String h1 = "hello "; 				// 0
		String w = "world";					// 1  
		System.out.println("hello ");		// 0
		System.out.println(h1 + "world");	// 1
		System.out.println("Hello " == h1); // 1

	}
}