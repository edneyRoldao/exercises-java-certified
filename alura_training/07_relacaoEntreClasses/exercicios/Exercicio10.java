class B {
    int x() { return y();}
    int y() { return 3; }
}

class C extends B {
    C() {
        super();
        z(x());
    }

    void z(int i) {
        System.out.println(i);
    }

    int y() { return 2; }
}

class A {
    public static void main(String[] args) {
        new C();
    }
}

/*
    A) Compila e imprime 3.
    B) Não compila
    C) Compila e imprime 2.
*/