package clases.ejercicio6;

public class ArrayArticulos {
	
	public static Gestisimal[] art = new Gestisimal[20];
	
	public static void listado() {
		int i = 0;
		while (i < art.length && art[i] != null) {
			System.out.println(art[i]);
			System.out.println("-----------------");
			i++;
		}
	}
	
	public boolean alta(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
		boolean alta = false;
		int i = 0;

		while (i < art.length && art[i] != null) {
			i++;
		}

		if (i < art.length) {
			art[i] = new Gestisimal(codigo, descripcion, precioCompra, precioVenta, stock);
			alta = true;
		}

		return alta;
	}
	
	public boolean baja(int codigo) {
		boolean baja = false;
		int i = 0;
		
		while(i < art.length && (art == null || !art[i].equals(codigo))) {
			i++;
		}
		
		if(i < art.length) {
			art[i] = null;
			baja = true;
		}
		
		return baja;
	}
	
	public boolean modificar(int codigo, double precioVenta) {
		boolean modificado = false;
		int i = 0;
		while(i < art.length && (art == null || !art[i].equals(codigo))) {
			i++;
		}
		
		if(i < art.length) {
			art[i].setPrecioVenta(precioVenta);
			modificado = true;
		}
		
		return modificado;
	}
	
	public boolean entradaMercancia(int codigo, int cant) {
		boolean entrada = false;
		int i = 0;
		
		while(i < art.length && (art == null || !art[i].equals(codigo))) {
			i++;
		}
		
		if(i<art.length) {
			art[i].setStock(art[i].getStock() + cant);
			entrada = true;
		}
		
		return entrada;
	}
	
	public boolean salidaMercancia(int codigo, int cant) {
		boolean salida = false;
		int i = 0;
		
		while (i < art.length && art[i] != null) {
			i++;
		}
		
		if(i<art.length) {
			art[i].setStock(art[i].getStock() - cant);
			salida = true;
		}
		
		return salida;
	}
}
