package sumaDousNumeros;

import java.util.Scanner;

public class SumaDousNumeros {
	public static void main(String[]args) {
		Scanner ent = new Scanner(System.in);
		int num1 = 0, num2 = 0, suma = 0;
		System.out.println("Teclee primeiro valor? ");// println imprime na liña seguinte
		num1 = ent.nextInt();
		System.out.print("Teclee segundo valor? ");// Sen ln imprime na mesma liña
		num2 = ent.nextInt();
//		System.out.println("Suma = " +(num1+num2));			Esta liña non garda a suma na variable, hai que executar a suma cando se necesite
		suma = num1 + num2;
// 		System.out.println("A suma é = " +suma);
//		Na seguinte liña estamos mostrando a suma cos símbolos	
		System.out.println("\n"+num1+" + "+num2+" = "+suma);
		ent.close();
	}

}
