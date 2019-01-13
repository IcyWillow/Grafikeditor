package grafikeditor;
import java.awt.Graphics;
import java.awt.Point;

final class EditorControl {
  private Zeichnung zeichnung = new Zeichnung();
  private char figurTyp = 'r';
  private Point ersterPunkt;
  Figur p;
  

  public void allesNeuZeichnen(Graphics g) {
   
	  zeichnung.zeichneFiguren(g);
	
  }

  public void setFigurTyp(char figurTyp) {
    this.figurTyp = figurTyp;
  }

  public void setErsterPunkt(Point ersterPunkt) {
    this.ersterPunkt = ersterPunkt;
    int x = ersterPunkt.x;
    int y = ersterPunkt.y - 25;
    
    switch(figurTyp) {
	  
	  case 'r':
		  p =  new Rechteck(x, y, 0, 0);
		  break;
	  case 'k':
		  p = new Kreis(x, y, 0);
		  break;
	  case 'l':
		  p = new Linie(x, y, 0, 0);
		  break;
	  case 't':
		  p = new Text(x, y, EditorFrame.text);
		  break;
	  case 'm':
		  p = null;
		  break;
	  default:
		  break;
	  }
    
	zeichnung.hinzufuegen(p);
  }

  public void erzeugeFigurMitZweitemPunkt(Point zweiterPunkt) {
	  
	  Figur f = null;
	  int w = zweiterPunkt.x > ersterPunkt.x ? zweiterPunkt.x - ersterPunkt.x : ersterPunkt.x - zweiterPunkt.x;
	  int h = zweiterPunkt.y > ersterPunkt.y ? zweiterPunkt.y - ersterPunkt.y : ersterPunkt.y - zweiterPunkt.y;
	  int x = zweiterPunkt.x > ersterPunkt.x ? ersterPunkt.x : zweiterPunkt.x;
	  int y = zweiterPunkt.y > ersterPunkt.y ? ersterPunkt.y - 25 : zweiterPunkt.y - 25;
	  
	  switch(figurTyp) {
	  
	  case 'r':
		  f =  new Rechteck(x, y, w, h);
		  break;
	  case 'k':
		  f = new Kreis(x, y, w);
		  break;
	  case 'l':
		  f = new Linie(ersterPunkt.x, ersterPunkt.y - 25, zweiterPunkt.x, zweiterPunkt.y - 25);
		  break;
	  case 't':
		  f = new Text(zweiterPunkt.x, zweiterPunkt.y, EditorFrame.text);
		  break;
	  case 'm':
	  
	  default:
		  break;
	  }
	  
	  if(f != null) {
		zeichnung.hinzufuegen(f);
	  }
  }
    
  public void erzeugeProvisorischesBild(Point zweiterPunkt) {
	  
	  int w = zweiterPunkt.x > ersterPunkt.x ? zweiterPunkt.x - ersterPunkt.x : ersterPunkt.x - zweiterPunkt.x;
	  int h = zweiterPunkt.y > ersterPunkt.y ? zweiterPunkt.y - ersterPunkt.y : ersterPunkt.y - zweiterPunkt.y;
	  int x = zweiterPunkt.x > ersterPunkt.x ? ersterPunkt.x : zweiterPunkt.x;
	  int y = zweiterPunkt.y > ersterPunkt.y ? ersterPunkt.y - 25 : zweiterPunkt.y - 25;

	  if (figurTyp == 'l') {
		  p.resize(zweiterPunkt.x, zweiterPunkt.y - 25, 0, 0);
	  } else if (figurTyp == 'm'){
		  
		  //for (Figur f : zeichnung)
		  
	  } else {
		  p.resize(x, y, w, h);
	  }

  }
}

