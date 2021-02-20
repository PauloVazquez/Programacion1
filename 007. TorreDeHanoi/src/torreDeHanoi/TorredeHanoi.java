package torreDeHanoi;
import java.util.Scanner; // Importante importar o Scanner
public class TorredeHanoi {
	public static void main(String[]args) {
		Scanner entrada = new Scanner (System.in);
		// Creamos as tres variables enteiras para comparar e ordear
		int a = 0, b = 0, c = 0, aux = 0;
		// Solicitamos a entrada dos tres valores
		System.out.print("Introduza o primeiro valor> ");
		a = entrada.nextInt();
		System.out.print("Introduza o segundo valor> ");
		b = entrada.nextInt();
		System.out.print("Introduza o terceiro valor> ");
		c = entrada.nextInt();
		// Para todas as comparativas imprimiremos cales son os números introducidos, así que poñemos antes do IF
		System.out.println("Os números tecleados son: a = "+a+" b = "+b+" e c = "+c);
		// Iniciamos if para comparar, se a > b, en caso de ser verdadeiro, intercambiamos valores
		// Hai que encher o camiño do TRUE, non do FALSE para non deixar esa rama baleira
				// VER DIAGRAMA FOLLA 9 DE EXERCICIOS DIAGRAMAS
		// No caso de que a sexa maior que b ou c e b maior que c, cambiamos os valores entre elas para que a sempre sexa menor que b e b menor que c.
		if (a > b) {
			aux = a;
			a = b;
			b = aux;
		}
		// Facemos así con cada variable e relacionando con cada unha das outras.
		if (a > c) {
			aux = a;
			a = c;
			c = aux;
		}
		if (b > c) {
			aux = b;
			b = c;
			c = aux;
		}
		System.out.print(a+","+b+","+c);
	}

}  // CORRIXIR E AFINAR
