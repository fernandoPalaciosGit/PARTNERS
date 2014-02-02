

package GUI.eventos;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Calculadora extends JFrame implements FocusListener {
	
	//ORIGENES
	//creamos los campos de texto y las etiquetas para la calculadora	
	JTextField valor1 = new JTextField("0",5);
	JLabel mas = new JLabel ("+");
	JTextField valor2 = new JTextField("0",5);
	JLabel igual = new JLabel ("=");
	JTextField suma = new JTextField("0",5);
	
	
	//Creamos el constructor
	public Calculadora(){
		super ("A�ade dos n�meros");
		setSize(350,90);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flow = new FlowLayout (FlowLayout.CENTER);
		setLayout(flow);
		//a�adimos listener a los dos campos de entrada de texto
		valor1.addFocusListener(this);
		valor2.addFocusListener(this);
		//configuramos campo suma y loa marcamos no editable
		suma.setEditable(false);
	
		//añadimos los objetivos de los vigilantes
		add(valor1);
		add(mas);
		add(valor2);
		add(igual);
		add(suma);
		setVisible(true);
		 
		
	}
	
	
	public void focusGained(FocusEvent event) {
	
		try{
		// convertimos valores de las capas de string a n�meros y los guardamos
		float total = Float.parseFloat(valor1.getText()) + Float.parseFloat(valor2.getText()) ;
		//a�adimos el resultado al campo suma
		suma.setText(""+total);
		}catch (NumberFormatException ntc){
			valor1.setText("0");
			valor2.setText("0");
			suma.setText("0");
		}
	}

	//implementacion de la interfaz
	public void focusLost(FocusEvent event) {
		focusGained(event);//realiza la operacion cuando pierde el foco sobre el origen de eventos en el que estamos actuando
	}
	
	public static void main(String[] args) {

		Calculadora cal = new Calculadora();
	}

		
	}


