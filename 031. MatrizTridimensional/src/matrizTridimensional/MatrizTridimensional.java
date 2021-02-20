package matrizTridimensional;
import java.util.Scanner;
public class MatrizTridimensional {
	public static void main(String[] args) {
		int indaval = 0, indalu = 0, indmat = 0, suma = 0, media = 0, mediamaior = 0, alumne = 0, notamenor = 10, notamaior = 0, alumnemaior = 0, alumnemenor = 0;
		// int matriznotas[][][] = new int[3][6][4];
		int matriznotas[][][]= {{{1,2,3,4},{5,6,7,8},{9,10,0,1},{2,3,4,5},{6,7,8,9},{10,0,1,2}},{{1,2,3,4},{5,6,7,8},{9,10,0,1},{2,3,4,5},{6,7,8,9},{10,0,1,2}},{{1,2,3,4},{5,6,7,8},{9,10,0,1},{2,3,4,5},{6,7,8,9},{10,0,1,2}}};
		Scanner teclado = new Scanner(System.in);
		
		// Enchemos a matriz
		/*for(indaval = 0; indaval < 3; indaval++) {
			for(indalu = 0; indalu < 6; indalu++) {
				for(indmat = 0; indmat < 4; indmat++) {
					do {
						System.out.print((indaval+1)+"ª avaliación, "+(indalu+1)+"ª alumne, "+(indmat+1)+"ª materia: ");
						matriznotas[indaval][indalu][indmat] = teclado.nextInt();
					} while (matriznotas[indaval][indalu][indmat] < 0 || matriznotas[indaval][indalu][indmat] > 10);				
				}
			}
		}*/
		
		// Mostramos a matriz
		for(indaval = 0; indaval < 3; indaval++) {
			for(indalu = 0; indalu < 6; indalu++) {
				for(indmat = 0; indmat < 4; indmat++) {
						System.out.print(matriznotas[indaval][indalu][indmat]+"\t");			
				}
				System.out.print("\n");	
			}
			System.out.print("\n");
		}
	// Solicitamos a materia da que queremos saber a media
		do {
			System.out.print("Introduza a materia: ");
			indmat = teclado.nextInt();
		} while (indmat < 1 || indmat > 4); // Pedimos a materia comezando por 1
		// Corriximos a materia para poder buscar correctamente na matriz
		indmat -= 1;
		
		// Calculamos a media de cada materia
		for(indalu = 0; indalu < 6; indalu++) {
			suma = 0;
			for(indaval = 0; indaval < 3; indaval++) {
				suma += matriznotas[indaval][indalu][indmat];
			}
			media = suma / 3;
			// No caso de atopar unha media maior, gardamos a nota e a persoa
			if(media > mediamaior) {
				mediamaior = media;
				alumne = indalu + 1;
			}
		}
		System.out.println("A persoa coa media máis alta é "+alumne+" e a súa nota media é "+mediamaior);		
		
		do {
			System.out.print("Introduza a materia: ");
			indmat = teclado.nextInt();			
		}while(indmat < 1 || indmat > 4);
		indmat -= 1;
		
		do {
		System.out.print("Introduza a avaliación: ");
		indaval = teclado.nextInt();
		} while(indaval < 1 || indaval > 3);
		indaval -= 1;
		
		for(indalu = 0; indalu < 6; indalu++) {
			if(matriznotas[indaval][indalu][indmat] >= notamaior) {
				notamaior = matriznotas[indaval][indalu][indmat];
				alumnemaior = indalu + 1;
			}
			if(matriznotas[indaval][indalu][indmat] <= notamenor) {
				notamenor = matriznotas[indaval][indalu][indmat];
				alumnemenor = indalu + 1;
			}
		}
		
		System.out.println("A nota menor é "+notamenor+" e a persoa é "+alumnemenor);		
		System.out.println("A nota maior é "+notamaior+" e a persoa é "+alumnemaior);	
	}
}
