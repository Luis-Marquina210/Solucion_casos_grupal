package Guia_1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Ingrese nombre del producto: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese precio del producto: ");
		float precio = sc.nextFloat();
		
		System.out.print("Ingrese cantidad del producto: ");
		int cantidad = sc.nextInt();
		
		float importe = precio * cantidad;
		float igv = importe * 0.18f;
		float descuento = importe * 0.03f;
		float total = importe - descuento + igv;
		
		System.out.println("R E S U L T A D O S");
		System.out.println("Nombre del prodcuto..: " + nombre);
		System.out.println("Precio del producto..: " + precio);
		System.out.println("Cantidad del prodcuto: " + cantidad);
		System.out.println("Importe..............: " + "s/." + importe);
		System.out.println("IGV..................: " + "s/." + df.format(igv));
		System.out.println("Descuento............: " + df.format (descuento) + "%");
		System.out.println("Total................: " + "S/." + df.format(total));

	 }
	 
	}
	