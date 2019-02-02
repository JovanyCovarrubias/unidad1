package programa8;


import java.text.DecimalFormat;
import java.util.Scanner;

public class programa10a {
	private static final java.text.DecimalFormat (###,###.##) = null;

	public static void main (String[] args){
		Scanner ad = new Scanner (System.in);
		DecimalFormat formateador= new DecimalFormat("###,####.##");
		double n=0.0, t=0.0;
		byte c;
		byte s=1;
		
	    System.out.println ("Welcome");
		System.out.println("Ingrese el producto");
		c=ad.nextByte();
				
		do{
			System.out.println("Ingrese el valor del producto"+s);
			n=ad.nextDouble();
			t=t+n;
			s++;
			
		}while(s<=c);
		
		System.out.println("Cantidad a pagar es:");
		
		if(t>=1500){
			t*=1.11;
		}else{
			t=t*1.1;
			
		}
		
		System.out.println("El aumento es de: ");
		}

	private static DecimalFormat DecimalFormat() {
		// TODO Auto-generated method stub
		return null;
	}
		}
				



