package pojo;

import java.util.ArrayList;

public class Pelicula {
	private String titulo;
	private String genero;
	private int duracion;
	private ArrayList<Sesion> sesiones;
	
	public Pelicula() {
		
	}

	public Pelicula(String titulo, String genero, int duracion, ArrayList<Sesion> sesiones) {
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.sesiones = sesiones;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public ArrayList<Sesion> getSesiones() {
		return sesiones;
	}

	public void setSesiones(ArrayList<Sesion> sesiones) {
		this.sesiones = sesiones;
	}
	

	
	
}
