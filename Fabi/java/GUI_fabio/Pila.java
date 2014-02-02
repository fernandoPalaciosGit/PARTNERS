import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;


public class Pila extends JFrame {


	/**
	 * Create the frame.
	 */
	public Pila() {
		super("Pila");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);

		JPanel panel = new JPanel();
		BoxLayout horizontal = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(horizontal);
		
		JButton a = new JButton("A");
		JButton b = new JButton("B");
		JButton c = new JButton("C");
		JButton d = new JButton("D");
		
		panel.add(a);
		panel.add(b);
		panel.add(c);
		panel.add(d);
		
		
		JPanel texto = new JPanel();
		JTextArea area = new JTextArea(4,10);
		JScrollPane scroll = new JScrollPane(area);
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		add(panel);
		add(scroll);
		
		setVisible(true);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Pila nueva = new Pila();
	}


}
