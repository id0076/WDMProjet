package WDM.Projet.Document;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import WDM.Projet.Document.Interface.Document;

public class DocumentImpl implements Document {

	private List<String> listMot = new ArrayList<String>();
	private List<String> listType = new ArrayList<String>();
	private List<String> listLemme = new ArrayList<String>();
	private File file;

	public DocumentImpl(File file) {
		this.file = file;

		BufferedReader entree = null;
		try {
			entree = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

			String ligne;
			while ((ligne = entree.readLine()) != null) {
				String[] splitMot = ligne.split("\t");
				if (splitMot.length == 3) {
					listMot.add(splitMot[0]);
				}
			}
		} catch (Exception e) {

		} finally {
			if (entree != null)
				try {
					entree.close();
				} catch (IOException e) {
				}
		}

	}

	public List<String> getListMot() {
		return listMot;
	}

	public List<String> getListType() {
		return listType;
	}

	public List<String> getListLemme() {
		return listLemme;
	}

	public File getFile() {
		return file;
	}

}
