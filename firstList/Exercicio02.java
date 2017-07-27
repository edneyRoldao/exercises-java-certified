public class Exercicio02 {

	public static void main(String[] args) {

		int n1 = Integer.parseInt(args[0]);

		switch(n1) {
			case 4: case 5: case 6: case 7: case 8:
				System.out.println("Hit");
				break;

			case 9: case 10: case 11:
				System.out.println("Double");
				break;

			case 15: case 16:
				System.out.println("Surrender");
				break;

			default:
				System.out.println("Stand");

		}

	}

}

/*
	Which two code fragments can be inserted at line n1, independently, enable to print Stand ?
	
	A) n1 = 6
	B) n1 = 10
	C) n1 = 14
	D) n1 = 18
*/