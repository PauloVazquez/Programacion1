package codigosASCII;

public class CodigosASCII {
	public static void main(String[] args) {
		for (int i = 0; i < 256; i++) {
			System.out.println("Código "+i+"\tCarácter: "+(char)i);
		}
		System.out.println("\n\n");
		for (char c = 'a'; c < 'z'; c++) {
			System.out.println("Carácter "+c+"\tCódigo: "+(int)c);
		}
		System.out.println("Carácter "+'Ñ'+"\tCódigo: "+(int)'Ñ');
	}
}