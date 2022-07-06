import java.io.IOException;
import java.util.Scanner; //Importar la biblioteca Scanner


public class Principal {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner read = new Scanner(System.in); // Crear un objeto Scanner
        Game semestral = new Game(); // Se crea un objeto de la clase game
        CLS cls = new CLS(); // Se crea un objeto de la clase cls
        Presentacion nombres = new Presentacion(); // Se crea un objeto de la clase presentacion
        Instrucciones instrucciones = new Instrucciones(); // Se crea un objeto de la clase instrucciones

        try {

            int opcion; // Opcion del menu
            boolean salir = false; // Variable para salir del menu

            while (!salir) {

                cls.main();
                System.out.println("\n\t\t\t***************************");
                System.out.println("\t\t\t* Examen Semestral HPA II *");
                System.out.println("\t\t\t***************************");

                System.out.println("\n\t[1] Presentacion Estudiantes");
                System.out.println("\n\t[2] Instrucciones del juego");
                System.out.println("\n\t[3] Iniciar juegar");
                System.out.println("\n\t[4] Salir");

                try {

                    System.out.print("\nOpcion: ");
                    opcion = read.nextInt();

                    switch (opcion) {

                        case 1:
                            cls.main();
                            nombres.Namestudents();
                            cls.pressENTER();
                            break;

                        case 2:
                            cls.main();
                            instrucciones.InstructionsGames();
                            cls.pressENTER();
                            break;

                        case 3:
                            cls.main();
                            semestral.PrepareGame();
                            semestral.GameStart();
                            cls.pressENTER();
                            break;

                        case 4:
                            salir = true;
                            break;

                        default:
                            System.out.println("Solo numeros entre 1 y 3");

                    } // Fin del switch

                } catch (Exception e) {
                    
                    System.out.println("Error... Ingrese una opcion valida");

                } // Fin de try

            } // Fin del while
        } finally {

            System.out.println("\nGracias por usar el juego... ¡Vuelva Pronto!\n");
            read.close();

        } // Fin del try

    } // Fin del metodo main

} // Fin de la clase Inicio