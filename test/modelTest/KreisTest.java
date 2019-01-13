package modelTest;

import static org.junit.Assert.*;

import org.junit.Test;

import grafikeditor.Kreis;

public class KreisTest {

private GraphicsStub g = new GraphicsStub();
	
	@Test
	public void testZeichne() {
		Kreis k = new Kreis(10, 20, 30);
		k.zeichne(g);
		assertEquals(1, g.nbOfDrawCircCalls);
		assertEquals(10, g.x);
		assertEquals(20, g.y);
		assertEquals(30, g.radius);
		assertEquals(30, g.r);
	}

}
