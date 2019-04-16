import java.util.Scanner;

public class Calculadora {
	private Integer a;
	private Integer b;

	public Calculadora(Integer a, Integer b) {

		this.a = a;
		this.b = b;
	}

	public Integer multiplicacion(Integer a, Integer b) {
		Integer resultado = 0;
		resultado = a * b;
		return resultado;

	}

	public Integer resta(Integer a, Integer b) {
		Integer resultado = 0;
		resultado = a - b;
		return resultado;

	}
	
	public Integer suma(Integer a, Integer b) {
		Integer resultado = 0;
		resultado = a + b;
		return resultado;
	}
	
	public Double division(Double a, Double b) {
		Double resultado = 0.0;
		resultado = a / b;
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
		a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();

		switch (opcion) {

		case 3:
			resultado = a + b;
			break;
		case 4:
			resultado = a / b;
			break;
		}

		System.out.println("El resultado es " + resultado.toString());
	}

}
