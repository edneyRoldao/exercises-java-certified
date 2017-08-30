class B extends C { 
	int m(int a) { 
		return 1; 
	} 
}

class C extends A { 
	int m(double b) { 
		return 3; 
	} 
}

class A extends B {
    int m(String c) { 
    	return 3; 
    }

    public static void main(String[] args) {
        System.out.println(new C().m(3));
    }
}

/*
	A) Compila e imprime 3.
	B) Compila e imprime 1.
	C) Compila e imprime 2.
	D) O código não compila.
	E) Compila e imprime 1, 2, 3.















































nao compila pois temos um ciclo de heranca













*/