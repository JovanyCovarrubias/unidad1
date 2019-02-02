package programa8;

import java.util.Scanner;

public class diasemana {
	
	public static void main (String args[]){
	
		Scanner Dia= new Scanner (System.in);
		int dia ;
		
	System.out.println("Elija un dia de la semana (1-7)");
	
	dia = Dia.nextInt();
	
	switch(dia){
	
	case 1: 
		System.out.println("1.- Lunes");
		break;
		
	case 2:
		System.out.println("2.- Martes");
		break;
		
	case 3:
		System.out.println("3.- Miercoles");
		break;
		
		
	case 4:
		System.out.println("4.- Jueves");
		break;
		
		
	case 5:
		System.out.println("5.- Viernes");
		break;
		
case 6: 
	System.out.println("6.- Sabado");
		break;
		
case 7: 
	System.out.println("7.- Domingo");
	break;
	
	
	default: System.out.println("No ha seleccionado un dia valido");
		break;
	}
	
	
	}
}
