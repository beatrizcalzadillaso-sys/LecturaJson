
package pojo;

import java.time.LocalTime;

public class Sesion {
	private LocalTime hora;
	private int sala;
	private float precio;
	
	public Sesion() {
		
	}

	public Sesion(LocalTime hora, int sala, float precio) {
		this.hora = hora;
		this.sala = sala;
		this.precio = precio;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
}
