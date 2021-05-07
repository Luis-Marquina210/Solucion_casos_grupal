package Guia_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Ingrese primer número:");
		n1 = sc.nextFloat();
		
		System.out.print("Ingrese segundo número:");
		n2 = sc.nextFloat();
		
		float prom = (n1 + n2)/2;
	    float aumt = (float) (n1 + (0.2 * n1));
		float dism = (float) (n2 - (0.3 * n2));
		
		System.out.println("\nResultados");
		System.out.println("------------------");
		System.out.println("Resultado 1.....: " + df.format(prom));
		System.out.println("Resultado 2.....: " + df.format(aumt));
		System.out.println("Resultado 3.....: " + df.format(dism));
	}

}