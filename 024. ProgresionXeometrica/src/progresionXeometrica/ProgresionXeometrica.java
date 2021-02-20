/* Progresi�n xeom�trica: Progresi�n que multiplica o l�mite inferior por un n�mero.
 * Ese n�mero ch�mase raz�n.*/

package progresionXeometrica;
import java.util.Scanner;
public class ProgresionXeometrica {
	public static void main(String[]args) {
		int limiteinferior, limitesuperior, razon, seguir;
		Scanner teclado = new Scanner(System.in);
		
		do {
			do { // Pedimos o n�mero inferior
			System.out.print("Introduza o l�mite inferior: ");
			limiteinferior = teclado.nextInt();
			// Controlamos que sexa superior a 0
			} while (limiteinferior < 1);
			
			do { // Pedimos o l�mite superior, para parar a progresi�n
				System.out.print("Introduza o l�mite superior: ");
				limitesuperior = teclado.nextInt();
				//Controlamos que sexa superior ao inferior							
			} while (limitesuperior <= limiteinferior);
			
			do { // Pedimos o n�mero da raz�n
				System.out.print("Introduza a raz�n da progresi�n: ");
				razon = teclado.nextInt();
				System.out.print("\n");
				// Controlamos que sexa superior a 1 para que haxa progresi�n				
			} while (razon < 2);
			
			do { // Mostramos a progresi�n e calculamos o seguinte valor
				System.out.print(limiteinferior+" ");
				limiteinferior *= razon;
				// Comparamos se ese valor � inferior ou igual ao superior.
			} while (limiteinferior <= limitesuperior);
			
			do {
			System.out.print("\nOutra progresi�n? (1 = S� / 0 = Non): ");
			seguir = teclado.nextInt();
			System.out.print("\n");
			// Seguimos mentres os valores introducidos non sexan 0 e 1
			} while (seguir != 0 && seguir != 1);
			
			// Seguimos mentres o usuario teclee 1 = S�
		} while (seguir == 1);
		System.out.print("\n\tFIN do programa");
		teclado.close();
	}
}