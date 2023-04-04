package Test;

import java.awt.BorderLayout;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class NotePadClass extends JFrame{
	String text="";
	public NotePadClass() {
		JTextField text = new JTextField();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		label.setHorizontalAlignment(SwingConstants.NORTH_WEST);
		label.setVerticalAlignment(SwingConstants.CENTER);
		add(text);
		setTitle("NotePad");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}