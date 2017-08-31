class Question02Test {
	public static void main(String[] args) {
		int var = 9;

		if(var++ < 10) {
			System.out.println(var + ": Hello World !");
		}else {
			System.out.println(var + ": Hello Universe !");
		}
	}
}

/*
	A) 9: Hello World !
	B) 10: Hello World !
	C) 9: Hello Universe !
	D) 10: Hello Universe ! 
	D) compilation fails
*/