//  Qual é a saída nos dois casos ?
class E25 {
	public static void main(String[] args) {
		String s = "Caelum";
		s.concat(" - Ensino e Inovação");
		System.out.println(s);

		StringBuilder sb = new StringBuilder("Caelum");
		sb.append(" - Ensino e Inovação");
		System.out.println(sb);
	}
}


/*
	a) ‘Caelum‘ e ‘Caelum - Ensino e Inovação‘.
	b) ‘Caelum - Ensino e Inovação‘ e ‘Caelum - Ensino e Inovação‘.
	c) ‘Caelum‘ e ‘Caelum‘.
	d) ‘Caelum - Ensino e Inovação‘ e ‘Caelum‘.
*/