// Crear un vector de 12 elementos, enchelo e visualizar a suma do contido despois de enchelo
// VER ORGANIGRAMA PÁXINA 4 SUCIO
package vector12Suma;
import java.util.Scanner; // Importante importar o Scanner
public class Vector12Suma {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int vectorimportes[], i, suma;
		suma = 0;
		vectorimportes = new int[12];
		// Enchemos o vector e asignamos ese valor ao total
		for (i = 0; i < 12; i++) {
			System.out.print("Teclee o "+(i+1)+"º valor> ");
			vectorimportes[i] = teclado.nextInt();
		}
		System.out.print("\n");
		for (i = 0; i < 12; i++) {
			// suma += vectorimportes[i] é igual a suma = suma + vectorimportes[i];
			suma += vectorimportes[i];
		}
		System.out.println("O valor total da suma é "+suma);
	}
}
