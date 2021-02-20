package sobrecargaMetodos;

public class MetodoCompareTo {
	public static void main(String[] args) {
		String cadea1 = "Abanderado", cadea2 = "Acabada";
		// Compara as cadeas e indica a diferenza entre as cadeas, a negativa é menor (primeira alfabeticamente) e viceversa.
		System.out.println("cadea1.compareTo(cadea2) = > "+cadea1.compareTo(cadea2));
		System.out.println("cadea2.compareToIgnoreCase(cadea1) = > "+cadea2.compareToIgnoreCase(cadea1));
	}

}
