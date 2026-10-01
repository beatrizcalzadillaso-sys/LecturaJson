package pojo;

import java.util.ArrayList;

public class Cines {
	private ArrayList<Cine> cines;

    public Cines() {
        this.cines = new ArrayList<>();
    }

    // Getter y Setter
    public ArrayList<Cine> getCines() {
        return cines;
    }

    public void setCines(ArrayList<Cine> cines) {
        this.cines = cines;
    }
	
}
