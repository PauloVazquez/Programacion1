package variables;
import java.util.Scanner;
public class Variables {
	public static void main(String[] args) {
		/************ Variables de valores enteiros *********/
		byte vByte = 0;
		short vShort = 0;
		int vInt = 0;
		long vLong = 0;
		/************ Variables de valores decimais (coma flotante) *********/
		float vFloat = 0;
		double vDouble = 0;
		
		/************ Rangos soportados *********/
		// Os positivos son sempre 1 menos que os negativos porque no positivo está incluído o 0 como valor.
		System.out.println("Valor mínimo de vByte = "+Byte.MIN_VALUE);
		System.out.println("Valor máximo de vByte = "+Byte.MAX_VALUE);
		System.out.println();
		
		System.out.println("Valor mínimo de vShort = "+Short.MIN_VALUE);
		System.out.println("Valor máximo de vShort = "+Short.MAX_VALUE);
		System.out.println();
		
		System.out.println("Valor mínimo de vInt = "+Integer.MIN_VALUE);
		System.out.println("Valor máximo de vInt = "+Integer.MAX_VALUE);
		System.out.println();
		
		System.out.println("Valor mínimo de vLong = "+Long.MIN_VALUE);
		System.out.println("Valor máximo de vLong = "+Long.MAX_VALUE);
		System.out.println();
		
		System.out.println("Valor mínimo de vFloat = "+Float.MIN_VALUE);
		System.out.println("Valor máximo de vFloat = "+Float.MAX_VALUE);
		System.out.println();
		
		System.out.println("Valor mínimo de vDouble = "+Double.MIN_VALUE);
		System.out.println("Valor máximo de vDouble = "+Double.MAX_VALUE);
		

	}
}
