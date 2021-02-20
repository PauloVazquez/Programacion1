package palindromo;
import java.util.Scanner;
public class Palindromo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase = "", fraseauxiliar = "";
		int i = 0, j = 0;
		boolean palindromo = true;

			System.out.print("Introduza unha frase: ");
			frase = teclado.nextLine();

		
		frase = frase.toLowerCase();

	// Eliminamos espazos
	for (i = 0; i < frase.length(); i++) {
		if (frase.charAt(i) != ' ') 
			fraseauxiliar += frase.charAt(i);
	}
	
	// Iniciamos índices a cada lado da cadea
	i = 0;
	j = fraseauxiliar.length()-1;
	
	
	do {
		// Comparamos caracteres
		if (fraseauxiliar.charAt(i) == fraseauxiliar.charAt(j)) {
			i++;
			j--;
		}else 
			palindromo = false;			
	} while (j > i && palindromo);
	
/*	for (i = 0; i < (frase.length()/2) && palindromo; i++) {
		if (fraseauxiliar.charAt(i) != (fraseauxiliar.charAt(fraseauxiliar.length()-i))) {
			palindromo = false;
		}
	}*/
	
	if (palindromo) 
		System.out.print("É un palíndromo");
	else 
		System.out.print("Non é un palíndromo");
	
	}
}