// Escolha a opção adequada ao tentar compilar os arquivos a seguir a/A.java
package a;
class A {
	b.B var;
}

// arquivo a/C.java
package a;
class C {
	b.B var;	
}

// arquivo a/b/B.java
package a.b;
class B {
}

/*
	a) Erro de compilação somente no arquivo A.
	b) Erro de compilação somente no arquivo B.
	c) Erro de compilação somente no arquivo C.
	d) Erro de compilação nos arquivos A e B.
	e) Erro de compilação nos arquivos A e C.
	f) Erro de compilação nos arquivos B e C.
	g) Compila com sucesso.
*/