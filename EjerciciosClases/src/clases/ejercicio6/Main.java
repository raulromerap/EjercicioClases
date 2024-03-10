package clases.ejercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayArticulos art = new ArrayArticulos();
		
		Scanner sc = new Scanner(System.in);
		
		int sel;
		
		int codigo;
		String descripcion = "";
		double precioCompra;
		double precioVenta;
		int stock;
		int cant;
		
		do {
			menu();
			sel = sc.nextInt();
			sc.nextLine();
			
			switch(sel) {
			
			case 1:
				ArrayArticulos.listado();
				
				break;
				
			case 2:
				System.out.println("Introduce el codigo");
				codigo = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduce la descripcion");
				descripcion = sc.nextLine();
				System.out.println("Introduce el precio de compra");
				precioCompra = sc.nextDouble();
				sc.nextLine();
				System.out.println("Introduce el precio de venta");
				precioVenta = sc.nextDouble();
				sc.nextLine();
				System.out.println("Introduce el stock");
				stock = sc.nextInt();
				sc.nextLine();
				
				if(art.alta(codigo, descripcion, precioCompra, precioVenta, stock)) {
					System.out.println("Se ha dado de alta al articulo correctamente");
				}else {
					System.out.println("Error al dar de alta");
				}
				
				break;
			case 3:
				System.out.println("Introduce el codigo");
				codigo = sc.nextInt();
				sc.nextLine();
				
				if(art.baja(codigo)) {
					System.out.println("Se ha dado de baja al articulo correctamente");
				}else {
					System.out.println("Error al dar de baja");
				}
				
				break;
			case 4:
				System.out.println("Introduce el codigo");
				codigo = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduce el precio de venta");
				precioVenta = sc.nextDouble();
				sc.nextLine();
				
				if(art.modificar(codigo, precioVenta)) {
					System.out.println("Se ha modificado el articulo correctamente");
				}else {
					System.out.println("Error al modificar");
				}
				break;
			case 5:
				System.out.println("Introduce el codigo");
				codigo = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduce la cantida de articulos de entrada");
				cant = sc.nextInt();
				sc.nextLine();
				
				if(art.entradaMercancia(codigo, cant)) {
					System.out.println("Se ha registrado la entrega correctamente");
				}else {
					System.out.println("Error de registro");
				}
				break;
			case 6:
				System.out.println("Introduce el codigo");
				codigo = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduce la cantida de articulos de salida");
				cant = sc.nextInt();
				sc.nextLine();
				
				if(art.entradaMercancia(codigo, cant)) {
					System.out.println("Se ha registrado la salida correctamente");
				}else {
					System.out.println("Error de registro");
				}
			}
			
		}while(sel != 7);
	}

	public static void menu() {
		
		System.out.println("\t Menu");
		System.out.println("========================");
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificacion");
		System.out.println("5. Entrada de mercancia");
		System.out.println("6. Salida de mercancia");
		System.out.println("7. Salir");
		System.out.println("========================");
		
	}
	
}
