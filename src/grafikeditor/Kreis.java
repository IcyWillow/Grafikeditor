package grafikeditor;
import java.awt.Graphics;

public class Kreis extends Figur {

	private int radius;

	public Kreis(int x, int y, int r) {
		super(x, y);
		this.radius = r;

	}
	
	public int getRadius() {
		return this.radius;
	}

	@Override
	public void zeichne(Graphics g) {
		  g.drawOval(x, y, radius, radius);
		
	}
	
	@Override
	public void resize(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.radius = w;
		
	}

	public String whoAmI() {
		// TODO Auto-generated method stub
		return "Kreis " + this.x + " " + this.y + " " + this.radius;
	}


}
