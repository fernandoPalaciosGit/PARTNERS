package GUI;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * 
 * @author daw1a15
 *
 */
//JFrame es un matrrco
//no necesita invocarse desde en MAIN
public class MarcoPrincipal extends JFrame{

	//constructor
	public MarcoPrincipal(){
		super("este es el titulo de la ventana");//invocamos el conatructor de la superclase JFrame
		setSize(350, 100);//tama�o de la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//operacion despues de teclear la x de cerrar ventana
		
		
		//CREAR BOTONES 
		//crear gestor de dise�o de botones : class FlowLayout
		FlowLayout flow = new FlowLayout();
		setLayout(flow);//ejecutamos el layout
		
		
		/***hasta aui todo igual****/
		//sobrecarga: FlowLayout flow = new FlowLayout(FlowLayout.LEFT, 25, 15); //separacion entre botones
		JButton play = new JButton("Play");
		JButton stop = new JButton("Stop");
		JButton pause = new JButton("Pause");

		
		//a�ado los botones al marco
		add(play);//-void
		add(stop);
		add(pause); 
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		MarcoPrincipal marco = new MarcoPrincipal();	
		
	}
}
