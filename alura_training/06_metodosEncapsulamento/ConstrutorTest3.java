public class ConstrutorTest3 {

	public ConstrutorTest3(String... names) {
		System.out.println("With varargs");
	}

	public ConstrutorTest3() {
		System.out.println("I have no parameters");
	}

	public static void main(String[] args) {
		
		// which constructor will be called ?
		new ConstrutorTest3(/*the second one*/);

	}
}