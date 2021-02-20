package matrizBidimensional;

public class MatrizBidimensional {
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
		// Cambiamos os valores segundo a fila e a columna
		for(ifi = 0; ifi < 8; ifi++) {
			for(ico = 0; ico < 8; ico++) {
				if(ifi % 2 == 0) {
					if(ico % 2 == 0) {
						matriz[ifi][ico] = 1;
						}else {
							matriz[ifi][ico] = 0;
					}
					}else { 
						if(ico % 2 == 0) {
					matriz[ifi][ico] = 0;
						}else { 
							matriz[ifi][ico] = 1;
				}
			}	
		}
/* Tamén se pode escribir 
 * 				if(ifi % 2 == 0) 
					if(ico % 2 == 0) 
						matriz[ifi][ico] = 1;
					else matriz[ifi][ico] = 0;
				else if(ico % 2 == 0) 
					matriz[ifi][ico] = 0;
					else matriz[ifi][ico] = 1;
 */
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