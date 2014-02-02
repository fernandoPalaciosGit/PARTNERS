
package GUI_fabio;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Alfabeto extends JPanel {

	/**
	 * Create the panel.
	 */
	public Alfabeto() {
		super();
		
		//BOTONES
		JButton a = new JButton("Hola");
		JButton b = new JButton("Adios");
		JButton c = new JButton("Hasta luego");
		JButton d = new JButton("Ciao");
		
		JPanel panel = new JPanel();
		BoxLayout horizontal = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(horizontal);
		
		
		panel.add(a);
		panel.add(b);
		panel.add(c);
		panel.add(d);
		add(panel);
	}

}
