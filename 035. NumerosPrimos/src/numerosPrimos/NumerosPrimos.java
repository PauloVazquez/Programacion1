package numerosPrimos;
import java.util.Scanner;
import java.io.IOException;
public class NumerosPrimos {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int limiteinferior = 0, limitesuperior = 0, num = 0, submultiplos = 2;
	char outra = ' ';
	boolean primo = true;

	do {
		// Pedimos os l�mites
		do {
			System.out.print("L�mite inferior: ");
			limiteinferior = teclado.nextInt();
			System.out.print("\nL�mite superior: ");
			limitesuperior = teclado.nextInt();
		}while (limiteinferior > limitesuperior);
		System.out.print("\n\n");
		// Exclu�mos o 1 como n�mero primo
		if (limiteinferior == 1) {
			limiteinferior = 2;
		}
		// Percorro os n�meros entre l�mites
		for (num = limiteinferior; num <= limitesuperior; num++) {
			// Percorro de 2 ao n�mero inferior ao que estou comprobando
			for (submultiplos = 2; submultiplos < num; submultiplos++) {
				// Se o n�mero � divisible polo subm�ltiplo, xa non � primo
				if (num%submultiplos == 0) {
					primo = false;					
				}
			}
			// Se � primo, mostramos, sen�n reiniciamos como primo
			if (primo) {
				System.out.print(num+"\t");
			}else
				primo = true;
			}
		System.out.print("\n\n");
		// Preguntamos se repetimos o proceso
		do {
			try {
				System.out.print("\tOutra serie (s/n): ");
				// Pasamos a min�sculas a opci�n introducida para comparar s� con mai�sculas
				outra = Character.toLowerCase((char) System.in.read());
				while(System.in.read() != '\n');
				}catch (IOException ioe) {}
		}while(outra != 'n' && outra != 's');	
		} while (outra != 'n');
	System.out.println("\t\n\nFIN DO PROGRAMA");
	teclado.close();
}
}
