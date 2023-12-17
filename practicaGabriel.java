import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class practicaGabriel {

    // Excepción por si no encuentra el archivo tableros.txt
    public static void main(String[] args) throws FileNotFoundException {
        // Definimos el nombre del archivo y su ruta (Solo escribimos la ruta si está en
        // un directorio diferente al del programa);
        File textoTableros = new File("tableros.txt");
        Scanner sc = new Scanner(System.in);

        if (textoTableros.exists() == true) {
            // Escaner para contar el número de líneas del archivo .txt
            Scanner scNumLineasTXT = new Scanner(textoTableros);
            // Escaner para guardar las líneas del archivo .txt en un array
            Scanner scLeerTXT = new Scanner(textoTableros);
            boolean otraPartida = true;
            // Número de líneas del texto
            int numLineasTXT = (contarLineasTexto(scNumLineasTXT));
            // Codigos del tablero inicial
            String codigosGeneracion[] = codigosTableroTexto(numLineasTXT, scLeerTXT);
            int tablerosJugados = 0;
            int tablerosGanados = 0;
            // EJECUCIÓN DEL JUEGO

            do {
                // GENERACIÓN DEL TABLERO

                // Genera un número aleatorio para elegir un tablero de los disponibles.
                int tableroRandom = (int) (Math.random() * (numLineasTXT));
                // CODIGO (String) del TABLERO INICIAL ACTUAL.
                String tableroGenerado = codigosGeneracion[tableroRandom];
                // TABLERO INICIAL, ES INMUTABLE.
                int tableroInicial[][] = definirTableroGenerado(tableroGenerado);
                // Tablero que el jugador irá modificando.
                int tablero[][] = definirTableroGenerado(tableroGenerado);
                // Contiene todos los tableros con las "jugadas" del usuario.
                int tablerosAnteriores[][][] = new int[tablero.length][tablero.length][100];
                int contadorMovimientos = 1;

                // Añade el tablero inicial en tablerosAnteriores[-][][0].
                tablerosAnteriores = registroJugadas(0, tableroInicial, tablerosAnteriores);
                // Imprime el Tablero inicial
                imprimirTablero(tablero);
                // Incrementa el número de los tableros que ha jugado el jugador.
                tablerosJugados++;

                // MOVIMIENTOS DEL JUGADOR HASTA QUE ESTE FINALICE EL TABLERO
                boolean tableroCompletado = false;
                while (tableroCompletado == false) {
                    System.out.println();
                    System.out.print("               ");
                    if (tableroLleno(tablero) == true) {
                        System.out.println("Pulsa la tecla intro si has terminado");
                    }
                    System.out.print("Jugada:");
                    String movimiento = sc.nextLine();
                    int fila = leerFila(tablero, movimiento);
                    int columna = leerColumna(tablero, movimiento);
                    if (movimiento.equals("-")) { // Deshacer jugadas
                        if (contadorMovimientos >= 2) {
                            tablero = jugadaAnterior(tablerosAnteriores, tablero, contadorMovimientos - 2);
                            imprimirTablero(tablero);
                            contadorMovimientos = contadorMovimientos - 1;
                        } else {
                            imprimirTablero(tablero);
                            System.out.print("               ");
                            System.out.println("No hay más cambios que deshacer. Introduce una jugada nueva.");
                        }
                    } else if (tableroLleno(tablero) == true && movimiento == "") { // Si el tablero esta lleno
                        tableroCompletado = true;
                    } else if (movimientoSinFallos(movimiento) == false) { // Si el string de la jugada no existe
                        imprimirTablero(tablero);
                        System.out.print("               ");
                        System.out.println("La jugada introducida es incorrecta. Vuelva a introducir la jugada.");
                    } else if (casillaBloqueada(tableroInicial, columna, fila) == true) { // Si la casilla pertenece al
                                                                                          // tablero inicial
                        imprimirTablero(tablero);
                        System.out.print("               ");
                        System.out.println(
                                "La casilla esta bloqueada ya que pertenece al tablero inicial. Vuelva a introducir la jugada");
                    }

                    else { // String(movimiento) es correcto
                        System.out.println();
                        tablero = cambiarFicha(columna, fila, tablero);
                        imprimirTablero(tablero);
                        tablerosAnteriores = registroJugadas(contadorMovimientos, tablero, tablerosAnteriores);
                        contadorMovimientos++;
                    }
                }
                // COMPROBAR SI EL TABLERO ES CORRECTO
                if (numeroFichasEsIgual(tablero) == true && filasIguales(tablero) == false
                        && columnasIguales(tablero) == false && comprobar3(tablero) == true) {
                    System.out.println("Tablero CORRECTO. Felicidades");
                    tablerosGanados++;
                } else {
                    System.out.println("TABLERO INCORRECTO. Se han incumplido las siguiene reglas:");
                    if (numeroFichasEsIgual(tablero) == false) {
                        System.out.println("- El número de fichas de cada tipo no es igual en cada columna y fila");
                    }
                    if (filasIguales(tablero) == true) {
                        System.out.println("- Hay filas repetidas");
                    }
                    if (columnasIguales(tablero) == true) {
                        System.out.println("- Hay columnas repetidas");
                    }
                    if (comprobar3(tablero) == false) {
                        System.out.println("- Hay más de 2 casillas contiguas con el mismo valor");
                    }
                }
                // PREGUNTA AL JUGADOR SI QUIERE JUGAR OTRA VEZ
                String otra = "";
                System.out.println("¿Quieres jugar otra vez? (SI/NO)");
                otra = sc.nextLine();
                while (otra.equals("SI") == false && otra.equals("NO") == false) {
                    System.out.println("Solo puedes escribir 'SI' o 'NO'");
                    otra = sc.nextLine();
                }
                if (otra.equals("SI") == true) {
                    otraPartida = true;
                    System.out.print("                 ");
                    System.out.println("NUEVO TABLERO");
                } else if (otra.equals("NO") == true) {
                    otraPartida = false;
                    System.out.println();
                    int winrate = (int) ((double) tablerosGanados / tablerosJugados) * 100;
                    System.out.println("JUEGO TERMINADO | Has jugado " + tablerosJugados + " tablero/s.");
                    System.out.println("Has ganado " + tablerosGanados
                            + " tablero/s lo que te da un porcertaje de victorias del " + winrate + " %.");
                }
            } while (otraPartida == true);

            // FIN DEL PROGRAMA
            scNumLineasTXT.close();
            scLeerTXT.close();
        } else {
            System.out.println("ERROR: Archivo (.txt) no encontrado");
        }
        sc.close();
    }

    public static int contarLineasTexto(Scanner scNumLineasTXT) { // Contar el número de líneas que tiene el archivo
                                                                  // .txt
        int contador = 0;
        while (scNumLineasTXT.hasNextLine() == true) { // Verifica que haya otra línea, si la hay entonces...

            contador++; // ... suma una línea más al contador (Más tarde podemos guardar las líneas en
                        // un array y usar el contador para definir el tamaño del array )
            scNumLineasTXT.nextLine();
        }
        return contador;
    }

    public static String[] codigosTableroTexto(int numLineasTXT, Scanner scLeerTXT) { // Guarda las lineas del archivo
                                                                                      // de texto en un array
        String[] codigos = new String[numLineasTXT];
        for (int i = 0; i < codigos.length; i++) {
            codigos[i] = scLeerTXT.nextLine();
        }
        return codigos;
    }

    public static int[][] definirTableroGenerado(String tableroGenerado) { // Define el tablero para los valores del
                                                                           // string inicial (Tamaño fijado del tablero
                                                                           // 6x6)
        int[][] tablero = new int[6][6];
        int columna = 0;
        int fila = 0;
        for (int i = 0; i < tableroGenerado.length(); i++) {
            if (tableroGenerado.charAt(i) == ' ') {
                fila++;
                columna = 0;
            } else {
                int valorCampo = tableroGenerado.charAt(i) - '0';
                tablero[columna][fila] = valorCampo;
                columna++;
            }
        }
        return tablero;
    }

    public static int leerFila(int[][] tablero, String movimiento) { // Devuelve el valor de la fila si el string es
                                                                     // correcto.
        int fila = -1;
        for (int i = 0; i < movimiento.length(); i++) {
            if (movimiento.charAt(i) >= '0' && movimiento.charAt(i) <= '9') {
                fila = movimiento.charAt(i) - '0' - 1;
            }
        }
        return fila;
    }

    public static int leerColumna(int[][] tablero, String movimiento) { // Devuelve el valor de la columna si el string
                                                                        // es correcto.
        int columna = -1;
        for (int i = 0; i < movimiento.length(); i++) {
            if (movimiento.charAt(i) >= 'a' && movimiento.charAt(i) <= 'f') {
                columna = movimiento.charAt(i) - 'a';
            } else if (movimiento.charAt(i) >= 'A' && movimiento.charAt(i) <= 'F') {
                columna = movimiento.charAt(i) - 'A';
            }
        }
        return columna;
    }

    public static void imprimirTablero(int[][] tablero) { // Imprime el tablero INICIAL
        int filasTotal = tablero.length;
        int columnasTotal = tablero.length;
        System.out.println("   A B C D E F"); // Indice Columnas
        for (int i = 0; i < filasTotal; i++) {
            System.out.print((i + 1) + "  "); // Indice Filas
            for (int j = 0; j < columnasTotal; j++) {
                if (tablero[j][i] == 1) {
                    System.out.print("x ");
                } else if (tablero[j][i] == 2) {
                    System.out.print("o ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static boolean movimientoSinFallos(String movimiento) { // Comprueba que el jugador ha escrito bien el
                                                                   // movimiento
        boolean sinError = true;
        boolean esNumero = false;
        boolean esLetra = false;
        if (movimiento.length() != 2) {
            return sinError = false;
        } else {
            for (int i = 0; i < movimiento.length(); i++) {
                if (movimiento.charAt(i) >= '0' && movimiento.charAt(i) <= '9' && esNumero == false) {
                    esNumero = true;
                } else if (((movimiento.charAt(i) >= 'a' && movimiento.charAt(i) <= 'f')
                        || (movimiento.charAt(i) >= 'A' && movimiento.charAt(i) <= 'F')) && esLetra == false) {
                    esLetra = true;
                } else {
                    return sinError = false;
                }
            }
        }
        return sinError;
    }

    public static int[][] cambiarFicha(int leerColumna, int leerFila, int[][] tablero) {
        if (tablero[leerColumna][leerFila] < 2) {
            tablero[leerColumna][leerFila]++;
        } else {
            tablero[leerColumna][leerFila] = 0;
        }
        return tablero;
    }

    public static boolean casillaBloqueada(int[][] tableroInicial, int leerColumna, int leerFila) { // Bloquea las
                                                                                                    // casillas del
                                                                                                    // tablero inicial
        boolean estaBloqueado = false;
        if (tableroInicial[leerColumna][leerFila] > 0) {
            estaBloqueado = true;
        }
        return estaBloqueado;
    }

    public static boolean tableroLleno(int[][] tablero) { // Comprueba si quedan casillas vacías.
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][][] registroJugadas(int contadorMovimientos, int[][] tablero, int[][][] tablerosAnteriores) { // Almacena
                                                                                                                      // las
                                                                                                                      // "jugadas"
                                                                                                                      // del
                                                                                                                      // usuario.
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero.length; columna++) {
                tablerosAnteriores[columna][fila][contadorMovimientos] = tablero[columna][fila];
            }
        }
        return tablerosAnteriores;
    }

    public static int[][] jugadaAnterior(int[][][] tablerosAnteriores, int[][] tablero, int contadorMovimientos) { // Devuelve
                                                                                                                   // el
                                                                                                                   // tablero
                                                                                                                   // con
                                                                                                                   // la
                                                                                                                   // "jugada"
                                                                                                                   // anterior
                                                                                                                   // del
                                                                                                                   // usuario.
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero.length; columna++) {
                tablero[columna][fila] = tablerosAnteriores[columna][fila][contadorMovimientos];
            }
        }
        return tablero;
    }

    public static boolean numeroFichasEsIgual(int[][] tablero) { // Comprueba que haya el mismo número de cada tipo de
                                                                 // fichas en todas las filas y columnas.
        boolean tableroCorrecto = true;
        for (int i = 0; i < tablero.length && tableroCorrecto == true; i++) { // Comprobamos las filas y las columnas
            int aspasFila = 0;
            int circulosFila = 0;
            int aspasColumna = 0;
            int circulosColumna = 0;
            for (int j = 0; j < tablero.length; j++) {
                // Comprobar fichas en cada fila
                if (tablero[j][i] == 1) {
                    aspasFila++;
                } else if (tablero[j][i] == 2) {
                    circulosFila++;
                }
                // Comprobar fichas en cada columna
                if (tablero[i][j] == 1) {
                    aspasColumna++;
                } else if (tablero[i][j] == 2) {
                    circulosColumna++;
                }
            }
            if (aspasFila != circulosFila || aspasColumna != circulosColumna) {
                tableroCorrecto = false;
            }
        }
        return tableroCorrecto;
    }

    public static boolean filasIguales(int[][] tablero) {
        for (int filaBase = 0; filaBase < tablero.length - 1; filaBase++) { // Elegir fila base
            for (int filaComparada = filaBase + 1; filaComparada < tablero.length; filaComparada++) { // Elegir fila a
                                                                                                      // comparar
                int casillasIguales = 0;
                for (int columna = 0; columna < tablero.length; columna++) { // Comparar elementos de cada fila
                    if (tablero[columna][filaBase] == tablero[columna][filaComparada]) {
                        casillasIguales++;
                    }
                }
                if (casillasIguales == tablero.length) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean columnasIguales(int[][] tablero) {
        for (int columnaBase = 0; columnaBase < tablero.length - 1; columnaBase++) { // Elegir columna base
            for (int columnaComparada = columnaBase + 1; columnaComparada < tablero.length; columnaComparada++) { // Elegir
                                                                                                                  // columna
                                                                                                                  // a
                                                                                                                  // comparar
                int casillasIguales = 0;
                for (int fila = 0; fila < tablero.length; fila++) { // Comparar elementos de cada columna
                    if (tablero[columnaBase][fila] == tablero[columnaComparada][fila]) {
                        casillasIguales++;
                    }
                }
                if (casillasIguales == tablero.length) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean comprobar3(int[][] tablero) { // No puede haber más de dos valores iguales contiguos, en
                                                        // horizontal ni en vertical.
        boolean noHayError = true;
        int f = 0, c = 0;
        int nFilas = tablero.length - 1;
        int nColumnas = tablero[0].length - 1;
        // recorrer por filas --- tablero [fila][col]
        while (f <= nFilas) {
            for (int i = 2; i <= nColumnas; i++) { // Comprobar por columnas
                int p = tablero[f][i];
                int x = tablero[f][i - 1];
                int z = tablero[f][i - 2];
                if (p == x && p == z) {
                    return noHayError = false;
                }
            }
            f++;
        }
        // Por columnas
        while (c <= nColumnas) {
            for (int i = 2; i <= nFilas; i++) { // Comprobar por filas
                int q = tablero[i][c];
                int n = tablero[i - 1][c];
                int m = tablero[i - 2][c];
                if (q == n && q == m) {
                    return noHayError = false;
                }
            }
            c++;
        }
        return noHayError;
    }
}