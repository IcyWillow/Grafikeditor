import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EditorMouseAdapter extends MouseAdapter {

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println(e.getPoint());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println(e.getPoint());
	}
	

}
