// Enunciado => https://campusvirtual.uva.es/pluginfile.php/5408664/mod_resource/content/10/Enunciado-P-2023-24.pdf

package PracticaFinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class practicaDefinitiva {
    public static void main(String[] args) {
        // Creo el objeto scanner
        Scanner scanner = new Scanner(System.in);

        limpiadorTerminal();

        System.out.print("############### M E N U ###############");
        System.out.println(); // Salto de linea

        // Opciones del menu
        System.out.print("1. Ver las normas");
        System.out.println(); // Salto de linea
        System.out.println(); // Salto de linea
        System.out.print("2. Como  se juega");
        System.out.println(); // Salto de linea
        System.out.println(); // Salto de linea
        System.out.print("3. Creditos");
        System.out.println(); // Salto de linea
        System.out.println(); // Salto de linea
        System.out.println("4. JUGAR!");
        System.out.println(); // Salto de linea
        System.out.println(); // Salto de linea
        System.out.print("Por favor, inserte la accion que desea realizar: ");

        // Variable para navegar a traves del menu
        int opcionMenu = scanner.nextInt();

        // Meto el switch en un bucle de forma que sea infinito y lo evaluo con la
        // siguiente variable
        boolean finMenu = false;
        // Compruebo la accion que desea realizar el jugador
        while (finMenu == false) {
            switch (opcionMenu) {
                case 0:
                    limpiadorTerminal();

                    System.out.print("################### M E N U ###################");
                    System.out.println(); // Salto de linea

                    // Opciones del menu
                    System.out.print("1. Ver las normas");
                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea
                    System.out.print("2. Como  se juega");
                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea
                    System.out.print("3. Creditos");
                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea
                    System.out.println("4. JUGAR!");
                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea
                    System.out.print("Por favor, inserte la accion que desea realizar: ");

                    opcionMenu = scanner.nextInt();
                    break;

                case 1:
                    limpiadorTerminal();
                    System.out.println("############### N O R M A S ###############");

                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea

                    System.out.print("Las normas del juego son las siguientes: ");
                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea
                    System.out.print("Norma 1: Cada casilla debe contener uno de los 2 valores posibles ('x' / 'o').");
                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea
                    System.out.println("Norma 2: Por cada fila, debe haber el mismo numero de casillas de cada valor.");
                    System.out.print(
                            "Y lo mismo para las columnas, debe haber el mismo numero de casillas de cada elemento.");
                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea
                    System.out.print("Norma 3: No debe haber mas de 2 valores iguales en casillas contiguas.");
                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea
                    System.out.print("Inserte '0' para volver al menu anterior: ");

                    opcionMenu = scanner.nextInt();
                    break;

                case 2:
                    limpiadorTerminal();
                    System.out.println("############### C O M O   J U G A R ###############");

                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea

                    System.out.print("La forma de jugar es la siguiente: ");
                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea
                    System.out.print(
                            "Paso 1: Se te pedira que insertes las dimensiones del tablero que desea, el numero ha de ser par. ");
                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea
                    System.out.println(
                            "Paso 2: Se te generara el tablero de juego y tendras que insertar la jugada que desees realizar.");
                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea
                    System.out.print(
                            "Paso 3: Para realizar las jugadas, insertara las coordenadas primero indicando la fila y luego la columna (3C).");
                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea
                    System.out.print("Paso 4: Para finalizar la partida, pulse 'intro'.");
                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea
                    System.out.print("Inserte '0' para volver al menu anterior: ");

                    opcionMenu = scanner.nextInt();
                    break;

                case 3:
                    limpiadorTerminal();

                    System.out.println("############### C R E D I T O S ###############");
                    System.out.println(); // Salto de linea
                    System.out.println("Practica hecha por: ");
                    System.out.print("Alejandro Garcia Lavandera y David Blasco Polo");
                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea
                    System.out.print("Practica realizada para el 17 de Diciembre del 2023");
                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea
                    System.out.print("Inserte '0' para volver al menu anterior: ");

                    opcionMenu = scanner.nextInt();
                    break;

                case 4:
                    // Muestro un menu para que el jugador eliga la dificultad del juego
                    limpiadorTerminal();

                    // Salimos del menu
                    finMenu = true;

                    break;

                default:
                    // El valor insertado no es valido, muestro el mensaje por pantalla y vuelov a
                    // pedir el numero

                    limpiadorTerminal();

                    System.out.println("############### E R R O R ###############");
                    System.out.println(); // Salto de linea
                    System.out.println("El numero insertado no es valido...");
                    System.out.println("Por favor, inserte de nuevo el numero de la opcion deseada: ");
                    System.out.println(); // Salto de linea

                    System.out.println("############### M E N U ###############");
                    System.out.println(); // Salto de linea
                    // Opciones del menu
                    System.out.print("1. Ver las normas");
                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea
                    System.out.print("2. Como  se juega");
                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea
                    System.out.print("3. Creditos");
                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea
                    System.out.println("4. JUGAR!");
                    System.out.println(); // Salto de linea
                    System.out.println(); // Salto de linea
                    System.out.print("Por favor, inserte la accion que desea realizar: ");

                    opcionMenu = scanner.nextInt();
                    break;
            }
        }

        limpiadorTerminal();

        // Creo una matriz que almacene al tablero
        int[][] tableroJuego = new int[6][6];

        tableroJuego = generadorTablero(tableroJuego);
        mostrarTablero(tableroJuego);
        String jugada = "";
        int fila = 0;
        int columna = 0;
        boolean finPartida = false;

        int contadorIntentos = 0;

        while (!finPartida) {
            System.out.print("Por favor, inserte la jugada que desea realizar: ");
            jugada = verificaJugada();

            if (jugada != "finPartida") {
                fila = extraeFila(jugada);
                columna = extraeColumna(jugada);

                tableroJuego = realizarJugada(fila, columna, tableroJuego);

                System.out.println(); // Salto de linea
                System.out.println(); // Salto de linea
                System.out.println(); // Salto de linea

                mostrarTablero(tableroJuego);
            } else {
                // Pregunto si quiere volver a jugar
                System.out.println("¿Quieres volver a jugar?");
                System.out.println("Si / No: ");
                jugada = scanner.nextLine();

                if (jugada == "Si") {
                    // Sumo un intento a la partida
                    contadorIntentos++;
                } else {
                    limpiadorTerminal();

                    // tresElementosIguales(tableroJuego);
                    filasOColumnasIguales(tableroJuego);

                    System.out.println("Has jugado un total de: " + contadorIntentos + " tableros.");
                    System.out.println("Nos vemos en la proxima partida!!");

                    finPartida = true;
                }
            }

        }

        // Cierro el objeto scanner
        scanner.close();
    }

    // #################################### //
    // ########## M E T O D O S ########### //
    // #################################### //

    // Funcion que limpia la terminal
    public static void limpiadorTerminal() {
        for (int contador = 0; contador < 70; contador++) {
            System.out.println();
        }
    }

    // Funcion que genera el tablero
    public static int[][] generadorTablero(int[][] tablero) {
        // Especifico la ruta del archivo
        String rutaArchivo = "Laboratorio\\PracticaFinal\\tableros.txt";

        // Variable para almacenar la linea leida del archivo
        String[] lineaLeida = new String[1];

        // Abro el archivo
        try {
            // Creo un objeto scanner para leer el archivo
            Scanner scannerTableros = new Scanner(new File(rutaArchivo));

            // Leo una fila entera del archivo
            int cont = 0;
            while (scannerTableros.hasNextLine()) {
                // System.out.print("Linea leida: " + scannerTableros);
                lineaLeida[cont] = scannerTableros.nextLine();
                cont++;
            }
            // Cierro el objeto scanner
            scannerTableros.close();

            // En caso de que haya algun problema a la hora de encontrar el archivo, manda
            // un mensaje de error
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + rutaArchivo);
            System.err.println("Por favor, comprueba que tienes el archivo en la misma direccion que el juego.");
        }

        // Eligo una linea al hazar del array con los tableros
        String lineaElegida = lineaLeida[(int) (Math.random() * lineaLeida.length)];

        
        String linea = lineaElegida.replaceAll("\\s", "");

        System.out.println(linea);

        // Creo el array elementos que almacena cada caracter de linea de forma
        // independiente
        int[] elementos = new int[linea.length()];
        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = 0;
        }

        // Inserto los valores de linea en elementos
        for (int cont = 0; cont < elementos.length; cont++) {
            elementos[cont] = (linea.charAt(cont) - '0');
        }

        // Imprimo el array
        for (int cont = 0; cont < elementos.length; cont++) {
            int fila = cont % 6;
            int columna = cont / 6;

            tablero[fila][columna] = elementos[cont];
        }

        return tablero;
    }

    // Funcion que imprime el tablero
    public static void mostrarTablero(int[][] tableroAImprimir) {
        // Muestro una guia de las columnas
        System.out.print("---| ");
        for (int cont = 0; cont < tableroAImprimir.length; cont++) {
            System.out.print(" " + (char) ('A' + cont) + " ");
        }

        System.out.println(); // Salto de linea

        // Imprimo el tablero en funcion de su tamaño con la fila marcada
        for (int fila = 0; fila < tableroAImprimir.length; fila++) {
            System.out.print(" " + (fila + 1) + " |  ");
            for (int columna = 0; columna < tableroAImprimir.length; columna++) {
                if (tableroAImprimir[fila][columna] == 0) {
                    System.out.print("   ");
                }
                if (Math.abs(tableroAImprimir[fila][columna]) == 1) {
                    System.out.print("x  ");
                }
                if (Math.abs(tableroAImprimir[fila][columna]) == 2) {
                    System.out.print("o  ");
                }
            }
            System.out.println(); // Salto de linea
        }
        System.out.println(); // Salto de linea
    }

    public static String verificaJugada() {
        // Creo el objeto scanner
        Scanner scanner2 = new Scanner(System.in);

        String jugada = scanner2.nextLine();

        if (jugada.equals("")) {
            jugada = "finPartida";
            System.out.println(jugada);
            return jugada;

        } else {
            // Creo una variable para controla el bucle
            boolean entradaCorrecta = false;
            // Compruebo si la entrada es correcta, en caso de que no lo sea, la vuelve ha
            // pedir hasta que lo sea
            while (!entradaCorrecta) {
                // Verifico que la entrada es valida
                if (jugada.length() == 2) {
                    // Extraigo cada caracter de la entrada por separado
                    char filaNumero = jugada.charAt(0);
                    char columnaLetra = jugada.charAt(1);

                    // Verifico que los caracteres son validos y se corresponde con la forma nC
                    if (Character.isDigit(filaNumero) && Character.isLetter(columnaLetra)) {
                        // Paso los caracteres a enteros
                        int fila = (int) (filaNumero - '0');
                        int columna = (int) (columnaLetra - 'A' + 1);

                        // Compruebo que los valores estan dentro del rango permitido
                        if (fila < 1 || fila > 6) {
                            System.out.println("La fila insertada no existe...");
                            System.out.println("Las filas van desde la 1 hasta la 6...");
                            System.out.println("Inserte de nuevo la jugada: ");
                            System.out.println(); // Salto de linea

                            jugada = scanner2.nextLine();
                        }
                        if (columna < 1 || columna > 6) {
                            System.out.println("La  columna insertada no existe...");
                            System.out.println("Las columnas van desde la A hasta la F...");
                            System.out.println("Inserte de nuevo la jugada: ");
                            System.out.println(); // Salto de linea

                            jugada = scanner2.nextLine();
                        }

                        entradaCorrecta = true;
                        return jugada;

                    } else {
                        System.out.println("Jugada no valida, debe de ser del formato 'nC': ");
                        System.out.println("    Donde [ n ] es un numero entre el 1 y el 6.");
                        System.out.println("    Donde [ C ] es una letra MAYUSCULA entre la A y la F.");
                        System.out.println(); // Salto de linea
                        System.out.print("Por favor, vuelva a insertar la jugada que desea realizar: ");
                        jugada = scanner2.nextLine();
                    }

                } else {
                    System.out.println("La longitud de la jugada insertada no es valida...");
                    System.out.print("Por favor, vuelva a insertar la jugada que desea realizar: ");
                    jugada = scanner2.nextLine();
                }
            }

            // Cierro el objeto scanner
            scanner2.close();

            return jugada;
        }

    }

    // Funcion que devuelva la jugada como valores entero para insertarlo en la
    // matriz
    public static int extraeFila(String jugada) {
        int filaExtraida = (int) ((jugada.charAt(0) - '0') - 1);
        return filaExtraida;
    }

    // Funcion que devuelve de la jugada la columna
    public static int extraeColumna(String jugada) {
        int columnaExtraida = (int) ((jugada.charAt(1) - 'A' + 1) - 1);
        return columnaExtraida;
    }

    // Funcion que se encarga de insertar las jugadas
    public static int[][] realizarJugada(int fila, int columna, int[][] tableroJuego) {
        // Compruebo que valor es la posicion y modifico en funcion del que sea
        if (tableroJuego[fila][columna] < 0) {
            System.out.print("Esa casilla no se puede editar...");
        } else {
            tableroJuego[fila][columna] = (tableroJuego[fila][columna] + 1) % 3;
        }

        return tableroJuego;
    }

    public static boolean tresElementosIguales(int[][] tableroACorregir) { 
        boolean validoFila = true;
        boolean validoColumna = true;

        // Compruebo si hay mas de 3 elementos iguales en cada fila
        for (int cont = 0; cont < tableroACorregir.length / 2; cont++) {
            int fila = cont % 6;
            int columna = cont / 6;

            // Para la fila
            int elementoComprobar = tableroACorregir[fila][columna];
            if (elementoComprobar == tableroACorregir[fila][columna + 1]
                    && elementoComprobar == tableroACorregir[fila][columna + 2]) {
                validoFila = false;
            }

            // Para la columna
            if (elementoComprobar == tableroACorregir[fila + 1][columna]
                    && elementoComprobar == tableroACorregir[fila + 2][columna]) {
                validoColumna = false;
            }
        }

        if (validoFila && validoColumna) {
            System.out.println("No hay 3 elementos iguales en la fila o la columna.");
            return true;
        } else {
            System.out.println("Hay 3 elementos iguales en la fila o la columna");
            return false;
        }
    }

    // Hay 2 filas o columnas iguales
    public static boolean filasOColumnasIguales(int[][] tableroACorregir) {
        boolean filasRepetidas = true;
        boolean columnasRepetidas = true;

        int fila = 0;
        int columna = 0;

        int[] filaExtraida = new int[6];
        int[] columnaExtraida = new int[6];

        

        // Compruebo si hay mas de 3 elementos iguales en cada fila
        for (int cont = 0; cont < tableroACorregir.length / 2; cont++) {
            fila = cont % 6;
            columna = cont / 6;

            // Para las filas
            // Extraigo la fila en cuestion
            for(int cont2 = 0; cont < 6; cont2++){
                filaExtraida[cont2] = tableroACorregir[fila][columna + cont2];

                if(filaExtraida[cont2] == tableroACorregir[fila][cont2]){
                    columnasRepetidas = false;
                }
            }
        

            // Para las columnas
            // Extraigo la columna en cuestion
            for(int cont2 = 0; cont < 6; cont2++){
                columnaExtraida[cont2] = tableroACorregir[fila + cont2][columna];

                
            }

            if(columnaExtraida[cont] == tableroACorregir[cont][columna]){
                    columnasRepetidas = false;
                }
        }

        if (filasRepetidas && columnasRepetidas) {
            System.out.println("No hay 3 elementos iguales en la fila o la columna.");
            return true;
        } else {
            System.out.println("Hay 3 elementos iguales en la fila o la columna");
            return false;
        }
    }
}