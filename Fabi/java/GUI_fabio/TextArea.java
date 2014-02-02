import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextArea extends JFrame{

	public TextArea() {
		
		super("Area de texto");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//DISE„O
		FlowLayout diseny = new FlowLayout();
		setLayout(diseny);
				
		//UNO
		JTextArea comentario = new JTextArea("Escribe algo...",3,40);
		JScrollPane scroll = new JScrollPane(comentario);
		add(scroll);
		
		//MARCORELOJ.JAVA
		MarcoReloj reloj = new MarcoReloj();
		add(reloj);
		
		//ALFABETO.JAVA
		Alfabeto alfa = new Alfabeto();
		add(alfa);
		
		//GRID.JAVA
		Grid grid = new Grid();
		add(grid);
		
		//BORDER.JAVA
		Border border = new Border();
		add(border);
		
	}
	
	public static void main(String[] args) {
		
		TextArea area = new TextArea();
		area.setVisible(true);
		
	}
	
}
