package ejerciciomaestra;

import java.util.Scanner;

import clases.Articulo;

public class Principal {

	public static void main(String[] args) {
		int opc;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("BIENVENIDO A GESTISIMAL");
		menu();
		
		opc = sc.nextInt();
		sc.nextLine();
		
		switch(opc) {
		case 1:
			
			datos();
			
			break;
		case 2:
			
			
			
			
			break;
		}
		
		sc.close();
	}

	public static void menu() {
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificar");
		System.out.println("5. Entrada mercancía");
		System.out.println("6. Salida mercancía");
		System.out.println("7. Salir");
		System.out.println("Seleccione una opción");
	}
	
	private static void datos() {
		int codigo;
		String descripcion;
		double precioCompra;
		double precioVenta;
		int stock;
		Articulo art;
		boolean anyadido;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el código");
		codigo = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduzca la descripción");
		descripcion = sc.nextLine();
		
		System.out.println("Introduzca el precio compra");
		precioCompra = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Introduzca el precio venta");
		precioVenta = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Introduzca el stock");
		stock = sc.nextInt();
		sc.nextLine();
		
		art = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
		
		anyadido = Gestisimal.alta(art);
		if(anyadido) {
			System.out.println("Artículo añadido correctamente");
		} else {
			System.out.println("No se ha podido añadir el artículo");
		}
	}
	
}
