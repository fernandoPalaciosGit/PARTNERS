
package GUI.eventos;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class ActionCommand extends JFrame implements ActionListener {

	JButton b1 = new JButton("Cursos");
	public ActionCommand(){
		super("Barra de T�tulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addActionListener(this);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		add(b1);
		pack();
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent evt){
		b1.setActionCommand("Pueba");
		b1.setLabel(b1.getActionCommand());
		repaint();
	}
	public static void main(String[] args) {
ActionCommand marco = new ActionCommand();
	}

}
