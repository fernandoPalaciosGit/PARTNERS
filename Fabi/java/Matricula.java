

public class Matricula {

	String letras_matr;
	int num_matr;
	
	public Matricula (String letras_matr,int num_matr){
		
		this.letras_matr = letras_matr;
		this.num_matr = num_matr;
		
	}
	
	public String getLetras_matr() {return letras_matr;}
	public void setLetras_matr(String letras_matr) {this.letras_matr = letras_matr;}


	public int getNum_matr() {return num_matr;}
	public void setNum_matr(int num_matr) {this.num_matr = num_matr;}

	
	//METODO toString PARA CONSEGUIR LA CADENA ENTERA
	public String toString(){return num_matr +" "+ letras_matr;}



}
