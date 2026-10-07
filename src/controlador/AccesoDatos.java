package controlador;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;

import pojo.Cines;
import pojo.Pelicula;
import pojo.Sesion;
import pojo.Cine;

public class AccesoDatos {

	public static void main(String[] args) {
		Gson gson = new Gson();
		
		//	 enlace
		String link = "cines.json";
		
		try {
		FileReader reader = new FileReader(link);
		
		Cines container = gson.fromJson(reader,Cines.class);
		
		ArrayList<Cine> listaCines = container.getCines();
		
		System.out.println("Cines disponibles: ");
		for(int i=0; i< listaCines.size(); i++) {
		
			System.out.println(i+" - "+listaCines.get(i).getNombre());
		
			}
		
		//	BUSQUEDA 1
		System.out.println("\n\nBusqueda 1: ");
		String busqueda1= "Cines Golem";
		for(int i=0; i< listaCines.size();i++) {
			if (listaCines.get(i).getNombre().equals(busqueda1)) {
				ArrayList<Pelicula> listaPelis = listaCines.get(i).getPeliculas();
				System.out.println("Peliculas disponibles en "+ busqueda1+"\n-----------------------");
				
				for(int j=0; j< listaPelis.size(); j++) {
					System.out.println(j+" - "+listaPelis.get(j).getTitulo());
					}
				}
			}
		
		// BUSQUEDA 2
		System.out.println("\n\nBusqueda 2: ");
		String busqueda2 = "Avatar";
		// 	RECORRER CINES
		for (int i=0; i< listaCines.size(); i++) {
			ArrayList<Pelicula> listaPelis = listaCines.get(i).getPeliculas();
			// RECORRER PELICULAS
			for(int j=0; j< listaPelis.size(); j++) {
				// SI LA PELICULA SE LLAMA AVATAR, IMPRIMIR LAS SESIONES DE AVATAR
				if( "Avatar".equals(listaPelis.get(j).getTitulo())) {
					ArrayList<Sesion> listSesiones= listaPelis.get(j).getSesiones();
					System.out.println("Pelicula: "+busqueda2+"\n--------------------------");
					for (int k=0; k< listSesiones.size(); k++) {
						System.out.printf("Hora: %s || Sala: %s || Precio: %s %n",listSesiones.get(k).getHora(), listSesiones.get(k).getSala(), listSesiones.get(k).getPrecio());
						}
					}
				
				}
			}
		} catch (IOException exc) {
			exc.printStackTrace();
		}
	}

}
