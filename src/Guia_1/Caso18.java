package Guia_1;

import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese la altura del tri�ngulo:");
		int h = sc.nextInt();
		
		System.out.print("Ingrese la base del tri�ngulo:");
		int b = sc.nextInt();
		
		int �rea = (b * h)/2;
		
		System.out.println("\nResultados");
		System.out.println("------------------");
		System.out.println("�rea del Tri�ngulo.....: " + �rea);

	}

}