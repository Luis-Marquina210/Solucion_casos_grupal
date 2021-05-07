package Guia5_data;

import java.util.ArrayList;


import com.senati.eti.model.Publicacion;

public class Caso4 {

	public static void main(String[] args) {
		
		Publicacion objPu1 = new Publicacion("Los Perros Hambrientos","Ciro Alegria", 1);
		Publicacion objPu2 = new Publicacion("Tradiciones Peruanas","Ricardo Palma", 1);
		Publicacion objPu3 = new Publicacion("Informatica Global","Bill Gates", 2);
		Publicacion objPu4 = new Publicacion("Los Heraldos Negros","Cesar Vallejo", 1);
		Publicacion objPu5 = new Publicacion("Rev. Dig. Merca2.0","Mark Zuckerberg", 2);
		
		
        ArrayList<Publicacion> arrPublicacion = new ArrayList<Publicacion>();
		
		arrPublicacion.add(objPu1);
		arrPublicacion.add(objPu2);
		arrPublicacion.add(objPu3);
		arrPublicacion.add(objPu4);
		arrPublicacion.add(objPu5);
		
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
