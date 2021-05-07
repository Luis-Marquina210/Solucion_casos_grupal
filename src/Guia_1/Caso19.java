package Guia_1;

import java.util.Scanner;

public class Caso19 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float lado1;
		float lado2;
		float lado3;
		
		System.out.print("Ingrese el primer lado: ");
		lado1 = entrada.nextFloat();
		System.out.print("Ingrese el segudo lado: ");
		lado2 = entrada.nextFloat();
		System.out.print("Ingrese el tercer lado: ");
		lado3 = entrada.nextFloat();
		
		float perimetro = (lado1 + lado2 + lado3);
		
		System.out.println("Perímetro del Triangulo.........: " + perimetro);

	}

}