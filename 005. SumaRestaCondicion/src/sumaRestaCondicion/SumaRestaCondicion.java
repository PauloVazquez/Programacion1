package sumaRestaCondicion;

import java.util.Scanner; // Importante importar o Scanner

public class SumaRestaCondicion {
	public static void main(String[]args) {
		Scanner entrada = new Scanner (System.in);
		// Creamos as d�as variables enteiras para comparar
		int num1 = 0, num2 = 0;
		// Solicitamos a entrada dos dous valores
		System.out.print("Teclee o primeiro valor> ");
		num1 = entrada.nextInt();
		System.out.print("Teclee o segundo valor> ");
		num2 = entrada.nextInt();
		// Iniciamos if para comparar, se num1 � maior ca num2, restamos os valores
		if(num1 > num2) {
			System.out.println(+num1+" - "+num2+" = "+(num1-num2));
		}
		// No caso contrario, se num1 � menor ou igual a num2, sumamos os valores
		else {
			// Importante, se non po�emos os par�nteses na operaci�n, concatenar� os dos n�meros
			System.out.println(+num1+" + "+num2+" = "+(num1+num2));
		}
		entrada.close();
	}
}