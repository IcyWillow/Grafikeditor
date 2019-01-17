package grafikeditor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;






public class FileManager {



	public void save(Zeichnung z) {
		
		
	
		try {
			FileOutputStream f = new FileOutputStream(new File("zeichnung.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);
			
			o.writeObject(z);
			o.close();
			f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public Zeichnung load() {
		
		Zeichnung z = new Zeichnung();
		
		try {
			FileInputStream  f = new FileInputStream(new File("zeichnung.txt"));
			ObjectInputStream  o = new ObjectInputStream(f);
			
		    try {
				z = (Zeichnung) o.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
			o.close();
			f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return z;

	}
	
}
