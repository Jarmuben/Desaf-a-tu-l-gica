//El programa imprime por pantalla del 10 al 1

public class Reto_1 {

	public static void main(String[] args) {

		// Declaro la variable serie y la inicio a valor 10 que es el numero por el que
		// empieza la serie.
		// si la inicio a valor 6 aparecerá por patalla 6,5,4,3,2,1

		int serie = 10;

		// Uso While y entre paréntesis pongo serie que es la variable o elemento que quiero evaluar.
		// Mientras que la variable serie sea mayor o igual a 1 va a imprimir el mensaje de abajo.

		while (serie >= 1) {

			System.out.println(serie);
			//Para evita un bucle y que salga por pantalla 10 de forma indefinida hago la orden de abajo.
			//Mientras que el valor de serie sea mayor o igual a 1 le resto uno y el resultado imprimo en pantalla
			//Mientras 10<=1 entonces imprime y resta uno que es igual a 9 y lo imprime.
			//Mientras 9 <=1 entonces imprime y resta uno que es igual a 8 y lo imprime.
			//Mientras 1<=1 entonces imprime y resta uno que es igual a 0 y ya no se cumple y no lo imprime.
			
			serie--;
		}

	}
}
