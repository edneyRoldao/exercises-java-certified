
	// Given:
	public class MainTest {
		public static void main(int[] args) {
			System.out.println("int main " + args[0]);
		}
		
		public static void main(Object[] args) {
			System.out.println("Object main " + args[0]);
		}
		
		public static void main(String[] args) {
			System.out.println("String main " + args[0]);
		}
	}
	
	// and commands:
	// javac MainTest.java
	// java MainTest 1 2 3

	/* WHAT IS THE RESULT ?
		A) int main 1
		B) Object main 1
		C) String main 1
		D) Compilation fails
		E) An Exception is thrown at runtime
	*/