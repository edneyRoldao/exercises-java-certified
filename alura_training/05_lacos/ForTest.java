public class ForTest {
	public static void main(String[] args) {
		
		/*
			We know that a normal for it does have three statements:
			1 - var initialization
			2 - a condition to stop loop
			3 - the increment

			All of them are optional
		*/
		for(;;) break; // it works
		for(int i = 0; ;) break; // it works
		for(int i = 0; i < 10; ) break; // it works
		System.out.println("all of them works pretty much");

		// we might initialize two vars on the same for
		for(int i = 0, j = 2; i < j; i++)
			System.out.println("it works !");

		// we might initialize two vars on the same for
		for(int i = 0, j = 10; i < j; i++, j--)
			System.out.println("i: " + i + " - j: " + j);

		// it works as well:
		int i;
		long j;
		for(i = 0, j = 10; i < j; i++, j--)
			System.out.println("i: " + i + " - j: " + j);

		// it works:
		for(int b = 0; b < 10; b++, System.out.println("looking crazy"))
			System.out.println(b);


		// When we have an infinity loop and the JVM is able to notice,
		// we might have a compile error after loop, like while statement
		//for(int i = 0; ; )	System.out.println("test");
		int a = 20; // error: unreachable.... 

		//for(int i = 0; true; )	System.out.println("test");
		int b = 20; // error: unreachable.... 

		//for(int i = 0; false; )	System.out.println("test"); //error: unreachable.... 

	}
}