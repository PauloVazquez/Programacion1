package codigosASCII;

public class CodigosASCII {
	public static void main(String[] args) {
		for (int i = 0; i < 256; i++) {
			System.out.println("C�digo "+i+"\tCar�cter: "+(char)i);
		}
		System.out.println("\n\n");
		for (char c = 'a'; c < 'z'; c++) {
			System.out.println("Car�cter "+c+"\tC�digo: "+(int)c);
		}
		System.out.println("Car�cter "+'�'+"\tC�digo: "+(int)'�');
	}
}