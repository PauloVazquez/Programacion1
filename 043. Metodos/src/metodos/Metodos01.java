package metodos;

public class Metodos01 {
	static void metodo1_1() {
		System.out.println("Dentro do método1_1");
	}
	static void metodo1() {
		System.out.println("Dentro do método1");
		System.out.println("Chamada a método1_1");
		metodo1_1();
		System.out.println("Retorno do método1_1");
	}
	static void metodo2() {
		System.out.println("Dentro do método2");
	}
	static void metodo3() {
		System.out.println("Dentro do método3");
		System.out.println("Chamada a método1 dende o método3");
		metodo1();
		System.out.println("Retorno do método1 ao método3");
	}
	public static void main(String[] args) {
		System.out.println("Chamada ao método1");
		metodo1();
		System.out.println("Retorno de método1");
		System.out.println("Chamada ao método2");
		metodo2();
		System.out.println("Retorno de método2");
		System.out.println("Chamada ao método3");
		metodo3();
		System.out.println("Retorno de método3");
		System.out.println("FIN DO PROGRAMA");
	}
}
