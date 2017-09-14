	import java.util.*;
		
	// Given the code fragment:
	class Test {
		public static void main(String[] args) {
			List<String> names = new ArrayList<>();
			names.add("Robb");
			names.add("Bran");
			names.add("Rick");
			names.add("Bran");

			if(names.remove("Bran")) {
				names.remove("Jon");
			}

			System.out.println(names);
		}
	}

	/* WHAT IS THE RESULT ?
		A) [Robb, Rick, Bran]
		B) [Robb, Rick]
		C) [Robb, Bran, Rick, Bran]
		D) An exception is thrown at runtime
	*/
