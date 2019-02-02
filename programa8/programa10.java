package programa8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class programa10 {

	public static void main (String [] args){
		//TODO Auto-generated method stub
		Scanner leer  = new Scanner (System.in);
		DecimalFormat forma= new DecimalFormat("###,###.##");
		//11% si es mayor de 1500 y 10% si es menor
		
		double producto1 =0,producto2=0,producto3=0,total=0
				
				System.out.println("¿Que deseas llevar?");
		System.out.println("Ingrese el primer producto");
		producto1 = leer.nextDouble();
		System.out.println("Ingrese el segundo producto");
		producto2 = leer.nextDouble();
		System.out.println("Ingrese el tercer producto");
		producto3 = leer.nextDouble();
		
		total= producto1+producto2+producto3;
		
		if (total>=1500){
			total= total*1.11;
			
		}
		
		else {
			total= total*1.10;
		}
		System.out.println("El total seria: $"+forma.format(total));
		System.out.println("Gracias por su compra");
		
	}
}
