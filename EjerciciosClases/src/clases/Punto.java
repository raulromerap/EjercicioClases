package clases;

public class Punto {

	
	/**
	 * Atributo que guarda la posicion x
	 */
	private int x;
	
	/**
	 * Atributo que guarda la posicion y
	 */
	private int y;
	
	/**
	 * 
	 * @param x
	 * @param y
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}


	public void imprime() {
		System.out.println("(" + this.x + ", " + this.y + ")");
	}
	
	public void desplaza(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	public double distacia(Punto p) {
		double distancia;
		distancia = Math.sqrt(Math.round(x - p.x) + Math.round(y - p.y));
		return distancia;
	}
}
