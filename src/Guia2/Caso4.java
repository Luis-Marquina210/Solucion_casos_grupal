package Guia2;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("Primer número...: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo número..: ");
        int num2 = sc.nextInt();
        
        String resultado = "";
        
        if (num1 == num2)
        	resultado = "Los números son iguales";
        else if (num1 < num2)
        	resultado = "El primer número es menor";
        else
        	resultado = "El segundo número es menor";
        
        System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Respuesta......: " + resultado);

	}

}