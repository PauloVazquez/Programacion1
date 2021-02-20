// Meter unha cadea calquera
// Separar as letras a un array char
// Separar os números a outro array int
// Separar os caracteres especiais noutro array char
// Mostrar aqueles vectores que teñan contido

package arraysCaracteres;

import java.util.Scanner;

public class ArraysCaracteres {
	
	public static String introducirFrase(Scanner teclado) {
		String frase;
		System.out.print("Introduza unha cadea: ");
		frase = teclado.nextLine();
		return frase;		
	}
	
	public static int contarLetras(String frase) {
		int letras = 0;
		int caracter;
		
		for (int i = 0; i < frase.length(); i++) { // Contamos se o valor  é unha letra
			caracter = frase.charAt(i);
			if (Character.isLetter(caracter)) {
				letras++;
			}
	}
		return letras;
	}
	
	public static int contarNumeros(String frase) {
		int dixitos = 0;
		int caracter;
		
		for (int i = 0; i < frase.length(); i++) { // Contamos se o valor é un díxito
			caracter = frase.charAt(i);
			if (Character.isDigit(caracter)) {
				dixitos++;
			}
		}
		return dixitos;
	}
	
	public static int contarEspeciais(String frase) {
		int caracteresEspeciais = 0;
		int caracter;
		
		for (int i = 0; i < frase.length(); i++) { // Contamos se o valor é un caracter diferente
			caracter = frase.charAt(i);
			if (!Character.isLetterOrDigit(caracter)) {
				caracteresEspeciais++;
			}
		}
		return caracteresEspeciais;
	}
	
	public static char[] encherVectorLetras(String frase, char[] letras) {
		int j = -1; // asignamos en -1 para comezar a sumar 1 e que comece en 0.
		
		for (int i = 0; i < frase.length(); i++) {
			if (Character.isLetter(frase.charAt(i))) { // Se o caracter é unha letra
					j++;
					letras[j] = frase.charAt(i);
			}
		}
		
		return letras;
	}
	
	public static int[] encherVectorNumeros(String frase, int[] numeros) {
		int j = -1;
		
		for (int i = 0; i < frase.length(); i++) {
			if (Character.isDigit(frase.charAt(i))) { // Se o caracter é un número
					j++;
					numeros[j] = Character.digit(frase.charAt(i), 10);
//					numeros[j] = Character.getNumericValue(frase.charAt(i));
			}
		}
		
		return numeros;
	}
	
	public static char[] encherVectorEspeciais(String frase, char[] especiais) {
		int j = -1;
		
		for (int i = 0; i < frase.length(); i++) {
			if (!Character.isLetterOrDigit(frase.charAt(i))) { // Se o carácter é especial
					j++;
					especiais[j] = frase.charAt(i);
			}
		}
		
		return especiais;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		int contLetras, contNumeros, contEspeciais;
		
		frase = introducirFrase(teclado);
		
		contLetras = contarLetras(frase);
		contNumeros = contarNumeros(frase);
		contEspeciais = contarEspeciais(frase);
		
		// Asignamos as dimensións a cada vector en función dos caracteres que existan de cada tipo
		char[] letras = new char[contLetras];
		int[] numeros = new int[contNumeros];
		char[] especiais = new char[contEspeciais];
		
		letras = encherVectorLetras(frase, letras);
		numeros = encherVectorNumeros(frase, numeros);
		especiais = encherVectorEspeciais(frase, especiais);
		
		System.out.println();
		
		//Mostramos cada vector só se existen caracteres do seu tipo
		if (letras.length != 0) {
			System.out.print("Letras:\t\t\t");
			for (int i = 0; i < letras.length; i++) {
				System.out.print(letras[i]+"\t");
			}
		}
		
		System.out.println();
		if (numeros.length != 0) {
			System.out.print("Números:\t\t");
			for (int i = 0; i < numeros.length; i++) {
				System.out.print(numeros[i]+"\t");
			}
		}
		
		System.out.println();
		if (especiais.length != 0) {
			System.out.print("Caracteres especiais:\t");
			for (int i = 0; i < especiais.length; i++) {
				System.out.print(especiais[i]+"\t");
			}
		}
	}
}