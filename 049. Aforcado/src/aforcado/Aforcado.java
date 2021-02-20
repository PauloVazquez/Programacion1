package aforcado;
import java.util.Scanner;

public class Aforcado {
	static char[] pedirPalabra(Scanner teclado) {
		char[] vectorpalabra;
		String palabra;
		System.out.print("Introduza unha palabra: ");
		palabra = teclado.nextLine();
		vectorpalabra = palabra.toCharArray();
		return vectorpalabra;
	}
	static int pedirFallos(Scanner teclado) {
		int fallos;
		do {
			System.out.print("Escolla o n�mero de fallos (1-10): ");
			fallos = teclado.nextInt();
		} while (fallos < 1 || fallos > 10);
		return fallos;
	}
	static char[] crearGuions(char[] vectorpalabra, int lonxitudepalabra) {
		char palabraguions[] = new char[lonxitudepalabra];
		palabraguions[0] = vectorpalabra[0];
		for (int i = 1; i < palabraguions.length-1; i++) {
			palabraguions[i] = '_';
		}
		palabraguions[lonxitudepalabra-1] = vectorpalabra[lonxitudepalabra-1];
		return palabraguions;
	}
	static char pedirLetra (Scanner teclado) {
		String letra;
		char letracaracter;
		do {
			teclado.nextLine();
			System.out.print("Introduza unha letra: ");
			letra = teclado.nextLine();
		} while (letra.length() != 1);
		letracaracter = letra.charAt(0);	
		return letracaracter;
	}
	static char[] comprobarLetra (char[] vectorpalabra, char[] vectoracertos, char[] vectorfallos, char letra) {
		char[] vector = new char[vectoracertos.length];
		boolean acertada = false, cambiada = false;
		int contadorfallos = 0;
		
		for (int i = 1; i < vector.length-1; i++) {
			if (letra == vectorpalabra[i]) {
				vectoracertos[i] = letra;
				acertada = true;
			}
			if (!acertada) {
				do {
					if (vectorfallos[contadorfallos] == '_') {
						vectorfallos[contadorfallos] = letra;
						cambiada = true;
					}
				} while (!cambiada);
				
			}
		}
		return vector;
		
	}
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int lonxitudepalabra, numerofallos;
		char[] vectorpalabra, vectoracertos, vectorfallos;
		char letra;
		
		vectorpalabra = pedirPalabra(teclado);
		lonxitudepalabra = vectorpalabra.length;
		numerofallos = pedirFallos(teclado);
		vectorfallos = new char[numerofallos];
		
		vectoracertos = crearGuions(vectorpalabra, lonxitudepalabra);
		
		
		System.out.println("\nPalabra a adivi�ar, "+lonxitudepalabra+" letras:");
		System.out.println(vectoracertos);
		System.out.println();

					
		
	

		}
	}
