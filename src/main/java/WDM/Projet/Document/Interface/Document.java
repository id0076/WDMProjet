package WDM.Projet.Document.Interface;

import java.io.File;
import java.util.List;

public interface Document {

	public List<String> getListMot();
	public List<String> getListType();
	public List<String> getListLemme();
	public File getFile();
	
}
