package sucesionFibonacci;
import java.util.Scanner; // Importante importar o Scanner
public class SucesionFibonacci {
	public static void main(String[]args) {
		Scanner teclado = new Scanner (System.in);
		// Fibonacci é a sucesión que suma os dous valores anteriores para conseguir o seguinte
		// valor1,valor2, numero sucesion.
		// valor2 é o valor inmediatamente anterior ao da sucesión
		// valor1 é o valor anterior a valor2
		int seguir = 0;
		
		do {
			int limitesuperior = 0, valor1 = 0, valor2 = 1, numerosucesion = 1;
		System.out.print("Introduza o límite superior para a serie de Fibonacci> ");
		limitesuperior = teclado.nextInt();
		System.out.println(valor1);
		
		do {
			System.out.println(numerosucesion);
			// Cada vez que se imprime o valor da sucesión, o valor2 toma ese valor e o valor1 pasa a ter o de vsalor2, e repetimos.
			numerosucesion = valor1 + valor2;
			valor1 = valor2;
			valor2 = numerosucesion;
		}while(valor2 <= limitesuperior);
		
		do {
			System.out.print("\nQuere continuar poñendo outro valor? (1 = SI / 0 = NON)> ");
			seguir = teclado.nextInt();
		}while(seguir != 1 && seguir != 0);
		System.out.print("\n");
		}while(seguir == 1);
		
		System.out.print("FIN DE PROGRAMA");
		
		teclado.close();
	}
}