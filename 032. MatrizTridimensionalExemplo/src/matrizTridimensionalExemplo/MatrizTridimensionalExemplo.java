package matrizTridimensionalExemplo;

public class MatrizTridimensionalExemplo {
	public static void main(String[] args) {
		int n[][][]= {{{1,2,3},{4,5,6},{7,8,9},{10,11,12}},
					{{13,14,15},{16,17,18},{19,20,21},{22,23,24}}};
		int i1 = 0, i2 = 0, i3 = 0;
		for (i1 = 0; i1 < 2; i1++) {
			for (i2 = 0; i2 < 4; i2++) {
				for (i3 = 0; i3 < 3; i3++) {
					System.out.print(n[i1][i2][i3]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
