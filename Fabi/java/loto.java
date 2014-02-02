

import java.util.*;

public class loto {

	// VECTORES
	int[][] tabla = new int[10][7];// TABLA DE DIMENSIONES 10/7
	int[] vector = new int[50]; // NUMERO DE VECES QUE SE REPITE CADA REGISTRO

	// TABLA COMPLETA CON METODOS CARGAR/NO REPETIR/ORDENAR/IMPRIMIR
	public void tablaCompleta() {

		System.out.print("*** TABLA DE APUESTAS ***");
		// CARGA TODOS LOS NUMEROS
		for (int fila = 0; fila < tabla.length; fila++) {
			for (int columna = 0; columna < 7; columna++) {

				int aux = (int) (Math.random() * 49 + 1); // NUMERO INTRODUCIDO
															// ALEATORIO
				tabla[fila][columna] = aux;
				vector[tabla[fila][columna]]++; // CONTADOR DE NUMERO

				// FOR PARA QUE RESTE SI ENCUENTRA UN NUMERO REPETIDO
				for (int z = 0; z < columna; z++) {

					if (tabla[fila][columna] == tabla[fila][z]) {
						columna--;
					}
				}
			}
		}

		// ORDENA LOS NUMEROS
		for (int i = 0; i < 10; i++) {

			for (int x = 5; x > 0; x--) {

				for (int j = 0; j < x; j++) {

					if (tabla[i][j] > tabla[i][j + 1]) {//

						int num = tabla[i][j]; //
						tabla[i][j] = tabla[i][j + 1]; //
						tabla[i][j + 1] = num; //

					}
				}
			}
		}

		// IMPRIME LOS NUMEROS
		for (int fila = 0; fila < 10; fila++) {
			System.out.println();// SALTO DE LINEA DE LOS NUMEROS
			for (int columna = 0; columna < 7; columna++) {

				if (tabla[fila][columna] < 10) {

					System.out.print(" "); // SI ES MENOR A 10 IMPRIME UN
											// ESPACIO

				}

				if (columna == 6) {
					System.out.print("\t"); // SI ES IGUAL A LA CULUMNA 6
											// ESPACIO PARA DIFFERENCIAR LOS
											// COMPLEMENTARIOS
				}

				System.out.print(tabla[fila][columna] + " ");
			}
		}

	}

	// IMPRIMIR NUMEROS COMPLEMENTARIOS
	public void numerosComplementarios() {
		System.out.println();
		System.out.println("Nœmeros complementarios:");
		for (int fila = 0; fila < 10; fila++) {

			for (int columna = 0; columna < 7; columna++) {

				if (columna == 6) { // SI LA CLUMNA ES LA 6 EN TEORIA la 7
									// IMPRIME COMPLEMENTAARIOS

					System.out.print(tabla[fila][columna] + " ");
				}

			}
		}
	}

	// RESULTADOS DE UNA JORNADA
	public void resultadoJornada(int jornada) { // METODO QUE LE PASAMOS LA
												// JORNADA POR EL MAIN Y NOS
												// IMPRIME LA MISMA
		System.out.println();
		System.out.println("Resultados jornada N¼: " + jornada);
		for (int fila = 0; fila < 11; fila++) {
			for (int columna = 0; columna < 7; columna++) {

				if (fila == jornada) {

					System.out.print(tabla[fila][columna] + " ");

				}

			}
		}

	}

	// ESTADISTICAS DE UN SOLO NUMERO
	public void estadisticasUnNumero(int repetido) { // LE INTRODUCIMOS UN
														// NUMERO Y NOS
														// ENCUENTRA EL NUMERO
														// INTRODUCIDO

		int contador = 0;
		for (int i = 0; i < 10; i++) {
			for (int x = 0; x < 7; x++) {

				if (tabla[i][x] == repetido) { // SI ES IGUAL A REPETIDO SUMA 1
					contador++;
				}

			}
		}

		System.out.println("El nœmero " + repetido + " se repite en "
				+ contador + " ocasiones.");

	}

	// ESTADISTICAS TODOS LOS NUMEROS
	public void estadisticasTodosNumeros() {
		for (int b = 0; b < vector.length; b++) {
			if (vector[b] != 0) {

				System.out.println(b + " se repite en " + vector[b]
						+ " ocasiones.");

			}
		}
	}

	// ESTADISTICAS NUNCA APARECEN
	public void estadisticasNuncaAparecen() {
		int never = 0;
		int posicion = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == 0) {
				never = vector[i];
				posicion = i;
				System.out.println("Nœmero que nunca ha aparecido: " + posicion
						+ " con " + never + " repeticiones.");
			}
		}
	}

	// ESTADISTICAS NUMERO QUE MAS VECES HA APARECIDO
	public void estadisticasMasVeces() {
		int mayor = 0;
		int contador = 0;
		for (int x = 0; x < 49; x++) {
			if (vector[x] > mayor) {

				mayor = vector[x];

			}

		}
		for (int x = 0; x < 49; x++) {

			if (vector[x] == mayor) {
				contador = contador + 1;
			}
		}

		int contador3 = 0;
		int repetidos[] = new int[contador];

		if (contador > 1)

			System.out.println("Hay " + contador + " numeros maximos");
		System.out.print("Los numeros ");

		for (int x = 0; x < 49; x++) {

			if (vector[x] == mayor) {
				repetidos[contador3] = (x + 1);

				if (contador > 1) {

					System.out.print(repetidos[contador3] + " / ");

				} else {

					System.out.print(repetidos[contador3]);
				}
				contador3++;
			}
		}
		System.out.println(" se repiten " + mayor + " veces.");
	}

	public void cleanWindow() {

		for (int i = 0; i < 50; i++) {
			System.out.println("");
		}

	}

	public static void main(String[] args) {

		loto nuevo = new loto();
		Scanner leer = new Scanner(System.in);

		boolean continuar = true;

		while (continuar == true) {
			System.out.println("");
			System.out
					.println("\n************* Menu principal: LOTO **************");
			System.out
					.println("1 - Imprimir todos los numeros complementarios.");
			System.out.println("2 - Imprimir resultados de una jornada.");
			System.out
					.println("3 - Imprimir resultados de todas las jornadas.");
			System.out.println("4 - Estadisticas.");
			System.out.println("5 - Salir.");
			System.out
					.println("***********************************************");
			System.out.println("Introduzca un opci—n -> ");
			int menu = leer.nextInt();

			while (menu < 1 || menu > 5) {
				System.out
						.println("Opcion incorrecta, introduzca un opcion correcta ->");
				menu = leer.nextInt();
			}

			nuevo.cleanWindow();

			switch (menu) {

			case 1:
				nuevo.numerosComplementarios();
				break;
			case 2:
				System.out.print("Introduzca un nœmero de jornada de 0 a 9: ");
				int jornada = leer.nextInt();
				nuevo.resultadoJornada(jornada);
				break;
			case 3:
				nuevo.tablaCompleta();
				break;
			case 4:
				boolean continuar2 = true;

				while (continuar2 == true) {

					System.out
							.println("\n************* Submenœ Estadisticas **************");
					System.out
							.println("1 - Nœmero de apariciones de un nœmero.");
					System.out
							.println("2 - Nœmero de apariciones de todos los nœmeros.");
					System.out
							.println("3 - Nœmero que m‡s veces ha aparecido.");
					System.out.println("4 - Nœmero que nunca ha aparecido.");
					System.out.println("5 - Combinaci—n Ideal.");
					System.out.println("6 - Combinaci—n probable.");
					System.out.println("7 - Salir.");
					System.out
							.println("***********************************************");
					System.out.println("Introduzca un opci—n -> ");

					int menu1 = leer.nextInt();

					while (menu1 < 1 || menu1 > 7) {
						System.out
								.println("Opcion incorrecta, introduzca un opcion correcta.");
						menu1 = leer.nextInt();
					}
					nuevo.cleanWindow();

					switch (menu1) {
					case 1:
						System.out.println("ÀQue nœmero quiere ver?");
						int numero = leer.nextInt();
						nuevo.estadisticasUnNumero(numero);
						break;
					case 2:
						nuevo.estadisticasTodosNumeros();
						break;
					case 3:
						nuevo.estadisticasMasVeces();
						break;
					case 4:
						nuevo.estadisticasNuncaAparecen();
						break;
					case 5:
						System.out.println("Combinacion Ideal");
						break;
					case 6:
						System.out.println("Combinacion probable");
						break;
					case 7:
						continuar2 = false;
						break;
					}

				}
				;
				break;

			case 5:
				System.out.println("Bye, bye !");
				continuar = false;
				break;

			}
		}
		leer.close();
	}
}