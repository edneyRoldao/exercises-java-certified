package calculadora.teste;

import calculadora.cientifica.*;
import calculadora.financeira.*;

public class Teste {
	public static void main(String[] args) {
		CalculadoraFinanceira cf = new CalculadoraFinanceira();
		CalculadoraCientifica cc = new CalculadoraCientifica();

		System.out.println("calculadora financeira: " + cf.calcularJurosCompostos(10.45));
		System.out.println("calculadora cientifica: " + cc.contarAtomosFormula(56));		
	}
}