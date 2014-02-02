
package GUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Grid extends JPanel {


	/**
	 * Create the frame.
	 */
	public Grid() {
		super();
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 300);
		
		JButton a = new JButton("Fabio");
		JButton b = new JButton("Fernando");
		JButton c = new JButton("Estefi");
		JButton d = new JButton("Laura");
		
		JPanel caja = new JPanel();
		GridLayout grid = new GridLayout(3,3,10,10);//celda de separacion
		
		caja.setLayout(grid);
		
		caja.add(a);
		caja.add(b);
		caja.add(c);
		caja.add(d);
		
		add(caja);
		
		setVisible(true);

	}

}
