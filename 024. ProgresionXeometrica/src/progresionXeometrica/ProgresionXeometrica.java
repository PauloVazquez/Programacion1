/* Progresión xeométrica: Progresión que multiplica o límite inferior por un número.
 * Ese número chámase razón.*/

package progresionXeometrica;
import java.util.Scanner;
public class ProgresionXeometrica {
	public static void main(String[]args) {
		int limiteinferior, limitesuperior, razon, seguir;
		Scanner teclado = new Scanner(System.in);
		
		do {
			do { // Pedimos o número inferior
			System.out.print("Introduza o límite inferior: ");
			limiteinferior = teclado.nextInt();
			// Controlamos que sexa superior a 0
			} while (limiteinferior < 1);
			
			do { // Pedimos o límite superior, para parar a progresión
				System.out.print("Introduza o límite superior: ");
				limitesuperior = teclado.nextInt();
				//Controlamos que sexa superior ao inferior							
			} while (limitesuperior <= limiteinferior);
			
			do { // Pedimos o número da razón
				System.out.print("Introduza a razón da progresión: ");
				razon = teclado.nextInt();
				System.out.print("\n");
				// Controlamos que sexa superior a 1 para que haxa progresión				
			} while (razon < 2);
			
			do { // Mostramos a progresión e calculamos o seguinte valor
				System.out.print(limiteinferior+" ");
				limiteinferior *= razon;
				// Comparamos se ese valor é inferior ou igual ao superior.
			} while (limiteinferior <= limitesuperior);
			
			do {
			System.out.print("\nOutra progresión? (1 = Sí / 0 = Non): ");
			seguir = teclado.nextInt();
			System.out.print("\n");
			// Seguimos mentres os valores introducidos non sexan 0 e 1
			} while (seguir != 0 && seguir != 1);
			
			// Seguimos mentres o usuario teclee 1 = Sí
		} while (seguir == 1);
		System.out.print("\n\tFIN do programa");
		teclado.close();
	}
}