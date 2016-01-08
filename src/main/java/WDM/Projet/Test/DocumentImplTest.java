package WDM.Projet.Test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import WDM.Projet.Document.DocumentImpl;
import WDM.Projet.Document.Interface.Document;

public class DocumentImplTest {

	@Test
	public void creationDocument() {
		File file = new File("/home/id0158/Téléchargements/WebdataMining/webDataminingSources/corpus/2003-01-02-1.txt");
		Document doc = new DocumentImpl(file);
		System.out.println(doc.getListMot());
	}

}
