package Guia2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Empleado.................: ");
		String nombre = sc.nextLine();
		
		System.out.print("Horas trabajadas.........: ");
		float horas = sc.nextFloat();
		
		System.out.print("Tarifa por horas..........: ");
		float tarifa = sc.nextFloat();
		
		System.out.print("Minutos de tardanzas.....: ");
		int minutos = sc.nextInt();
		
		
		float importe = horas * tarifa;
		
	    float bono = 0;
	
		if (horas > 60) 
			bono = 0.13f * importe;
		else
			bono = importe * 0.04f;
		
		
		
		float descuento = 0;
		
		if(minutos > 15)
			descuento = importe * 0.03f;
		else
			descuento = 0;
			
		System.out.println("\n-------------------------");
		System.out.println("---R E S U L T A D O S---");
        System.out.println("---------------------------");
        System.out.println("Producto...................: " + nombre );
        System.out.println("Horas trabajadas...........: " + horas);
        System.out.println("Tarifa por horas...........: " + tarifa);
        System.out.println("Importe....................: " + df.format(importe));
        System.out.println("Bono.......................: " + df.format(bono));
        System.out.println("Descuento..................: " + df.format(descuento));
        
        float alcanzado=0;
		
		if(horas <= 70)
			System.out.println("Meta alcanzada....................: " + df.format(((horas*100) / 70)) + "%");
		else
			if(horas > 70)
				System.out.println("El % de horas extras seria de.: " + df.format((((horas*100) / 70) - 100)) + "%");
			
        
	}

}
