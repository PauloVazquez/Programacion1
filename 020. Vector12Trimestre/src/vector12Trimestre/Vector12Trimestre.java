// Crear un vector de 12 elementos, enchelo e visualizar e asociar cada suma ao seu trimestre correspondente
// Meses 0 a 2 = Trimestre 1, meses 3 a 5 = Trimestre 2, meses 6 a 8 = Trimestre 3 e meses 9 a 11 = Trimestre 4 
// VER ORGANIGRAMA PÁXINA 6 SUCIO
// FACER EN CASA
package vector12Trimestre;
import java.util.Scanner;
public class Vector12Trimestre {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int importes[], trimestres[], it;
		it = 0;
		importes = new int[12];
		trimestres = new int[4];
		
		// Enchemos o vector de importes
		for (int ii = 0; ii < 12; ii++) { // Declaramos a variable dentro do propio for
			System.out.print("Teclee o "+(ii+1)+"º valor> ");
			importes[ii] = teclado.nextInt();
		}
		// Executamos a suma en función do trimestre ao que pertence cada mes
		for (int ii = 0; ii < 12; ii++) {
			if (ii%3 == 0 && ii != 0) { // Se o mes é divisible entre 3 e non é o 1º, temos que contar 1 trimestre máis
				it++;
			}
			trimestres[it]+=importes[ii];
			}
		System.out.print("\n");
		for (it = 0; it < 4; it++) {
			System.out.println("O "+(it+1)+"º trimestre é "+trimestres[it]);
		}
		teclado.close();
	}

}
