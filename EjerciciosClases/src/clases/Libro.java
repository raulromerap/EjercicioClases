package clases;

public class Libro {

	/**
	 * Atributo que guarda el titulo del libro
	 */
	private String titulo = "";

	/**
	 * Atributo que guarda el nombre del autor
	 */
	private String autor = "";

	/**
	 * Atributo que guarda el numero de ejemplares
	 */
	private int ejemplares;

	/**
	 * Atributo que guarda el numero de ejemplares prestados
	 */
	private int prestados;

	public Libro() {

	}

	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.prestados = prestados;
	}

	public boolean prestamo(int cantidad) {

		boolean prestamo = false;

		if (this.ejemplares >= this.prestados) {
			prestamo = true;
			this.prestados += cantidad;
			this.ejemplares -= cantidad;
		}

		return prestamo;
	}

	public boolean devolucion(int cantidad) {

		boolean devolucion = false;

		if (this.prestados < ejemplares) {
			this.prestados -= cantidad;
			this.ejemplares += cantidad;
		}
		
		return devolucion;
	}
}
