/* Enchemos unha matriz cos valores de ventas de coches
 * O usuario dá un valor de mes e mostramos o número de ventas totais
 */

package matrizVentaCoches;
import java.util.Scanner;
import java.math.*;
public class MatrizVentaCoches05 {
	public static void main(String[]args) {
		// int mventacoches[][] = new int[12][4];
		int mventacoches[][] = {{25,46,32,11},{3,8,11,12},{45,65,23,22},{125,345,200,100},{40,34,7,54},
							   {12,56,98,4},{9,5,123,44},{27,83,160,3},{23,44,66,13},{4,5,70,9},{12,23,34,2},{33,87,200,3}};
		int indmes, indcoche, mes = 0, suma = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		// Enchemos a matriz
		/* for(indcoche = 0; indcoche < 4; indcoche++) {
			for(indmes = 0; indmes < 12; indmes++) {
				// System.out.print("Teclee as ventas para o "+(indmes+1)+"º mes e o "+(indcoche+1)+"º coche: ");	
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
		
		// Pedimos o mes no que queremos saber o número de ventas
		do {
			System.out.print("Introduza o valor do mes que quere coñecer: ");
			mes = teclado.nextInt();
		} while(mes < 1 || mes > 12);
		
		
		for(indcoche = 0; indcoche < 4; indcoche++) {
			suma += mventacoches[mes-1][indcoche];
			}
		System.out.print("As unidades vendidas no "+mes+"º mes foron "+suma);
		}
	}
