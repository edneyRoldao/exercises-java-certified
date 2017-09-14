	
	// Given the code fragment:
	class Test {
		public static void main(String[] args) {
			int x = 5;
			while(isAvailable(x)) {
				System.out.print(x);
			}	
		}

		public static boolean isAvailable(int x) {
			return x-- > 0 ? true : false;
		}
	}

	/* Which modifications enables the code to print 54321 ?

		A) replace line 7 with System, out. print(--x);
		B) at line 1, insert x--
		C) replace line 7 with --x, and, at line 8, insert System, out. print(x);
		D) Replace line 12 With return (x > 0) ? false: true;
	*/
