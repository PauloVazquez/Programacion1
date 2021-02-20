package matrizBidimensional01;
import java.util.Scanner;
public class MatrizBidimensional01 {
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		// int matriz[][] = new int[4][6];
		int matriz[][] = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};
		int ifi = 0, ico = 0;
		
		// Enchemos matriz
		/*  for(ifi = 0; ifi < 4; ifi++) {
			for(ico = 0; ico < 6; ico++) {
				System.out.print("Teclee o elemento matriz["+ifi+"]["+ico+"]: ");
				matriz[ifi][ico] = teclado.nextInt();
			}
		}*/
		// Mostramos matriz
		System.out.println("\n");
		for(ifi = 0; ifi < 4; ifi++) {
			for(ico = 0; ico < 6; ico++) {
				System.out.print(matriz[ifi][ico]+"\t");
			}
			System.out.println("\n");
		}	
	}
}