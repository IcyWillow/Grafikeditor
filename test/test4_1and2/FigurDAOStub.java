package test4_1and2;

public class FigurDAOStub implements FigurDAO {

	private String[] testFiguren = {
			"Rechteck 1 10 10 10",
			"Kreis 10 30 50",
			"Linie 10 20 30 40"
	};
	
	private int currentFigur = 0;
	@Override
	public String[] readNextFigurData() {
		if (currentFigur < testFiguren.length) {
			String[] figurData = testFiguren[currentFigur ].split(" ");
			currentFigur++;
			return figurData;
		}
		
		return null;
	}

}
