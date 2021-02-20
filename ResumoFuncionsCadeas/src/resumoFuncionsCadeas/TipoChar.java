package resumoFuncionsCadeas;

public class TipoChar {
	public static void main (String[] args) {
		// Tipo primitivo char:
		
			// O char é un caracter, que pode ser letra, número, ideograma ou calquera símbolo .
		char letra = 'a';
		System.out.println(letra); // Imprime letra a.
		
		char codePointDecimal = 97;
		System.out.println(codePointDecimal); // Imprime letra a.
		
		char codePointHexadecimal = '\u0061';
		System.out.println(codePointHexadecimal); // Imprime letra a.
		
									System.out.println();
			// Para algúns símbolos só se pode usar o que se denomina o Code Point.
		char guaraniHexadecimal = '\u20B2';
		System.out.println(guaraniHexadecimal); // Imprime símbolo Guaraní.
		
		char guaraniDecimal = 8370;
		System.out.println(guaraniDecimal); // Imprime símbolo Guaraní.

									System.out.println();
		// Secuencia de escape "\"
			// Unha secuencia de escape é un símbolo "\" que se antepón a símbolos especiais dentro de Java.
			// Estes símbolos son usados pola propia linguaxe e necesitamos marcar desta forma para usalo textualmente.
		char comiñaSimple = '\'';
		System.out.println(comiñaSimple); // Mostra unha comiña simple.
		
		char comiñaDobre = '\"';
		System.out.println(comiñaDobre); // Mostra unha comiña dobre.
		System.out.println("1\t2"); // Mostran os números 1 e 2 separados por tabulación.
		System.out.println("Así\npodemos escribir\nen tres liñas"); // Mostra o texto en liñas separadas.
		
									System.out.println();
		
		// Podemos convertir calquera char a un valor int e viceversa.
		int a = 'a';
		System.out.println(a); // Mostra o número equivalente a "a" en ASCII. Mostra 97.
		
		char b = 98;
		System.out.println(b); // Mostra o caracter equivalente a "98" en ASCII. Mostra b.
		
			// Esta conversión pode facerse mediante un cast.
		System.out.println((char)a); // Mostra o enteiro a como caracter. Mostra a.
		System.out.println((int)b); // Mostra o caracter b como enteiro. Mostra 98.
		
									System.out.println();
		
		// Aritmética de caracteres.
		
			// Podemos sumar ou restar valores ás letras.
		char c = 'e'- 2;
		System.out.println(c); // Mostra c.
		
		char d = 'a' + 3;
		System.out.println(d); // Mostra d.
		
			// Se queremos mostrar unha letra en maiúscula ou minúscula podemos facelo cunha simple operación aritmética
		char H = 'h' + 'A' - 'a';
		System.out.println(H);
		H = 'h' - 32; // Sería equivalente a restar 32 para pasar a maiúscula
		System.out.println(H);
		
		char h = 'H' + 'a' - 'A';
		System.out.println(h);
		h = 'H' + 32; // Sería equivalente a sumar 32 para pasar a minúscula
		System.out.println(h);
		
	}

}
