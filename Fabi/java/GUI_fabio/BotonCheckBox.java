import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;


public class BotonCheckBox extends JFrame {

	
	
	/**
	 * Create the frame.
	 */
	public BotonCheckBox() {
		
		super("Selecci—n");
		setSize(450,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout diseny = new FlowLayout();
		setLayout(diseny);
		JCheckBox cursoJava = new JCheckBox("Curso Java");
		JCheckBox cursoPHP = new JCheckBox("Curso PHP");
		JCheckBox cursoRed = new JCheckBox("Curso Red");
		JCheckBox chckbxCursoPs = new JCheckBox("Curso PS3");
		
		ButtonGroup cursos = new ButtonGroup();
		
		cursos.add(cursoJava);
		cursos.add(cursoPHP);
		cursos.add(cursoRed);
		
		getContentPane().add(cursoJava);
		getContentPane().add(cursoPHP);
		getContentPane().add(cursoRed);
		getContentPane().add(chckbxCursoPs);
		
		
		
		
		setVisible(true);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		BotonCheckBox frame = new BotonCheckBox();
	
	}

}
