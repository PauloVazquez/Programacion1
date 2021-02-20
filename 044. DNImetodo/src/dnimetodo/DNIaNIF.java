package dnimetodo;
import java.util.Scanner;

public class DNIaNIF {
	static char letraNif(int DNI) {
		String letra= "TRWAGMYFPDXBNJZSQVHLCKE";
		return letra.charAt(DNI%23);			
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String DNIstring;
		int DNI;
		do {
			System.out.print("Introduza un número DNI: ");
			DNI = teclado.nextInt();
			DNIstring = String.valueOf(DNI);
		} while (DNIstring.length() != 8);
			

		System.out.println("NIF completo: "+DNI+letraNif(DNI));
		teclado.close();
	}
}
