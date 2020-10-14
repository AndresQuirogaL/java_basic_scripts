package javaBasicScripts;

/*
 * El while se debe utilizar cuando no se sabe el
 * número de veces que se va a repetir el bloque de sentencias.
 */

public class FactorialWhile {
	public static void main(String[] args) {
		int n = 5;        // n se inicializa a 5 para calcular 5!
		int factorial = 1; // factorial se inicializa a 1 
				
		int i = 1;        // el valor inicial de i es 1
		
		while (i <= n) {
			factorial = factorial * i;
			i++;
		}
		
		System.out.println("El factorial de " + n + " es " +
						   factorial);
	}
}
