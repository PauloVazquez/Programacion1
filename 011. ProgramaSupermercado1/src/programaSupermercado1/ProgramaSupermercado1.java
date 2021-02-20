package programaSupermercado1;
import java.util.Scanner; // Importante importar o Scanner
public class ProgramaSupermercado1 {
	// VER DIAGRAMA PAXINA 3 EXERCICIOS DE DIAGRAMAS
	public static void main(String[]args) {
	Scanner entrada = new Scanner (System.in);
	int prezoartigo = 0, prezocompra = 0, pago = 0, clientes = 0, valorcaixa = 0, contadorclientes = 0, valormediocompra = 0;
	// Un bucle DO WHILE para que funcione mentres hai clientes
	do {
		// Un bucle DO WHILE que calcule o prezo de cada compra individual
		do {
			System.out.print("Introduza o valor do artigo (0 para acabar)> ");
			prezoartigo = entrada.nextInt();
			prezocompra = prezocompra + prezoartigo;
		}while (prezoartigo != 0);
		System.out.println("\nO total da compra é > "+prezocompra);
		// Un bucle DO WHILE que controle que se paga cun importe correcto e diga se faltan cartos
		do {
			System.out.print("\nIntroduza o importe co que paga> ");
			pago = entrada.nextInt();
			if (pago < prezocompra) {
				System.out.println("\nFaltan: "+(prezocompra-pago)+"€.");
			}
		}while(pago<prezocompra);
		System.out.println("\nA volta son "+(pago-prezocompra)+"€");
		contadorclientes = contadorclientes + 1;
		valorcaixa = valorcaixa + prezocompra;
		prezocompra = 0;
		// Un bucle DO WHILE que controle que o valor introducido sexa 0 ou 1 para novo cliente.
		do {
			System.out.print("\nHai outro cliente? (0 = Non 1= Si): ");
			clientes = entrada.nextInt();
		}while (clientes != 0 && clientes != 1);
	}while(clientes == 1);
	System.out.println("\nO valor total da caixa é "+valorcaixa);
	System.out.println("\nO número total de clientes foi "+contadorclientes);
	valormediocompra = valorcaixa / contadorclientes;
	System.out.println("\nO valor medio da cesta foi "+valormediocompra);
	entrada.close();
	}
}