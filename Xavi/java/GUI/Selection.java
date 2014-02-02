package GUI;

import java.awt.FlowLayout;

import javax.swing.*;
public class Selection extends JFrame{
	//JFrame es un matrrco
	//no necesita invocarse desde en MAIN

		//constructor
		public Selection(){
			super("este es el titulo de la ventana");//invocamos el conatructor de la superclase JFrame
			setSize(350, 100);//tama�o de la ventana
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//operacion despues de teclear la x de cerrar ventana
			
			
			//CREAR BOTONES 
			//crear gestor de dise�o de botones : class FlowLayout
			FlowLayout flow = new FlowLayout();
			setLayout(flow);//ejecutamos el layout (aplicas el gestor)
			
			/***hasta aui todo igual****/
			
			JCheckBox cursoJava = new JCheckBox ("Curso java", true);
			JCheckBox cursoPHP = new JCheckBox ("Curso PHP", true);
			JCheckBox cursoWeb = new JCheckBox ("Curso Web", true);
			JCheckBox cursoRedes = new JCheckBox ("Curso Redes", true);
			
			ButtonGroup cursos = new ButtonGroup(); //agrupar elementos de botones
			
			//le decimos son los botones del grupo, los botones de cursos
			cursos.add(cursoJava);
			cursos.add(cursoPHP);
			cursos.add(cursoWeb);
			cursos.add(cursoRedes);
			
			//a�adimos los botones a la ventana
			add(cursoJava);
			add(cursoPHP);
			add(cursoWeb);
			add(cursoRedes);
			
			setVisible(true);
		}
		
		public static void main(String[] args) {
			Selection s=new Selection();
			
		}
		
}