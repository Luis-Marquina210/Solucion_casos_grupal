package Guia_1;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Ingrese altura del rect�ngulo: ");
		int altura = sc.nextInt();
		
		System.out.print("Ingrese base del rect�ngulo: ");
		int base = sc.nextInt();
		
		int area = base * altura;
		int perimetro = 2 * (base + altura);
		
		System.out.println("\nR E S U L T A D O S");
        System.out.println("-----------------------");
        System.out.println("�rea del rect�ngulo............: " + area);
        System.out.println("Per�metro del rectangulo.......: " + perimetro);
	
		
	}

}
