
package GUI.gestores;
import javax.swing.JFrame;


public class MarcoEncuesta extends JFrame {

	/**
	 * @param args
	 */
	public MarcoEncuesta(){
		   super("Encuesta");
	       setSize(200,140);
	       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       AsistenteEncuesta en = new AsistenteEncuesta();
	       add(en);
	       setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MarcoEncuesta me = new MarcoEncuesta(); 
	}

}




