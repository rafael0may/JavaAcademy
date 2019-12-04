import java.util.Scanner;

public class SRMD {
	public static void main (String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		double uno = entrada.nextDouble();
		System.out.println("Ingrese otre: ");
		double dos = entrada.nextDouble();
		
		double suma =  uno + dos;
		double resta = uno - dos;
		double multiplicacion = uno * dos;
		double division = uno / dos;
		
		System.out.println(("La suma es: ") + suma +
							("\nLa resta es: ") + resta +
							("\nla multiplicacion es: ") + multiplicacion +
							("\nLa division es: ") + division);	
	}
}

