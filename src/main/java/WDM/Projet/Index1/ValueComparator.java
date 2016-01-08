package WDM.Projet.Index1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ValueComparator implements Comparator{

	public Map<String,Frequence> indexSimple = new HashMap<String, Frequence>();
	
   
    
	public ValueComparator(Map<String, Frequence> indexSimple) {
		super();
		this.indexSimple = indexSimple;
	}


	@Override
	public int compare(Object o1, Object o2) {
		if (indexSimple.get(o1).getFrequence() >= indexSimple.get(o2).getFrequence()) {
			return -1;
		} else {
			return 1;
		}
	}


}
