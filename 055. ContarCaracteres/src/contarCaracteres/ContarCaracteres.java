package contarCaracteres;
import java.util.Scanner;

public class ContarCaracteres {
	
	static String introducirFrase(Scanner teclado) {
		String frase;
		
		do {
			System.out.print("Introduza unha frase: ");
			frase = teclado.nextLine();
		} while (frase.length() > 50);
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
	
	public static int contarDixitos(String frase) {
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

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase, rematar;
		int letras, dixitos, caracteresEspeciais; 
		
		do {
			frase = introducirFrase(teclado);
						
			letras = contarLetras(frase);
			dixitos = contarDixitos(frase);
			caracteresEspeciais = contarEspeciais(frase);
			
			System.out.println();
			System.out.println(frase+" tén: ");
			System.out.println("\t"+letras+" letras");
			System.out.println("\t"+dixitos+" díxitos");
			System.out.println("\t"+caracteresEspeciais+" caracteres especiais");
			
			System.out.println();
			System.out.println("Opcións");
			System.out.println("\tCalquera merda: Seguir");
			System.out.println("\tFIN: Rematar");
			System.out.println();
			System.out.print("Opción escollida: ");
			rematar = teclado.nextLine();
			System.out.println();
		} while (!rematar.equalsIgnoreCase("FIN"));
	}
}
