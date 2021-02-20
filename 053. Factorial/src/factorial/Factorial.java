package factorial;
import java.util.Scanner;

public class Factorial {
	static double factorial(double factorial) {
		
		if (factorial == 0) {
			factorial = 1;
		}else {
			for (double i = factorial-1; i > 1; i--) {
				factorial *= i; // O factorial multiplica o valor introducido polos sucesivos -1 cara abaixo
			}
		}
		return factorial;
	}
		
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		double numerousuario;
		String seguir;
		
		do {
			do {
				System.out.print("Introduza un número: ");
				numerousuario = teclado.nextInt();
			} while (numerousuario < 0);
			
			System.out.println("\nO factorial de "+numerousuario+" é "+factorial(numerousuario));
			teclado.nextLine();
			do {	
				System.out.print("\nQuere consultar outro factorial? (S/N): ");
				seguir = teclado.nextLine();
			} while (!seguir.equalsIgnoreCase("S") && !seguir.equalsIgnoreCase("N"));
	
		} while (seguir.equalsIgnoreCase("S"));
	}
}