import java.io.IOException; //Importar la biblioteca IOException  

public class CLS {

    public void main(String... arg) throws IOException, InterruptedException   {  

    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //Limpia la pantalla  

    } //Fin de main  
} //Fin de CLS


