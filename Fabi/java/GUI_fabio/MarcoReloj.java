import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class MarcoReloj extends JPanel {

	/**
	 * Create the frame.
	 */
	public MarcoReloj() {
		
		super();
		
		String tiempoActual = "27/3/1990";
		JLabel actual = new JLabel(tiempoActual);
		add(actual);
		
	}
	
}
