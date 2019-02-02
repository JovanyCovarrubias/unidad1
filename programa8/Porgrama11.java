package programa8;

import java.util.Scanner;

public class programa9 {
	 
	public static void main (String args[]){
		
		Scanner Medida= new Scanner(System.in);
		byte op;
		double medida=0, resultado=0 ;
		
		System.out.println("Ingrese una unidad");
		
		System.out.println("1 Pulgadas a Centimetros");
		System.out.println("2 Pies a Centimetros");
		System.out.println("3 Pies a Pulgadas");
		System.out.print("Salir");
		op= Medida.nextByte();
		
		switch(op){
		
		case 1:
			resultado = medida * 2.54;
		System.out.println("El resultado en centimetros es: "+resultado+"cm");
		
		break;
		
		case 2: 
			resultado = medida * 30.48;
		System.out.println("El resultado en pies "+resultado+"cm" );
		
		break;
		
		case 3: 
			resultado = medida * 12;
		System.out.println("El resultado en pies es: "+resultado+"plg");
		
		break;
	
		}
		
	}

}
public class Porgrama11 {

}
