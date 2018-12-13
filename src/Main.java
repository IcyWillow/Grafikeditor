import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final Display display = new Display();
		final EditorFrame display = new EditorFrame(800, 600);
	    List<Figur> figuren = new ArrayList<Figur>();
	    //Linie l = new Linie(32, 300, 98, 100);
	    Rechteck r = new Rechteck(10, 10, 5000, 20);
	    figuren.add(new Text(250, 300, "fleisch"));
	    // figuren.add(new Rechteck(10, 10, 5000, 20));
	    // figuren.add(new Kreis(50, 50, 100));
	    // figuren.add(l);

	    
	    Linie l = new Linie(10, 20, 30, 40);
	    l.move(10, 10);
	    Figur f = new Linie(10, 20, 30, 40);
	    f = new Rechteck(10, 10, 10, 10);
	    
	    
	    f = new Text(30, 50, "fleisch");
	    f.move(10, 10);
	    
	    l.move(0, 100);
	    r.move(230, 150);

	    figuren.add(l);
	    figuren.add(r);
	    
	}
	


}
