package algoritmos;
import java.util.Scanner;

public class Bi_deci_oct_hex15 {
	
	
	String num2;
	int num3;
	int num4;
	int i;
	String num;
	String oct;
	String Hexa;
	String hexa16;
	String octalhexa;
	String hexa8;
	String binaoctal;
	String binahexa;
	String octalbina;
	
	public void Decimal(){
		
		System.out.println("\nIngrese : Decimal a Binario :");
		Scanner teclado = new Scanner(System.in);
		num2 = teclado.next();
		i=Integer.parseInt(num2);
		System.out.println("En binario es :"+Integer.toBinaryString(i));
		System.out.println("===========================================");
		
	}
	public void Octal(){
		
		System.out.println("\nIngrese : Decimal a Octal :");
		Scanner teclado = new Scanner(System.in);
		num3 = teclado.nextInt();
		System.out.println("En Octal es :"+Integer.toOctalString(num3));
		System.out.println("===========================================");
	}
	public void Hexadecimal(){
		
		System.out.println("\nIngrese : Decimal a Hexadecimal :");
		Scanner teclado = new Scanner(System.in);
		num4 = teclado.nextInt();
		System.out.println("En hexadecimal es :"+Integer.toHexString(num4));
		System.out.println("===========================================");
	}
	public void Binario(){
		
		System.out.println("\nIngrese : Binario a Decimal ==>0 y 1<===:");
		Scanner teclado = new Scanner(System.in);
		num = teclado.next();
		System.out.println("En Decimal es :"+Integer.parseInt(num,2));
		System.out.println("===========================================");
		
	}
	public void Octal8(){
		
		System.out.println("\nIngrese : Octal a Decimal:");
		Scanner teclado = new Scanner(System.in);
		oct = teclado.next();
		System.out.println("En Decimal es :"+Integer.parseInt(oct,8));
		System.out.println("=========================================");
		
	}
	public void Hexadi16(){
		
		System.out.println("\nIngrese : Hexadecimal a Decimal:");
		Scanner teclado = new Scanner(System.in);
		Hexa = teclado.next();
		System.out.println("En Decimal es :"+Integer.parseInt(Hexa,16));
		System.out.println("=========================================");
	
	}
	public void HexaBina(){
		
		
		System.out.println("\nIngrese : Hexadecimal a Binario:");
		Scanner teclado = new Scanner(System.in);
		hexa16 = teclado.next();
		i=Integer.parseInt(hexa16,16);
		System.out.println("En Binario es :"+Integer.toBinaryString(i));
		System.out.println("=========================================");
		
	}
	public void HexaOctal(){
		
		System.out.println("\nIngrese : Hexadecimal a Octal:");
		Scanner teclado = new Scanner(System.in);
		hexa8 = teclado.next();
		i=Integer.parseInt(hexa8,16);
		System.out.println("En Octal es :"+Integer.toOctalString(i));
		System.out.println("=========================================");
	
		
	}
	public void BinaOctal(){
		
		System.out.println("\nIngrese : Binario a Octal   =====>0 y 1<===:");
		Scanner teclado = new Scanner(System.in);
		binaoctal = teclado.next();
		i=Integer.parseInt(binaoctal,2);
		System.out.println("En Octal es :"+Integer.toOctalString(i));
		System.out.println("===========================================");
			
	}
	public void BinaHexa(){
		
		System.out.println("\nIngrese : Binario a Hexadecimal :");
		Scanner teclado = new Scanner(System.in);
		binahexa = teclado.next();
		i=Integer.parseInt(binahexa,2);
		System.out.println("En Hexadecimal es :"+Integer.toHexString(i));
		System.out.println("===========================================");
			
		
	}
	public void OctalBina(){
		
		
		System.out.println("\nIngrese : Octal a Binario :");
		Scanner teclado = new Scanner(System.in);
		octalbina = teclado.next();
		i=Integer.parseInt(octalbina,8);
		System.out.println("En Binario es :"+Integer.toBinaryString(i));
		System.out.println("===========================================");
		
			
	}
	public void OctalHexa(){
		
		System.out.println("\nIngrese : Octal a Hexadecimal :");
		Scanner teclado = new Scanner(System.in);
		octalhexa = teclado.next();
		i=Integer.parseInt(octalhexa,8);
		System.out.println("En Hexadecimal es :"+Integer.toHexString(i));
		System.out.println("===========================================");
			
	}
	
	
	public static void main(String[] args) {
	
		Bi_deci_oct_hex15 nuevo=new Bi_deci_oct_hex15();
		
		Scanner teclado = new Scanner(System.in);
   	  		
		char opcion;
		
		do{
			System.out.println("MENU DE COMBINACIONES NUMERICAS\t");
			System.out.println("===========================================");
			System.out.println("a.-Imprimir Decimal a Binario: ");
			System.out.println("b.-Imprimir Decimal a Octal: ");
			System.out.println("c.-Imprimir Decimal a Hexadecimal: ");
			System.out.println("d.-Imprimir Binario a Decimal: ");
			System.out.println("e.-Imprimir Octal a Decimal: ");
			System.out.println("f.-Imprimir Hexadecimal a Decimal: ");
			System.out.println("g.-Imprimir Hexadecimal a Binario: ");
			System.out.println("h.-Imprimir Hexadecimal a Octal: ");
			System.out.println("i.-Imprimir Binario a Octal: ");
			System.out.println("j.-Imprimir Binario a Hexadecimal:");
			System.out.println("k.-Imprimir Octal a Binario:");
			System.out.println("l.-Imprimir Octal a Hexadecimal:");
			System.out.println("m.-Salir\n");
			System.out.println("===========================================");
		
		System.out.println("Ingrese un letra en minuscula:");
		opcion = teclado.next().charAt(0);
			 	
		switch (opcion){
		case ('a'):nuevo.Decimal();
		break;
		case ('b'):nuevo.Octal();
		break;
		case ('c'):nuevo.Hexadecimal();
		break;
		case ('d'):nuevo.Binario();
		break;
		case ('e'):nuevo.Octal8();
		break;
		case ('f'):nuevo.Hexadi16();
		break;
		case ('g'):nuevo.HexaBina();
		break;
		case ('h'):nuevo.HexaOctal();
		break;
		case ('i'):nuevo.BinaOctal();
		break;
		case ('j'):nuevo.BinaHexa();
		break;
		case ('k'):nuevo.OctalBina();
		break;
		case ('l'):nuevo.OctalHexa();
		break;
		case ('m'):
			System.out.println("\tFIN DE PROGRAMA ");
		System.exit(opcion);
		break;
		}
		
	}while(opcion !='m');
}

}