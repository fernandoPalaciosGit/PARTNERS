package GUI;

import herencias_polimorfismo.censouni.Fecha;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;



//JFRAME TEXTO
public class JPanelDemo extends JFrame{
	
	JPanelDemo(){
		super("este es el titulo de la ventana");// invocamos el constructor de la superclase JFrame
		
		setSize(600, 300);// tama�o de la ventana 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// operacion despues de teclear la x de cerrar ventana

		
		// crear gestor de dise�o de botones : class FlowLayout
		FlowLayout diseny = new FlowLayout();
		setLayout(diseny);// ejecutamos el layout (aplicas el gestor)

		/*** hasta aqui todo igual ****/
		
		JTextArea curso = new JTextArea ("Escribe", 8,40);//pasar parametros de linea y de caracteres por linea
		
		//FALLLOOOOO
		//ahora debemmos asignarlo al Panel1
		add(curso);
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		JPanelDemo texto = new JPanelDemo ();
	}
}

//PANEL
class Panel1 extends JPanel {
	public Panel1() {
		//los paneles NO tienen nombre
		super();//slo para instanciarlo
		
		Fecha fecha=new Fecha();
		String tiempoActual = fecha.toString();//obtenemos la fachha actual
										//se puede instanciar la fecha ya creada (ejercicio)
		JLabel actual = new JLabel(tiempoActual);
		add(actual);
}
	
	public static void main(String[] args) {
		//no sirve, el panel NO ejecuta nada
	}
}

