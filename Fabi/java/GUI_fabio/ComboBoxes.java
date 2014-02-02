import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class ComboBoxes extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ComboBoxes() {
		super("Lista Selecci—n");
		setSize(450,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout diseny = new FlowLayout();
		getContentPane().setLayout(diseny);
		JComboBox combo = new JComboBox();
		combo.addItem("Curso Buton");
		combo.addItem("Curso Java");
		
		add(combo);
		
		setVisible(true);
	}

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		ComboBoxes frame = new ComboBoxes();
	
	}
}
