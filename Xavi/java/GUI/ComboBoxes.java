package GUI;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.*;

public class ComboBoxes extends JFrame {
	
		//JFrame es un matrrco
		//no necesita invocarse desde en MAIN

			//constructor
			public ComboBoxes(){
				super("este es el titulo de la ventana");//invocamos el conatructor de la superclase JFrame
				setSize(350, 100);//tama�o de la ventana
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//operacion despues de teclear la x de cerrar ventana
				
				
				//CREAR BOTONES 
				//crear gestor de dise�o de botones : class FlowLayout
				FlowLayout flow = new FlowLayout();
				setLayout(flow);//ejecutamos el layout (aplicas el gestor)
			
				/***hasta aui todo igual****/
				
				JComboBox curso = new JComboBox();//creamos el objeto de una lista desaplegable
				curso.addItem("CursoJava");
				curso.addItem("CursoPHP");
				curso.addItem("CursoRedes");
				curso.addItem("CursoWeb");
				
				//a�adimos un solo objeto
				add(curso);
				
				//l hacemos visible
				setVisible(true);
				
				
				
				
				
			}
			
			
			public static void main(String[] args) {
				ComboBoxes comb=new ComboBoxes();
			}
}