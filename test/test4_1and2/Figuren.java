package test4_1and2;

import java.util.List;

import grafikeditor.Figur;

public class Figuren {

	public static void main(String[] args) {
		FigurFileDAO dao = new FigurFileDAO();
		FigurParser fp = new FigurParser(dao);
		List<Figur> figuren = fp.parse();
		System.out.println(figuren);
		dao.close();
		

	}

}
