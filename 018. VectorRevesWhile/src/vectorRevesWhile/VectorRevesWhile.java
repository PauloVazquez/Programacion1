// Crear un vector, pedir encher de valores num�ricos enteiros
// Mostrar dito vector do rev�s cun bucle WHILE

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
			System.out.print("Introduza o "+(i+1)+"� valor> ");
			vector[i] = teclado.nextInt();
		}
		System.out.print("\n");
		System.out.println("Valor de sa�da de i ->"+i+"\n");
		// Como sa�mos do vector anterior con i = 10, temos que decrementar 1 ou asignar o valor 9 � variable i
		i--;
		// Visualizamos vector
		while ( i >= 0) {
			/* Se po�emos i--, primeiro visualiza o valor de vector[i] e despois resta.
			No seguinte bucle xa mostra o seguinte restado */
			System.out.println(+vector[i--]);
		}
		System.out.println("Valor de sa�da de i ->"+i+"\n");
		teclado.close();
	}
}