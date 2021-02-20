package variables_caracter;
import java.io.IOException;
public class Variables_Caracter {
	public static void main(String[] args) {
		// Se non lle dou ningún caracter de valor, dá erro. Co espazo en branco xa serve 
		// char caracter = '';
		char caracter = ' ';
		// int caracter = 0;
		/*try {
			System.out.print("Teclea carácter: ");
			caracter = System.in.read();
		}catch(IOException ioe) {}
		System.out.println("\nO carácter é "+caracter);
		
		System.out.println();*/
		
		try {
			System.out.print("Teclea carácter: ");
			caracter = (char)System.in.read();
		}catch(IOException ioe) {}
		System.out.println("\nO carácter é "+caracter);
		
		
	}
}
