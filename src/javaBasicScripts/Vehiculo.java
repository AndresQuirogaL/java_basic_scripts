package javaBasicScripts;

public class Vehiculo {
	String matricula;
	String marca;
	String modelo;
	String color;
	
	double tarifa;
	boolean disponible;
	
	// Método constructor de la clase Vehiculo
	public Vehiculo(String matricula,
					String marca,
					String modelo,
					String color,
					double tarifa) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tarifa = tarifa;
		this.disponible = false;
	}

	/* Para crear objetos, basta con declarar una variable del
	 * tipo de clase definido.
	 * Vehiculo vehiculo1;
	*/

	/* 
	 * La  instanciación  de  un  objeto  se  realiza  ejecutando  el
	 * método  constructor  de la clase.
	 * Para crear el objeto y asignar un espacio de memoria es necesario
	 * realizar la instanciación con el operador new.
	 * Vehiculo  vehiculo2 = new Vehiculo("IBZ 087", "BMW", "GTI", "Blanco", 300.0);
	*/
	
	/* Para acceder a los atributos de los objetos de la clase Vehiculo se definen
	 * los métodos ‘get’ y ‘set’. Los métodos ‘get’ se utilizan para consultar el 
	 * estado de un objeto y los métodos ‘set’ para modificar su estado.
	 */
	public String getMatricula() {
		return this.matricula;
	}

	public String getMarca() {
		return this.marca;
	}

	public String getModelo() {
		return this.modelo;
	}
	
	public String getColor() {
		return this.color;
	}

	public double getTarifa() {
		return this.tarifa;
	}

	public boolean getDisponible() {
		return this.disponible;
	}

	public String getAtributos() {
		return "Matrícula: " + getMatricula() + " " +
			   " Modelo: " + getMarca() + " " + getModelo() +
			   " Color: " + getColor() +
			   " Tarifa: " + getTarifa() +
			   " Disponible: " + getDisponible();
		} 
	
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}
