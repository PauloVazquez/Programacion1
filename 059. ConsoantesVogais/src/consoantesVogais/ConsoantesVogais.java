package consoantesVogais;

import java.util.Scanner;

public class ConsoantesVogais {
	
	static String introducirTexto(Scanner teclado) {
		String cadeaUsuario, textoCompleto = "";
		System.out.print("Teclee unha cadea: ");
		
		do {			
			cadeaUsuario = teclado.nextLine();
			textoCompleto = textoCompleto + cadeaUsuario;
		} while (cadeaUsuario.charAt(cadeaUsuario.length()-1) != '.'); // Repetimos mentres o último carácter non sexa un punto.

		return textoCompleto;
	}
	
	static String limparTexto(String texto) { // Eliminamos díxitos e caracteres especiais
		String textoLimpo = "";
		for (int i = 0; i < texto.length(); i++) {
			if (Character.isLetter(texto.charAt(i))) { // Só concatenamos se o carácter é letra.
				textoLimpo = textoLimpo + texto.charAt(i);				
			}
		}
		
		System.out.println("\nA cadea introducida é: "+textoLimpo);
		return textoLimpo;
	}
	
	static String limparVogais(String texto) { // Pasamos as vogais acentuadas a vogais normais
		String textoLimpo ="";
		for(int i = 0; i < texto.length(); i++) {
			switch(texto.charAt(i)) {
			case 'á':
				textoLimpo = textoLimpo + 'a';
				break;
			case 'é':
				textoLimpo = textoLimpo + 'e';
				break;
			case 'í':
				textoLimpo = textoLimpo + 'i';
				break;
			case 'ó':
				textoLimpo = textoLimpo + 'o';
				break;
			case 'ú', 'ü':
				textoLimpo = textoLimpo + 'u';
				break;
			default:
				textoLimpo = textoLimpo + texto.charAt(i);
			}
		}
		System.out.println(textoLimpo);
		return textoLimpo;
	}
	
	static void detectarTipoLetras(String texto) { // Ubica a letra no seu correspondente vector
		char vogais[] = new char[5];
		char consoantes[] = new char[22];
		
		// Enchemos os vectores con baleiros
		for (int i = 0; i < vogais.length; i++) {
			vogais[i] = ' ';
		}
		for (int i = 0; i < consoantes.length; i++) {
			consoantes[i] = ' ';
		}
		
		for (int i = 0; i < texto.length(); i++) { //  Percorremos o texto
			if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u') {
				int j = 0;
				while(vogais[j] != texto.charAt(i) && vogais[j] != ' ') { // Mentres o carácter sexa diferente á posición do vector e esta sexa diferente de 0 avanzamos
				j++;
				}
				vogais[j] = texto.charAt(i); // Cando sexa igual ou atope un espazo, ubica a letra				
			} else {
				int j = 0;
				while(consoantes[j] != texto.charAt(i) && consoantes[j] != ' ') {
					j++;
				}
				consoantes[j] = texto.charAt(i);
			}
		}
		System.out.println();
		System.out.println("Vogais:");
		for (int i = 0; i < vogais.length; i++) {
			System.out.print(vogais[i]);
		}
		System.out.println("\n");
		System.out.println("Consoantes:");
		for (int i = 0; i < consoantes.length; i++) {
			System.out.print(consoantes[i]);
		}

			
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String textoCompleto ="", textoLimpo ="";
		
		textoCompleto = introducirTexto(teclado); 
		
		System.out.print("Teclee unha cadea: ");

		textoLimpo = limparTexto(textoCompleto); // Eliminamos díxitos e caracteres especiais
		textoLimpo = textoLimpo.toLowerCase();
	
		textoLimpo = limparVogais(textoLimpo); // Pasamos as vogais acentuadas a vogais normais
		
		detectarTipoLetras(textoLimpo); // Ubicamos a letra no seu correspondente vector
	
	}
}
