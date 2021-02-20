/* Crear un vector de dimensión 10, introducir números sen repetir ningún
   Despois de cheo, ordear co método da burbulla*/

package ordearArray;

import java.util.Scanner;

public class OrdearArray {
	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    int[] vector = new int[10];
	    int auxiliar;
	    boolean existe = false;
	    auxiliar = 0;
	    int numero = 0;
	    int i = 0;
	    int j = 0;
	    
	   for(i = 0; i < vector.length;i++) {
		   do {
			   existe = false;
			   System.out.print("Teclee o "+(i+1)+"º número: ");
			   vector[i] = teclado.nextInt();
			   for(j = 0; j < i && !existe; j++) {
				   if (vector[i] == vector[j]) {
					   existe = true;
				   }
			   }
			   
		   } while(existe);
	   }
	    
	    // Mostramos o vector desordeado
	   System.out.print("\n");
	   System.out.println("Vector desordeado");
	    for (i = 0; i < vector.length; i++) {
	    	System.out.print(vector[i]+"\t");
	    }
	    
	    // Método da burbulla	
	    for (i = 0; i < (vector.length-1); i++) {
	    	for (j = i+1; j < vector.length; j++) {
	    		if(vector[i] > vector [j]) {
	    			auxiliar = vector[i];
	    			vector[i] = vector[j];
	    			vector[j] = auxiliar;
	    		}
	    	}
	    }
	    System.out.print("\n");
	    System.out.println("\nVector ordeado");
	    // Mostramos o vector ordeado
	    for (i = 0; i < vector.length; i++) {
	    	System.out.print(vector[i]+"\t");
	    }
	}
	}
