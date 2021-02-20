// Crear un vector, pedir encher de valores numéricos enteiros
// Mostrar dito vector do revés cun bucle WHILE

package vectorRevesWhile;
import java.util.Scanner; // Importante importar o Scanner
public class VectorRevesWhile {
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
		System.out.print("\n");
		System.out.println("Valor de saída de i ->"+i+"\n");
		// Como saímos do vector anterior con i = 10, temos que decrementar 1 ou asignar o valor 9 á variable i
		i--;
		// Visualizamos vector
		while ( i >= 0) {
			/* Se poñemos i--, primeiro visualiza o valor de vector[i] e despois resta.
			No seguinte bucle xa mostra o seguinte restado */
			System.out.println(+vector[i--]);
		}
		System.out.println("Valor de saída de i ->"+i+"\n");
		teclado.close();
	}
}