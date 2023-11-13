// Escribe un programa en Java que pida al usuario 3 números y un orden de ordenamiento, 
//que puede ser ascendente o descendente, a continuación, según el orden indicado se mostrarán en pantalla dichos números.

import java.util.Scanner;

public class Reto_4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num1, num2, num3;
		int orden;

		System.out.println("Ingrese el primer número");
		num1 = scanner.nextInt();

		System.out.println("Ingrese el segundo número");
		num2 = scanner.nextInt();

		System.out.println("Ingrese el tercer número");
		num3 = scanner.nextInt();

		System.out.println("Si quieres orden ascendente escribe 1 y orden descendente escribe 2");
		orden = scanner.nextInt();

		//Ese if es para comprobar si el orden que solicita el usuario es ascendente o descendente.
		if (orden == 1) {
			// Comparamos los tres numeros para ver el orden en que se imprime.
			
			if (num1 < num2) {
				if (num2 < num3) {
					System.out.println(num1);
					System.out.println(num2);
					System.out.println(num3);
				}
			}
			if (num1 < num3) {
				if (num3 < num2) {
					System.out.println(num1);
					System.out.println(num3);
					System.out.println(num2);
				}
			}
			if (num2 < num1) {
				if (num1 < num3) {
					System.out.println(num2);
					System.out.println(num1);
					System.out.println(num3);
				}
			}
			if (num2 < num3) {
				if (num3 < num1) {
					System.out.println(num2);
					System.out.println(num3);
					System.out.println(num1);
				}
			}
			if (num3 < num1) {
				if (num1 < num2) {
					System.out.println(num3);
					System.out.println(num1);
					System.out.println(num2);
				}
			}
			if (num3 < num2) {
				if (num2 < num1) {
					System.out.println(num3);
					System.out.println(num2);
					System.out.println(num1);
				}
			}
		}
		//Ese if es para comprobar si el orden que solicita el usuario es ascendente o descendente.
		if (orden == 2) {
			// Comparamos los tres numeros para ver el orden en que se imprime.
			if (num1 < num2) {
				if (num2 < num3) {
					System.out.println(num3);
					System.out.println(num2);
					System.out.println(num1);
				}
			}
			if (num1 < num3) {
				if (num3 < num2) {
					System.out.println(num2);
					System.out.println(num3);
					System.out.println(num1);
				}
			}
			if (num2 < num1) {
				if (num1 < num3) {
					System.out.println(num3);
					System.out.println(num1);
					System.out.println(num2);
				}
			}
			if (num2 < num3) {
				if (num3 < num1) {
					System.out.println(num1);
					System.out.println(num3);
					System.out.println(num2);
				}
			}
			if (num3 < num1) {
				if (num1 < num2) {
					System.out.println(num2);
					System.out.println(num1);
					System.out.println(num3);
				}
			}
			if (num3 < num2) {
				if (num2 < num1) {
					System.out.println(num1);
					System.out.println(num2);
					System.out.println(num3);
				}
			}
		}

	}
	
}