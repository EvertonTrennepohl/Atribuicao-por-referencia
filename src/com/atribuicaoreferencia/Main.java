package com.atribuicaoreferencia;

/* 
 * Em tipos primitivos a atribuição é feita por valor.
 * Já em classes (objetos) a atribuição é por referência. 
 *
 */

public class Main {

	public static void main(String[] args) {
		
		// Iniciando a variável intA e atribuindo o valor '1'.
		int intA = 1;
		// Iniciando a variável intB e atribuindo o valor de intA, ou seja, '1'.
		int intB = intA;
		
		// Aqui será impresso 'intA = 1 intB = 1'.
		System.out.println("intA = " + intA + " intB = " + intB);
		
		// Atribuindo o valor '2' para intA.
		intA = 2;
		
		// Aqui será impresso 'intA = 2 intB = 1'.
		// Mesmo alterando o valor de intA, intB não sofreu alteração.
		System.out.println("intA = " + intA + " intB = " + intB);
		
		// Instanciando o objA com valor 2
		MeuObj objA = new MeuObj(2);
		
		// Atribuindo objA à objB
		MeuObj objB = objA;
		
		// Aqui será impresso 'objA = 2 objB = 2.
		System.out.println("objA = " + objA + " objB = " + objB);
		
		// Alterando o valor do objA
		objA.setNum(5);
		
		// Como objA recebeu '5' e objB faz referência à objBA,
		// será impresso '5' para objA e objB.
		System.out.println("objA = " + objA + " objB = " + objB);

	}

}
