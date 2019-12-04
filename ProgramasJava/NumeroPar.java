public class NumeroPar{
	public static void main (String[] args){
		int valorEntero = Integer.valueOf(args[0]);
		boolean esPar = valorEntero%2 == 0;		
		if(esPar==true){
			System.out.println("El numero " + valorEntero + " esPar");
		}else{
			System.out.println("El numero " + valorEntero + " esImpar");
		}
	}
}