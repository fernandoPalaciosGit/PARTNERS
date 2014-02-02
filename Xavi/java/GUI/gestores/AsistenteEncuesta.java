
package GUI.gestores;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


	//creamos la clase , es un panel como contenedor para el cartLeyaut
public class AsistenteEncuesta extends JPanel implements ActionListener{

	/**
	 * @param args
	 */
	//para segir la pista al action
	int cartaActual = 0;
	//cramos objeto del gestor del diseño
	CardLayout cartas = new CardLayout();
	//array de objetos
	PanelEncuesta[] pregunta = new PanelEncuesta[3];
	
	//constructor
	public AsistenteEncuesta(){
		super();
		setSize(240,140);
		//configuramos el panel de diseño
		setLayout(cartas);
	//configurar encuesta
		String pregunta1 = "¿Cuál es tu género? ";
		String[] respuesta1  = {"Hombre","Mujer","No contesto"};
		pregunta[0]= new PanelEncuesta(pregunta1,respuesta1,2);
		//2 el que aparece marcado por defecto
		String pregunta2 = "¿Cuál es tu edad? ";
		String[] respuesta2 = {"Menos de 25","25-34","35-54","Más de 54"};
		pregunta[1]= new PanelEncuesta(pregunta2,respuesta2,1);
		String pregunta3 = "¿Cuantas veces repasas programación por semana? ";
		String[] respuesta3 = {"Nunca","1-3 veces","Más de 3"};
		pregunta[2]= new PanelEncuesta(pregunta3,respuesta3,1);
		//cualdo llege a la pregunta final abilita el boton al finalizar
		pregunta[2].setPreguntaFinal(true);
         //vamos a poner a cada boton un vigilate (si se pulsa o no)
		for (int i = 0;i < pregunta.length; i++){
			pregunta[i].botonSiguiente.addActionListener(this);
			pregunta[i].botonFinal.addActionListener(this);
			add(pregunta[i],"carta "+ i);
		}
	}
	//metodo que se ejecuta cada vez que se pulsa un boton
	public void actionPerformed (ActionEvent evt){
		cartaActual ++;
		//si es el último panel
		if(cartaActual >= pregunta.length){
			System.exit(0);
		}
		cartas.show(this, "carta "+cartaActual);
	}
} //fin asisteneteEncuesta

//Creamos la clase  PanelEncuesta, que es donde colocaremos la información cuando se 
//pase cuando llamenos a un objeto de esta clase.
	class PanelEncuesta extends JPanel{
		//definición  variables
		JLabel pregunta;
		JRadioButton[] respuesta;
		JButton botonSiguiente = new JButton("Siguiente");
		JButton botonFinal = new JButton("Finalizar");
		//Constructor
		PanelEncuesta (String pre, String[] resp, int def){
			super ();
			setSize(160,110);
			//crear objetos
			pregunta = new JLabel (pre);
			respuesta = new JRadioButton[resp.length];
			//Para agrupar botones
			ButtonGroup grupo = new ButtonGroup();
			//vamos a organizar la información en tres subpaneles
			// Primer panel
			JPanel sub1 = new JPanel();
			JLabel preLabel = new JLabel(pre);
			sub1.add(preLabel);
			//Segundo panel
			JPanel sub2 = new JPanel();
			//para recuperar todos
			for(int i= 0; i< resp.length; i++){
				
				if(def==i){
					respuesta[i]= new JRadioButton(resp[i],true);
				}else{
					respuesta[i]=new JRadioButton(resp[i],false);
				}
				grupo.add(respuesta [i]);
				sub2.add(respuesta[i]);
				}
			//tercer panel
			JPanel sub3 = new JPanel();
			botonSiguiente.setEnabled(true);
			sub3.add(botonSiguiente);
			botonFinal.setEnabled(false);
			sub3.add(botonFinal);
			//creamos el gestor del diseño
			GridLayout grid = new GridLayout(3,1);
			setLayout(grid);
			add(sub1);
			add(sub2);
			add(sub3);
			
			}
			//método
		void setPreguntaFinal(boolean preguntaFinal){
			if(preguntaFinal){
				botonSiguiente.setEnabled(false);
				botonFinal.setEnabled(true);
			}
			
		}
	}
		


