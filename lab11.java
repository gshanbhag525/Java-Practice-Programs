import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* <applet code = "lab11" width=300 height=300></applet> */
public class lab11 extends Applet implements KeyListener{

	int x=20,y=30;
	String msg="Keyevents--->NHCE";
	
	public void init() {
		addKeyListener(this);
		requestFocus();
		setBackground(Color.green);
		setForeground(Color.blue);
		
	}
	public void keyPressed(KeyEvent k) {
		showStatus("Key down");
		int key = k.getKeyCode();
		switch(key) {
		case KeyEvent.VK_UP:
			showStatus("Move to up");
			break;
		case KeyEvent.VK_DOWN:
			showStatus("Move to down");
			break;
		case KeyEvent.VK_LEFT:
			showStatus("Move to left");
			break;
		case KeyEvent.VK_RIGHT:
			showStatus("Move to right");
			break;
		}
		repaint();
	}
	public void keyReleased(KeyEvent k) {
		showStatus("Key UP");
	}

	public void keyTyped(KeyEvent k) {
		msg+=k.getKeyChar();
		repaint();
	}

	public void paint(Graphics g) {
		g.drawString(msg,x,y);
	}
	
		
}
