package Guia2;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("Primer n�mero...: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo n�mero..: ");
        int num2 = sc.nextInt();
        
        String resultado = "";
        
        if (num1 == num2)
        	resultado = "Los n�meros son iguales";
        else if (num1 < num2)
        	resultado = "El primer n�mero es menor";
        else
        	resultado = "El segundo n�mero es menor";
        
        System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Respuesta......: " + resultado);

	}

}