package variables_caracter;
import java.io.IOException;
public class Variables_Caracter {
	public static void main(String[] args) {
		// Se non lle dou ning�n caracter de valor, d� erro. Co espazo en branco xa serve 
		// char caracter = '';
		char caracter = ' ';
		// int caracter = 0;
		/*try {
			System.out.print("Teclea car�cter: ");
			caracter = System.in.read();
		}catch(IOException ioe) {}
		System.out.println("\nO car�cter � "+caracter);
		
		System.out.println();*/
		
		try {
			System.out.print("Teclea car�cter: ");
			caracter = (char)System.in.read();
		}catch(IOException ioe) {}
		System.out.println("\nO car�cter � "+caracter);
		
		
	}
}
