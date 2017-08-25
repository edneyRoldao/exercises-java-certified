public class TestaCarro {
	public static void main(String[] args) {
		Carro c = new Carro();
		c.setNome("Mustang");
		c.setAno(2012);

		System.out.println("Nome: " + c.getNome());
		System.out.println("Ano: " + c.getAno());

	}
}