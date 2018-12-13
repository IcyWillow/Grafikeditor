import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
final class EditorFrame extends JFrame {
  private EditorControl editorControl = new EditorControl();
  
  public EditorFrame(int breite, int hoehe) {
    erzeugeUndSetzeEditorPanel();
    fensterEinmitten(breite, hoehe);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    addMouseListener(new EditorMouseAdapter());
  }

  private void erzeugeUndSetzeEditorPanel() {
    JPanel panel = new EditorPanel(editorControl);
    setContentPane(panel);
  }

  private void fensterEinmitten(int breite, int hoehe) {
    Dimension bildschirmGroesse = Toolkit.getDefaultToolkit().getScreenSize();
    Rectangle fensterAusschnitt = new Rectangle();
    fensterAusschnitt.width = breite;
    fensterAusschnitt.height = hoehe;
    fensterAusschnitt.x = (bildschirmGroesse.width - fensterAusschnitt.width) / 2;
    fensterAusschnitt.y = (bildschirmGroesse.height - fensterAusschnitt.height) / 2;
    setBounds(fensterAusschnitt);
  }
  
	public void mousePressed(MouseEvent e) {
		System.out.println(e.getPoint() + "2323");
	}
}