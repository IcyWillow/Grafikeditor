package grafikeditor;
import java.awt.Graphics;
import java.io.Serializable;

public abstract class Figur implements Serializable {

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
	
	public abstract void resize(int x, int y, int w, int h);


}
