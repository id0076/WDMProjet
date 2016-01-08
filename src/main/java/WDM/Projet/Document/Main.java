package WDM.Projet.Document;

import java.io.File;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import WDM.Projet.Document.Interface.Document;
import WDM.Projet.Index1.Frequence;
import WDM.Projet.Index1.Index1;

public class Main {
	
	
	public static void main(String[] args) {
		
		File file = new File("/home/charlotte/Documents/corpus/2003-01-02-1.txt");
		Document doc = new DocumentImpl(file);
		Index1 index = new Index1();
      	index.addDocument(doc);
	
		
		
	}
}



