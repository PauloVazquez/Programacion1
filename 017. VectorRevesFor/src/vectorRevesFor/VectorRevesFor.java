// Crear un vector, pedir encher de valores num�ricos enteiros
// Mostrar dito vector do rev�s

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
			System.out.print("Introduza o "+(i+1)+"� valor> ");
			vector[i] = teclado.nextInt();
		}
		
		System.out.println("Valor de sa�da de i ->"+i+"\n");
		// Visualizamos vector
		for (i = 9; i >= 0; i--) {
			System.out.println(+vector[i]);
		}
		System.out.println("Valor de sa�da de i ->"+i+"\n");
		teclado.close();
	}
}