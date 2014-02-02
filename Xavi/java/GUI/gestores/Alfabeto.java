package GUI.gestores;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Alfabeto extends JFrame{

	/**
	 * @param args
	 */
	//Instanciamiento de objetos
	JButton a = new JButton("Abierto");
	JButton b = new JButton("Bravo");
	JButton c = new JButton("Cara");
	JButton d = new JButton("Decisión");
	JButton e = new JButton("Evidencia");
	JButton f = new JButton("Formación");
	//Constructor
	public Alfabeto(){
		super("Alfabeto");
		setSize(360,120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//FlowLayout diseny = new FlowLayout(FlowLayout.LEFT);
		FlowLayout diseny = new FlowLayout(FlowLayout.LEFT, 25, 15 );
		//Aplicamos el marco
		setLayout(diseny);
		add(a);
		add(b);
		add(c);
		add(d);
		add(e);
		add(f);
		setVisible(true);
		
	}
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Alfabeto a = new Alfabeto();
	}

}
