
//Escribe un programa en Java que pida un número por teclado hasta que éste sea positivo.
 
//A continuación, muestra los primeros 20 números sucesivos a dicho número.. 

import java.util.Scanner;

public class Reto_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numero, contador = 0;// inicializa las variables a cero porque es un contador para sumarle uno cada
									// vez que cuente.

		System.out.println("Introduce un número positivo ");

		numero = scanner.nextInt(); // se lee el primer número.

		// el objetivo es que la variable número sea un número positivo.
		if (numero > 0) {

			// Aqui va lo que pasa si el if se cumple.

			System.out.println("El número introducido es positivo");

		} else { // si no se cumple la condición.

			System.out.println("El número introducido no es positivo");
			// aqui incluyo el cero que arriba no lo puse. Este es el grupo de los que no
			// aceptamos.

			while (numero <= 0) {
				System.out.println("Introduce un número positivo ");
				numero = scanner.nextInt(); // lee por pantalla el numero puesto por el usuario.
			}
		}
		// El contador cuenta desde 0 el numero de veces que se hace el bucle.

		// Con while mientras creo un bucle donde quiero comprobar que se ejecuta 20 veces.

		while (contador < 20) {
			// Pongo esto porque quiero que cada vez que se cumple la condición de que el
			// contador de veces
			// es menor a 20 se ejecute una vez mas hasta que llegue a 20 veces.
			contador++;
			// Cada vez que se cumple la condición y se ejecuta el contador se le suma un
			// numero al usado en ese
			// contador.
			numero++;
			System.out.println(numero);

		}
	}
}
