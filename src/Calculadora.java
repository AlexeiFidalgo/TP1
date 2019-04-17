import java.util.Scanner;

public class Calculadora {
	private Integer a;
	private Integer b;

	public Calculadora(Integer a, Integer b) {

		this.a = a;
		this.b = b;
	}

	public Integer multiplicacion() {
		Integer resultado = 0;
		resultado = this.a * this.b;
		return resultado;

	}

	public Integer resta() {
		Integer resultado = 0;
		resultado = this.a - this.b;
		return resultado;

	}

	public Integer suma() {
		Integer resultado = 0;
		resultado =this.a + this.b;
		return resultado;
	}

	public Integer division() {
		Integer resultado = 0;
		resultado = this.a / this.b;
		return resultado;
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado = 0;
		do {
			System.out.println(
					"Ingrese su operación /n 1 para multiplicar /n 2 para restar /n 3 para sumar /n 4 para dividir");
			opcion = teclado.nextInt();
		} while (opcion < 1 && opcion > 4);

		System.out.println("Ingrese el primer numero");

		System.out.println("Ingrese el segundo numero");

		Calculadora miCalculadora = new Calculadora(a = teclado.nextInt(), b = teclado.nextInt());
		switch (opcion) {
		case 1:
			miCalculadora.multiplicacion();
			break;
		case 2: 
			miCalculadora.resta();
		case 3:
			miCalculadora.suma();
			break;
		case 4:
			miCalculadora.division();
			break;
		}

		System.out.println("El resultado es " + resultado.toString());
	}

}
