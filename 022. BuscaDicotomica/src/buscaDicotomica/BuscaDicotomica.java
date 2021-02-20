// Exercicio BUSCA DICOTÓMICA
// Ter unha matriz cuns valores determinados
// Solicitar número a buscar
// Buscar o número
// Mostrar se o número está
// FACER EN CASA ORGANIGRAMA E JAVA

package buscaDicotomica;
import java.util.Scanner;
public class BuscaDicotomica {
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		int indicesquerda, numerobuscado, indicemedio, indicedereita;		
		int taboa[] = {2, 23, 27, 30, 45, 55, 61, 66, 78, 100};
		indicesquerda = 0;
		indicedereita = 9;
		indicemedio = 5;
		
		System.out.print("Teclee un número a buscar> ");
		numerobuscado = teclado.nextInt();
		

		
		
		teclado.close();		
		
	}
}