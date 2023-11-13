
public class Reto_3 {

	public static void main(String[] args) {

		int numero = 0; // desde cero para que cuando haga el bucle sume 1 desde cero

		while (numero < 100) {

			numero++;

			// si un numero dividido entre otro da cero el primero es multiplo del segundo.

			// la primera condición es si es multiplo lo imprimimos si no se ignora.

			// la segunda del que queremos comprobar que es multiplo.
			// Si se cumple que el numero que sea del 1 al 100 es %multiplo de 2 y el resto es cero.
			// Si no se cumple no es multiplo.
			if (numero % 2 == 0) {
				System.out.println(numero); // me imprime los numeros multiplos de 2.

			}
			//si lo anterior no se cumple entonces que se cumpla la siguiente condicíon.
			//si imprimo la primera condición ignora el segundo if lo que evita que repita numeros.
			// el 4 si cumple el primer if e imprime.
			//el 5 no es multiplo de 2 ni 3 por lo que lo ignora.
			//el 6 es multiplo de los dos y como el primero lo cumple con dos no sigue con el 3 para no repetirlo.
			else if (numero % 3 == 0) {
				System.out.println(numero);
			}
		}
	}
}
