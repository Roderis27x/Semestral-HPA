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

        board.move(caballoNegro, 0, 6);
        board.move(caballoBlanco, 7, 1);


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

                System.out.println("El turno del jugador: " + turn); //Se muestra el turno del jugador
                board.PrintBoard(); //Se imprime el tablero

                System.out.println("Turno del Caballo Blanco: Mover o Salir..."); //Se muestra el turno del jugador
                System.out.println("La posicion es: " + caballoBlanco.posc); //Se muestra la posicion del caballo
                try {

                    action = read.nextLine(); //Se lee la accion del jugador

                } catch (Exception e) {

                    System.out.println("Error... Ingrese una accion valida"); //Se muestra el error

                }

                if(action.equals("mover") || action.equals("Mover") || action.equals("MOVER") ){

                    System.out.print("Ingrese la siguiente posicion: "); //Se muestra el mensaje de ingreso de la siguiente posicion
                    move = read.nextLine(); //Se lee la siguiente posicion del jugador
                    
                    board.Entrada(move, caballoBlanco); //Se realiza el movimiento del caballo

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

                if(action.equals("mover") || action.equals("Mover") || action.equals("MOVER") ){

                    System.out.print("Ingrese la siguiente posicion: ");
                    move = read.nextLine();

                    board.Entrada(move, caballoNegro); //Se realiza el movimiento del caballo

                    if (caballoBlanco.posc.equals(caballoNegro.posc)){ //Si la posicion del caballo es igual a la posicion del caballo rival

                        ganador(caballoBlanco, "Caballo Blanco"); //Se imprime el mensaje de ganador
                        gameStatus = 0; //Se cambia el estado del juego a 0
                    
                    }

                    gameStatus = 1;
                    turn++; 


                }
                else if(action.equals("salir") || (action.equals("Salir") || action.equals("SALIR") )){
                    
                    ganador(caballoBlanco, "Caballo Blanco"); //Se imprime el mensaje de ganador
                    gameStatus = 0; //Se cambia el estado del juego a 0

                }
                else{

                    System.out.println("Error... Ingrese una accion valida"); //Se muestra el error

                } //Fin del else

                
            } //Fin del else
                
        } //Fin While

    } //Fin de GameStart 

} //Fin de la clase Game