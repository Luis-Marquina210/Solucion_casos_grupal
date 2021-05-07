package Guia2;
import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese número: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int opc = 0;
		
		String rp = "";
		
		if (n > 0 && n <= 7) 
			opc = 1;
		else if(n >= 8 && n <= 10)
			opc = 2;
		else if (n >= 11 && n <= 14)
			opc = 3;
		else if (n >= 15 && n <= 17)
			opc = 4;
		else if (n >= 18 && n <= 20)
			opc = 5;
		
		else
			rp = "Este numero no existe";

		switch (opc) {
		case 1:
			rp = "Sin palabras";
			break;
		case 2:
			rp = ("Malo");
			break;
			
		case 3:
			rp = ("Regular");
			break;
			
		case 4:
			rp = ("Notable");
			break;
		
		case 5:
			rp = ("Excelente");
			break;	
		} 
		System.out.println("Estado obtenido: " + rp);
		
	}





	}