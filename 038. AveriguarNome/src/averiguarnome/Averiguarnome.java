package averiguarnome;
import java.util.Scanner;
public class Averiguarnome {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome = null;
		System.out.print("Nome: ");
		nome = teclado.nextLine();
		System.out.println("Valor devolto => "+nome.equalsIgnoreCase("Samuel"));
//		if(nome.equals("Samuel")) // equals � un m�todo para comparar Strings, non serve ==
		if(nome.equalsIgnoreCase("Samuel")) // IgnoreCase omite as mai�sculas e min�sculas
			System.out.print("Acerto");
		else
			System.out.print("Fallo");
		teclado.close();
	}
}