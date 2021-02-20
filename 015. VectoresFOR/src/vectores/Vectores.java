package vectores;
import java.util.Scanner; // Importante importar o Scanner
public class Vectores {
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		int indice = 0;
		// Creamos un vector de enteiros
		int vector[];
		// Asignamos unha dimensión 7 ao vector
		vector = new int[7];
// Pode definirse o vector e dimensionar na mesma liña
//	int vector[] = new int[7];
		while(indice < 7) {
			System.out.print("Teclee valor> ");
			vector[indice] = teclado.nextInt();
			indice++;
		}
		System.out.println("\n");
		while(indice > 0) {
			indice--;
			System.out.print(vector[indice]+"\t");
		}
		teclado.close();
	}
}