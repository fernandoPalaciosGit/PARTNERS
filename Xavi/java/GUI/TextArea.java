package GUI;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.*;

public class TextArea extends JFrame {

	// JFrame es un marco, invocar desde el MAIN


	public TextArea() {
		super("este es el titulo de la ventana");// invocamos el constructor de la superclase JFrame
													
		setSize(350, 100);// tama�o de la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// operacion despues de teclear la x de cerrar ventana

		
		// crear gestor de dise�o de botones : class FlowLayout
		FlowLayout diseny = new FlowLayout();
		setLayout(diseny);// ejecutamos el layout (aplicas el gestor)

		/*** hasta aqui todo igual ****/
		
		JTextArea curso = new JTextArea ("Escribe", 8,40);//pasar parametros de linea y de caracteres por linea
		
		add(curso);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		TextArea area= new TextArea();
	}
}
