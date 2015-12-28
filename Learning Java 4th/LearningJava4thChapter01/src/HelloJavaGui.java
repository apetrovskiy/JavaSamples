import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloJavaGui {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello, Java!");
		JLabel label = new JLabel("Hello, Java!", JLabel.CENTER);
		frame.add(label);
		frame.setSize(300, 300);
		frame.setVisible(true);
		// frame.add(new HelloComponent());
		frame.add(new HelloComponent2("Hello, Java!"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class HelloComponent2 extends JComponent implements MouseMotionListener {
	String theMessage;
	int messageX = 125, messageY = 95;
	
	public HelloComponent2(String message) {
		theMessage = message;
		addMouseListener((MouseListener) this);
	}
	
	public void paintComponent(Graphics g) {
		g.drawString("Hello, Java!", 125, 95);
	}
	
	public void mouseDragged(MouseEvent e) {
		messageX = e.getX();
		messageY = e.getY();
		repaint();
	}
	
	public void mouseMoved(MouseEvent e) {}
}
