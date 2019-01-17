package test4_1and2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import grafikeditor.Figur;

public class FigurParserTest {
	
	private FigurDAO dao;
	private FigurParser fp;
	
	@Before
	public void setup() {
		dao = new FigurDAOStub();
		fp = new FigurParser(dao);
	}

	@Test
	public void test() {
		List<Figur> figuren = fp.parse();
		assertEquals(3, figuren.size());
		assertEquals("Rechteck 1 10 10 10", figuren.get(0).whoAmI());
		assertEquals("Kreis 10 30 50", figuren.get(1).whoAmI());
		assertEquals("Linie 10 20 30 40", figuren.get(2).whoAmI());
		
	}

}
