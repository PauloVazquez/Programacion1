/* Enchemos unha matriz cos valores de ventas de coches
 * Indicamos o mes con maior número de ventas
 */

package matrizVentaCoches;
import java.util.Scanner;
import java.math.*;
public class MatrizVentaCoches03 {
	public static void main(String[]args) {
		// int mventacoches[][] = new int[12][4];
		int mventacoches[][] = {{25,46,32,11},{3,8,11,12},{45,65,23,22},{125,345,200,100},{40,34,7,54},
						          {12,56,98,4},{9,5,123,44},{27,83,160,3},{23,44,66,13},{4,5,70,9},{12,23,34,2},{33,87,200,3}};
		int indmes, indcoche, mes, valormax, suma;
		valormax = 0;
		mes = 0;
		
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
		
		// Calculamos as sumas de cada coche no ano
		for(indmes = 0; indmes < 12; indmes++) {
			suma = 0;
			for(indcoche = 0; indcoche < 4; indcoche++) {
				suma += mventacoches[indmes][indcoche];			
			}
			if(suma > valormax) {
				valormax = suma;
				// Para que o orde do mes comece por 1
				mes = indmes+1;
			}
			suma = 0;
		}
		System.out.print("O mes con maior número de ventas foi o "+mes+"º e as unidades vendidas foron "+valormax);
	}
}
