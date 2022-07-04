import java.util.Scanner; //Importar la biblioteca Scanner

public class Game {

    Scanner read = new Scanner(System.in); //Variable para leer datos
    int gameStatus; //Estado del juego
    int turn; //Turno del jugador
    String action;  //Acciones del jugador
    String move; //Movimiento del jugador en el tablero}
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

    public void ganador(Figuras ca, String nCaballo){

        System.out.print(nCaballo + " " + "Ha ganado"); //Imprime el mensaje de ganador
        System.out.print("El recorrido es: " + ca.posicion); //Imprime el recorrido del caballo
        System.out.print("El turno de jugo es: " + turn); //Imprime el turno del jugador

    } //Fin de ganador

    public void GameStart(){
        //GameStatus = 0: Salir de juego
        //GameStatus = 1: Turno del jugador 1 (Caballo Blanco)
        //GameStatus = 2: Turno del jugaador 2 (Caballo Negro)

        while(gameStatus != 0){ 

            if(gameStatus == 1){ 

                System.out.print("El turno del jugador: " + turn); //Se muestra el turno del jugador
                board.PrintBoard(); //Se imprime el tablero

                System.out.print("Turno del Caballo Blanco: Mover o Salir..."); //Se muestra el turno del jugador
                System.out.print("La posicion es: " + caballoBlanco.posc); //Se muestra la posicion del caballo
                try {

                    action = read.nextLine(); //Se lee la accion del jugador

                } catch (Exception e) {

                    System.out.println("Error... Ingrese una accion valida"); //Se muestra el error

                }

                if(action.equals("mover") || (action.equals("Mover") || action.equals("MOVER") )){

                    System.out.print("Ingrese la siguiente posicion: "); //Se muestra el mensaje de ingreso de la siguiente posicion
                    move = read.nextLine(); //Se lee la siguiente posicion del jugador
                    if(caballoBlanco.posc.equals(caballoNegro.posc)){
                        ganador(caballoBlanco, "Caballo Blanco"); //Se imprime el mensaje de ganador
                        gameStatus = 0; //Se cambia el estado del juego a 0
                    }

                    gameStatus = 2; //Se cambia el estado del juego a 2

                } //Fin del if
                else if(action.equals("salir") || (action.equals("Salir") || action.equals("SALIR") )){
                    ganador(caballoNegro, "Caballo Negro"); //Se imprime el mensaje de ganador
                    gameStatus = 0; //Se cambia el estado del juego a 0
        
                } //Fin del else if
                else{

                    System.out.println("Error... Ingrese una accion valida"); //Se muestra el error

                } //Fin del else
                   
            } //Fin del if
            else{ 
                
                System.out.print("Turno del Caballo Negro: Mover o Salir...");
                System.out.print("La posicion es: " + caballoNegro);

                try {

                    action = read.nextLine();

                } catch (Exception e) {
                    
                    System.out.println("Error... Ingrese una accion valida"); //Se muestra el error
                }
            }
                
               
        




        } //Fin While








    } //Fin de GameStart 


    




}