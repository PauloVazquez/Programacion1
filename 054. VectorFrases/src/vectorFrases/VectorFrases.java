package vectorFrases;
import java.util.Scanner;

public class VectorFrases {
	
	static int menu(Scanner teclado) {
		int opcion;
		
		do {
			System.out.println("Escolla opción:");
			System.out.println("\t1. Encher vector");
			System.out.println("\t2. Visualizar vector");
			System.out.println("\t3. Contar letra");
			System.out.println("\t4. Frase máis longa");
			System.out.println("\t5. Frase con máis repeticións dun carácter");
			System.out.println("\t6. Frase máis longa con repeticións");
			System.out.println("\t7. Saír");
			System.out.print("Opción: ");
			opcion = teclado.nextInt();
		} while (opcion < 1 || opcion > 7 );
		
		return opcion;
	}
	
	static String[] encherVector(Scanner teclado, String[] vFrases) {
		
		teclado.nextLine(); // Baleiramos o teclado para que non quede nada dentro
		System.out.println();
		for (int i = 0; i < vFrases.length; i++) {
			System.out.print("Introduza a frase "+(i+1)+": ");
			vFrases[i] = teclado.nextLine();
		}
		System.out.println();
		return vFrases;	
	}
	
	static void visualizarFrases(String[] vFrases){
		
		System.out.println();
		for (int i = 0; i < vFrases.length; i++) {
			System.out.println(vFrases[i]);
		}
		System.out.println();
	}
	
	static String[] pasarFraseMinusculas (String[] vFrases) {
		for (int i = 0; i < vFrases.length; i++) {
			vFrases[i] = vFrases[i].toLowerCase(); // Pasamos as frases a minúsculas para comparar coa letra en minúsculas 
	}
		return vFrases;
	}
	
	static int contarLetra(char letra, String[] vFrases) {
		int contador = 0;
		
		for (int i = 0; i < vFrases.length; i++) { // Percorremos o vector e paramos en cada frase
			for (int j = 0; j < vFrases[i].length(); j++) { // Percorremos as letras de cada frase
				if (vFrases[i].charAt(j) == letra) { // Comparamos as letras de cada frase coa letra introducida
					contador++;
				}
			}
		}
		return contador;
	}
	
	static void verFraseMaisLonga(String[] vFrases) {
		int lonxitudeMaior = 0, fraseMaior = 0;
		
		for (int i = 0; i < vFrases.length; i++) {
			if (vFrases[i].length() > lonxitudeMaior) { // Comparamos lonxitudes e asignamos a maior á variable maior e anotamos que frase é
				lonxitudeMaior = vFrases[i].length();
				fraseMaior = i;
			}
			}		
		System.out.println();
		System.out.println("A frase máis longa é "+vFrases[fraseMaior]+" con "+lonxitudeMaior+" caracteres");
		System.out.println();
		}
		
	static void verFraseConMaisCaracterDado(char letra, String[] vFrases) {
		int contadorletra = 0, fraseMaisCaracteres = 0, numeroCaracteresMaior = 0;
		
		for (int i = 0; i < vFrases.length; i++) {
			for (int j = 0; j < vFrases[i].length(); j++) {
				if (vFrases[i].charAt(j) == letra) { // Contamos as letras que se repiten
					contadorletra++; 
					}				
				}
			if (contadorletra > numeroCaracteresMaior) { // Comparamos as letras repetidas e asociamos a variables para mostrar, coa frase que é
				numeroCaracteresMaior = contadorletra;
				fraseMaisCaracteres = i;	
			}	
		}
		System.out.println();
		System.out.println("A frase con máis caracteres \""+letra+"\" é "+vFrases[fraseMaisCaracteres]+" con "+numeroCaracteresMaior);
		System.out.println();
	}
	
	static void frasesMaisLongas(String[] vFrases) {
		String auxiliar;
		int lonxitude;
		int i;

		for (i = 0; i < (vFrases.length-1); i++) {
			for (int j = 1; j < vFrases.length; j++) {
				if (vFrases[i].length() < vFrases[j].length()) { // Ordeamos o vector das Frases
					auxiliar = vFrases[i];
					vFrases[i] = vFrases[j];
					vFrases[j] = auxiliar;
				}
				if (vFrases[i].length() == vFrases[0].length()) {
					System.out.println("\t"+vFrases[i]);					
				}
			}
		}
//		lonxitude = vFrases[0].length();
//		i = 0;
//		
//		System.out.println();
//		System.out.println("A lonxitude máis longa é de "+lonxitude+" caracteres.");
//		System.out.println("As frases son: ");
//		
//		do { // Imprimimos aqueles Strings que teñan a lonxitude do primeiro
//			System.out.println("\t"+vFrases[i]);
//			i++;
//		} while (vFrases[i].length() == lonxitude && i < lonxitude);
//		System.out.println();
		}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int dimension, opcion, contador;	
		String seguir;
		char letra;
		
		do {
			do {
				System.out.print("Cantas frases quere introducir? ");
				dimension = teclado.nextInt();
			} while (dimension < 1);
		
		String vFrases[] = new String[dimension];
		System.out.println();
		
			do {
			opcion = menu(teclado);
				switch(opcion) {
				case 1:
					vFrases = encherVector(teclado, vFrases);
					break;
				case 2:
					visualizarFrases(vFrases);
					break;
				case 3:
					teclado.nextLine();
					System.out.print("\nIntroduza a letra a contar: ");
					letra = teclado.nextLine().charAt(0);
					letra = Character.toLowerCase(letra); // Pasamos a letra a minï¿½sculas para comparar coas frases en mï¿½nusculas
					vFrases = pasarFraseMinusculas(vFrases);
					contador = contarLetra(letra,vFrases);
					System.out.println("\nHai "+contador+" \""+letra+"\"");
					System.out.println();
					break;
				case 4:
					verFraseMaisLonga(vFrases);
					break;
				case 5:
					teclado.nextLine();
					System.out.print("\nIntroduza a letra a contar: ");
					letra = teclado.nextLine().charAt(0);
					letra = Character.toLowerCase(letra); // Pasamos a letra a minï¿½sculas para comparar coas frases en mï¿½nusculas
					vFrases = pasarFraseMinusculas(vFrases);
					verFraseConMaisCaracterDado(letra, vFrases);
					break;
				case 6:
					frasesMaisLongas(vFrases);
					break;
				}
			} while (opcion > 0 && opcion < 7 );
			
			teclado.nextLine();
			do {
				System.out.println();
				System.out.print("Quere continuar introducindo frases? (S/N): ");
				seguir = teclado.nextLine();
			} while (!seguir.equalsIgnoreCase("s") && !seguir.equalsIgnoreCase("n"));
		
		} while (seguir.equalsIgnoreCase("s"));
	}
}