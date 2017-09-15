class Pai {
	Pai(String a) {
		System.out.println("No pai: " + a);
	}
}

class Filha extends Pai {
	Filha(String a) {
		super(a);
		System.out.println("Na Filha: " + a);
	}

	Filha() {
		this("aaa");
	}

}

class TestConstructor {

	public TestConstructor() {
		//this(10); // recursive constructor invocation
		new TestConstructor(10);
	}

	public TestConstructor(int x) {
		this();
	}

	public static void main(String[] args) {
		new TestConstructor();
	}
}