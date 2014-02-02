

package GUI.gestores;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Grupo extends JFrame {

	/**
	 * @param args
	 */
	JButton manuel = new JButton ("Manuel");
	JButton sara = new JButton ("Sara");
	JButton joan = new JButton ("Joan");
	JButton xavier = new JButton ("Xavier");
	JButton catalina = new JButton ("Catalina");
	JButton antonio = new JButton ("Antonio");
	JButton teresa = new JButton ("Teresa");
	JButton sergio = new JButton ("Sergio");
	JButton pilar = new JButton ("pilar");
	JButton oscar = new JButton ("oscar");
	public Grupo(){
		super ("Grupo");
		setSize(260,260);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Crear un panel
		//Crear un objeto del Gestor de pila
		//Asignar ese objeto al panel
	   JPanel panel= new JPanel();
	   GridLayout mienbros = new GridLayout(3,3,10,10);
	   panel.setLayout(mienbros);
	   //añadir componentes
	   panel.add(manuel);
	   panel.add(sara);
	   panel.add(joan);
	   panel.add(xavier);
	   panel.add(catalina);
	   panel.add(antonio);
	   panel.add(teresa);
	   panel.add(sergio);
	   panel.add(pilar);
	   //panel.add(oscar);
	   
	   add(panel);
	   setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Grupo g = new Grupo();
	}

}
