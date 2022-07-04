public class Board {

    String[][] table = new String[8][8]; // Tablero de juego
    char num[] = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' }; // Array de letras
    char let[] = new char[] { '8', '7', '6', '5', '4', '3', '2', '1' }; // Array de numeros

    public Board() {
        for (int i = 0; i < 8; i++) { // Inicia el tablero con espacios vacios
            for (int j = 0; j < 8; j++) {

                table[i][j] = " "; // Asigna espacios vacios al tablero

            } // Fin for j

        } // Fin del for i

    } // Fin del metodo BoardPosition

    public void PrintBoard() {

        System.out.print("     A      B     C     D     E     F     G     H   ");

        for (int fila1 = 0; fila1 < 8; fila1++) {
            System.out.println("");
            //System.out.println("-----------------------------------");
            System.out.println("===================================================");
            System.out.print(8 - fila1);

            for (int col2 = 0; col2 < 8; col2++) {
                System.out.print(" || " + table[fila1][col2] + " ");
            }
            System.out.print("||");
        }
        System.out.println("");
        System.out.println("===================================================");
        System.out.println("     A      B     C     D     E     F     G     H   ");

    } // Fin del metodo PrintTablero

    public void move(Figuras ca, int x, int y) {

        table[ca.ax][ca.ay] = " "; // Elimina el caballo de la posicion anterior

        ca.ax = x; // Asigna la posicion inicial en x
        ca.ay = y; // Asigna la posicion inicial en y

        table[ca.ax][ca.ay] = ca.nombre; // Asigna el nombre del caballo a la posicion inicial

    } // Fin del metodo move

    public void Entrada(String entrada, Figuras ca) {

        int validMov; // Variable de validacion de movimiento
        int t1 = ca.ax + 1; // Asigna la posicion inicial en x
        int t2 = ca.ay + 1; // Asigna la posicion inicial en y
        int l = 0, n = 0; // Variables de posiciones
        char fila2 = entrada.charAt(0); // Asigna la letra de la fila
        char col2 = entrada.charAt(1); // Asigna el numero de la columna

        for (int i = 0; i < let.length; i++) {
            if (fila2 == let[i]) {
                l = i + 1; // Asigna la posicion de la fila
            } // Fin del if
        } // Fin del for i

        for (int i = 0; i < num.length; i++) {
            if (col2 == num[i]) {
                n = i + 1; // Asigna la posicion de la columna
            } // Fin del if
        } // Fin del for i

        validMov = (t1 - n) * (t1 - n) + (t2 - l) * (t2 - l); // Calcula el valor del movimiento

        if (validMov == 5) {
            ca.posicion.add(entrada); // Agrega la posicion a la lista de registro
            ca.posc = entrada; // Asigna la posicion inicial
            move(ca, n - 1, l - 1); // Mueve el caballo a la posicion inicial

        } // Fin del if
        else {

            System.out.print("Perdio el turno, Movimineto invalido");

        } // Fin del else

    } // Fin del metodo Entrada

} // Fin de la clase Board
