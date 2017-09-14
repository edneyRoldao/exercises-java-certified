
	// Given the code fragment:
	class Test {
		public static void main(String[] args) {
			String str1 = "Java";
			String str2 = new String("java");
			// Line n1
			{
				System.out.println("Equal");
			} else {
				System.out.println("Not Equal");
			}	
		}
	}

	/*  which code fragment, when inserted at line n1, enables 
		the App class to print Equal ?

		A) String str3 = str2;
		   if(str1 == str3)

		B) if(str1.equalsIgnoreCase(str2));

		C) String str3 = str2;
		   if(str1.equals(str3))

		D) if(str1.toLowerCase() == str2.toLowerCase())
	*/