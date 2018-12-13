import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Zeichnung {
	
	//private Figur[] figuren;
	private List<Figur> figuren = new ArrayList<Figur>();

	
	public Zeichnung() {
		
	}
	
	public void zeichneFiguren(Graphics g)
	{
		for (Figur f : figuren) {
			f.zeichne(g);
		}
		
	}
	
	  /**
	   * F�gt eine weitere Figur hinzu und l�st die Auffrischung des Fensterinhaltes aus.
	   * @param figur Referenz auf das weitere Figur-Objekt.

       */
	
	  public void hinzufuegen(Figur figur) {
	    figuren.add(figur);
	    
	   
	  }

	  /**
	   * L�scht alle Figuren und l�st die Auffrischung des Fensterinhaltes aus.

	  public void allesLoeschen() {
	    figuren.clear();
	    repaint();
	  }
	$
	public void move(int dx, int dy) {
		
		
	}*/
}
