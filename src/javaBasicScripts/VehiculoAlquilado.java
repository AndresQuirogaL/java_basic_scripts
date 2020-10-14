package javaBasicScripts;

public class VehiculoAlquilado {
	/* 
	 * se define una composición que declara un objeto de la clase Vehiculo
	 * y un objeto de la clase Cliente. La nueva clase VehiculoAlquilado
	 * relaciona una instancia de la clase Vehiculo con una instancia  de la
	 * clase Cliente y crea objetos que almacenan relaciones entre clientes
	 * y vehículos de alquiler.
	 */
	private Cliente cliente;
	private Vehiculo vehiculo;   
	private int diaAlquiler;
	private int mesAlquiler;
	private int añoAlquiler;
	private int totalDiasAlquiler;

	public VehiculoAlquilado(Cliente cliente,
							 Vehiculo vehiculo,
							 int diaAlquiler, 
							 int mesAlquiler,
							 int añoAlquiler,
							 int totalDiasAlquiler) {
		this.cliente = cliente;
		this.vehiculo = vehiculo;
		this.diaAlquiler = diaAlquiler;
		this.mesAlquiler = mesAlquiler;
		this.añoAlquiler = añoAlquiler;
		this.totalDiasAlquiler = totalDiasAlquiler;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public Vehiculo getVehiculo() {
		return this.vehiculo;
	} 
}
