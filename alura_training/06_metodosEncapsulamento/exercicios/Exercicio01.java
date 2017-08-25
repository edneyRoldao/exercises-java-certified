class A {
    
    final String n;

    A() {
        a();
        n = "aprendendo";
    }

    void a() {
        System.out.println("testa");
    }
}

public class Exercicio01 extends A {
    void a() {
        System.out.println(n.length());
    }

    public static void main(String[] args) {
        new B();
    }
}

/*
    A) Compila e dá exception.
    B) Compila e não imprime nada.
    C) Não compila.
    D) Compila e imprime length.
    E) Compila e imprime "testa".
*/

















































/*
    We have a nullPointerException.

    The child class is overriding the a method and this method from paint it's ok, but
    on child it is trying acccess length() method from a null value. 
*/







