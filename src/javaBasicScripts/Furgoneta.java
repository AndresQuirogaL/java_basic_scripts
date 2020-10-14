package javaBasicScripts;

public class Furgoneta extends Vehiculo {
	private int carga;
	private int volumen;

	public Furgoneta(String matricula,
			 		 String marca,
			 		 String modelo,
			 		 String color,
			 		 double tarifa,
			 		 int carga,
			 		 int volumen) {
		super(matricula, marca, modelo, color, tarifa);
		this.carga = carga;
		this.volumen = volumen;
	}
	
	public int getCarga() {
		return this.carga;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public String getAtributos() {
		return super.getAtributos() +
				" Carga (kg): " + this.carga +
				" Volumen (m3): " + this.volumen;
	}
}
