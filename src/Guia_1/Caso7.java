package Guia_1;

import java.text.DecimalFormat;

public class Caso7 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		
		float rpta = (float) ((float) (17 * 2 + (float) Math.pow(3,2) -6) / 5 - 2 * (4.7 - 1.2 * 2));
		
		
		System.out.println("----------------------");
		System.out.println("Resultados");
		System.out.println("----------------------");
		System.out.println("Respuesta...........: " + df.format(rpta));
		
	}
}