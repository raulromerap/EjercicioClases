package clases.ejercicio6;

public class ArrayArticulos {
	
	public static Gestisimal[] art = new Gestisimal[20];
	
	public static void listado() {
		int i = 0;
		while (i < art.length && art[i] != null) {
			System.out.println(art[i]);
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
			modificado = true;
			art[i].setPrecioVenta(precioVenta);
		}
		
		return modificado;
	}
	
	public boolean entradaMercancia(Gestisimal arts, int cant) {
		boolean entrada = false;
		int i = 0;
		
		
		while(i < art.length && (art == null || !art[i].equals(arts))) {
			i++;
		}
		
		if(i<art.length) {
			int stockInicial = art[i].getStock();
			entrada = true;
			stockInicial += cant;
			art[i].setStock(stockInicial);
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
			
			salida = true;
		}
		
		return salida;
	}
}
