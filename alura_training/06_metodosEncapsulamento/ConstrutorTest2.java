public class ConstrutorTest2 {

	// Here we have a loop infinity
	public ConstrutorTest2() {
		new ConstrutorTest2();
	}

	public static void main(String[] args) {
		new ConstrutorTest2(); // StackOverFlowError
	}

}