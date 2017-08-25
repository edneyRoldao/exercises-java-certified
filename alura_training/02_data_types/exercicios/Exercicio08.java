public class Exercicio08 {
	public static void main(String[] args) {

        String s = "estudando para a certificação";
        s.replace("e", 'a');
        System.out.println(s);

    }
}

/*
	A) Compila e imprime "astudando para a cartificação".
	B) Não compila.
	C) Compila e imprime "estudando para a certificação".
	D) Compila e imprime "studando para a crtificação".
*/


































































/*
    PEGADINHA:

    o replace pode receber tanto char quanto String como argumentos, porém estamos usando
    tipos diferentes na mesma chamada. Isso não é possivel.

    exp: "gsdfgsdfgsdfg".replace('char', "string");

*/





