package Guia2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Alumno..............................: ");
		String nombre = sc.nextLine();
		
		
		System.out.print("Carrera a elegir [DS-RC-DG].........: ");
		String carr = sc.nextLine();
		
		
		System.out.print("Turno a elegir [M-T-N]..............: ");
		String turno = sc.nextLine();
		
		
		float monto = 0;
		String nom_carrera = "";
		
        switch(carr.toUpperCase()) {
        
        case("DS"):
        	nom_carrera = "Desarrollo de Software";
		    monto = 1500;
        	break;
        
        case("RC"):
        	nom_carrera = "Redes y Conectividad";
		    monto = 1400;
        	break;		
        
        case("DG"):
        	nom_carrera = "Diseño Gráfico";
		    monto = 1300;
        	break;
        
        default:
        	nom_carrera = "0";
        	monto = 0;

        }
        
        float descuento = 0;
        String nom_turno = "";
        
        
     
       switch(turno.toUpperCase()) {
       
       case ("M"):
    	   nom_turno = "Mañana";
    	   descuento = monto * 0.1f;
    	   break;
       
       case ("T"):
    	   nom_turno = "Tarde";
    	   descuento = monto * 0.2f;
    	   break;
    	   
       case ("N"):
    	   nom_turno = "Noche";
    	   descuento = monto * 0.15f;
    	   break;
       default:
    	   nom_turno = "0";
    	   descuento = 0;       
       }
		
       float t_final = monto - descuento; 
       
       
       System.out.println("\n-----------------------");
	   System.out.println("R E S U L T A D O S");
       System.out.println("-----------------------");
       System.out.println("Alumno..................: " + nombre);
       System.out.println("Nombre de la carrera....: " + nom_carrera);
       System.out.println("Nombre del Turno........: " + nom_turno);
       System.out.println("Monto...................: " + df.format(monto));
       System.out.println("Descuento...............: " + df.format(descuento));
       System.out.println("Total al pagar en S/....: " + df.format(t_final));
       System.out.println("Total al pagar en $.....: " + df.format(t_final / 3.33f));

	}

}
