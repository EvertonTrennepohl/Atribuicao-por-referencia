package com.atribuicaoreferencia;

/* 
 * Em tipos primitivos a atribui��o � feita por valor.
 * J� em classes (objetos) a atribui��o � por refer�ncia. 
 *
 */

public class Main {

	public static void main(String[] args) {
		
		// Iniciando a vari�vel intA e atribuindo o valor '1'.
		int intA = 1;
		// Iniciando a vari�vel intB e atribuindo o valor de intA, ou seja, '1'.
		int intB = intA;
		
		// Aqui ser� impresso 'intA = 1 intB = 1'.
		System.out.println("intA = " + intA + " intB = " + intB);
		
		// Atribuindo o valor '2' para intA.
		intA = 2;
		
		// Aqui ser� impresso 'intA = 2 intB = 1'.
		// Mesmo alterando o valor de intA, intB n�o sofreu altera��o.
		System.out.println("intA = " + intA + " intB = " + intB);
		
		// Instanciando o objA com valor 2
		MeuObj objA = new MeuObj(2);
		
		// Atribuindo objA � objB
		MeuObj objB = objA;
		
		// Aqui ser� impresso 'objA = 2 objB = 2.
		System.out.println("objA = " + objA + " objB = " + objB);
		
		// Alterando o valor do objA
		objA.setNum(5);
		
		// Como objA recebeu '5' e objB faz refer�ncia � objBA,
		// ser� impresso '5' para objA e objB.
		System.out.println("objA = " + objA + " objB = " + objB);

	}

}
