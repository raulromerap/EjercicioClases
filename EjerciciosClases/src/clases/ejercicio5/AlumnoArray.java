package clases.ejercicio5;

public class AlumnoArray {

	public static Alumno[] alumnos = new Alumno[30];

	public static void listado() {
		int i = 0;
		while (i < alumnos.length && alumnos[i] != null) {
			System.out.println(alumnos[i]);
			i++;
		}
	}

	public boolean agrega(String nombre, double notaMedia) {
		boolean agregado = false;
		int i = 0;

		while (i < alumnos.length && alumnos[i] != null) {
			i++;
		}

		if (i < alumnos.length) {
			alumnos[i] = new Alumno(nombre, notaMedia);
		}

		return agregado;
	}

	public boolean modificar(String nombre, double notaMedia) {
		boolean modificado = false;
		int i = 0;
		while(i < alumnos.length && (alumnos == null || !alumnos[i].equals(nombre))) {
			i++;
		}
		
		if(i < alumnos.length) {
			alumnos[i].setNotaMedia(notaMedia);
			modificado = true;
		}
		
		return modificado;
	}

	public boolean borrar(String nombre) {
		boolean borrado = false;
		int i = 0;
		
		while(i < alumnos.length && (alumnos == null || !alumnos[i].equals(nombre))) {
			i++;
		}
		
		if(i < alumnos.length) {
			alumnos[i] = null;
			borrado = true;
		}
		
		return borrado;
	}
	
	public static int encuentraAlumno(String nombre) {
		int pos = 0;
		while(pos < alumnos.length) {
			
		}
		return pos;
	}
	
}
