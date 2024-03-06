package clases.ejercicio5;

public class Alumno {

	private String nombre = "";
	private double notaMedia;
	
	public Alumno() {
	
	}

	public Alumno(String nombre, double notaMedia) {
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	
	
	
	public String toString() {
		String cadena = "";
		cadena += "Nombre: " + this.nombre + " Nota media: " + this.notaMedia;
		return cadena;
	}
	
}
