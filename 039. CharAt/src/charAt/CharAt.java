package charAt;

public class CharAt {
	public static void main(String[] args) {
		String frase0 = "Ma�� � xoves", frase1 = "";
		int pos = 0;
		char letra = ' ';
		for (pos = 0; pos < frase0.length(); pos++) {
			letra = frase0.charAt(pos);
			if (letra == 'a'|| letra == 'e'|| letra == 'i' || letra == 'o' || letra == 'u')
				frase1 += letra;
			}
		System.out.println("frase1 => "+frase1);
		}
	}