package Guia_1;

import java.util.Scanner;

public class Caso10 {
	
	public static final double PI = 3.1416;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese radio: ");
		double r = sc.nextDouble();
		
		double area = PI * Math.pow(r, 2);
		double perimetro = 2 * PI * r;
		
		System.out.println("Área del círculo..: " + area);
		System.out.println("Perímetro.........: " + perimetro);
		
				
		

	}
}