package grafikeditor;
import java.awt.Graphics;

public class Text extends Figur {
	
	private String text;

	public Text(int x, int y, String s) {
		super(x, y);
		this.text = s;

	}
	
	public String getText() {
		return this.text;
	}

	@Override
	public void zeichne(Graphics g) {
		 g.drawString(text, x, y);
		
	}

	
	@Override
	public void resize(int x, int y, int w, int h) {
	
	}

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
