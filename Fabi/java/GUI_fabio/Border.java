import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Border extends JPanel {

	/**
	 * Create the panel.
	 */
	public Border() {
		super();
		setSize(600, 300);
		
		JPanel panel = new JPanel();
		
		JButton n = new JButton("Norte");
		JButton s = new JButton("Sur");
		JButton e = new JButton("Este");
		JButton o = new JButton("Oeste");
		JButton c = new JButton("Centro");
		
		setLayout(new BorderLayout());
		add(n,BorderLayout.NORTH);
		add(s,BorderLayout.SOUTH);
		add(e,BorderLayout.EAST);
		add(o,BorderLayout.WEST);
		add(c,BorderLayout.CENTER);
		
	}

}
