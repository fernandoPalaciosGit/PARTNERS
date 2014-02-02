package GUI.eventos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * b1.addActionListener(this) = VIGILANTE
 * @author daw1a15
 */

//implementando la interfaz ActionListener, puedo asignar operatividad a los eventos,
//a traves de: "void actionPerformed(ActionEvent event)" 
public class CambiarTitulo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	JButton b1 = new JButton("Curso de Java");
	JButton b2 = new JButton("Curso de PHP");

	public CambiarTitulo() {
		super("Barra de T�tulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// metodos que procuran la vigilancia de los eventos 
		// aqui son 2 componentes, uno por cada boton
		b1.addActionListener(this);
		b2.addActionListener(this);

		FlowLayout flow = new FlowLayout();// diseñador
		setLayout(flow);
		add(b1);
		add(b2);
		pack();// controla el conjunto de lo que se esta diseñando
		setVisible(true);

	}

	
	public void actionPerformed(ActionEvent event) {
	
		// como si instanciara mi clase
		Object fuente = event.getSource();

		// 4� El m�todo nos devuelve un objeto event, que podemos usar para
		// detectar el componente que lo ha producido.
		if (fuente == b1) {
			setTitle("Curso Java");
		} else if (fuente == b2) {
			setTitle("Curso de PHP");
		}

		// Para que se vea cuando se cambie
		repaint();
	}

	public static void main(String[] args) {
		
		CambiarTitulo marco = new CambiarTitulo();
	}

}
