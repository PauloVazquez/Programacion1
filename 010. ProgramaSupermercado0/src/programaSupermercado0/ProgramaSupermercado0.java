package programaSupermercado0;
import java.util.Scanner; // Importante importar o Scanner
public class ProgramaSupermercado0 {
	// VER DIAGRAMA PAXINA 2 EXERCICIOS DE DIAGRAMAS
	public static void main(String[]args) {
	Scanner entrada = new Scanner (System.in);
	// Creamos as variables do prezo do artigo, o prezo da compra e a cantidade do pago
	int part = 0, pcomp = 0, pag = 0;
	// Abrimos un bucle DO WHILE para executar o pedido do prezo de cada artigo
	do {
		System.out.print("Introduza o valor do artigo (0 para acabar)> ");
		part = entrada.nextInt();
		pcomp = pcomp + part;
	}while (part != 0);
	System.out.println("\nO total da compra é > "+pcomp);
	do {
	System.out.print("\nIntroduza o importe co que paga> ");
	pag = entrada.nextInt();
	if (pag < pcomp) {
		System.out.println("\nFaltan: "+(pcomp-pag)+"€.");
	}
	}while(pag<pcomp);
	System.out.print("\nA volta son "+(pag-pcomp)+"€");
	entrada.close();
	}
}