

package GUI.gestores;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Border extends JFrame {

	/**
	 * @param args
	 */
	JButton botonN = new JButton ("Norte");
	JButton botonS = new JButton ("Sur");
	JButton botonE = new JButton ("Este");
	JButton botonO = new JButton ("Oeste");
	JButton botonC = new JButton ("Centro");
	
	public Border(){
		super("Borde");
		setSize(240,280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//BorderLayout b = new BorderLayout();
		//setLayout(b);
		setLayout(new BorderLayout());
		add(botonN, BorderLayout.NORTH);
		add(botonS, BorderLayout.SOUTH);
		add(botonE, BorderLayout.EAST);
		add(botonO, BorderLayout.WEST);
		add(botonC, BorderLayout.CENTER);
		//setVisible(true);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Border marco = new Border();
     marco.setVisible(true);
	}

}
