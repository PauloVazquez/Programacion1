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
		// Pedimos os límites
		do {
			System.out.print("Límite inferior: ");
			limiteinferior = teclado.nextInt();
			System.out.print("\nLímite superior: ");
			limitesuperior = teclado.nextInt();
		}while (limiteinferior > limitesuperior);
		System.out.print("\n\n");
		// Excluímos o 1 como número primo
		if (limiteinferior == 1) {
			limiteinferior = 2;
		}
		// Percorro os números entre límites
		for (num = limiteinferior; num <= limitesuperior; num++) {
			// Percorro de 2 ao número inferior ao que estou comprobando
			for (submultiplos = 2; submultiplos < num; submultiplos++) {
				// Se o número é divisible polo submúltiplo, xa non é primo
				if (num%submultiplos == 0) {
					primo = false;					
				}
			}
			// Se é primo, mostramos, senón reiniciamos como primo
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
				// Pasamos a minúsculas a opción introducida para comparar só con maiúsculas
				outra = Character.toLowerCase((char) System.in.read());
				while(System.in.read() != '\n');
				}catch (IOException ioe) {}
		}while(outra != 'n' && outra != 's');	
		} while (outra != 'n');
	System.out.println("\t\n\nFIN DO PROGRAMA");
	teclado.close();
}
}
