package WDM.Projet.Index1;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import WDM.Projet.Document.Interface.Document;
import WDM.Projet.Index.Interface.Index;

public class Index1 implements Index {

	public Map<String,Frequence> indexSimple = new HashMap<String, Frequence>();
	ValueComparator comparateur = new ValueComparator(indexSimple);
	TreeMap<String,Frequence> mapTriee = new TreeMap<String,Frequence>(comparateur);
	
	
	public void create(){
			
	}
	


	public void addDocument(Document document) {
		for(String mot : document.getListMot()){
			if(indexSimple.containsKey(mot)){
				indexSimple.get(mot).setFrequence(indexSimple.get(mot).getFrequence()+1);
				if(!indexSimple.get(mot).getFile().contains(document)){
					indexSimple.get(mot).add(document.getFile());
				}
			}else{
				ArrayList<File> file = new ArrayList<File>();
				file.add(document.getFile());
				Frequence freq = new Frequence(1,file);
				indexSimple.put(mot, freq);
			}
		}

	}

	public void delDocument(Document document) {
		for(String mot : document.getListMot()){
			indexSimple.get(mot).setFrequence(indexSimple.get(mot).getFrequence()-1);
			indexSimple.get(mot).remove(document.getFile());
			if(indexSimple.get(mot).getFrequence()==0){
				indexSimple.remove(mot);
			}
		}

	}

}
