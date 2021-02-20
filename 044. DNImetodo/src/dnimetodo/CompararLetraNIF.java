// Introduzo o DNI e a letra e comprobo se � v�lido

package dnimetodo;
import java.util.Scanner;

public class CompararLetraNIF {
	
	// Comprobaci�n de letra correcta de DNI
	static char letraNif(int DNI) {
		String letra= "TRWAGMYFPDXBNJZSQVHLCKE";
		return letra.charAt(DNI%23);			
	}
	
	// Comparaci�n entre letras para validar
	static boolean comprobarLetra(char letrausuario, char letraNif){
		boolean correcto = false;
		if (letrausuario == letraNif) {
			correcto = true;
		}
		return correcto;
	}
	
	// Comprobaci�n de introduci�n dun DNI num�rico
    static boolean eNumerico(String NIF) {
        boolean numerico = false;
        NIF = NIF.substring(0, 8);
        try {
            Integer.parseInt(NIF);
            numerico = true;
        } catch (NumberFormatException excepcion) {
        	numerico = false;
        	System.out.println("Introduza un valor num�rico no DNI\n");
        }
        return numerico;
    }
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int DNI;
		String NIF;
		char letrausuario;
		
		do {
			// Pedimos NIF e repetimos se non t�n 9 cifras e se o DNI non � num�rico
			do {
				System.out.print("Introduza un NIF: ");
				NIF = teclado.nextLine();
			} while (NIF.length() != 9 || !eNumerico(NIF));
			
			// Extraemos o n�mero de DNI e pasamos a Int
			 DNI = Integer.parseInt(NIF.substring(0, 8));
			 // Extraemos a letra do NIF e pasamos a char en mai�sculas
			 letrausuario = Character.toUpperCase(NIF.charAt(8));
			 
			// Se a comparaci�n � correcta ou incorrecta, escribimos
			if (comprobarLetra(letraNif(DNI), letrausuario)) {
				System.out.println("\nLetra correcta");
			}else {
				System.out.println("\nLetra incorrecta");
				System.out.println("O NIF correcto �: "+DNI+letraNif(DNI)+"\n");
			}
		} while (!comprobarLetra(letraNif(DNI), letrausuario));
		teclado.close();
	}
}