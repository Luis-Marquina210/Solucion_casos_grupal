package Guia4;
import java.util.ArrayList;
import java.util.Scanner;
public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int [5];
		
		int i = 0, pares= 0, impares= 0;
		float promedio = 0, suma = 0;
		
		 for( i = 0; i < 5; i++) {
			 System.out.print("Ingrese numero " + (i+1) + ": "  );
			 numeros[i] = sc.nextInt();
			 
			 if(numeros[i] % 2 ==0)
				 pares++;
			 else
				 impares++;
			 
			 suma = suma + numeros[i];
			 
		 }
		
		 promedio = suma / 5;
		 
		 
		 System.out.println("---------------------");
		 System.out.println("R E S U S L T A D O S");
		 System.out.println("---------------------");
		System.out.println("Cantidad de números pares........: " + pares);
		System.out.println("Cantidad de números impares......: " + impares);
		System.out.println("Promedio de los números..........: " + promedio);
		}
		
		
		
		
		   }
	


