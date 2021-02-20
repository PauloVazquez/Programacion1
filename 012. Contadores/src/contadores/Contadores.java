package contadores;

public class Contadores {
	public static void main(String[]args) {
		int contador = 3;
		// ++variable primeiro suma e despois mostra
		System.out.println("contador = "+ ++contador);
		// variable++ suma despois de mostrar a variable, por iso mostra o valor que tiña antes
		System.out.println("contador = "+ contador++);
		// Agora visualiza a variable e xa a mostra sumada, porque sumou ao rematar a sentenza anterior
		System.out.println("contador = "+ contador);
		System.out.println("\n");
		// Agora primeiro vai restar do valor anterior e despois visualiza
		System.out.println("contador = "+ --contador);
		// Agora restará despois de visualizar, por iso mostra o valor da variable antes da operación
		System.out.println("contador = "+ contador--);
		// Agora visualiza a variable e xa a mostra sumada, porque restou ao rematar a sentenza anterior
		System.out.println("contador = "+ contador);
	}

}
