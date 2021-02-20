package matrizBidimensional04;

public class MatrizBidimensional04 {
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
				// Asignamos valores, se a fila ou a columna son 0, poñemos 1
				// Se a fila ou a columna son o valor do vector - 1 poñemos 1. (Na última fila e na última columna)
				// Resto en 0
				// Recordar que os índices comezan en 0 e rematan na lonxitude do vector -1		
				for(ifi = 0; ifi < 8; ifi++) {
					for(ico = 0; ico < 8; ico++){
						if(ifi == 0 || ico == 0 || ifi == (matriz.length)-1 || ico == (matriz.length)-1) {
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