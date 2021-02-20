package abreviacionsAritmeticas;
import java.util.Scanner;
public class AbreviacionsAritmeticas {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		int variable1 =0, variable2 = 0;
		
		// Acumularía sumando valores introducidos
		do {
			System.out.print("Valor> ");
			variable1 = entrada.nextInt();
			variable2+=variable1;
			System.out.println("variable2 = "+variable2);
		}while(variable2 < 100);
		
		System.out.println("\nFin de acumulación");
		
		// O mesmo pero acumulando en negativo
		do {
			System.out.print("Valor> ");
			variable1 = entrada.nextInt();
			variable2-=variable1;
			System.out.println("variable2 = "+variable2);
		}while(variable2>=0);
		entrada.close();
	}

}
