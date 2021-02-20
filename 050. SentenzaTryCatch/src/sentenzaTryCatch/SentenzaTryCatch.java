package sentenzaTryCatch;
import java.util.Scanner;

public class SentenzaTryCatch {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dividendo = 0, divisor = 0, cociente = 0, resto = 0;
		System.out.print("Dividendo: ");
		dividendo = teclado.nextInt();
		System.out.print("Divisor: ");
		divisor = teclado.nextInt();
		
		
		try { // Aquí pode haber erro porque o divisor 0 daría erro	
			cociente = dividendo/divisor; 
			resto = dividendo%divisor; 
		}catch(ArithmeticException ae) {System.out.println("Problema co divisor, non pode ser 0");}
	
		System.out.println("Cociente => "+cociente);
		System.out.println("Resto => "+resto);
		teclado.close();
	}

}
