/* Enchemos unha matriz cos valores de ventas de coches
 * Indicamos a marca m�is vendida no ano e o seu n�mero de ventas
 */

package matrizVentaCoches;
import java.util.Scanner;
import java.math.*;
public class MatrizVentaCoches06 {
	public static void main(String[]args) {
		// int mventacoches[][] = new int[12][4];
		int mventacoches[][] = {{25,46,32,11},{3,8,11,12},{45,65,23,22},{125,345,200,100},{40,34,7,54},
		          			   {12,56,98,4},{9,5,123,44},{27,83,160,3},{23,44,66,13},{4,5,70,9},{12,23,34,2},{33,87,200,3}};
		int indmes, indcoche, suma;
		suma = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		// Enchemos a matriz
		/* for(indcoche = 0; indcoche < 4; indcoche++) {
			for(indmes = 0; indmes < 12; indmes++) {
				// System.out.print("Teclee as ventas para o "+(indmes+1)+"� mes e o "+(indcoche+1)+"� coche: ");	
				// mventacoches[indmes][indcoche] = teclado.nextInt();
				mventacoches[indmes][indcoche] = (int)(Math.random()*100+1);	
			}
		}*/
		// Mostramos a matriz
		for(indmes = 0; indmes < 12; indmes++) {
			for(indcoche = 0; indcoche < 4; indcoche++) {
				System.out.print(mventacoches[indmes][indcoche]+"\t");
			}
			System.out.println("\n");
		}
		
		// Calculamos as sumas de todos os coches do ano
		for(indcoche = 0; indcoche < 4; indcoche++) {
			for(indmes = 0; indmes < 12; indmes++) {
				suma += mventacoches[indmes][indcoche];			
			}
		}
		System.out.print("As unidades vendidas foron "+suma);
	}
}
