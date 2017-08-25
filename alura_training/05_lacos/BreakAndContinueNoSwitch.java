public class BreakAndContinueNoSwitch {
	public static void main(String[] args) {
		
		for(int i = 0; i < 4; i++) {
			System.out.println("I'm before switch");
			switch(i) {
				case 0:
				case 1:
					System.out.println("Case " + i);
					break;
				case 2:
					System.out.println("Legal " + i);
					continue; // it's applying on for
				case 3:
					System.out.println("cheguei no 3");
					break;
				default:
					System.out.println("Estranho...");
			}

			System.out.println("I'm after switch");
		}

		fora: for(int a=0;a<30;a++)
			for(int b=0;b<1;b++)
				if(a+b==25) continue fora;
			else if(a+b==20) break;
			else System.out.println(a);
	}
}