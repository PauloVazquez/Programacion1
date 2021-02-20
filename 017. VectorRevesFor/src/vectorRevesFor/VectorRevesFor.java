// Crear un vector, pedir encher de valores numéricos enteiros
// Mostrar dito vector do revés

package vectorRevesFor;
import java.util.Scanner; // Importante importar o Scanner
public class VectorRevesFor {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int vector[];
		vector = new int [10];
		int i;
		// Enchemos vector
		for (i = 0; i < 10; i++) {
			System.out.print("Introduza o "+(i+1)+"º valor> ");
			vector[i] = teclado.nextInt();
		}
		
		System.out.println("Valor de saída de i ->"+i+"\n");
		// Visualizamos vector
		for (i = 9; i >= 0; i--) {
			System.out.println(+vector[i]);
		}
		System.out.println("Valor de saída de i ->"+i+"\n");
		teclado.close();
	}
}