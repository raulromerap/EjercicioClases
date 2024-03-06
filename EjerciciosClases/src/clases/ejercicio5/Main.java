package clases.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String[] alumnos = new String[30];
		
		Scanner sc = new Scanner(System.in);
		
		int sel;
		
		menu();
		
		sel = sc.nextInt();
		
		
		
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
