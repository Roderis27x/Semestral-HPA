import java.util.LinkedList; //Importar la biblioteca LinkedList

public class Figuras {

    LinkedList<String> posicion = new LinkedList<>();  //Lista de posiciones de los caballos
    int ax, ay; //Coordenadas de los caballos
    String nombre, posc; //Nombre y posicion del caballo
    char color; //Color del caballo

    public Figuras(int x, int y, char color, String posc, String nombre) {

        this.ax = x; //Asigna la posicion inicial en x
        this.ay = y;
        this.color = color;
        this.posc = posc; //Asigna la posicion inicial en y
        this.nombre = nombre; //Asigna el nombre del caballo
        posicion.add(posc); //Agrega la posicion inicial a la lista de registro

    }//Fin del constructor Caballos

} //Fin de la clase Figuras
