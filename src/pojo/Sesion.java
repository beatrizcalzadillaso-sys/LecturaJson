
package pojo;


public class Sesion {
	private String hora;
	private String sala;
	private String precio;
	
	public Sesion() {
		
	}

	public Sesion(String hora, String sala, String precio) {
		this.hora = hora;
		this.sala = sala;
		this.precio = precio;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	
	
}
