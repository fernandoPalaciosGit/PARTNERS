package GUI.eventos;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


/*
 * ItemListener: un tipo de escuchador que permite elegir varios items
 */
public class ElegirFormato extends JFrame implements ItemListener {

	//Crear String para comboBox
	String[] formatos= {"(Elige formato)","Atom", "RSS 0.92", "RSS 1.0", "RSS 2.0"};
	//Crear String para etiquetas
	String [] descripciones ={
			"Formato de sindicaci�n y webblog Atom",
			"Formato de sindicacion RSS 0.92(Netocupe)",
			"RSS 1.0 (RDF)",
			"RSS 2.0 (RSS Selecci�n Acumulada)"
	};
	
	//Creamos combo y Etiqueta
	JComboBox CajaFormato = new JComboBox();//caja donde recojo 
	JLabel etiquetaDescripcion = new JLabel("");//etiiqueta de informacion
	
	//Constructor
	public ElegirFormato(){
		super("Formato de Sindicaci�n");
		setSize(420,125);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		//a�adimos al combobox items del String formatos
		
		for (int i = 0; i<formatos.length; i++){
			CajaFormato.addItem(formatos[i]);
			
		}
		//añadimos el vigilante (escmuchador) de la caja 
		CajaFormato.addItemListener(this);
		//a�adimos combo arriba en gestor de dise�o
		add(BorderLayout.NORTH,CajaFormato);
		//gestor de diseño dentro de la caja
		add(BorderLayout.CENTER,etiquetaDescripcion);
		setVisible(true);
		
		//implemetar m�todo itemStrateChanged de interface ItemListener
		
		
	}
	
	public void itemStateChanged(ItemEvent event) {
		//obtener el index del Item
		int eleccion = CajaFormato.getSelectedIndex();
		if (eleccion > 0){//si se ha seleccionado algo....
			etiquetaDescripcion.setText(descripciones[eleccion -1]);/*-1 para ajustar a los indices delk aray*/
			//configuramos texto de etiqueta Descripcion
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ElegirFormato ef= new ElegirFormato();
	}




	
	

}
