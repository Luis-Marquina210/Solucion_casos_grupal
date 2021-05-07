package Guia5_data;

import java.util.ArrayList;
import java.util.Scanner;

import com.senati.eti.model.Publicacion;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Publicacion objPu1 = new Publicacion("Los Perros Hambrientos","Ciro Alegria", 1);
		Publicacion objPu2 = new Publicacion("Tradiciones Peruanas","Ricardo Palma", 1);
		Publicacion objPu3 = new Publicacion("Informatica Global","Bill Gates", 2);
		Publicacion objPu4 = new Publicacion("Los Heraldos Negros","Cesar Vallejo", 1);
		Publicacion objPu5 = new Publicacion("Rev. Dig. Merca2.0","Mark Zuckerberg", 2);
		
		
        ArrayList<Publicacion> arrPublicacion = new ArrayList<Publicacion>();
		
        Publicacion objPu6 = null;
		
		String nom = "", aut = "", rpta = "S";
		int tipo = 0, contador = 5;
		
		arrPublicacion.add(objPu1);
		arrPublicacion.add(objPu2);
		arrPublicacion.add(objPu3);
		arrPublicacion.add(objPu4);
		arrPublicacion.add(objPu5);
		
		do {
		System.out.println("*****************");
		System.out.println("REGISTRO DE DATOS");
		System.out.println("*****************");
		System.out.print("Titulo: ");
		nom = sc.nextLine();
		System.out.print("Autor: ");
		aut = sc.nextLine();
		System.out.print("Tipo [1|2]: ");
		tipo = sc.nextInt();
		
		while(tipo != 1 && tipo != 2) {
			System.out.println("Tipo no valido");
			System.out.println("Ingrese el tipo nuevamente");
			System.out.print("Tipo [1|2]: ");
			tipo = sc.nextInt();}
		
		
		objPu6 = new Publicacion (nom, aut, tipo);
		arrPublicacion.add(objPu6);
		
		
			 sc.nextLine();
			 
			 do {
				System.out.print("\n¿Desea agregar otra publicación[S|N]: ");
			    rpta = sc.nextLine();
			    if (!rpta.toUpperCase().equals("S") && !rpta.toUpperCase().equals("N"))
			    System.out.println("<<<<<<<<Opción no valida>>>>>>>>");
			
			}while(!rpta.toUpperCase().equals("S") && !rpta.toUpperCase().equals("N"));
		}while(rpta.toUpperCase().equals("S"));
        
	
		
		
		System.out.println("\n*****************");
		System.out.println("Datos registrados");
		System.out.println("*****************");
		
		String patron = "%-4s %-30s %-20s %-20s";
		System.out.println(String.format(patron, "N", "TITULO", "AUTOR", "TIPO"));
		System.out.println(String.format(patron, "-", "------", "------","----"));
		
		
		for(int x = 0; x < arrPublicacion.size(); x++) {
			System.out.println(String.format(patron, (x+1),
					arrPublicacion.get(x).Titulo(),
					arrPublicacion.get(x).Autor(),
					arrPublicacion.get(x).MostrarTipo()));
			
		}
	}

}
