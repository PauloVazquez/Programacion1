package matrizBidimensional03;

public class MatrizBidimensional03 {
	public static void main(String[]args) {
		int matriz[][] = {{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},
				 {9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9},{9,9,9,9,9,9,9,9}};
		int ifi = 0, ico = 0;
		
		// Mostramos matriz inicializada en 9
		for(ifi = 0; ifi < 8; ifi++) {
			for(ico = 0;ico < 8; ico++) {
				System.out.print(matriz[ifi][ico]+"\t");
			}
			System.out.println("\n");
		}
		// Asignamos valores, se a fila é igual á columna é 1
		// Se a fila e a columna suman 7, o valor da matriz menos 1, é 0
		// Recordar que os índices comezan en 0 e rematan na lonxitude do vector -1
		for(ifi = 0; ifi < 8; ifi++) {
			for(ico = 0; ico < 8; ico++){
				if(ifi == ico || ifi + ico == (matriz.length)-1) {
					matriz[ifi][ico] = 1;
				} else {
					matriz[ifi][ico] = 0;
				}
			}
		}
		// Mostramos a matriz
		System.out.println("\n");
		for(ifi = 0; ifi < 8; ifi++) {
			for(ico = 0;ico < 8; ico++) {
				System.out.print(matriz[ifi][ico]+"\t");
		}
		System.out.println("\n");
		}
	}
}
