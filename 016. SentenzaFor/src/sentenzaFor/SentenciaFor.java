package sentenzaFor;

public class SentenciaFor {
	
	public static void main(String[] args) {
		int v=0;
		/*
		// Defino un bucle 'for'
		// Tiene un valor inicial v=0
		// Mientras v sea menor que 12
		// El bucle avanza en pasos de 1
		//		Puedo escribir v+1
		//		o directamente v++
		
		// Si no pongo llaves, el bucle solo contiene una instrucción
		for (v=0; v<12; v++)
			System.out.print("Valor de v=");
			System.out.print(v+"\n");
		
		// Si pongo las llaves, puede contener varias
		for (v=0; v<12; v++) {
			System.out.print("Valor de v=");	// print no salta de línea despues de escribir
			System.out.println(v);				// println salta a la siguiente linea al terminar
		}
		
		// El bucle ha terminado cuando v llega a 12
		System.out.println("Valor de salida de v="+v);
		
		// El bucle se puede escribir también en una sola línea
		// y por lo tanto sin emplear las llaves
		for (v=0; v<12; v++)
			System.out.println("Valor de v="+v);
		
		*/
		
		// 'for' anidados
		int a=0, b=0;
		for (v=0; v<3; v++) {
			for (a=3; a<7; a++) {
				for (b=2; b<5; b++) {
					System.out.println("v = "+v+"\ta = "+a+"\tb = "+b);
				}
			}
		}
		
		
	}

}
