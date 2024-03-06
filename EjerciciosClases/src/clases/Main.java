package clases;

public class Main {

	public static void main(String[] args) {
		
		Articulo art1 = new Articulo("Coke", 1.5, 10);
		
		double descuento = 20.4;
		
		System.out.println(art1);
		
		art1.getPVPDescuento(descuento);
		
		art1.vender(4);
		
		System.out.println(art1);
	}

}
