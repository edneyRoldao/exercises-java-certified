// Choose a suitable option when try to compile and run the following file
// without parameters at command line, as E04.java
package a.b.c;

import java.util.*;

class E04 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		for(String arg : args) {
			if(new E().exists(arg))
				list.add(arg);
		}
	}
} 

import java.io.*;

class E {
	public boolean exists(String name) {
		File f = new File(name);
		return f.exists();
	}
}










































































/*
	a) O arquivo não compila.
	b) O arquivo compila mas dá erro de execução pois o array é nulo.
	c) O arquivo compila mas dá erro de execução pois o array tem tamanho zero.
	d) Roda e imprime false.
	e) Roda e imprime true.
	f) Roda e não imprime nada.
*/