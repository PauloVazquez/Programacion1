package comprobarNumeroPrimo;
import java.util.Scanner;
public class ComprobarNumeroPrimo {
	
	static boolean comprobarPrimo(int num) {
		boolean primo = true;
		int divisor = 2;
		
		do {
			if (num == 1) { // Comprobamos a excepción de 1
				primo = false;
			}else {
				if (num == 2) {  // Comprobamos a excepción de 2
					primo = true;				
				}else {
					if ((num/2)%divisor == 0) { // Se a metade do número non é divisible polo divisor, xa non se poderá dividir por outro
						primo = false;
						}else {
							divisor++;
						}
				}
			}
		} while (primo && divisor < num && num != 2);
		return primo;
	}
	
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		boolean primo;
		
		System.out.print("Teclea un número: ");
		num = teclado.nextInt();
		
		if (comprobarPrimo(num)) {
			System.out.println("O número "+num+" é primo");
		}else {
			System.out.println("O número "+num+" non é primo");
		}
	}
}