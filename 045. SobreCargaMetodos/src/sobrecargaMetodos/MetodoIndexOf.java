package sobrecargaMetodos;

public class MetodoIndexOf {
	public static void main(String[] args) {
		char letra = 'e';
		String subcad = "fr";
		String cadea = "Isto é unha frase de exemplo que dará froito";
		
		System.out.println("Resultado Index 1 => "+cadea.indexOf(letra));
		System.out.println("Resultado Index 2 => "+cadea.indexOf(letra,8));
		System.out.println("Resultado Index 3 => "+cadea.indexOf(subcad));
		System.out.println("Resultado Index 4 => "+cadea.indexOf(subcad,20));
	}

}
