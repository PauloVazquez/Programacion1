package cifrado;
import java.util.Scanner;

public class Cifrado {
	static int menu(Scanner teclado) {
		int opcion;
		System.out.println("\nEscolla unha opción:");
		System.out.println("\t1. Teclear frase");
		System.out.println("\t2. Codificar frase");
		System.out.println("\t3. Decodificar frase");
		System.out.println("\t4. Visualizar frase");
		System.out.println("\t5. Fin");
		System.out.print("Opción: ");
		
		do {
			opcion = teclado.nextInt();
		} while (opcion < 1 || opcion > 5);
		
		return opcion;	
	}
	
	static String teclearFrase(Scanner teclado) {
		String frase;
		teclado.nextLine();
		System.out.print("\nIntroduza a frase: ");
		frase = teclado.nextLine();
		return frase;
	}
	
	static String cifrarFrase(String frase) {
		char letra[];
		letra = frase.toCharArray();
		// Substituímos os caracteres, por defecto sumamos 1 ao ASCII
		for (int i = 0; i < letra.length; i++) {
			switch (letra[i]) {
			case 'Z':
				letra[i] = 'A';
				break;
			case 'z':
				letra[i] = 'a';
				break;
			case ',':
				letra[i] = '-';
				break;
			case '.':
				letra[i] = '+';
				break;
			case ' ':
				letra[i] = '*';
				break;
			default:
				letra[i]++;
			}
		}
		frase = String.valueOf(letra);
		System.out.println("Fin da codificación");
	return frase;
	}
	
	static String descifrarFrase(String frase) {
		char letra[];
		letra = frase.toCharArray();
		// Substituímos os caracteres, por defecto restamos 1 ao ASCII
		for (int i = 0; i < letra.length; i++) {
			switch (letra[i]) {
			case 'A':
				letra[i] = 'Z';
				break;
			case 'a':
				letra[i] = 'z';
				break;
			case '-':
				letra[i] = ',';
				break;
			case '+':
				letra[i] = '.';
				break;
			case '*':
				letra[i] = ' ';
				break;
			default:
				letra[i]--;
			}
		}
		frase = String.valueOf(letra);
		System.out.println("Fin da decodificación");
	return frase;
	}
	
	static String visualizarFrase(String frase) {
		
		System.out.println("Frase: "+frase);
		return frase;
	}
	
	public static void main(String[] args) {
		int opcion;
		String frase = "";
		Scanner teclado = new Scanner(System.in);
		
		do {
		// Mostramos menú
		opcion = menu(teclado);
		
			switch (opcion) {
			case 1:
				frase = teclearFrase(teclado);
				break;	
			case 2:
				frase = (cifrarFrase(frase));
				break;
			case 3:
				frase = (descifrarFrase(frase));
				break;
			case 4:
				visualizarFrase(frase);
				break;
			default:
				System.out.println("FIN DE PROGRAMA");
				opcion = 6;
				break;
			}		
		} while (opcion > 0 && opcion < 5);
		teclado.close();
	}
}