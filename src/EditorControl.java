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

	  Figur f = null;
	  int w = zweiterPunkt.x > ersterPunkt.x ? zweiterPunkt.x - ersterPunkt.x : ersterPunkt.x - zweiterPunkt.x;
	  int h = zweiterPunkt.y > ersterPunkt.y ? zweiterPunkt.y - ersterPunkt.y : ersterPunkt.y - zweiterPunkt.y;
	  int x = zweiterPunkt.x > ersterPunkt.x ? ersterPunkt.x : zweiterPunkt.x;
	  int y = zweiterPunkt.y > ersterPunkt.y ? ersterPunkt.y - 25 : zweiterPunkt.y - 25;
	  
	  switch(figurTyp) {
	  
	  case 'r':
		  f = new Rechteck(x, y, w, h);
		  break;
	  case 'k':
		  f = new Kreis(x, y, w);
		  break;
	  case 'l':
		  f = new Linie(ersterPunkt.x, ersterPunkt.y - 25, zweiterPunkt.x, zweiterPunkt.y - 25);
	  case 't':
		  f = new Text(zweiterPunkt.x, zweiterPunkt.y, EditorFrame.text);
	  default:
		  break;
	  }
	  
	  if(f != null) {
		zeichnung.hinzufuegen(f);
	  }
  }
}

