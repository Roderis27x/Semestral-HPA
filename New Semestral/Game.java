import java.util.Scanner; //Importar la biblioteca Scanner

public class Game {

    Scanner read = new Scanner(System.in); //Variable para leer datos
    int gameStatus; //Estado del juego
    int turn; //Turno del jugador
    String action;  //Acciones del jugador
    String move; //Movimiento del jugador en el tablero
    Figuras caballoBlanco, caballoNegro; //Caballos del juego
    Board board; //Tablero del juego

    public void PrepareGame(){
        gameStatus = 1;
        turn = 1;
        caballoNegro = new Figuras(0, 6, 'N', "G8", "CN" );
        caballoBlanco = new Figuras(7, 1, 'B', "A1", "CB" );

        board = new Board();

        board.move(6, 0, caballoNegro);
        board.move(1, 7, caballoBlanco);


    } //Fin de PrepareGame

    public void GameStart(){
        //GameStatus = 0: Salir de juego
        //GameStatus = 1: Turno del jugador 1 (Caballo Blanco)
        //GameStatus = 2: Turno del jugaador 2 (Caballo Negro)

        while(gameStatus!=0){ 

            if(gameStatus==1){ 

                System.out.print("El turno del jugador: " + turn);
                board.PrintBoard();

                System.out.print("Turno del Caballo Blanco: Mover o Salir...");
                System.out.print("La posicion es: " + caballoBlanco.posc);




            }

        } //Fin While








    } //Fin de GameStart 


    




}