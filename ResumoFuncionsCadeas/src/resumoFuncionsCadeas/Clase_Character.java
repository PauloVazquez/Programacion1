package resumoFuncionsCadeas;

public class Clase_Character {
	
	public static void main(String[]args) {
		// Clase Character
		
			// Clasificación de caracteres
		
			// As funcións isDigit(), isLetter(), isLetterOrDigit() devolven un booleano.
		
		char numero = '8';
		char letra = 'p';
		char especial = '?';
		
		// isDigit().
		
		boolean éDixito;
		
		éDixito = Character.isDigit(numero);
		System.out.println(éDixito); // Mostra true porque "8" é díxito.
		
		éDixito = Character.isDigit(letra);
		System.out.println(éDixito); // Mostra false porque "p" non é díxito.
		
		éDixito = Character.isDigit(especial);
		System.out.println(éDixito); // Mostra false porque "?" non é díxito.
		
		// isLetter().
		
		boolean éLetra;
		
		éLetra = Character.isLetter(numero); // Mostra false porque "8" non é letra.
		System.out.println(éLetra);
		
		éLetra = Character.isLetter(letra); // Mostra true porque "p" é letra.
		System.out.println(éLetra);
		
		éLetra = Character.isLetter(especial); // Mostra false porque "?" non é letra.
		System.out.println(éLetra);
		
		// isLetterOrDigit().
	}

}
