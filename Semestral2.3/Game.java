import java.util.Scanner;
public class Game {
    Scanner read = new Scanner(System.in); 
    Figuras caballoBlanco;
    Figuras caballoNegro;
    Board tabla;
    int gameStatus;
    int player;
    String opcion;; 
    String mover;
    
    

    public void PrepareGame(){
        
        player = 1;
        gameStatus = 1;
       
        caballoBlanco = new Figuras(7, 1, 'B', "B1", "CB");
        caballoNegro = new Figuras(0, 6, 'N', "G8", "CN");
        
        tabla = new Board();
        
        tabla.Displace(caballoBlanco, 7, 1);
        tabla.Displace(caballoNegro, 0, 6);
        
    }


    public void Winner(Figuras ca, String nombreCaballo){
        
        System.out.println(nombreCaballo + " " + "Ha ganado");
        System.out.println("El Recorrido es: " + ca.registroPos);
        System.out.println("Las rondas de juegos fueron: " + player);
    }
    
    public void GameStart(){
        //GameStatus = 0: Salir de juego
        //GameStatus = 1: Turno del jugador 1 (Caballo Blanco)
        //GameStatus = 2: Turno del jugaador 2 (Caballo Negro)
        System.out.println("\n\t\t\t*******************************");
        System.out.println("\t\t\t* Juego de Ajedrez (Caballos) *");
        System.out.println("\t\t\t*******************************");

        while(gameStatus != 0){ 

            if(gameStatus == 1){ 

                System.out.println("\nRonda de juego: " + player); //Se muestra el turno del jugador
                tabla.PrintBoard(); //Se imprime el tablero

                System.out.println("\nTurno del Caballo Blanco."); //Se muestra el turno del jugador
                System.out.println("La posicion actual es: " + caballoBlanco.posc); //Se muestra la posicion del caballo
                System.out.println(""); //Se imprime un espacio en blanco
                System.out.println("Escribir Mover para la siguiente posicion"); 
                System.out.println("Escribir salir para terminar el juego"); //Se muestra el mensaje de mover
                
                try {

                    System.out.print("\nOpcion: "); //Se pide la siguiente posicion del caballo
                    opcion = read.nextLine(); //Se lee la accion del jugador

                } catch (Exception e) {

                    System.out.println("Error... Ingrese una accion valida"); //Se muestra el error

                }

                if(opcion.equals("mover") || opcion.equals("Mover") || opcion.equals("MOVER") ){

                    System.out.print("Ingrese la siguiente posicion: "); //Se muestra el mensaje de ingreso de la siguiente posicion
                    mover = read.nextLine(); //Se lee la siguiente posicion del jugador
                    
                    tabla.CheckPosition(mover, caballoBlanco); //Se realiza el movimiento del caballo
                    System.out.println("Se registro el movimiento");
                    tabla.PrintBoard();
                    

                    if(caballoBlanco.posc.equals(caballoNegro.posc)){
                        Winner(caballoBlanco, "Caballo Blanco"); //Se imprime el mensaje de ganador
                        gameStatus = 0; //Se cambia el estado del juego a 0
                    }

                    gameStatus = 2; //Se cambia el estado del juego a 2

                } //Fin del if
                else if(opcion.equals("salir") || (opcion.equals("Salir") || opcion.equals("SALIR") )){
                    Winner(caballoNegro, "Caballo Negro"); //Se imprime el mensaje de ganador
                    gameStatus = 0; //Se cambia el estado del juego a 0
                    
        
                } //Fin del else if
                else{

                    System.out.println("Error... Ingrese una accion valida"); //Se muestra el error

                } //Fin del else

            } //Fin del if
            
            else{ 
                
                System.out.println("\nTurno del Caballo Negro.");
                System.out.println("La posicion actual es: " + caballoNegro.posc);
                System.out.println();
                System.out.println("Escribir mover para la siguiente posicion");
                System.out.println("Escribir salir para terminar el juego");

                try {
                    System.out.print("\nOpcion: ");
                    opcion = read.nextLine();

                } catch (Exception e) {

                    System.out.println("Error... Ingrese una accion valida"); //Se muestra el error
                }

                if(opcion.equals("mover") || opcion.equals("Mover") || opcion.equals("MOVER") ){

                    System.out.print("Ingrese la siguiente posicion: ");
                    mover = read.nextLine();

                    tabla.CheckPosition(mover, caballoNegro); //Se realiza el movimiento del caballo

                    if (caballoBlanco.posc.equals(caballoNegro.posc)){ //Si la posicion del caballo es igual a la posicion del caballo rival

                        Winner(caballoBlanco, "Caballo Blanco"); //Se imprime el mensaje de ganador
                        gameStatus = 0; //Se cambia el estado del juego a 0
                    
                    }

                    gameStatus = 1;
                    player++; 


                }
                else if(opcion.equals("salir") || (opcion.equals("Salir") ||opcion.equals("SALIR") )){
                    
                    Winner(caballoBlanco, "Caballo Blanco"); //Se imprime el mensaje de ganador
                    gameStatus = 0; //Se cambia el estado del juego a 0
                    

                }
                else{

                    System.out.println("Error... Ingrese una accion valida"); //Se muestra el error

                } //Fin del else

                
            } //Fin del else
        
        } //Fin While
        
    } //Fin de GameStart
    
       
    
}
