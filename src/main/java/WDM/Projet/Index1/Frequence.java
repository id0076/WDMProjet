package WDM.Projet.Index1;

import java.io.File;
import java.util.ArrayList;

public class Frequence {
	
	public int frequence;
	
    public ArrayList<File> file;
	
	
	public ArrayList<File> getFile() {
		return file;
	}
	
	public void add(File fichier){
		file.add(fichier);
	}
	
	public void remove(File fichier){
		file.remove(fichier);
	}

	public void setFile(ArrayList<File> file) {
		this.file = file;
	}

	public Frequence(int frequence, ArrayList<File> file) {
		super();
		this.frequence = frequence;
		this.file = file;
	}

	public int getFrequence() {
		return frequence;
	}
	
	public void setFrequence(int frequence) {
		this.frequence = frequence;
	}

}
