package modelTest;

public class GraphicsStub extends ConcreteGraphics {

	public int nbOfDrawCircCalls;
	public int x;
	public int y;
	public int radius;
	public int r;
	
	@Override
	public void drawOval(int x, int y, int radius, int r){
		nbOfDrawCircCalls++;
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.r = r;
	}
}
