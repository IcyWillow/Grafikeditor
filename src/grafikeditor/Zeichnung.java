package grafikeditor;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Zeichnung {
	
	//private Figur[] figuren;
	private List<Figur> figuren = new ArrayList<Figur>();
	private Figur selectedFigur;

	
	
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
