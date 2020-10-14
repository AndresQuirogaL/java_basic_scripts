package javaBasicScripts;

/*
 * El for se debe utilizar cuando se sabe el número de veces que
 * se va a repetir el bloque de sentencias. Un for es útil cuando
 * se conoce el valor inicial para la variable de control del bucle
 * y además es necesario utilizar una expresión aritmética para
 * actualizar esta variable.
 */

public class FactorialFor {
	public static void main(String[] args) {
		int n = 5;        // n se inicializa a 5 para calcular 5!
		int factorial = 1; // factorial se inicializa a 1
		
		for (int i=1; i <= n; i++) {
			factorial = factorial * i;
		}
		
		System.out.println("El factorial de " + n + " es " +
						   factorial);
	}
}
