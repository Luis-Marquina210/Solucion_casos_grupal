package Guia2;

import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		float num1 = 0,num2 = 0,rpta = 0;
		
		int op;
				
		System.out.print("Primer número...: ");
		num1 = sc.nextFloat();
				
		System.out.print("Segundo número..: ");
		num2 = sc.nextFloat();
		
		System.out.print("Operación [1-6].: ");
		op = sc.nextInt();
		
		String rp = "";
		
		switch (op) {
		case 1:
			rpta = num1 + num2;
				rp = "Suma";
			break;
		case 2:
			rpta = num1 - num2;
				rp = "Resta";
			break;
		case 3:
			rpta = num1 * num2;
				rp = "Producto";
			break;
		case 4:
			if (num2 != 0) {
			rpta = num1 / num2;
			rp = "División";
			}else {
				rpta = 0;
				rp = "No es posible hallar la División";
			}break;
		case 5:
			if (num2 != 0) {
				rpta = num1 % num2;
				rp = "Resto Entero";
				}else {
					rpta = 0;
					rp = "No es posible hallar el Resto Entero";
				}break;
		case 6:
			rpta = (num1 + num2)/ 2;
				rp = "Promedio";
			break;
			
		default: rpta = 0;
		rp = "Opción no valida";
			
		}
				
		System.out.println("--------------------");
		System.out.println("----Resultados----");
		System.out.println("--------------------");
		System.out.println("Número 1: " + num1);
		System.out.println("Número 2: " + num2);
		System.out.println("Operación: " + rp);
		System.out.println("Resultado: " + rpta);
		
		
	}
}