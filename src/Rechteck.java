import java.awt.Graphics;

public class Rechteck extends Figur {
	
	private int breite, hoehe;

	public Rechteck(int x, int y, int b, int h) {
		super(x, y);
		this.breite = b;
		this.hoehe = h;
	}

	public int getBreite() {

		return this.breite;
	}

	public int getHoehe() {
	
		return this.hoehe;
	}
	
	@Override
	public void resize(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.breite = width;
		this.hoehe = height;
	}
	

	@Override
	public void zeichne(Graphics g) {
	g.drawRect(x, y, breite, hoehe);
		
	}

}
