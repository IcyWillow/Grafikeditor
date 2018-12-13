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

	
}
