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


}