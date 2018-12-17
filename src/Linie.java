import java.awt.Graphics;

public class Linie extends Figur {

	private int endeX;
	private int endeY;
	
	public Linie(int x, int y, int ex, int ey) {
		super(x, y);

		this.endeX = ex;
		this.endeY = ey;
	}
	
	public int getEndX() {
		return this.endeX;
	}
	
	public int getEndY() {
		return this.endeY;
	}
	
	@Override
	public void move(int deltaX, int deltaY) {
		super.x += deltaX;
		super.y += deltaY;
		endeX += deltaX;
		endeY += deltaY;
	}

	@Override
	public void zeichne(Graphics g) {
		 g.drawLine(x, y, endeX, endeY);
	}

	@Override
	public void resize(int x, int y, int w, int h) {
		this.endeX = x;
		this.endeY = y;
		
	}

}
