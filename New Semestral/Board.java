public class Board {

    String [][] board = new String[8][8]; //Tablero de juego
    char arrayChar[] =  new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'}; //Array de letras
    int arrayInt[] = new int[] {'1', '2', '3', '4', '5', '6', '7', '8'}; //Array de numeros

    public void BoardPosition(){
        for (int i = 0; i < 8; i++) { //Inicia el tablero con espacios vacios
            for (int j = 0; j < 8; j++) { 

                board[i][j] = " "; //Asigna espacios vacios al tablero

            } //Fin for j

        } //Fin del for i

    } //Fin del metodo BoardPosition

    public void PrintBoard(){

        System.out.print("   a   b   c   d   e   f   g   h   "); //Imprime la letra de las columnas
        for (int fila = 0; fila < 8; fila++){

            System.out.println("-----------------------------------");
            System.out.print(fila -8); //Imprime el numero de fila
            
            for (int col = 0; col < 8; col++){
                
                System.out.print(" | " + board[fila][col] + "  "); //Imprime el tablero
                
            } //Fin del for col

            System.out.print(" | "); // Imprime el espacio final

        } //Fin del for fila

        System.out.println(""); //Salto de linea
        System.out.println("   a   b   c   d   e   f   g   h   "); //Imprime la letra de las columnas

    } //Fin del metodo PrintTablero

    public void Entrada(Caballo ca){

        String entrada; //Variable de entrada
        int t1_ = ca.x+1; //Asigna la posicion inicial en x
        int t2_ = ca.y+1; //Asigna la posicion inicial en y








    } //Fin del metodo Entrada

} //Fin de la clase Board
