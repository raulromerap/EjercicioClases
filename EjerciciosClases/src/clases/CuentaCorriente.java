package clases;

public class CuentaCorriente {

	private String dni;

	private String nombre;

	private double saldo;

	public CuentaCorriente(String dni, double saldo) {

		if(dni != null && dni != "" && saldo > 0) {
		this.dni = dni;
		this.saldo = saldo;
		}

	}

	public CuentaCorriente(String dni, String nombre, double saldo) {

		if(dni != null && dni != "" && saldo > 0 && nombre != null && nombre != "") {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
		}

	}
	
	public boolean sacarDinero(double sacar) {
		
		boolean posible = false;
		
		if(saldo - sacar > 0) {
			posible = true;
			
			saldo -= sacar;
		}
		
		
		return posible;
	}

	public void ingresarDinero(double ingreso) {
		
		saldo += ingreso;
		
	}
	
	public void mostrarInformacion(boolean muestraInfo) {
		
		if(muestraInfo) {
			
			System.out.println("Nombre titular: " + nombre);
			System.out.println("DNI: " + dni);
			System.out.println("Saldo: " + saldo);
		}
		
	}
}
