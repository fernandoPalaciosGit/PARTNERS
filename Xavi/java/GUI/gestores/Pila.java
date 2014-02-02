
package GUI.gestores;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Pila extends JFrame{

	/**
	 * @param args
	 */
	//Constructor
	public Pila(){
		super("Pila");
		setSize(430,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Crear panel superior
		//1º Crear panel
		JPanel panelComando = new JPanel();
		//2º Crear gestor
		//BoxLayout horizontal = new BoxLayout(panelComando, BoxLayout.X_AXIS); //horizontal
		BoxLayout horizontal = new BoxLayout(panelComando, BoxLayout.Y_AXIS); //Vertical
		//Decir que utilice el gestor de diseño
		
		//Aplicar el panel
		panelComando.setLayout(horizontal);
		//Crear botones
		JButton alta = new JButton ("Alta");
		JButton baja = new JButton ("Baja");                            
		JButton actualizar = new JButton ("Actualizar");
		JButton salvar = new JButton ("Salvar");
		//Añadir botones
		panelComando.add(alta);
		panelComando.add(baja);
		panelComando.add(actualizar);
		panelComando.add(salvar);
		// Crear panel inferior
		JPanel panelTexto = new JPanel(); //crea el panel
		JTextArea texto = new JTextArea(4,10); 
		JScrollPane panelScroll = new JScrollPane(texto);
		
		//Creamos el gestor de diseño
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		add(panelComando);
		add(panelScroll);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pila p = new Pila();
	}

}
