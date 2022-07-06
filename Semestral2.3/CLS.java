
import java.io.IOException; //Importar la biblioteca IOException 
import java.io.Console;


public class CLS {

    public void main(String... arg) throws IOException, InterruptedException   {  

    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia la pantalla  

    } //Fin de main  

    public Console console = System.console(); //Crear un objeto Console

    public void pressENTER() {
        System.out.print("\nPresione ENTER para continuar...");
        console.readLine(); //Pausa la ejecucion del programa hasta que se presione ENTER
    }

} //Fin de CLS


