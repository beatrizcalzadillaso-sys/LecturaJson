package controlador;

import java.util.ArrayList;

import com.google.gson.Gson;

import pojo.Cines;
import pojo.Cine;

public class AccesoDatos {

	public static void main(String[] args) {
		Gson gson = new Gson();
		
		//	 enlace
		String link = "cines.json";
		
		Cines container = gson.fromJson(link,Cines.class);
		
		ArrayList<Cine> listaCines = container.getCines();
		
		System.out.println(listaCines.get(1).getNombre());
	}

}
