package grafikeditor;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;

@SuppressWarnings("serial")
final class EditorFrame extends JFrame implements MouseListener, MouseMotionListener, KeyListener  {
  private EditorControl editorControl = new EditorControl();
  private JToolBar t = new JToolBar("Test"); 
  private JMenuBar m = new JMenuBar();
  private JMenu menu = new JMenu("Filé");
  private JMenuItem menuItem = new JMenuItem("Save");
  static String text;
  
  JButton btnSave = new JButton("Save");
  JButton btnLoad = new JButton("Load");

  
  public EditorFrame(int breite, int hoehe) {
    erzeugeUndSetzeEditorPanel();
    fensterEinmitten(breite, hoehe);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    
    addMouseListener(this);
    addKeyListener(this);
    addMouseMotionListener(this);
  
  /*
    add(m);
    m.add(menu);
    menu.add(menuItem);
    menuItem.addActionListener(new ActionListener() {
    	@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
    });
    
    
    t.setPreferredSize(new Dimension(breite, 40));
    
    // Save Button
    btnSave.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			editorControl.figurenSpeichern();
			
		}
	});
    
    btnLoad.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			editorControl.figurenLaden();
			
		}
	});
  
    t.add(btnSave);
    t.add(btnLoad);
    t.setFloatable(false);
    t.setRollover(true);
    this.add(t);
*/
    

    
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

public void keyPressed(KeyEvent e) {
	editorControl.setFigurTyp(e.getKeyChar());

	if(e.getKeyChar() == 't') {
		JFrame frame = new JFrame("Insert Text");
		text = "";
	    text = JOptionPane.showInputDialog(frame, "Geben Sie den gewünschten Text ein?");
	  
	}
}

public void mouseClicked(MouseEvent e) {}
public void mouseEntered(MouseEvent e) {}
public void mouseExited(MouseEvent e) {}
public void keyReleased(KeyEvent e) {}
public void keyTyped(KeyEvent e) {}
public void mouseMoved(MouseEvent e) {}

  

}
