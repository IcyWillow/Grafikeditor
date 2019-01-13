package grafikeditor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

public class FileManager {

	private Gson gson = new Gson();
	
	public void save(Zeichnung z) {
		String s = gson.toJson(z);

		    try {
				BufferedWriter writer = new BufferedWriter(new FileWriter("figuren.txt"));
				writer.write(s);
			    writer.close();		
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     
		
	}
	
	public Zeichnung load() {
		
		 String s = ""; 
	
		
		 
		    try {
				s = new String(Files.readAllBytes(Paths.get("figuren.txt")));   		 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		 
		    Zeichnung z = gson.fromJson(s, Zeichnung.class);	
		    return z;
		    
	}
	
}
