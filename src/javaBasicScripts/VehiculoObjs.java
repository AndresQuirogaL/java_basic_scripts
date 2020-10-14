package javaBasicScripts;

public class VehiculoObjs {
	public static void main (String[] args) {
		/*
		 * Ejemplo de referencia null: Vehiculo vehiculo1;
		 * Una referencia a un objeto puede no tener asignada una instancia.
		 * Esto puede ocurrir porque se ha declarado el objeto pero no se ha
		 * instanciado, es decir no se ha creado un objeto con el operador new.
		 * Existe un valor especial, llamado null que indica que un objeto no se ha instanciado.
		 * En un programa Java no se deben dejar referencias de objetos sin instanciar.
		 * Es necesario asegurarse de que los objetos existen para evitar referencias null.
		 * Para saber si una referencia está instanciada o no, se puede comparar con null. 
		 */
		Vehiculo vehiculo3;

		Vehiculo  vehiculo2 = new Vehiculo("IBZ 087",
										   "BMW",
										   "GTI",
										   "Blanco",
										   300.0);
		
		/*
		 * Para mostrar la tarifa del objeto vehiculo1 se puede acceder directamente al
		 * atributo tarifa del objeto o se puede ejecutar el método getTarifa().
		 * Esto se debe a que los atributos de clase Vehiculo son de acceso público porque
		 * se han declarado public en vez de private. Los atributos de la clase se deben
		 * declarar private y para acceder a ellos se debe utilizar un método ‘get’. 
		 */
		System.out.println("Matricula     : " + vehiculo2.matricula);
		System.out.println("Marca y modelo: " + vehiculo2.marca + " " + vehiculo2.modelo);
		System.out.println("Color         : " + vehiculo2.color);
		System.out.println("Tarifa        : " + vehiculo2.tarifa);

		/*
		 * Un alias es una referencia más al mismo espacio de memoria del objeto original.
		 * Por ejemplo, si se crea el objeto vehiculo2 y después se declara otro objeto
		 * vehiculo3 y a continuación se asigna la referencia de vehiculo1 a vehiculo3,
		 * entonces vehiculo3 es un alias de vehiculo2. Esto significa que el espacio de
		 * memoria de vehiculo2 y vehiculo3 es el mismo.
		 */
		vehiculo3 = vehiculo2;
	}
}
