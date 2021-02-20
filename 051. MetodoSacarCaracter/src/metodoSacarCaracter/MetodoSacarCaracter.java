package metodoSacarCaracter;
import java.util.Scanner;

public class MetodoSacarCaracter {
	
	static char sacarCaracter (String texto, int posicion) {
		char[] vectortexto = vectortexto = texto.toCharArray(); // Convirto o texto en vector
		posicion--; // Resto 1 á posición para que a 1ª sexa 1 e non 0
		
		return vectortexto[posicion];
	}
	
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		String texto;
		int caracter;
		
		
		System.out.print("Introduza un texto: ");
		texto = teclado.nextLine();
		
		do {
			
			System.out.print("\nQue caracter quere extraer? ");
			caracter = teclado.nextInt();
			if(caracter != 0 && caracter <= texto.length()) {
				System.out.println("O carácter é "+sacarCaracter(texto, caracter));
			}
			
		} while (caracter != 0);
		System.out.print("\nFIN");
	}

}
