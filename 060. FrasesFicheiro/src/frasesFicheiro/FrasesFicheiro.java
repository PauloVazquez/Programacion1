//	Crear ficheiro de texto no que imos meter frases até que poñamos FIN ou fin
//	Chamarase frases.txt
//	Ler ese ficheiro, ordear as frases por lonxitudes e despois de ordealas
//	Crear o ficheiro forde.txt e visualizalo

// Non se van contar as frases mentres se introducen

package frasesFicheiro;
import java.io.*;
import java.util.Scanner;

public class FrasesFicheiro {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String texto, liña;
		
		try {
			FileWriter escritor = new FileWriter("A:\\Google Drive\\paulovazquezacosta\\Proyectos\\2020 DAM\\1º\\Programación\\2T\\Ficheiros de texto\\frases.txt");
			System.out.print("Teclear texto a gravar: ");
			texto = teclado.nextLine();
			while(!texto.equalsIgnoreCase("Fin")) {
				texto += '\n';
				escritor.write(texto);
				texto = teclado.nextLine();	
			}
			escritor.close();
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		texto ="";
		
		try {
			BufferedReader lector = new BufferedReader(new FileReader("A:\\Google Drive\\paulovazquezacosta\\Proyectos\\2020 DAM\\1º\\Programación\\2T\\Ficheiros de texto\\frases.txt"));
			liña = in
		} catch (FileNotFoundException ioe) {
			System.out.println(ioe.getMessage());
		}
		
	}

}
