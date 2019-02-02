package programa8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class programa10b {
public static void main(String args[]){
	Scanner ad = new Scanner (System.in);
	DecimalFormat formateador= new DecimalFormat("###,####.##");
	
	byte numero = 0; int i = 0;
	double suma = 0;
	
	do{
		System.out.print("Ingrese Numero");
		Scanner leer;
		numero= leer.nextByte();
		if(numero>=0 && numero <= 76){
			suma+=numero;
			i++;
			
		}
	}while(numero<=76);
	System.out.print("La suma es:"+suma+"El promedio es:"+formateador.format(suma/i));
	
}
}
