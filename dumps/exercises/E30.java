	
	// Given the code fragment:
	class Test {
		public static void main(String[] args) {
			String[] arr = {"A", "B", "C", "D"};
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
				if(arr[i].equals("C")) {
					continue;
				}
				System.out.println("Word done");
				break;
			}
		}
	}

	/*
		A) A B C Word done
		B) A B C D Word done
		C) A Word done
		D) Compilations fails
	*/

