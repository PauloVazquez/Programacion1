package ordearNomes;
import java.util.Scanner;

public class OrdearNomes {
	static String[] encherVector(Scanner teclado, String nomes[]){
		// Enchemos vector
		for (int i = 0; i < 10; i++) {
			System.out.print("Nome "+(i+1)+": ");
			nomes[i] = teclado.nextLine();
		}
		// Devolvemos o vector cheo
		return nomes;
	}
	static void visualizarVector(String nomes[]) {
		// Visualizamos o vector
		for (int i = 0; i < 10; i++) {
			System.out.print(nomes[i]+"\t");
		}
	}
	static String[] ordearVector(String nomes[]) {
		String auxiliar = "";
		// Método da burbulla
		for (int i = 0; i < 10-1; i++) {
			for (int j = i+1; j < 10; j++) {
			if (nomes[i].compareToIgnoreCase(nomes[j]) > 0) {
					auxiliar = nomes[i];
					nomes[i] = nomes[j];
					nomes[j] = auxiliar;
				}
			// Se usamos nomes[i].compareTo(nomes[j]) ordeará diferenciando maiúsculas de minúsculas
				/*if (nomes[i].compareTo(nomes[j]) > 0) {
					auxiliar = nomes[i];
					nomes[i] = nomes[j];
					nomes[j] = auxiliar;
				}*/
			}
		}
		return nomes;
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nomes[] = new String [10];
		
		// Encher vector
		nomes = encherVector(teclado, nomes);	
		System.out.println();
		// Visualizar vector desordeado
		System.out.println("Vector desordeado");
		visualizarVector(nomes);
		System.out.println("\n");
		// Ordear vector
		nomes = ordearVector(nomes);
		// Visualizar vector ordeado
		System.out.println("Vector ordeado");
		visualizarVector(nomes);
	}
}