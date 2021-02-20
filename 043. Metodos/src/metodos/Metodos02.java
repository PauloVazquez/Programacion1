package metodos;
import java.util.Scanner;

public class Metodos02 {
	// Se non fora VOID tería que ter un return
	static void suma() {
		Scanner teclado = new Scanner(System.in);
		// As variables de suma() pertencen a suma, non a outros métodos nin a main
		int num1 = 0, num2 = 0;
		System.out.print("Número 1: ");
		num1 = teclado.nextInt();
		System.out.print("Número 2: ");
		num2 = teclado.nextInt();
		System.out.println("\nSuma = "+(num1+num2));
		// O teclado tén que pecharse aquí, non no main, xa que se abriu no método suma().
		teclado.close(); 
	}
	public static void main(String[] args) {
		suma();
		
	}
}
