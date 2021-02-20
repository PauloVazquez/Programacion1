// Crear unha cadea caracter a caracter, só letras
// Crear unha cadea da mesma lonxitude que a anterior.
// Que diga en que posicións se repiten letras, se se repiten

package cadeaCaracterACaracter;
import java.util.Scanner;

public class CadeaCaracterACaracter {
	static String crearCadea(Scanner teclado) {
		String letra, cadea = "";
		letra="";
	
		do {
		try {
				do {
					System.out.print("Introduza unha letra (Punto(.) para acabar): ");
					letra = teclado.nextLine();			
					//letra = Character.toUpperCase((char)System.in.read());
				} while ((!Character.isLetter(letra.charAt(0)) || letra.length() != 1) && !letra.contentEquals(".") && letra.isEmpty()); // Repetir se non é letra punto
				
				if (Character.isLetter(letra.charAt(0))) {
					cadea = cadea+letra.toUpperCase();				
				}		
				
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("A cadea está baleira\n");
		}
		} while (!letra.contentEquals(".")); // Repetir até que o usuario pulse . para rematar
		
		return cadea;
	}
	
	static String crearSegundaCadea(Scanner teclado, int lonxitude) {
		String segundaCadea;
		System.out.println();

		do {
			System.out.print("Introduza unha cadea de "+lonxitude+" letras: ");
			segundaCadea = teclado.nextLine();
		} while (segundaCadea.length() != lonxitude); // Repetir mentres teña lonxitudes diferentes
		
		segundaCadea = segundaCadea.toUpperCase();
		
		return segundaCadea;
	}
	
	static void compararCadeas(String cadea, String segundaCadea) {
		
		System.out.println();
		
		for (int i = 0; i < cadea.length(); i++) {
			if (cadea.substring(i, (i+1)).equalsIgnoreCase(segundaCadea.substring(i, (i+1)))) { // Se o caracter da posición é igual ou diferente, dicilo
				System.out.println("As cadeas coinciden na posición "+(i+1)+"ª coa letra \""+cadea.charAt(i)+"\"");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadea, segundaCadea;
		int lonxitude;
		
		cadea = crearCadea(teclado);
		lonxitude = cadea.length();
		segundaCadea = crearSegundaCadea(teclado, lonxitude);
		
		compararCadeas(cadea, segundaCadea);

	}
}
