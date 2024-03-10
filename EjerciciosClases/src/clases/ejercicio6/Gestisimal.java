package clases.ejercicio6;

public class Gestisimal {

	private int codigo;
	private String descripcion;
	private double precioCompra;
	private double precioVenta;
	private int stock;

	public Gestisimal() {

	}

	public Gestisimal(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
		if(codigo > 0) {
			this.codigo = codigo;
		}
		if(descripcion != null && !descripcion.equals("")) {
			this.descripcion = descripcion;
		}
		if(precioCompra > 0) {
			this.precioCompra = precioCompra;
		}
		if(precioVenta > 0) {
			this.precioVenta = precioVenta;
		}
		if(stock > 0) {
			this.stock = stock;
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String toString() {
		return this.codigo + "\n" + this.descripcion + "\n" + this.precioCompra + "\n" + this.precioVenta + "\n" + this.stock + "\n";
	}

}
