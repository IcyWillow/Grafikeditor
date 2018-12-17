import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
final class EditorFrame extends JFrame implements MouseListener, KeyListener, MouseMotionListener  {
  private EditorControl editorControl = new EditorControl();
  static String text;
  

  
  public EditorFrame(int breite, int hoehe) {
    erzeugeUndSetzeEditorPanel();
    fensterEinmitten(breite, hoehe);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    addMouseListener(this);
    addKeyListener(this);
    addMouseMotionListener(this);

    
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



@Override
public void mousePressed(MouseEvent event) {
	editorControl.setErsterPunkt(event.getPoint());

	
}

@Override
public void mouseReleased(MouseEvent event) {
	editorControl.erzeugeFigurMitZweitemPunkt(event.getPoint());
	repaint();
	
}

@Override
public void mouseDragged(MouseEvent event) {
	editorControl.erzeugeProvisorischesBild(event.getPoint());
	repaint();

}

@Override
public void keyPressed(KeyEvent e) {
	editorControl.setFigurTyp(e.getKeyChar());

	if(e.getKeyChar() == 't') {
		JFrame frame = new JFrame("Insert Text");
		text = "";
	    text = JOptionPane.showInputDialog(frame, "Geben Sie den gewünschten Text ein?");
	  
	}
}

public void mouseClicked(MouseEvent arg0) {}
public void mouseEntered(MouseEvent arg0) {}
public void mouseExited(MouseEvent arg0) {}
public void keyReleased(KeyEvent e) {}
public void keyTyped(KeyEvent e) {}
public void mouseMoved(MouseEvent arg0) {}





  

}
