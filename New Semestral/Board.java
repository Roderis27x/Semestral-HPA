public class Board {

    String [][] board = new String[8][8]; //Tablero de juego
    char arrayChar[] =  new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'}; //Array de letras
    int arrayInt[] = new int[] {'1', '2', '3', '4', '5', '6', '7', '8'}; //Array de numeros

    public Board(){
        for (int i = 0; i < 8; i++) { //Inicia el tablero con espacios vacios
            for (int j = 0; j < 8; j++) { 

                board[i][j] = " "; //Asigna espacios vacios al tablero

            } //Fin for j

        } //Fin del for i

    } //Fin del metodo BoardPosition

    public void PrintBoard(){

        System.out.print("   a   b   c   d   e   f   g   h   "); //Imprime la letra de las columnas
        for (int fila1 = 0; fila1 < 8; fila1++){

            System.out.println("-----------------------------------");
            System.out.print(fila1 -8); //Imprime el numero de fila
            
            for (int col1 = 0; col1 < 8; col1++){
                
                System.out.print(" | " + board[fila1][col1] + "  "); //Imprime el tablero
                
            } //Fin del for col

            System.out.print(" | "); // Imprime el espacio final

        } //Fin del for fila

        System.out.println(""); //Salto de linea
        System.out.println("   a   b   c   d   e   f   g   h   "); //Imprime la letra de las columnas

    } //Fin del metodo PrintTablero

    public void move(int x, int y, Figuras ca){

        board[ca.ax][ca.ay] = " "; //Elimina el caballo de la posicion anterior

        ca.ax = x;  //Asigna la posicion inicial en x
        ca.ay = y;  //Asigna la posicion inicial en y

        board[ca.ax][ca.ay] = ca.nombre; //Asigna el nombre del caballo a la posicion inicial
        
    } //Fin del metodo move



    public void Entrada(Figuras ca, String entrada){

        
        int validMov; //Variable de validacion de movimiento
        int t1_ = ca.ax+1; //Asigna la posicion inicial en x
        int t2_ = ca.ay+1; //Asigna la posicion inicial en y
        int l = 0, n = 0; //Variables de posiciones
        char fila2 = entrada.charAt(0); //Asigna la letra de la fila
        char col2 = entrada.charAt(1); //Asigna el numero de la columna

        for (int i = 0; i < arrayChar.length; i++ ){
            if (fila2 == arrayChar[i]){
                l = i + 1; //Asigna la posicion de la fila
            } //Fin del if
        } //Fin del for i

        for (int i= 0; i < arrayInt.length; i++ ){
            if (col2 == arrayInt[i]){
                n = i + 1; //Asigna la posicion de la columna
            } //Fin del if
        } //Fin del for i

        validMov = (t1_ - n)*(t1_ - n) + (t2_ - l)*(t2_ - l); //Calcula el valor del movimiento

        if(validMov == 5){
            ca.posicion.add(entrada); //Agrega la posicion a la lista de registro
            ca.posc = entrada; //Asigna la posicion inicial
            move(n-1, l-1, ca); //Mueve el caballo a la posicion inicial


        } //Fin del if
        else{

            System.out.print("Perdio el turno, Movimineto invalido");

        } //Fin del else

    } //Fin del metodo Entrada





} //Fin de la clase Board
