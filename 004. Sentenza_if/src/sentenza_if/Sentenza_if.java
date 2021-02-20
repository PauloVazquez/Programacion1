package sentenza_if;

public class Sentenza_if {
	public static void main(String[]args) {
		int num1 = 24, num2 = 24;
		// == é igual, no caso de usar un = sería asignación de valor á variable
		if (num1 == num2) {	
		// Para executar dúas liñas de sentenza necesito abrir chave e incluir todas dentro de  {} para executalas dentro do IF
			System.out.println("Son iguais");
			System.out.println("os dous números");
		}
		else {
		// Se só houbese unha sentenza non habería obriga de poñelas {} pero poden poñerse e funciona igual.
			System.out.println("Son distintos");
			System.out.println("os números");
		}
		System.out.println("\n\n\tFIN DE PROGRAMA\n");		// Tén 2 novos saltos de liña e 1 tabulador para presentar. Ao final tamén salta liña por prinln
	}

}
