package metodos;
import java.util.Scanner;

public class Metodos02 {
	// Se non fora VOID ter�a que ter un return
	static void suma() {
		Scanner teclado = new Scanner(System.in);
		// As variables de suma() pertencen a suma, non a outros m�todos nin a main
		int num1 = 0, num2 = 0;
		System.out.print("N�mero 1: ");
		num1 = teclado.nextInt();
		System.out.print("N�mero 2: ");
		num2 = teclado.nextInt();
		System.out.println("\nSuma = "+(num1+num2));
		// O teclado t�n que pecharse aqu�, non no main, xa que se abriu no m�todo suma().
		teclado.close(); 
	}
	public static void main(String[] args) {
		suma();
		
	}
}
