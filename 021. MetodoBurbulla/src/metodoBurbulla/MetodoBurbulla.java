/*METODO DA BURBULLA
 * Solicitar 10 n�meros para encher un vector
 * Ordeamos o vector con 2 �ndices para comparar valores
 * Mostramos o vector ordeado
 * PAXINA 9 SUCIO*/

/* CANTO MENOS CONSTANTES NUN PROGRAMA, MELLOR
 * CANTO M�IS ABSTRACTO, MELLOR*/

package metodoBurbulla;
import java.util.Scanner;
public class MetodoBurbulla {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// As t�boas poden definirse como na seguinte li�a
		int /*taboa[] = new int[10],*/ auxiliar, i1, i2;
		// Ou como na seguinte li�a, definindo xa os valores e toma o tama�o da cantidade de valores que defina
		int taboa[] = {100,23,2,45,78,66,61,55,27,30};
		
		// Enchemos vector
		/* En vez de po�er o valor na comparaci�n, pode definirse o valor da lonxitude do vector
		Serve para que, se cambia o tama�o do vector, non haxa que modificar todo*/
		/*for (i1 = 0; i1 < taboa.length; i1++) {
			System.out.print("Teclee o "+(i1+1)+"� valor> ");
			taboa[i1] = teclado.nextInt();
		}
		*/
		// Ordeamos vector
		for (i1 = 0; i1 < taboa.length-1; i1++) {
			for (i2 = i1+1; i2 < taboa.length; i2++) {
				if (taboa[i1] > taboa[i2]) {
					auxiliar = taboa[i1];
					taboa[i1] = taboa[i2];
					taboa[i2] = auxiliar;
				}
			}
		}
		
		// Mostramos vector
		for (i1 = 0; i1 < taboa.length; i1++) {
			System.out.println("["+taboa[i1]+"]");
		}
	}
}