package javaBasicScripts;

/*
 * El do-while se debe utilizar cuando el bloque
 * de sentencias se debe ejecutar al menos una vez.
 */

public class FactorialDoWhile {
	public static void main(String[] args) {
		int n = 5;        // n se inicializa a 5 para calcular 5!
		int factorial = 1; // factorial se inicializa a 1
		
		int i = 1;        // el valor inicial de i es 1
		
		do {
			factorial = factorial * i;
			i++;
		} while (i <= n);
		
		System.out.println("El factorial de " + n + " es " +
						   factorial);
	}
}
