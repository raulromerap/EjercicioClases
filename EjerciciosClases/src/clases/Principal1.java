package clases;

import java.util.Scanner;

public class Principal1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String dni = "";
		
		String nombre = "";
		
		double saldo = 0;
		
		String eleccion = "";
		
		menu();
		
		
		
	}
	
	public static void menu() {
		
		System.out.println("Elija la operación que quieres realizar");
		System.out.println("Sacar dinero");
		System.out.println("Ingresar dinero");
		System.out.println("Mostrar informacion");
		
	}

}
