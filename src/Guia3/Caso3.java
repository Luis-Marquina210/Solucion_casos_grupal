package Guia3;

import java.util.Scanner;


public class Caso3 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		long factorial=1;
        int num;
        
        System.out.print("Introduce un n�mero: ");
        num = numero.nextInt();
        
        if(num <= 7 ) {
        	for (int i = num; i > 0; i--) {
                factorial = factorial * i;
            }
            System.out.println("El factorial de " + num + " es: " + factorial);
            
	}else
            	System.out.println("El n�mero es superior a 7");

	}

}
