package metodos;

public class Metodos01 {
	static void metodo1_1() {
		System.out.println("Dentro do m�todo1_1");
	}
	static void metodo1() {
		System.out.println("Dentro do m�todo1");
		System.out.println("Chamada a m�todo1_1");
		metodo1_1();
		System.out.println("Retorno do m�todo1_1");
	}
	static void metodo2() {
		System.out.println("Dentro do m�todo2");
	}
	static void metodo3() {
		System.out.println("Dentro do m�todo3");
		System.out.println("Chamada a m�todo1 dende o m�todo3");
		metodo1();
		System.out.println("Retorno do m�todo1 ao m�todo3");
	}
	public static void main(String[] args) {
		System.out.println("Chamada ao m�todo1");
		metodo1();
		System.out.println("Retorno de m�todo1");
		System.out.println("Chamada ao m�todo2");
		metodo2();
		System.out.println("Retorno de m�todo2");
		System.out.println("Chamada ao m�todo3");
		metodo3();
		System.out.println("Retorno de m�todo3");
		System.out.println("FIN DO PROGRAMA");
	}
}
