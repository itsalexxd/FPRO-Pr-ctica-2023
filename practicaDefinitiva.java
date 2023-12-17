// Enunciado => https://campusvirtual.uva.es/pluginfile.php/5408664/mod_resource/content/10/Enunciado-P-2023-24.pdf

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

        // Variable que nos permite controlar el bucle while
        boolean volverJugar = false;

        // Creo una matriz que almacene al tablero
        int[][] tablero = new int[6][6];
        // Array que almacena las jugadas
        int[] almacenJugadas = new int[100];
        int contadorJugadas = 100;

        String jugada = "";
        int fila = 0;
        int columna = 0;
        boolean finPartida = false;

        int contPartidas = 0;
        int contadorVictorias = 0;
        int porcentajeVictorias = 0;



        while (!finPartida) {
            jugada = "";
            finPartida = false;

            tablero = generadorTablero(tablero);
            mostrarTablero(tablero);
            System.out.print("Inserte la jugada que desea realizar: ");
            jugada = verificaJugada();


            if (!jugada.equals("finPartida")) {
                fila = extraeFila(jugada);
                columna = extraeColumna(jugada);
                tablero = realizarJugada(fila, columna, tablero);

                System.out.println(); // Salto de linea
                System.out.println(); // Salto de linea
                System.out.println(); // Salto de linea

                mostrarTablero(tablero);
            
            }else {

                System.out.println("Va a finalizar la partida, ¿Esta seguro de hacerlo?");
            
                // Pregunto si quiere volver a jugar
                System.out.println("¿Quieres volver a jugar?");
                System.out.println("Si / No: ");
                jugada = scanner.next();

                if (jugada.equals("Si")) {
                    // Sumo un intento a la partida
                    contPartidas++;
                    limpiadorTerminal();

                    // Si todas las verificaciones son validas, es una victoria
                    if (tableroRellenado(tablero) && tresElementosIguales(tablero) && compruebaFilasRepetidas(tablero) && compruebaColumnasRepetidas(tablero)){
                        contadorVictorias++;
                    }

                    System.out.println("Has jugado un total de: " + contPartidas + " tableros.");

                } else {
                    limpiadorTerminal();

                    System.out.println("¿Sera un tablero valido segun las normas?");
                    System.out.println();

                    tableroRellenado(tablero);
                    tresElementosIguales(tablero);
                    compruebaFilasRepetidas(tablero);
                    compruebaColumnasRepetidas(tablero);

                    System.out.println();
                    System.out.println();

                    System.out.println("Tus estadisticas son: ");
                    System.out.println("Tableros jugados: " + contPartidas);
                    porcentajeVictorias=(int)(((double)contadorVictorias)/((double)contPartidas)) * 100;
                    System.out.println("Porcentaje de victorias: " + porcentajeVictorias + "%");
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
        String rutaArchivo = "/workspaces/FPRO-Pr-ctica-2023/tableros.txt";

        // Variable para almacenar la linea leida del archivo
        String[] lineaLeida = new String[2];

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

    // Funcion que se encarga de almacenar los movimientos realizados
    public static int[][][] registroJugadasRealizadas(int contadorMovimientos, int[][] tablero, int[][][]tablerosAnteriores){  // Almacena las "jugadas" del usuario.
    for(int fila = 0; fila  < tablero.length ;fila++){
        for(int columna = 0; columna < tablero.length; columna++){
            tablerosAnteriores[columna][fila][contadorMovimientos] = tablero[columna][fila];
        }
    }
    return tablerosAnteriores;
}

    // Funcion que almacena las jugadas del usuario
    public static int[] almacenaJugadasUsuario(int fila, int columna, int[] almacenJugadas, int contadorJugadas){
        int jugadaConjunta = (fila * 10) + columna;
        almacenJugadas[contadorJugadas] = jugadaConjunta;
        return almacenJugadas;
    }

    // Funcion que se encarga de insertar las jugadas
    public static int[][] recuperarJugada(int fila, int columna, int[][] tableroJuego) {
        // Compruebo que valor es la posicion y modifico en funcion del que sea
        if (tableroJuego[fila][columna] < 0) {
            System.out.print("Esa casilla no se puede editar...");
        } else {
            tableroJuego[fila][columna] = (tableroJuego[fila][columna] - 1) % 3;
        }

        return tableroJuego;
    }

    // Funcion que comprueba si el tablero esta completo o no
    public static boolean tableroRellenado(int[][] tableroACorregir) {
        for (int cont = 0; cont < tableroACorregir.length * tableroACorregir.length; cont++) {

            int fila = cont % tableroACorregir.length;
            int columna = cont / tableroACorregir.length;

            if (tableroACorregir[fila][columna] == 0) {
                System.out.println("Error, el tablero no esta completo...");
                System.out.println("Faltan huecos por rellenar...");
                return false;
            }

        }
        System.out.println("El tablero esta completado");
        return true;
    }

    // Compruebo si hay tres elementos iguales tanto en vertical como en horizontal
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
            System.out.println("Hay 3 elementos iguales en la fila o la columna");
            return true;
        } else {
            System.out.println("No hay 3 elementos iguales en la fila o la columna.");
            return false;
        }
    }
    
    // Compruebo si hay filas iguales
    public static boolean compruebaFilasRepetidas(int[][] tablero){  
        // Elegimos la fila que queremos comparar
        for (int filaInicial = 0; filaInicial < tablero.length - 1; filaInicial++){

            // Elegimos la fila con la que vamos a comparar
            for(int filaComparar = filaInicial + 1; filaComparar < tablero.length; filaComparar++){
                // Creo una variable que lleve la cuenta de los elementos iguales
                int elementosIguales = 0;

                // Comparamos cada elemento
                for(int cont = 0; cont < tablero.length; cont++){
                    if(Math.abs(tablero[filaInicial][cont]) == Math.abs(tablero[filaComparar][cont])){
                        elementosIguales++;
                    }
                }
                if(elementosIguales == tablero.length){
                    System.out.println("Se repite al menos una fila");
                    // Tiene filas repetidas
                    return true; 
                }
            }
        }
        System.out.println("No se repite ninguna fila");
        return false;
    }

    // Compruebo si hay columnas iguales
    public static boolean compruebaColumnasRepetidas(int[][]tablero){
        // Elegimos la fila que queremos comparar
        for (int columnaInicial = 0; columnaInicial < tablero.length - 1; columnaInicial++){

            // Elegimos la fila con la que vamos a comparar
            for(int columnaComparar = columnaInicial + 1; columnaComparar < tablero.length; columnaComparar++){
                // Creo una variable que lleve la cuenta de los elementos iguales
                int elementosIguales = 0;

                // Comparamos cada elemento
                for(int cont = 0; cont < tablero.length; cont++){
                    if(Math.abs(tablero[cont][columnaInicial]) == Math.abs(tablero[cont][columnaComparar])){
                        elementosIguales++;
                    }
                }
                if(elementosIguales == tablero.length){
                    System.out.println("Se repite al menos una columna");
                    return true;
                }
            }
        }
        System.out.println("No se repite ninguna columna");
        return false;
    }
}