package sentenza_if;

public class Sentenza_if {
	public static void main(String[]args) {
		int num1 = 24, num2 = 24;
		// == � igual, no caso de usar un = ser�a asignaci�n de valor � variable
		if (num1 == num2) {	
		// Para executar d�as li�as de sentenza necesito abrir chave e incluir todas dentro de  {} para executalas dentro do IF
			System.out.println("Son iguais");
			System.out.println("os dous n�meros");
		}
		else {
		// Se s� houbese unha sentenza non haber�a obriga de po�elas {} pero poden po�erse e funciona igual.
			System.out.println("Son distintos");
			System.out.println("os n�meros");
		}
		System.out.println("\n\n\tFIN DE PROGRAMA\n");		// T�n 2 novos saltos de li�a e 1 tabulador para presentar. Ao final tam�n salta li�a por prinln
	}

}
