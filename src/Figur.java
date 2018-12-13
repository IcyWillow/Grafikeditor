import java.awt.Graphics;

public abstract class Figur {

	protected int x;
	protected int y;
	
	public Figur(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void move(int deltaX, int deltaY) {
		
		this.x += deltaX;
		this.y += deltaY;
	}

	public abstract void zeichne(Graphics g);
}
