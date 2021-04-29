package Guia_1;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Ingrese altura del rectángulo: ");
		int altura = sc.nextInt();
		
		System.out.print("Ingrese base del rectángulo: ");
		int base = sc.nextInt();
		
		int area = base * altura;
		int perimetro = 2 * (base + altura);
		
		System.out.println("\nR E S U L T A D O S");
        System.out.println("-----------------------");
        System.out.println("Área del rectángulo............: " + area);
        System.out.println("Perímetro del rectangulo.......: " + perimetro);
	
		
	}

}
