package javaBasicScripts;

public class Circunferencia {
	public static final double PI = 3.1415926536;
	private double radio;
	
	// Método constructor.
	public Circunferencia(double radio) {
		this.radio = radio;
	}

	/* Debido a que el atributo radio es privado, 
	 * la forma correcta de acceder a su valor es
	 * por medio de un método get.
	 */
	public double getRadio() {
		return this.radio;
	}

	/* 
	 * Un método de tipo operación es aquel que realiza un cálculo o
	 * modifica el estado de un objeto. Este tipo de métodos pueden
	 * incluir una lista de parámetros y puede devolver un valor o no.
	 * Si el método no devuelve un valor, se declara void.
	 */
	public double calcularPerimetro() {
		return 2 * PI * this.radio;
	}

	public double calcularArea() {
		return PI * this.radio * this.radio;
	}
}
