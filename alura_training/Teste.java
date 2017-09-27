class A {

	void m2() throws java.io.FileNotFoundException {
		System.out.print("e");
		new java.io.FileInputStream("a.txt");
		System.out.print("f");
	}

	void m() throws java.io.IOException {
		System.out.print("c");
		m2();
		System.out.print("d");
	}

	public static void main(String[] args) throws java.io.FileNotFoundException {
		System.out.print("a");
		new A().m();
		System.out.print("b");		
	}
}