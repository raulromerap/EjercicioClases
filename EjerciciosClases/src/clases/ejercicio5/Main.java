package clases.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		AlumnoArray alumn = new AlumnoArray();
		
		Scanner sc = new Scanner(System.in);
		
		int sel;
		
		String nombre = "";
		double notaMedia;
		
		
		do {
		menu();
		
		sel = sc.nextInt();
		sc.nextLine();
		
		switch(sel) {
		
			case 1:
				AlumnoArray.listado();
				
				break;
			case 2:
				System.out.println("Introduce el nombre");
				nombre = sc.nextLine();
				
				System.out.println("Introduce la nota media");
				notaMedia = sc.nextDouble();
				
				sc.nextLine();
				
				alumn.agrega(nombre,notaMedia);
				
				if(alumn.agrega(nombre, notaMedia)) {
					System.out.println("Se ha agreagado correctamente");
				}else {
					System.out.println("Error al agregar");
				}
				
				break;
			case 3: 
				System.out.println("Introduce el nombre");
				nombre = sc.nextLine();
				System.out.println("Introduce la nueva nota");
				notaMedia = sc.nextDouble();
				
				alumn.modificar(nombre, notaMedia);
				
				if(alumn.modificar(nombre, notaMedia)) {
					System.out.println("Se ha modificado correctamente");
				}else {
					System.out.println("Error al modificar");
				}
				
				break;
			case 4:
				System.out.println("Introduce el nombre");
				nombre = sc.nextLine();
				
				if(alumn.borrar(nombre)) {
					System.out.println("Se ha borrado correctamente");
				}else {
					System.out.println("Error al borrar");
				}
				
				break;
		};
		}while(sel != 5);
		
		System.out.println("Sistema apagado");
		
		sc.close();
	}
	
	static void menu() {
		
		System.out.println("ALUMNOS/AS");
		System.out.println("=================");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo alumno");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
		
	}
}
