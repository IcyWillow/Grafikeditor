import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Die Klasse Display stellt ein Fenster auf dem Bildschirm zur Verf�gung, in welchem
 * Figur-Objekte dargestellt werden k�nnen.
 * Siehe auch Java-Grundkurs Abschnitt 10.2 und 10.3.
 * 
 * @author Andres Scheidegger
 */
@SuppressWarnings("serial")
public class Display extends JFrame implements MouseListener{
  /** Die Liste der dargestellten Figur-Objekte */
	private List<Figur> figuren = new ArrayList<Figur>();
	Zeichnung zeichnung = new Zeichnung();

  /**
   * Konstruktor. Initialisiert das Fenster in der Mitte des Bildschirms und erzeugt ein
   * JFrame-Objekt, auf welchem die Figuren gezeichnet werden.
   */
  public Display() {
	
    Dimension windowSize = new Dimension(800, 600);
    setSize(windowSize);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int windowPositionX = (screenSize.width - windowSize.width) / 2;
    int windowPositionY = (screenSize.height - windowSize.height) / 2;
    Point windowPosition = new Point(windowPositionX, windowPositionY);
    setLocation(windowPosition);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    createAndAddDrawingPanel();
    setVisible(true);
    addMouseListener(this);
  }

  private void createAndAddDrawingPanel() {
	    // Das JPanel-Objekt ist ein Objekt einer anonymen Unterklasse von JPanel
	    // Siehe Java-Grundkurs Abschnitt 3.9
	    add(new JPanel() {
	      // Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer die repaint()-
	      // Methode beim Dsiplay aufruft.
	      @Override
	      protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        setZeichnung(g);
	        //zeichneFiguren(g);
	    
	      }
	    });
	  }

  /**
   * Zeichnet alle Figuren.
   * @param g Referenz auf das Graphics-Objekt zum zeichnen.
   */
  /*
  private void zeichneFiguren(Graphics g) {
    for (Figur f : figuren) {
      if (f instanceof Rechteck) {
        Rechteck r = (Rechteck)f;
        g.drawRect(r.getX(), r.getY(), r.getBreite(), r.getHoehe());
      }
      
      if (f instanceof Kreis) {
    	  Kreis k = (Kreis)f;
    	  g.drawOval(k.getX(), k.getY(), k.getRadius(), k.getRadius());
      }
      
      if (f instanceof Linie) {
    	  Linie l = (Linie)f;
    	  g.drawLine(l.getX(), l.getY(), l.getEndX(), l.getEndY());
      }
      
     if (f instanceof Text) {
    	 Text t = (Text)f;
    	 g.drawString(t.getText(), t.getX(), t.getY());
     }
    
    }
  }*/

  public void setZeichnung(Graphics g) {
	  zeichnung.zeichneFiguren(g);
  	}


@Override
public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
	
}

@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent event) {
	// TODO Auto-generated method stub
	zeichnung.hinzufuegen(new Rechteck(event.getX(), event.getY(), 30, 30));
	System.out.println(event.getX());

	repaint();


}

@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
