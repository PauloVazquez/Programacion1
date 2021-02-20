package contarVogais;
import java.util.Scanner;
import java.io.IOException;
public class ContarVogaisSwitch {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int conta = 0, conte = 0, conti = 0, conto = 0, contu = 0, i = 0;
		char vector[] = new char [10], letra = ' ';
		//Enchemos o vector
		// Comprobamos que se introduzan valores		
		for (i = 0; i < 10; i++) {
			System.out.print("Teclee letra "+(i+1)+": ");
			try {
				
			vector[i] = Character.toLowerCase((char) System.in.read());
			while(System.in.read() !='\n');
			} catch (IOException ioe) {System.out.print("ERRO: Valor inválido");}
		// Se os valores son vogais, contamos
			// switch é máis cómoda para realizar if na rama do NON
			switch (vector[i]) {
			case 'a':
				conta++;
				break;
			case 'e':
				conte++;
				break;
			case 'i':
				conti++;
				break;
			case 'o':
				conto++;
				break;
			case 'u':
				contu++;
				break;
			}
		}
		System.out.print("\n");
		System.out.println("Total de a: "+conta);
		System.out.println("Total de e: "+conte);
		System.out.println("Total de i: "+conti);
		System.out.println("Total de o: "+conto);
		System.out.println("Total de u: "+contu);
				
		teclado.close();
		}
	}