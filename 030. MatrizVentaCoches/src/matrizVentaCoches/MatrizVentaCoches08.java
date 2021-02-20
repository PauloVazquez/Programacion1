/* Pedir unha marca.
 * Hai que dár un listado de meses e auxiliar ordeadas de menor a maior 
 */

package matrizVentaCoches;
import java.util.Scanner;
import java.math.*;

public class MatrizVentaCoches08 {
	public static void main(String[]args) {
		// int mventacoches[][] = new int[12][4];
		int mventacoches[][] = {{25,46,32,11},{3,8,11,12},{45,65,23,22},{125,345,200,100},{40,34,7,54},
							   {12,56,98,4},{9,5,123,44},{27,83,160,3},{23,44,66,13},{4,5,70,9},{12,23,34,2},{33,87,200,3}};
		int indmes, indcoche, auxiliar1 = 0, auxiliar2 = 0, marca = 0, indesq, inder;
		int matrizmarca[][] = new int[12][2];
		
		Scanner teclado = new Scanner(System.in);
		
		// Enchemos a matriz
		/* for(indcoche = 0; indcoche < 4; indcoche++) {
			for(indmes = 0; indmes < 12; indmes++) {
				// System.out.print("Teclee as auxiliar para o "+(indmes+1)+"º mes e o "+(indcoche+1)+"º coche: ");	
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
		
		// Pedimos o mes no que queremos saber o número de auxiliar
		do {
			System.out.print("Introduza o valor da marca que quere coñecer: ");
			marca = teclado.nextInt();
		} while(marca < 1 || marca > 4);
		
		// Asociamos o valor da marca introducida a unha nova matriz de 12 x 2.
		// Nunha fila o valor das ventas desa marca, noutra fila o valor dos meses
		for(indmes = 0; indmes < 12; indmes++) {
			for(indcoche = 0; indcoche < 2; indcoche++) {
				
			matrizmarca[indmes][0] = indmes;
			matrizmarca[indmes][1] = mventacoches[indmes][marca-1];
			}
		}
		// Método da burbulla aplicado ao vector con dúas filas
		for(indesq = 0; indesq < 11; indesq++) {
			for(inder = indesq+1; inder < 12; inder++) {
				if(matrizmarca[indesq][1] < matrizmarca[inder][1]) {
					auxiliar1 = matrizmarca[indesq][0];
					matrizmarca[indesq][0] = matrizmarca[inder][0];
					matrizmarca[inder][0] = auxiliar1;
					auxiliar2 = matrizmarca[indesq][1];
					matrizmarca[indesq][1] = matrizmarca[inder][1];
					matrizmarca[inder][1] = auxiliar2;
				}
			}
		}
		for(indmes = 0; indmes < 12; indmes++) {
			for(indcoche = 0; indcoche < 2; indcoche++) {
				System.out.print(matrizmarca[indmes][indcoche]+"\t");
			}
			System.out.println("\n");
		}
	}
	}
