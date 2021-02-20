package resumoFuncionsCadeas;

public class Clase_Character {
	
	public static void main(String[]args) {
		// Clase Character
		
			// Clasificación de caracteres
				// Por tipos de caracter
		
		char numero = '8';
		char letraMinuscula = 'a';
		char especial = '?';
		
					// boolean isDigit(char).
		boolean éDixito;
		
		éDixito = Character.isDigit(numero);
		System.out.println(éDixito); // Mostra true porque "8" é díxito.
		
		éDixito = Character.isDigit(letraMinuscula);
		System.out.println(éDixito); // Mostra false porque "p" non é díxito.
		
		éDixito = Character.isDigit(especial);
		System.out.println(éDixito); // Mostra false porque "?" non é díxito.
		
							System.out.println();
					// boolean isLetter(char).
		boolean éLetra;
		
		éLetra = Character.isLetter(numero); // Mostra false porque "8" non é letra.
		System.out.println(éLetra);
		
		éLetra = Character.isLetter(letraMinuscula); // Mostra true porque "p" é letra.
		System.out.println(éLetra);
		
		éLetra = Character.isLetter(especial); // Mostra false porque "?" non é letra.
		System.out.println(éLetra);
		
							System.out.println();
					// boolean isLetterOrDigit(char).
		boolean éLetraOuDixito;
		
		éLetraOuDixito = Character.isLetterOrDigit(numero);
		System.out.println(éLetraOuDixito); // Mostra true porque "8" é díxito.
		
		éLetraOuDixito = Character.isLetterOrDigit(letraMinuscula);
		System.out.println(éLetraOuDixito); // Mostra true porque "p" é letra.
		
		éLetraOuDixito = Character.isLetter(especial); // Mostra false porque "?" non é letra nin díxito.
		System.out.println(éLetraOuDixito);
		
							System.out.println();
			// Por maiúsculas ou minúsculas		
					// boolean isLowerCase(char).
		boolean éMinuscula;
		char letraMaiuscula = 'A';
		
		éMinuscula = Character.isLowerCase(letraMinuscula);
		System.out.println(éMinuscula); // Mostra true porque "p" é minúscula
	
		éMinuscula = Character.isLowerCase(letraMaiuscula);
		System.out.println(éMinuscula); // Mostra false porque "P" é maiúscula
		
		éMinuscula = Character.isLowerCase(numero);
		System.out.println(éMinuscula); // Mostra false porque nin sequera é letra
		
							System.out.println();
					// boolean isUpperCase(char).
		boolean éMaiuscula;
		
		éMaiuscula = Character.isUpperCase(letraMinuscula);
		System.out.println(éMaiuscula); // Mostra false porque "p" é minúscula
	
		éMaiuscula = Character.isUpperCase(letraMaiuscula);
		System.out.println(éMaiuscula); // Mostra true porque "P" é maiúscula
		
		éMaiuscula = Character.isUpperCase(especial);
		System.out.println(éMaiuscula); // Mostra false porque nin sequera é letra
		
							System.out.println();
			// Por tipo de caracter branco
				// As funcións isSpaceChar(char), isWhiteSpace(char) devolven un booleano.
					// boolean isSpaceChar(char).
		boolean éEspazo;		
		char espazo = ' ';
		char novaLiña = '\n';
		char tabulador = '\t';
		
		éEspazo = Character.isSpaceChar(espazo);
		System.out.println(éEspazo); // Mostrará true porque ' ' é un espazo en branco único
		
		éEspazo = Character.isSpaceChar(novaLiña);
		System.out.println(éEspazo); // Mostrará falso porque '/n' non é un espazo en branco único
		
		éEspazo = Character.isSpaceChar(tabulador);
		System.out.println(éEspazo); // Mostrará falso porque '/t' non é un espazo en branco único
		
							System.out.println();
					// boolean isWhitespace(char).	
		éEspazo = Character.isWhitespace(espazo);
		System.out.println(éEspazo); // Mostrará true porque ' ' é un dos tipos de espazo en branco
		
		éEspazo = Character.isWhitespace(novaLiña);
		System.out.println(éEspazo); // Mostrará true porque '/n' é un dos tipos de espazo en branco
		
		éEspazo = Character.isWhitespace(tabulador);
		System.out.println(éEspazo); // Mostrará true porque '/t' é un dos tipos de espazo en branco
		
		éEspazo = Character.isWhitespace(letraMinuscula);
		System.out.println(éEspazo); // Mostrará false porque 'p' non é un dos tipos de espazo en branco
		
							System.out.println();
			// Conversión
				// Conversión entre caracteres
					// char toLowerCase(char)
		char pMaiuscula;
		char pMinuscula;
		
		System.out.println(letraMaiuscula);
		pMinuscula = Character.toLowerCase(letraMaiuscula);
		System.out.println(pMinuscula);
		
							System.out.println();
					// char toUpperCase(char)
		System.out.println(letraMinuscula);
		pMaiuscula = Character.toUpperCase(letraMaiuscula);
		System.out.println(pMaiuscula);
		
							System.out.println();
				// Conversión de caracter a outro tipo
					// int digit(char, int base)
		int numeroConvertido;
		
		numeroConvertido = Character.digit('F', 16); // Convirte 'F' ao seu valor en hexadecimal (número)
		System.out.println(numeroConvertido);
		
							System.out.println();
					// String toString(char)
		String cadea;
		
		cadea = Character.toString(numero);
		System.out.println(cadea);
		
						//Podemos concatenar dous caracteres diferentes como un String
		cadea = Character.toString(letraMaiuscula)+Character.toString(numero);
		System.out.println(cadea);
		
							System.out.println();
				// Conversión doutro tipo a caracter
					// char forDigit(int, int base)
		
		char aMinuscula;
	
		aMinuscula = Character.forDigit(10, 16); // Convirte o 10 ao valor en hexadecimal (caracter)
		System.out.println(aMinuscula);
	}

}
