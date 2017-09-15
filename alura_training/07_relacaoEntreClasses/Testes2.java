class Pai {
	String s = "Sou membro da classe pai";
}

class Filho extends Pai {
	String s = "Sou membro da classe filho";

	public void imprime() {
		String s = "Sou local";
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
	}

	public static void main(String[] args) {
		new Filho().imprime();
	}
}
