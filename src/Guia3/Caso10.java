package Guia3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		String rpta = "S", n_mayor_sueldo = "", n_menor_sueldo = "", n_mayor_tardanza = "";
		float  thr = 0, bn = 0, dsc = 0, hrs = 0, mayor_sueldo = 0, menor_sueldo = 0;
		int min_tardanza = 0, num_reg = 0, mayor_min_tardanza = 0, metas = 0;
		
		while(rpta.toUpperCase().equals("S")) {
            num_reg++;
            System.out.println("----------------------");
            System.out.println("REGISTRO " + num_reg + ":");
            System.out.println("----------------------");
		    
            
		do {
		System.out.print("Empleado.................: ");
		String nombre = sc.nextLine();
		System.out.print("Horas trabajadas.........: ");
		hrs = sc.nextInt();
		System.out.print("Tarifa por hora..........: ");
		thr = sc.nextFloat();
		System.out.print("Minutos de tardanza......: ");
		min_tardanza = sc.nextInt();
		
		float sueldo_bruto = (hrs * thr);
		
		if( hrs <= 50)
			bn = 0;
		else if( hrs >=51 && hrs <= 60)
			bn = (0.02f * sueldo_bruto);
		else if( hrs > 60 && hrs <= 70)
			bn = (0.08f * sueldo_bruto);
		else if( hrs > 70 && hrs <= 80)
			bn = (0.13f * sueldo_bruto);
		else if( hrs > 80)
			bn = (0.15f * sueldo_bruto);
		
		if( min_tardanza <= 15)
			dsc = 0;
		else if( min_tardanza >= 16)
			dsc = (0.003f * sueldo_bruto * min_tardanza);
		else if( min_tardanza >= 31)
			dsc = (0.005f * sueldo_bruto * min_tardanza);
		
		float sueldo_neto = (sueldo_bruto + bn)- dsc;
		float porc_alca = (hrs*100) / 80;
		
		if (porc_alca > 90)
			metas++;
		
		System.out.println("------------------");
		System.out.println("    Resultados    ");
		System.out.println("------------------");
		System.out.println("Sueldo bruto.....: " + df.format(sueldo_bruto));
		System.out.println("Bonificacíon.....: " + df.format(bn));
		System.out.println("Descuento........: " + df.format(dsc));
		System.out.println("Sueldo neto......: " + df.format(sueldo_neto));
		
		 if(hrs <= 80)
	            System.out.println("Meta alcanzada............: " + df.format(porc_alca) + "%");
	        else
	            if(hrs > 80)
	                System.out.println("El % de horas extras seria de.: " + df.format((porc_alca - 100)) + "%");
		 
		 if (sueldo_neto >= mayor_sueldo) {
             mayor_sueldo = sueldo_neto;
             n_mayor_sueldo = nombre;
             }
         if (sueldo_neto < menor_sueldo) {
             menor_sueldo = sueldo_neto;
             n_menor_sueldo = nombre;
         }
		 if (num_reg == 1) {
			 menor_sueldo = sueldo_neto;
		     mayor_min_tardanza = min_tardanza;
		 }
		 if (mayor_min_tardanza < min_tardanza) {
			 mayor_min_tardanza = min_tardanza;
			 n_mayor_tardanza = nombre;
		 }
		 
		 sc.nextLine();
		 
		 System.out.println("----------------");
         System.out.print("¿Desea registrar otro participante? <S/N>: ");
         rpta = sc.nextLine();
         }while (!"S".equals(rpta.toUpperCase()) && !"N".equals(rpta.toUpperCase()));
		}
		
		System.out.println("\n---------------");
        System.out.println(" R E S U M E N ");
        System.out.println("---------------");
        System.out.println("Número de empleados....................................: " + num_reg);
        System.out.println("Sueldo neto mayor..: " + df.format(mayor_sueldo) + " pertenece a: " + n_mayor_sueldo);
        System.out.println("Sueldo neto menor..: " + df.format(menor_sueldo) + " pertenece a: " + n_menor_sueldo);
        System.out.println("Empleado con la mayor cantidad de minutos de tardanza..: " + n_mayor_tardanza + " " + (mayor_min_tardanza) + " min.");
        System.out.println("Cantidad de empleados con más del 90% de la meta.......: " + metas);
	}

}