package ordearTresNumeros;
import java.util.Scanner; // Importante importar o Scanner
public class OrdearTresNumeros {
	public static void main(String[]args) {
		Scanner entrada = new Scanner (System.in);
		// Creamos as tres variables enteiras para comparar e ordear
		int a = 0, b = 0, c = 0;
		// Solicitamos a entrada dos tres valores
		System.out.print("Introduza o primeiro valor> ");
		a = entrada.nextInt();
		System.out.print("Introduza o segundo valor> ");
		b = entrada.nextInt();
		System.out.print("Introduza o terceiro valor> ");
		c = entrada.nextInt();
		// Para todas as comparativas imprimiremos cales son os n�meros introducidos, as� que po�emos antes do IF
		System.out.println("Os n�meros tecleados son: a = "+a+" b = "+b+" e c = "+c);
		// Iniciamos if para comparar, se a � menor que b e que c, ani�amos IF
		// VER DIAGRAMA FOLLA 7 DE EXERCICIOS DIAGRAMAS
		if (a < b) {
			if (a < c) {
				if (b < c) {
					// Se a � menor que b e b menor que c, a orde de pequeno a grande ser�a: a, b, c 
					System.out.print(a+","+b+","+c);
				}
				// Sen�n ser�a: a, c, b
				else {
					System.out.print(a+","+c+","+b);
				}
			}
			else {
				System.out.print(c+","+a+","+b);
			}
		}
		else {
			if (a > c) {
				if (b > c) {
					System.out.print(c+","+b+","+a);
				}
				else {
					System.out.print(b+","+c+","+a);
				}
			}
			else {
				System.out.print(b+","+a+","+c);
			}
		}
			

		
	}

}
