package grafikeditor;
import java.awt.Graphics;
import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Zeichnung implements Serializable {
	
	//private Figur[] figuren;
	private List<Figur> figuren = new ArrayList<Figur>();
	private Figur selectedFigur;
	
	public Zeichnung() {
		
	}

	
	
	public void zeichneFiguren(Graphics g)
	{
		for (Figur f : figuren) {
			f.zeichne(g);
		}
	
	}
	
	
	  public void hinzufuegen(Figur figur) {
	    figuren.add(figur);
	    
	   
	  }
	  
	  
	  public void entfernen() {
		  figuren.clear();
	  }

}
