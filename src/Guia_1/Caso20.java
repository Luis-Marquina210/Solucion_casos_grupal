package Guia_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00");

		System.out.print("Ingrese el Producto.........: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese precio de costo.....: ");
		float costo = sc.nextFloat();
		
		System.out.print("Ingrese la ganancia del mes.: ");
		float gana = sc.nextFloat();
		
		
		float venta1 = costo + gana;
		float venta2 = venta1 * 0.42f;
		
		
		System.out.println("\nR E S U L T A D O S");
        System.out.println("-----------------------");
        System.out.println("Producto.............................: " + nombre );
        System.out.println("La venta del mes es de...............: " + df.format(venta1));
        System.out.println("La venta incrementada en un 42% es de: " + df.format(venta2 + venta1));
        
	}

}
