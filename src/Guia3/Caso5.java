package Guia3;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 1, n = 0, num_menor = 0, aux = 0, c = 1;
		
		while (x <= 5) {
			System.out.print("Ingrese número " + x + ": ");
			n = sc.nextInt();
			
			if (x == 1) {
				num_menor = n;
				aux = n;
			}else
				if (aux == n)
					c++;
			
			if (n < num_menor)
				num_menor = n;
			
			x++;			
		}	
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Número menor......: " + num_menor);
		
		if (c == 5)
			System.out.println("Los números son iguales...");
	}
}