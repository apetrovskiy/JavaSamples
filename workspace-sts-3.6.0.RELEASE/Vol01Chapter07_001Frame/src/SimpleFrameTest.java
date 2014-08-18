import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SimpleFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				SimpleFrame frame = new SimpleFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				Container contentPane = frame.getContentPane();
				Component c = new JLabel();
				c.setName("aaaaaaa");
				c.setLocation(10, 10);
				c.setSize(30, 30);
				c.setVisible(true);
				c.show();
				contentPane.add(c);
				Component c2 = new JTextField();
				c2.setName("bbbbbbb");
				c2.setLocation(50, 50);
				c2.setSize(50, 50);
				c2.setVisible(true);
				contentPane.add(c2);
				frame.setVisible(true);
			}
		});
	}

}
