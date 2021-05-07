package com.senati.eti.model;

import java.util.ArrayList;

public class Publicacion {

	private String nombre;
	private String autor;
	private int tipo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	public Publicacion() {
	}
	
	
	public Publicacion(String nombre, String autor, int tipo) {
		this.nombre = nombre;
		this.autor = autor;
		this.tipo = tipo;
	}
	
	// Metodos 
	
	public String Titulo() {
		
		return this.nombre;

	}
	
    public String Autor() {
		
		return this.autor;

	}
	
	
	
	
	public String MostrarTipo() {
		String r = "";
		
		if(this.tipo == 1)
			r = "Libro";
		else if(this.tipo == 2)
			r = "Revista";
		
		
		return r;
	}
	
	
	
	
	
	
	
	
	
	
	
}
