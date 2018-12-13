import java.awt.Graphics;
import java.awt.Point;

final class EditorControl {
  private Zeichnung zeichnung = new Zeichnung();
  private char figurTyp;
  private Point ersterPunkt;
  

  public void allesNeuZeichnen(Graphics g) {
   
	  zeichnung.zeichneFiguren(g);
	
  }

  public void setFigurTyp(char figurTyp) {
    this.figurTyp = figurTyp;
  }

  public void setErsterPunkt(Point ersterPunkt) {
    this.ersterPunkt = ersterPunkt;
  }

  public void erzeugeFigurMitZweitemPunkt(Point zweiterPunkt) {
	  int breite, hohe;
	  
	  breite = zweiterPunkt.x - ersterPunkt.x;
	  hohe = zweiterPunkt.y - ersterPunkt.y;
	  int x = ersterPunkt.x;
	  int y = ersterPunkt.y;
	  
	  if(ersterPunkt.x > zweiterPunkt.x) {
		  
		  x = zweiterPunkt.x;
	  } else  
	  if(ersterPunkt.y > zweiterPunkt.y) {
		  y = zweiterPunkt.y;
	  }
	  
	  zeichnung.hinzufuegen(new Rechteck(zweiterPunkt.x, zweiterPunkt.y, Math.abs(breite), Math.abs(hohe)));
	  
  }
}

